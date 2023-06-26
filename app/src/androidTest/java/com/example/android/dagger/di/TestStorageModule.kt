package com.example.android.dagger.di

import com.example.android.dagger.FakeStorage
import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

@Module
abstract class TestStorageModule {
    @Binds
    abstract fun provideStorage(storage: FakeStorage): Storage
}