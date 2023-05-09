package com.kotlin.brc.store_recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.brc.store_recipes.adapter.CategoriesAdapter
import com.kotlin.brc.store_recipes.adapter.DishesAdapter
import com.kotlin.brc.store_recipes.entities.CategoryItems
import com.kotlin.brc.store_recipes.entities.MealsItems
import com.kotlin.brc.store_recipes.entities.Recipes

class HomeScreenActivity : AppCompatActivity() {

    var arrayListCategories = ArrayList<CategoryItems>()
    var arrayListDishes = ArrayList<MealsItems>()

    private var categoriesAdapter = CategoriesAdapter()
    private var dishesAdapter = DishesAdapter()

    private lateinit var listCategories :RecyclerView
    private lateinit var listDishes:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_home)

        listCategories=findViewById(R.id.list_categories)
        listDishes=findViewById(R.id.list_dishes)

//        arrayListCategories.add(Recipes(1,"beef1"))
//        arrayListCategories.add(Recipes(2,"bee2f"))
//        arrayListCategories.add(Recipes(3,"beef3"))
//        arrayListCategories.add(Recipes(4,"beef4"))

        categoriesAdapter.setData(arrayListCategories)

//        arrayListDishes.add(Recipes(1,"bee789f"))
//        arrayListDishes.add(Recipes(2,"bee879f"))
//        arrayListDishes.add(Recipes(3,"bee546f"))
//        arrayListDishes.add(Recipes(4,"bee7f"))

        dishesAdapter.setData(arrayListDishes)

        listCategories.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        listCategories.adapter = categoriesAdapter

        listDishes.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        listDishes.adapter = dishesAdapter

    }
}


