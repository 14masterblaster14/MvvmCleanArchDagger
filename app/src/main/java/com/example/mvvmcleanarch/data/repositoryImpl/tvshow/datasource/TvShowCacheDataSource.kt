package com.example.mvvmcleanarch.data.repositoryImpl.tvshow.datasource

import com.example.mvvmcleanarch.data.model.tvshow.TvShow

interface TvShowCacheDataSource {

    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)
}