package com.example.hiltpractice.viewmodel

import androidx.lifecycle.ViewModel
import com.example.hiltpractice.SessionManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val sessionManager:SessionManager):ViewModel() {

    private var counter=0

    fun addCounter():Int{
        counter++
        return counter
    }

    fun saveToken(token: String) {
        sessionManager.saveToken(token)
    }

    fun getToken():String = sessionManager.getToken()
}