package com.kotlin.brc.store_recipes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.brc.store_recipes.R
import com.kotlin.brc.store_recipes.entities.Recipes
class DishesAdapter:RecyclerView.Adapter<DishesAdapter.RecipeViewHolder>() {

    private var listener: OnItemClickListener? = null
    var context: Context? = null
    private var arrayListDishes = ArrayList<Recipes>()

    class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view)

    fun setData(arrData : List<Recipes>){
        arrayListDishes = arrData as ArrayList<Recipes>
    }
    fun setClickListener(listener1: OnItemClickListener){
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

    holder.itemView.findViewById<TextView>(R.id.name_dish).text = arrayListDishes[position].dishName

//    holder.itemView.rootView.setOnClickListener {
//            listener!!.onClicked(arrayListDishes[position].strcategory)
//        }
    }
    interface OnItemClickListener{
        fun onClicked(categoryName:String)
    }

}