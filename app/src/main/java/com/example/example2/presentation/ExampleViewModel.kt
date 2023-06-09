package com.example.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.example2.di.ApplicationScope
import com.example.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Singleton

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    private val id: Long
): ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "$this $id")
    }
}