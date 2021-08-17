package com.example.mvvmcleanarch.presentation.di.Artist

import com.example.mvvmcleanarch.domain.usecase.GetArtistsUseCase
import com.example.mvvmcleanarch.domain.usecase.UpdateArtistsUseCase
import com.example.mvvmcleanarch.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }
}