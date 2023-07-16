package com.example.hiltpractice.di.module

import com.example.hiltpractice.SessionManager
import com.example.hiltpractice.storage.Valuator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class MainViewModelModule {

    @Provides
    @ViewModelScoped
    fun provideSessionManager(valuator: Valuator):SessionManager{

        return SessionManager(valuator)
    }
}