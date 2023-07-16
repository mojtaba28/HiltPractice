package com.example.hiltpractice.storage

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class PrefValuator @Inject constructor(@ApplicationContext val context: Context) : Valuator {

    private val pref = context.getSharedPreferences("hilty",Context.MODE_PRIVATE)

    private val TOKEN_KEY = "TOKEN"

    override fun saveToken(token:String){
        pref.edit().putString(TOKEN_KEY,token).apply()
    }


    override fun readToken():String{
        return pref.getString(TOKEN_KEY,"")?:""
    }


}