package com.example.mvvmcleanarch.domain.repository

import com.example.mvvmcleanarch.data.model.artist.Artist

interface ArtistRepository {

    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}