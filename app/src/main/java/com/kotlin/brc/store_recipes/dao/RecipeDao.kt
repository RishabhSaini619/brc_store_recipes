package com.kotlin.brc.store_recipes.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kotlin.brc.store_recipes.entities.Recipes

@Dao
interface RecipeDao {
    @get:Query("SELECT*FROM Recipes ORDER BY recipe_Id DESC")
    val allRecipes: List<Recipes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipes: Recipes)
}