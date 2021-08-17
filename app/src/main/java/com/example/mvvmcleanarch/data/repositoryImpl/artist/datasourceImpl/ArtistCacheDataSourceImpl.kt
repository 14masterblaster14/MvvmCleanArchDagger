package com.example.mvvmcleanarch.data.repositoryImpl.artist.datasourceImpl

import com.example.mvvmcleanarch.data.model.artist.Artist
import com.example.mvvmcleanarch.data.repositoryImpl.artist.datasource.ArtistCacheDataSource

class ArtistCacheDataSourceImpl : ArtistCacheDataSource {
    private var artistList = ArrayList<Artist>()

    override suspend fun getArtistsFromCache(): List<Artist> {
        return artistList
    }

    override suspend fun saveArtistsToCache(artists: List<Artist>) {
        artistList.clear()
        artistList = ArrayList(artists)
    }
}