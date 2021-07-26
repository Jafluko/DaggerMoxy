package com.example.testlib.di

import android.support.v4.app.FragmentActivity
import androidx.annotation.Nullable
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
public class ModuleContainer {

    @Provides
    @Nullable
    @Singleton
    public fun getFragmentActivity(): FragmentActivity {
        return FragmentActivity()
    }
}