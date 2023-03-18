package com.example.example2.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ContextModule(private val application: Context) {

    @Provides
    fun provideContext(): Context {
        return application
    }
}