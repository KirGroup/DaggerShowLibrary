package com.example.example2

import android.app.Application
import com.example.example2.di.DaggerApplicationComponent
import java.text.SimpleDateFormat
import java.util.*

class App: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this, System.currentTimeMillis())
    }
}