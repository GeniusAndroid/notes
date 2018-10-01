package com.geniusforapp.notes.di.modules

import com.geniusforapp.notes.di.scopes.ActivityScope
import com.geniusforapp.notes.ui.activites.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
@Module
abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector()
    abstract fun mainActivity(): MainActivity
}