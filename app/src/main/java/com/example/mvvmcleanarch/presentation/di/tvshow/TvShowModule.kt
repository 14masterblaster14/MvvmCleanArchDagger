package com.example.mvvmcleanarch.presentation.di.tvshow

import com.example.mvvmcleanarch.domain.usecase.GetTvShowsUseCase
import com.example.mvvmcleanarch.domain.usecase.UpdateTvShowsUseCase
import com.example.mvvmcleanarch.presentation.tvshow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {

    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}