package com.example.daggershowlibrary

class Activity {

    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }

}