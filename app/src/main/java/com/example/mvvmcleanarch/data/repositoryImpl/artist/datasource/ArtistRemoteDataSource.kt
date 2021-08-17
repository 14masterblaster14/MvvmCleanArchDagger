package com.example.mvvmcleanarch.data.repositoryImpl.artist.datasource

import com.example.mvvmcleanarch.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists(): Response<ArtistList>
}