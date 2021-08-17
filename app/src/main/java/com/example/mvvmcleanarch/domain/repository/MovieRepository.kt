package com.example.mvvmcleanarch.domain.repository

import com.example.mvvmcleanarch.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?
}