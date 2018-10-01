package com.geniusforapp.notes.data.remote.api.models.notes

import com.geniusforapp.notes.data.remote.api.models.BaseResponse


/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
class Note(var id: Int, var note: String, var timestamp: String) : BaseResponse() {
}