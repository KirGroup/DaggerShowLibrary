package com.example.example2.di

import com.example.example2.data.datasource.ExampleLocalDataSource
import com.example.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.example2.data.datasource.ExampleRemoteDataSource
import com.example.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindDatabase(db: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteDatabase(remoteDb: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource


}