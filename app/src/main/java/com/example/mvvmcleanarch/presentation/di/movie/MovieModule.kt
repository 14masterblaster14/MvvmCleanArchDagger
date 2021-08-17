package com.example.mvvmcleanarch.presentation.di.movie

import com.example.mvvmcleanarch.domain.usecase.GetMoviesUseCase
import com.example.mvvmcleanarch.domain.usecase.UpdateMoviesUseCase
import com.example.mvvmcleanarch.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }
}