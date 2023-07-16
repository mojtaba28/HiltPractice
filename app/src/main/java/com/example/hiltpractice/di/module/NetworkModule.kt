package com.example.hiltpractice.di.module

import com.example.hiltpractice.di.qualifire.RetrofitGitHubQualifier

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

//    for singleton scope you should change @InstallIn(ActivityComponent::class)
//    to @InstallIn(SingletonComponent::class)
//    for retrofit use like this

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://google.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    @RetrofitGitHubQualifier
    fun provideRetrofit2(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://github.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }



}