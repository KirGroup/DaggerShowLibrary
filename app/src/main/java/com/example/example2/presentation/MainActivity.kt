package com.example.example2.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.daggershowlibrary.R
import com.example.example2.App
import com.example.example2.data.database.ExampleDatabase
import com.example.example2.data.network.ExampleApiService
import com.example.example2.di.DaggerApplicationComponent
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val component by lazy {
        (application as App).component
    }

    override fun onCreate(savedInstanceState: Bundle?) {
//        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        viewModel.method()
        Log.d("MainActivity1", "${component.getViewModel()}")
        Log.d("MainActivity1", "${component.getViewModel()}")
        Log.d("MainActivity1", "${component.getDatabase()}")
        Log.d("MainActivity1", "${component.getDatabase()}")
    }
}