package com.geniusforapp.notes.application.helpers.rx

import io.reactivex.*

/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
interface SchedulerProvider {
    fun ui(): Scheduler

    fun computation(): Scheduler

    fun io(): Scheduler

    fun <T> ioToMainObservableScheduler(): ObservableTransformer<T, T>

    fun <T> ioToMainSingleScheduler(): SingleTransformer<T, T>

    fun ioToMainCompletableScheduler(): CompletableTransformer

    fun <T> ioToMainFlowableScheduler(): FlowableTransformer<T, T>

    fun <T> ioToMainMaybeScheduler(): MaybeTransformer<T, T>
}