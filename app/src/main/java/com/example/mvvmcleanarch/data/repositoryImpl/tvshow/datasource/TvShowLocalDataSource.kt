package com.example.mvvmcleanarch.data.repositoryImpl.tvshow.datasource

import com.example.mvvmcleanarch.data.model.tvshow.TvShow

interface TvShowLocalDataSource {

    suspend fun getTvShowsFromDB():List<TvShow>
    suspend fun saveTvShowsToDB(tvShows:List<TvShow>)
    suspend fun clearAll()
}