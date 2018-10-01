package com.geniusforapp.notes.ui.base.mvp

import android.support.annotation.StringRes

/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
interface MvpView {
    fun showLoading()
    fun showError(@StringRes message: Int)
    fun showError(message: String)
    fun showMessage(@StringRes message: Int)
    fun showMessage(message: String)
}