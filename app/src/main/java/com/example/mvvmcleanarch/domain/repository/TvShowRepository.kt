package com.example.mvvmcleanarch.domain.repository

import com.example.mvvmcleanarch.data.model.tvshow.TvShow

interface TvShowRepository {

    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}