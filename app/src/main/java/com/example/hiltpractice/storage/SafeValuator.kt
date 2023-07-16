package com.example.hiltpractice.storage

import android.content.Context
import android.util.Base64
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class SafeValuator @Inject constructor(@ApplicationContext context: Context): Valuator {

    private val pref=context.getSharedPreferences("hilt",Context.MODE_PRIVATE)
    private val TOKEN_KEY="TOKEN"
    override fun readToken(): String {
        return String(Base64.decode(pref.getString(TOKEN_KEY, "") ?: "",Base64.DEFAULT))
    }

    override fun saveToken(token: String) {
        pref.edit().putString(TOKEN_KEY, Base64.encodeToString(token.toByteArray(), Base64.DEFAULT))
            .apply()
    }
}