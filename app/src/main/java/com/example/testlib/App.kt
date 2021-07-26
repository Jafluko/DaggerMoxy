package com.example.testlib

import android.app.AppComponentFactory
import android.app.Application
import com.example.testlib.di.AppComponent

class App : Application() {

    private lateinit var component: AppComponent
    fun getComponent(): AppComponent {
        return component
    }

    override fun onCreate() {
        super.onCreate()
        component = buildComponent()
    }

    private fun buildComponent(): AppComponent {
        return
    }
}