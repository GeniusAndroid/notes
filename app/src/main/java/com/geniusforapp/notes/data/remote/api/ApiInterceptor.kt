package com.geniusforapp.notes.data.remote.api

import okhttp3.Interceptor
import okhttp3.Response


/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
class ApiInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val requestBuilder = original.newBuilder()
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "")
        val request = requestBuilder.build()
        return chain.proceed(request)
    }
}