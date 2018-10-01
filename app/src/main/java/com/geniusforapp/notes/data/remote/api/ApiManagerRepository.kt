package com.geniusforapp.notes.data.remote.api

import com.geniusforapp.notes.data.remote.api.models.notes.Note
import com.geniusforapp.notes.data.remote.api.models.user.User
import io.reactivex.Completable
import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
@Singleton
class ApiManagerRepository @Inject constructor(private var apiHeader: ApiHeader, private var retrofit: Retrofit) : ApiManager {


    override fun register(deviceId: String): Single<User> {
        return retrofit.create(ApiManager::class.java).register(deviceId)
    }

    override fun createNote(note: String): Single<Note> {
        return retrofit.create(ApiManager::class.java).createNote(note)
    }

    override fun fetchAllNotes(): Single<List<Note>> {
        return retrofit.create(ApiManager::class.java).fetchAllNotes()
    }

    override fun updateNote(noteId: Int, note: String): Completable {
        return retrofit.create(ApiManager::class.java).updateNote(noteId, note)
    }

    override fun deleteNote(noteId: Int): Completable {
        return retrofit.create(ApiManager::class.java).deleteNote(noteId)
    }

    override fun apiHeader(): ApiHeader {
        return apiHeader
    }
}