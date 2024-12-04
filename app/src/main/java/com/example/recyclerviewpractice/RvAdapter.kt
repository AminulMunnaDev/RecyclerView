package com.example.recyclerviewpractice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(var dataList :ArrayList<RvModel>,val context: Context):RecyclerView.Adapter<RvAdapter.MyViewHolder>(){
   inner class MyViewHolder(private var view : View):RecyclerView.ViewHolder(view){
       val profile = view.findViewById<ImageView>(R.id.item_image)
       val name = view.findViewById<TextView>(R.id.restaurant_name)
       val address = view.findViewById<TextView>(R.id.restaurant_address)
   }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val myItem =LayoutInflater.from(context).inflate(R.layout.item_list,parent,false)
        return MyViewHolder(myItem)
    }

    override fun getItemCount(): Int {
      return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val singleData =dataList[position]

        holder.profile.setImageResource(singleData.foodImage)
        holder.name.text=singleData.restaurantName
        holder.address.text=singleData.restaurantAddress
    }


}


