package com.geniusforapp.notes.application

import com.geniusforapp.notes.di.components.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
class BaseApplication : DaggerApplication() {


    override fun applicationInjector(): AndroidInjector<BaseApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }

}