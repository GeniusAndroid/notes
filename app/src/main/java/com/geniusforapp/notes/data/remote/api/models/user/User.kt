package com.geniusforapp.notes.data.remote.api.models.user

import com.geniusforapp.notes.data.remote.api.models.BaseResponse
import com.google.gson.annotations.SerializedName


/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/
class User : BaseResponse() {

    @SerializedName("api_key")
    var apiKey: String? = null
        internal set
}