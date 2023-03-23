package com.example.example2.data.network

import android.content.Context
import android.util.Log
import com.example.daggershowlibrary.R
import com.example.example2.di.ApplicationScope
import javax.inject.Inject

@ApplicationScope
class ExampleApiService @Inject constructor(
    private val context: Context,
    private val time: Long
) {

    fun method() {
        Log.d("MY_EXAMPLE_TEST", "My ExampleApiService ${context.getString(R.string.app_name)} $time")
    }

    companion object {

        private const val LOG_TAG = "MY_EXAMPLE_TEST"
    }
}
