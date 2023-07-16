package com.example.hiltpractice.di.module

import android.content.Context
import com.example.hiltpractice.storage.PrefValuator
import com.example.hiltpractice.storage.Valuator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ActivityComponent::class)
 class AppModule {


//    for singleton scope you should change @InstallIn(ActivityComponent::class)
//    to @InstallIn(SingletonComponent::class)
//    for retrofit use like this
//    @Provides
//    @Singleton
//    fun provideRetrofit():Retrofit{
//        return Retrofit.Builder()
//            .baseUrl()
//            .build()
//    }

//    @Binds
//    abstract fun provideValuator(prefValuator: PrefValuator):Valuator

    // provide, same as up
    @Provides
    fun provideValuator(@ApplicationContext context: Context): Valuator {
        return PrefValuator(context)
    }

}