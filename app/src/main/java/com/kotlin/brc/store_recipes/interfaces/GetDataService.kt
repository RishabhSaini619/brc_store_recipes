package com.kotlin.brc.store_recipes.interfaces

import com.kotlin.brc.store_recipes.entities.Category
import com.kotlin.brc.store_recipes.entities.MealResponse
import com.kotlin.brc.store_recipes.entities.Meals
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetDataService {
    @GET("categories.php")
    fun getCategoryList(): Call<Category>

    @GET("filter.php")
    fun getMealList(@Query("c") category: String): Call<Meals>

    @GET("lookup.php")
    fun getSpecificItem(@Query("i") id: String): Call<MealResponse>


}