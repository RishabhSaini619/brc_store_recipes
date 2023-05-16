package com.kotlin.brc.store_recipes.retrofitclient

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClientInstance {
    private lateinit var retrofit: Retrofit
    private val baseURl = "https://www.themealdb.com/api/json/v1/1/"
        val retrofitInstance:Retrofit
        get() {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(baseURl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
}