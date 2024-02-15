package com.ingeacev.meliprueba.di

import com.ingeacev.meliprueba.data.source.remote.MeliApi
import com.ingeacev.meliprueba.util.BASE_URL
import com.ingeacev.meliprueba.util.SITE_ID
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {

    @Provides
    @Singleton
    fun provideMeliApi(): MeliApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MeliApi::class.java)
    }
}