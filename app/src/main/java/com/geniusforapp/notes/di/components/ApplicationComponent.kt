package com.geniusforapp.notes.di.components

import com.geniusforapp.notes.application.BaseApplication
import com.geniusforapp.notes.di.modules.ActivityModule
import com.geniusforapp.notes.di.modules.ApplicationModule
import com.geniusforapp.notes.di.modules.DataManagerModule
import com.geniusforapp.notes.di.modules.FragmentsModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * App Component.
 */
@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityModule::class,
    ApplicationModule::class,
    DataManagerModule::class,
    FragmentsModule::class
])
internal interface ApplicationComponent : AndroidInjector<BaseApplication> {

    /**
     * Builder Interface.
     */
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<BaseApplication>()
}
