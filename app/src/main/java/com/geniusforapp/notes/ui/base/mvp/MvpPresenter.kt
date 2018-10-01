package com.geniusforapp.notes.ui.base.mvp

/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
interface MvpPresenter<V : MvpView> {

    fun onAttach(mvpView: V)

    fun onDetach()

    fun handleError(e: Throwable)
    fun getMvpView(): V

}