package com.example.testlib.di

import com.example.testlib.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = [ModuleContainer::class])
@Singleton
interface AppComponent {
    fun inject(mainActivity: MainActivity);
}