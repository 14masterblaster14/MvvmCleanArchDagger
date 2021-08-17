package com.example.mvvmcleanarch.domain.usecase

import com.example.mvvmcleanarch.data.model.artist.Artist
import com.example.mvvmcleanarch.domain.repository.ArtistRepository

class GetArtistsUseCase (private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.getArtists()

}