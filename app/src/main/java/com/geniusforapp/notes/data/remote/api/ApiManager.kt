package com.geniusforapp.notes.data.remote.api

import com.geniusforapp.notes.data.remote.api.models.notes.Note
import com.geniusforapp.notes.data.remote.api.models.user.User
import io.reactivex.Completable
import io.reactivex.Single
import retrofit2.http.*


/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
interface ApiManager {

    fun apiHeader(): ApiHeader

    @FormUrlEncoded
    @POST("user/register")
    fun register(@Field("device_id") deviceId: String): Single<User>

    // Create note
    @FormUrlEncoded
    @POST("new")
    fun createNote(@Field("note") note: String): Single<Note>

    // Fetch all notes
    @GET("all")
    fun fetchAllNotes(): Single<List<Note>>

    // Update single note
    @FormUrlEncoded
    @PUT("{id}")
    fun updateNote(@Path("id") noteId: Int, @Field("note") note: String): Completable

    // Delete note
    @DELETE("{id}")
    fun deleteNote(@Path("id") noteId: Int): Completable
}