package com.example.mvvmcleanarch.presentation.di.core

import com.example.mvvmcleanarch.data.repositoryImpl.artist.datasource.ArtistCacheDataSource
import com.example.mvvmcleanarch.data.repositoryImpl.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.example.mvvmcleanarch.data.repositoryImpl.movie.datasource.MovieCacheDataSource
import com.example.mvvmcleanarch.data.repositoryImpl.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.example.mvvmcleanarch.data.repositoryImpl.tvshow.datasource.TvShowCacheDataSource
import com.example.mvvmcleanarch.data.repositoryImpl.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }


}