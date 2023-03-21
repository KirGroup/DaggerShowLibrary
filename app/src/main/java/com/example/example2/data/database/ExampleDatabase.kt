package com.example.example2.data.database

import android.content.Context
import android.util.Log
import com.example.daggershowlibrary.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val time: String
) {

    fun method() {
        Log.d("MY_EXAMPLE_TEST", "ExampleDatabase ${context.getString(R.string.app_name)} $time $this")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}