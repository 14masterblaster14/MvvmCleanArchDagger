package com.example.mvvmcleanarch.data.repositoryImpl.tvshow.datasource

import com.example.mvvmcleanarch.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {

    suspend fun getTvShows(): Response<TvShowList>
}