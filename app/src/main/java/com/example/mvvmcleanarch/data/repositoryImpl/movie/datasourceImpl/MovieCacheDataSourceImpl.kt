package com.example.mvvmcleanarch.data.repositoryImpl.movie.datasourceImpl

import com.example.mvvmcleanarch.data.model.movie.Movie
import com.example.mvvmcleanarch.data.repositoryImpl.movie.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl : MovieCacheDataSource {

    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}