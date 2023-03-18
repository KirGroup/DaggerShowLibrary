package com.example.example2.di

import com.example.example2.data.repository.ExampleRepositoryImpl
import com.example.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}