package com.example.mvvmcleanarch.data.repositoryImpl.movie.datasource

import com.example.mvvmcleanarch.data.model.movie.Movie

interface MovieCacheDataSource {

    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)
}