package com.example.mvvmcleanarch.data.repositoryImpl.movie.datasource

import com.example.mvvmcleanarch.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {

    suspend fun getMovies(): Response<MovieList>
}