package com.kotlin.brc.store_recipes.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.kotlin.brc.store_recipes.dao.RecipeDao
import com.kotlin.brc.store_recipes.entities.Recipes
import com.kotlin.brc.store_recipes.entities.Category
import com.kotlin.brc.store_recipes.entities.MealsItems
import com.kotlin.brc.store_recipes.entities.CategoryItems
import com.kotlin.brc.store_recipes.entities.Meals
import com.kotlin.brc.store_recipes.entities.converter.CategoryListConverter
import com.kotlin.brc.store_recipes.entities.converter.MealListConverter

@Database(entities = [Recipes::class, Category::class, CategoryItems::class, Meals::class, MealsItems::class], version = 1, exportSchema = false)
@TypeConverters(CategoryListConverter::class, MealListConverter::class)


abstract class RecipeDatabase : RoomDatabase(

) {
    companion object {
        var recipeDatabase: RecipeDatabase? = null

        @Synchronized
        fun getDatabase(context: Context): RecipeDatabase {
            if (
                recipeDatabase != null
            ) {
                recipeDatabase = Room.databaseBuilder(
                    context,
                    RecipeDatabase::class.java,
                    "recipe.db"
                ).build()
            }
            return recipeDatabase!!
        }
    }

    abstract fun recipeDao(): RecipeDao
}