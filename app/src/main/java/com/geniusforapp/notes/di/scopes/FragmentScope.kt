package com.geniusforapp.notes.di.scopes

import dagger.Component
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/


/**
 * Annotation for Dagger components that signifies the scope of the component is the [Fragment] that the
 * [Component] injects into.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
annotation class FragmentScope
