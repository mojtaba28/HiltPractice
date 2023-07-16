package com.example.hiltpractice.storage

interface Valuator {

    fun readToken():String
    fun saveToken(token:String)

}