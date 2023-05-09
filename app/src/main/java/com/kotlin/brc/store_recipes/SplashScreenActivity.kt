package com.kotlin.brc.store_recipes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import com.kotlin.brc.store_recipes.database.RecipeDatabase
import com.kotlin.brc.store_recipes.entities.Category
import com.kotlin.brc.store_recipes.entities.Meals
import com.kotlin.brc.store_recipes.entities.MealsItems
import com.kotlin.brc.store_recipes.interfaces.GetDataService
import com.kotlin.brc.store_recipes.retofitclient.RetrofitClientInstance
import kotlinx.coroutines.launch
import pub.devrel.easypermissions.AppSettingsDialog
import pub.devrel.easypermissions.EasyPermissions
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var buttonStart: Button
    private lateinit var screenLoader: ProgressBar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_splash)

        buttonStart= findViewById(R.id.btn_start)
        screenLoader= findViewById(R.id.loader)

        setUpEventListener()

    }
    private fun setUpEventListener() {
        screenLoader.visibility= View.INVISIBLE

        buttonStart.setOnClickListener{
            var intent = Intent(this@SplashScreenActivity, HomeScreenActivity::class.java)
        startActivity(intent)
        finish()
    }
    }

}