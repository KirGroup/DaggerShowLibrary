package com.example.example2.di

import android.content.Context
import com.example.example2.data.database.ExampleDatabase
import com.example.example2.data.network.ExampleApiService
import com.example.example2.presentation.ExampleViewModel
import com.example.example2.presentation.MainActivity
import com.example.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun activityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance time: Long
        ): ApplicationComponent
    }
}