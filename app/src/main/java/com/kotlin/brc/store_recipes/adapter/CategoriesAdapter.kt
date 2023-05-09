package com.kotlin.brc.store_recipes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.brc.store_recipes.R
import com.kotlin.brc.store_recipes.entities.CategoryItems
//import kotlinx.android.synthetic.main.item_list_categories.view.*

class CategoriesAdapter:RecyclerView.Adapter<CategoriesAdapter.RecipeViewHolder>() {

    var listener: OnItemClickListener? = null
    var context: Context? = null
    var arrayListCategories = ArrayList<CategoryItems>()

    class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
    fun setData(arrData : List<CategoryItems>){
        arrayListCategories = arrData as ArrayList<CategoryItems>
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

//    holder.itemView.name_category.text = arrayListCategories[position].strcategory
    holder.itemView.rootView.setOnClickListener {
            listener!!.onClicked(arrayListCategories[position].strcategory)
        }
    }
    interface OnItemClickListener{
        fun onClicked(categoryName:String)
    }

}