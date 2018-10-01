package com.geniusforapp.notes.data

import com.geniusforapp.notes.data.local.db.DbManager
import com.geniusforapp.notes.data.remote.api.ApiManager

/**
 * @name testAndroidDagger
 * Copyrights (c) 10/1/18 Created By Ahmad Najar
 **/

interface DataManager : DbManager, ApiManager {
}