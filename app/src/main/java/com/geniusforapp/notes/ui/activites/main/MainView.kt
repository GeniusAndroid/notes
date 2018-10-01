package com.geniusforapp.notes.ui.activites.main

import com.geniusforapp.notes.ui.base.mvp.MvpView

/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
interface MainView : MvpView {
    fun showData(data: String)
    fun showApiKey(apiKey: String)
}