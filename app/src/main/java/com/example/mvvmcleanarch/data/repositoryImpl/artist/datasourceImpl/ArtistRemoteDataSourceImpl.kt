package com.example.mvvmcleanarch.data.repositoryImpl.artist.datasourceImpl

import com.example.mvvmcleanarch.data.api.TMDBService
import com.example.mvvmcleanarch.data.model.artist.ArtistList
import com.example.mvvmcleanarch.data.repositoryImpl.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl (
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDataSource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}