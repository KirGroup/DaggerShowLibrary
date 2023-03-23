package com.example.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.example2.di.ApplicationScope
import com.example.example2.domain.ExampleRepository
import com.example.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Singleton

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository,
    private val id: Long
): ViewModel() {

    fun method() {
        repository.method()
        Log.d("ExampleViewModel2", "$this $id")
    }
}