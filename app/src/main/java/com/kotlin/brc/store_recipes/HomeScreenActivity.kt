package com.kotlin.brc.store_recipes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.brc.store_recipes.adapter.CategoriesAdapter
import com.kotlin.brc.store_recipes.adapter.DishesAdapter
import com.kotlin.brc.store_recipes.entities.Recipes

class HomeScreenActivity : AppCompatActivity() {

    var arrayListCategories = ArrayList<Recipes>()
    var arrayListDishes = ArrayList<Recipes>()

    var categoriesAdapter = CategoriesAdapter()
    var dishesAdapter = DishesAdapter()

    private lateinit var listDishes : RecyclerView
    private lateinit var listCategories : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_screen_home)

        listDishes=findViewById(R.id.list_dishes)
        listCategories=findViewById(R.id.list_categories)

        arrayListCategories.add(Recipes(0,"beef1"))
        arrayListCategories.add(Recipes(1,"bee2f"))
        arrayListCategories.add(Recipes(3,"beef3"))
        arrayListCategories.add(Recipes(4,"beef4"))

        categoriesAdapter.setData(arrayListCategories)

        arrayListDishes.add(Recipes(1,"bee789f"))
        arrayListDishes.add(Recipes(2,"bee879f"))
        arrayListDishes.add(Recipes(3,"bee546f"))
        arrayListDishes.add(Recipes(4,"bee7f"))

        dishesAdapter.setData(arrayListDishes)

        listCategories.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        listCategories.adapter = categoriesAdapter

        listDishes.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        listDishes.adapter = dishesAdapter

    }
}