package com.kotlin.brc.store_recipes.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.kotlin.brc.store_recipes.entities.converter.ConverterListCategory


@Entity("Category")
data class Category(
    @PrimaryKey(autoGenerate = true)
    var recipe_Id: Int,

    @ColumnInfo(name = "categoryItem")
    @Expose
    @SerializedName("categories")
    @TypeConverters(ConverterListCategory::class)
    var categoryItem: List<CategoryItem>? = null
)