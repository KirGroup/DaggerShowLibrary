package com.example.example2.di

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.example2.presentation.ExampleViewModel
import com.example.example2.presentation.ExampleViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(ExampleViewModel::class)
    @Binds
    fun bindExampleViewModel(exampleViewModel: ExampleViewModel): ViewModel

    @IntoMap
    @ViewModelKey(ExampleViewModel2::class)
    @Binds
    fun bindExampleViewModel2(exampleViewModel2: ExampleViewModel2): ViewModel
}