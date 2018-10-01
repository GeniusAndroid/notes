package com.geniusforapp.notes.di.scopes

import android.app.Activity
import dagger.Component
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

/**
 * Annotation for Dagger components that signifies the scope of the component is the [Activity] that the
 * [Component] injects into.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
annotation class ActivityScope
