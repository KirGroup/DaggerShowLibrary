package com.example.example2.data.database

import android.content.Context
import android.util.Log
import com.example.daggershowlibrary.R
import com.example.example2.di.ApplicationScope
import javax.inject.Inject

@ApplicationScope
class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val time: Long
) {

    fun method() {
        Log.d("MY_EXAMPLE_TEST", "ExampleDatabase ${context.getString(R.string.app_name)} $time $this")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}