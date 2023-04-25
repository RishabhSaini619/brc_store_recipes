package com.kotlin.brc.store_recipes.entities

import  androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity("Recipes")

data class Recipes(
    @PrimaryKey(autoGenerate = true)
    var recipe_Id: Int
) : Serializable