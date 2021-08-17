package com.example.mvvmcleanarch.data.repositoryImpl.artist.datasource

import com.example.mvvmcleanarch.data.model.artist.Artist

interface ArtistCacheDataSource {

    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists:List<Artist>)
}