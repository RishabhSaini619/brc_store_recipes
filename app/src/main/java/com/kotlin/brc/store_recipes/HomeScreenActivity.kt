package com.kotlin.brc.store_recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kotlin.brc.store_recipes.adapter.CategoriesAdapter
import com.kotlin.brc.store_recipes.adapter.DishesAdapter
import com.kotlin.brc.store_recipes.entities.Recipes

class HomeScreenActivity : AppCompatActivity() {

    var arrayListCategories = ArrayList<Recipes>()
    var arrayListDishes = ArrayList<Recipes>()

    var CategoriesAdapter = CategoriesAdapter()
    var DishesAdapter = DishesAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_home)

        arrayListCategories.add(Recipes(1,"beef1"))
        arrayListCategories.add(Recipes(2,"bee2f"))
        arrayListCategories.add(Recipes(3,"beef3"))
        arrayListCategories.add(Recipes(4,"beef4"))

        CategoriesAdapter.setData(arrayListCategories)

        arrayListDishes.add(Recipes(1,"bee789f"))
        arrayListDishes.add(Recipes(2,"bee879f"))
        arrayListDishes.add(Recipes(3,"bee546f"))
        arrayListDishes.add(Recipes(4,"bee7f"))

        DishesAdapter.setData(arrayListDishes)

        list_categories.layoutManager = LinearLayoutManager(this)
        list_categories.adapter = CategoriesAdapter

        list_dishes.layoutManager = LinearLayoutManager(this)
        list_dishes.adapter = DishesAdapter

    }
}