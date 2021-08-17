package com.example.mvvmcleanarch.domain.usecase

import com.example.mvvmcleanarch.data.model.movie.Movie
import com.example.mvvmcleanarch.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute():List<Movie>? = movieRepository.getMovies()
}