package com.example.android.dagger

import com.example.android.dagger.storage.Storage
import javax.inject.Inject

class FakeStorage @Inject constructor(): Storage {

    private var stores: MutableMap<String, String> = mutableMapOf()


    override fun setString(key: String, value: String) {
        stores[key] = value
    }

    override fun getString(key: String): String {
        return stores[key].orEmpty()
    }

}
