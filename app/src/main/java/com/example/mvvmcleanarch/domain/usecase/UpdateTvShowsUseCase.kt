package com.example.mvvmcleanarch.domain.usecase

import com.example.mvvmcleanarch.data.model.tvshow.TvShow
import com.example.mvvmcleanarch.domain.repository.TvShowRepository

class UpdateTvShowsUseCase (private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.updateTvShows()
}