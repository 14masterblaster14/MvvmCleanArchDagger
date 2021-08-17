package com.example.mvvmcleanarch.presentation

import android.app.Application
import com.example.mvvmcleanarch.BuildConfig
import com.example.mvvmcleanarch.presentation.di.Artist.ArtistSubComponent
import com.example.mvvmcleanarch.presentation.di.Injector
import com.example.mvvmcleanarch.presentation.di.core.*
import com.example.mvvmcleanarch.presentation.di.movie.MovieSubComponent
import com.example.mvvmcleanarch.presentation.di.tvshow.TvShowSubComponent

class MovieApplication : Application(), Injector {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()         // Need to add only modules with constructor parameter
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()

    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
        return appComponent.tvShowSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }
}