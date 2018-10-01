package com.geniusforapp.notes.di.modules

import android.app.Application
import com.geniusforapp.notes.application.BaseApplication
import dagger.Binds
import dagger.Module

/**
 * App Module.
 */
@Module
internal abstract class ApplicationModule {

    @Binds
    internal abstract fun bindsApplication(app: BaseApplication): Application

}
