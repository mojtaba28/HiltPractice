package com.example.hiltpractice

import com.example.hiltpractice.storage.Valuator
import javax.inject.Inject

class SessionManager @Inject constructor(val valuator: Valuator) {

    private var token = "5s4sd5s54fd5sd4f45"

    fun getToken():String{
        token=valuator.readToken()
        return token
    }

    fun saveToken(token:String){

        this.token = token
        valuator.saveToken(token)
    }
}