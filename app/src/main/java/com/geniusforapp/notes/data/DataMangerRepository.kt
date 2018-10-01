package com.geniusforapp.notes.data

import com.geniusforapp.notes.data.local.db.DbManager
import com.geniusforapp.notes.data.remote.api.ApiHeader
import com.geniusforapp.notes.data.remote.api.ApiManager
import com.geniusforapp.notes.data.remote.api.models.notes.Note
import com.geniusforapp.notes.data.remote.api.models.user.User
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
@Singleton
class DataMangerRepository @Inject constructor(var apiManager: ApiManager, var dbManager: DbManager) : DataManager {
    override fun register(deviceId: String): Single<User> {
        return apiManager.register(deviceId)
    }

    override fun createNote(note: String): Single<Note> {
        return apiManager.createNote(note)
    }

    override fun fetchAllNotes(): Single<List<Note>> {
        return apiManager.fetchAllNotes()
    }

    override fun updateNote(noteId: Int, note: String): Completable {
        return apiManager.updateNote(noteId, note)
    }

    override fun deleteNote(noteId: Int): Completable {
        return apiManager.deleteNote(noteId)
    }

    override fun apiHeader(): ApiHeader {
        return apiManager.apiHeader()
    }
}