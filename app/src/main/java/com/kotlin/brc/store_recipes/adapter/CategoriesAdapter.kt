package com.kotlin.brc.store_recipes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.brc.store_recipes.R
import com.kotlin.brc.store_recipes.entities.Recipes
//import kotlinx.android.synthetic.main.item_list_categories.view.*

class CategoriesAdapter:RecyclerView.Adapter<CategoriesAdapter.RecipeViewHolder>() {

    var listener: CategoriesAdapter.OnItemClickListener? = null
    var context: Context? = null
    var arrayListCategories = ArrayList<Recipes>()

    class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
    fun setData(arrData : List<Recipes>){
        arrayListCategories = arrData as ArrayList<Recipes>
    }
    fun setClickListener(listener1: OnItemClickListener){
        listener = listener1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        context = parent.context
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list_categories,parent,false))
    }

    override fun getItemCount(): Int {
        return arrayListCategories.size
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {

//    holder.itemView.name_category = arrayListCategories[position].recipe_Name
//    holder.itemView.rootView.setOnClickListener {
//            listener!!.onClicked(arrayListCategories[position].strcategory)
//        }
    }
    interface OnItemClickListener{
        fun onClicked(categoryName:String)
    }

}