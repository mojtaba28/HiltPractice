package com.example.hiltpractice.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import com.example.hiltpractice.R

import com.example.hiltpractice.di.qualifire.RetrofitGitHubQualifier
import com.example.hiltpractice.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel:MainViewModel by viewModels()
    @Inject
    lateinit var retrofit:Retrofit
    @Inject
    @RetrofitGitHubQualifier
    lateinit var retrofit2: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.saveToken("s51d5as1d5as1d5")
        findViewById<TextView>(R.id.text).setText(viewModel.getToken())

        Log.e("retrofit","Activity: 1  Retrofit1:"+retrofit.hashCode()+" Url:"+retrofit.baseUrl())
        Log.e("retrofit","Activity: 1  Retrofit2:"+retrofit2.hashCode()+" Url:"+retrofit2.baseUrl())
    }
}