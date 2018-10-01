package com.geniusforapp.notes.ui.base.mvp

import com.geniusforapp.notes.application.helpers.rx.SchedulerProvider
import com.geniusforapp.notes.data.DataManager
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
open class BasePresenter<V : MvpView> @Inject constructor(var dataManager: DataManager, var compositeDisposable: CompositeDisposable, var schedulerProvider: SchedulerProvider) : MvpPresenter<V> {


    override fun getMvpView(): V {
        return view
    }


    lateinit var view: V

    fun isViewAttached(): Boolean {
        return view != null
    }

    override fun onAttach(mvpView: V) {
        this.view = mvpView
    }

    override fun onDetach() {
        compositeDisposable.dispose()
    }

    override fun handleError(e: Throwable) {
    }

}