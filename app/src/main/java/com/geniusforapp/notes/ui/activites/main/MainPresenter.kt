package com.geniusforapp.notes.ui.activites.main

import android.util.Log
import com.geniusforapp.notes.application.helpers.rx.SchedulerProvider
import com.geniusforapp.notes.data.DataManager
import com.geniusforapp.notes.ui.base.mvp.BasePresenter
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
class MainPresenter<V : MainView> @Inject constructor(dataManager: DataManager, compositeDisposable: CompositeDisposable, schedulerProvider: SchedulerProvider) :
        BasePresenter<V>(dataManager, compositeDisposable, schedulerProvider), MainMvpPresenter<V> {
    override fun getData() {
        getMvpView().showData(dataManager.apiHeader().testData)
    }


    override fun register(deviceId: String) {
        compositeDisposable.add(dataManager
                .register(deviceId)
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ data ->
                    Log.d(MainPresenter::class.java.simpleName, data.apiKey)
                    getMvpView().showApiKey(data.apiKey!!)
                }, { error ->
                    handleError(error)
                }))
    }
}