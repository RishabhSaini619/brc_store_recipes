package com.kotlin.brc.store_recipes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var buttonStart: Button
    private lateinit var screenLoader: ProgressBar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_splash)
        buttonStart= findViewById(R.id.btn_start)

        setUpEventListener()

    }
    private fun setUpEventListener() {

        buttonStart.setOnClickListener{
            var intent = Intent(this@SplashScreenActivity, HomeScreenActivity::class.java)
        startActivity(intent)
        finish()
    }
    }
}