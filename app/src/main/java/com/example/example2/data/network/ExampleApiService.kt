package com.example.example2.data.network

import android.content.Context
import android.util.Log
import com.example.daggershowlibrary.R
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val context: Context,
    private val time: String
) {

    fun method() {
        Log.d("MY_EXAMPLE_TEST", "My ExampleApiService ${context.getString(R.string.app_name)} $time")
    }

    companion object {

        private const val LOG_TAG = "MY_EXAMPLE_TEST"
    }
}
