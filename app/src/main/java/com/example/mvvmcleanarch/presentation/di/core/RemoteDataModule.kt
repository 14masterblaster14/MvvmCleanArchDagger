package com.example.mvvmcleanarch.presentation.di.core

import com.example.mvvmcleanarch.data.api.TMDBService
import com.example.mvvmcleanarch.data.repositoryImpl.artist.datasource.ArtistRemoteDataSource
import com.example.mvvmcleanarch.data.repositoryImpl.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.example.mvvmcleanarch.data.repositoryImpl.movie.datasource.MovieCacheDataSource
import com.example.mvvmcleanarch.data.repositoryImpl.movie.datasource.MovieRemoteDataSource
import com.example.mvvmcleanarch.data.repositoryImpl.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.example.mvvmcleanarch.data.repositoryImpl.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.example.mvvmcleanarch.data.repositoryImpl.tvshow.datasource.TvShowRemoteDataSource
import com.example.mvvmcleanarch.data.repositoryImpl.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule (private val apiKey: String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDataSource {
        return TvShowRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }


}