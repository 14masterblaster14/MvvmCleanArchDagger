package com.example.mvvmcleanarch.data.repositoryImpl.artist.datasource

import com.example.mvvmcleanarch.data.model.artist.Artist

interface ArtistLocalDataSource {

    suspend fun getArtistsFromDB():List<Artist>
    suspend fun saveArtistsToDB(artists:List<Artist>)
    suspend fun clearAll()
}