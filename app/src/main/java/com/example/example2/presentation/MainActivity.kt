package com.example.example2.presentation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.daggershowlibrary.R
import com.example.daggershowlibrary.databinding.ActivityMainBinding
import com.example.example2.App
import java.util.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }
    private val viewModel2 by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel2::class.java]
    }

    private val component by lazy {
        (application as App)
            .component
            .activityComponentFactory()
            .create("My Id")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel.method()
        viewModel2.method()

        binding.tvActivity.setOnClickListener {
            Intent(this, MainActivity2::class.java).apply {
                startActivity(this)
            }
        }
    }
}