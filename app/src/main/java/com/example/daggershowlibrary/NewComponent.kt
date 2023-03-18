package com.example.daggershowlibrary

import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {
    fun inject(activity: Activity)
}