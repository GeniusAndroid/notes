package com.geniusforapp.notes.ui.activites.main

import com.geniusforapp.notes.ui.base.mvp.MvpPresenter

/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
interface MainMvpPresenter<V : MainView> : MvpPresenter<V> {
    fun getData()
    fun register(deviceId: String)
}