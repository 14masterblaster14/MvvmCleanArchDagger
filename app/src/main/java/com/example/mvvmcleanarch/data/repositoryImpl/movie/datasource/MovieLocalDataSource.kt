package com.example.mvvmcleanarch.data.repositoryImpl.movie.datasource

import com.example.mvvmcleanarch.data.model.movie.Movie

interface MovieLocalDataSource {

    suspend fun getMoviesFromDB():List<Movie>
    suspend fun saveMoviesToDB(movies:List<Movie>)
    suspend fun clearAll()
}