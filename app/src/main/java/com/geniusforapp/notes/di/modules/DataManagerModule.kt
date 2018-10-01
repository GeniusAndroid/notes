package com.geniusforapp.notes.di.modules

import com.geniusforapp.notes.BuildConfig
import com.geniusforapp.notes.application.helpers.rx.AppSchedulerProvider
import com.geniusforapp.notes.application.helpers.rx.SchedulerProvider
import com.geniusforapp.notes.data.DataManager
import com.geniusforapp.notes.data.DataMangerRepository
import com.geniusforapp.notes.data.local.db.DbManager
import com.geniusforapp.notes.data.local.db.DbManagerRepository
import com.geniusforapp.notes.data.remote.api.ApiHeader
import com.geniusforapp.notes.data.remote.api.ApiInterceptor
import com.geniusforapp.notes.data.remote.api.ApiManager
import com.geniusforapp.notes.data.remote.api.ApiManagerRepository
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
@Module
class DataManagerModule {

    @Provides
    @Singleton
    fun provideDbManager(dbManagerRepository: DbManagerRepository): DbManager {
        return dbManagerRepository
    }

    @Provides
    @Singleton
    fun provideApiManager(adiManagerRepository: ApiManagerRepository): ApiManager {
        return adiManagerRepository
    }

    @Provides
    @Singleton
    fun provideDataManager(dataMangerRepository: DataMangerRepository): DataManager {
        return dataMangerRepository
    }

    @Provides
    @Singleton
    fun provideApiHeader(): ApiHeader {
        return ApiHeader()
    }


    @Provides
    @Singleton
    fun provideCompositeDisposable(): CompositeDisposable {
        return CompositeDisposable()
    }

    @Provides
    @Singleton
    fun provideAppSchedulerProvider(): SchedulerProvider {
        return AppSchedulerProvider()
    }

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .client(OkHttpClient().newBuilder()
                        .connectTimeout(60L, TimeUnit.SECONDS)
                        .readTimeout(60L, TimeUnit.SECONDS)
                        .writeTimeout(60L, TimeUnit.SECONDS)
                        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                        .addInterceptor(ApiInterceptor())
                        .build())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
}