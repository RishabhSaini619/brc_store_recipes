package com.kotlin.brc.store_recipes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.brc.store_recipes.R
import com.kotlin.brc.store_recipes.entities.Recipes
//import kotlinx.android.synthetic.main.item_list_categories.view.*

class DishesAdapter:RecyclerView.Adapter<DishesAdapter.RecipeViewHolder>() {

    var listener: DishesAdapter.OnItemClickListener? = null
    var context: Context? = null
    var arrayListDishes = ArrayList<Recipes>()

    class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
    fun setData(arrData : List<Recipes>){
        arrayListDishes = arrData as ArrayList<Recipes>
    }
    fun setClickListener(listener1: DishesAdapter.OnItemClickListener){
        listener = listener1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        context = parent.context
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list_dishes,parent,false))
    }

    override fun getItemCount(): Int {
        return arrayListDishes.size
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {

    holder.itemView.name_category = arrayListDishes[position].dishName

    holder.itemView.rootView.setOnClickListener {
            listener!!.onClicked(arrayListDishes[position].strcategory)
        }
    }
    interface OnItemClickListener{
        fun onClicked(categoryName:String)
    }

}