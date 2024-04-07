package com.plcoding.spotifycloneyt.data.remote

import com.google.firebase.firestore.FirebaseFirestore
import com.plcoding.spotifycloneyt.data.enteties.Song
import com.plcoding.spotifycloneyt.other.Constants
import kotlinx.coroutines.tasks.await

class SongsDataBase {
    private val fireStore = FirebaseFirestore.getInstance()
    private val songsCollection = fireStore.collection(Constants.SONG_COLLECTION)

    suspend fun getAllSongs(): List<Song> {
        return try {
            songsCollection.get().await().toObjects(Song::class.java)
        } catch (ex: Exception) {
            emptyList()
        }
    }
}