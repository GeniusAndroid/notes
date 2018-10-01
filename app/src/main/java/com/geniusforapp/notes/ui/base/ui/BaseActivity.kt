package com.geniusforapp.notes.ui.base.ui

import com.geniusforapp.notes.ui.base.mvp.MvpView
import dagger.android.support.DaggerAppCompatActivity

/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
open class BaseActivity : DaggerAppCompatActivity(), MvpView {
    override fun showLoading() {

    }

    override fun showError(message: Int) {
        showError(getString(message))
    }

    override fun showError(message: String) {

    }

    override fun showMessage(message: Int) {
        showMessage(getString(message))
    }

    override fun showMessage(message: String) {

    }
}