package com.example.mvvmcleanarch.data.repositoryImpl.tvshow.datasourceImpl

import com.example.mvvmcleanarch.data.api.TMDBService
import com.example.mvvmcleanarch.data.model.tvshow.TvShowList
import com.example.mvvmcleanarch.data.repositoryImpl.tvshow.datasource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl (
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDataSource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}
