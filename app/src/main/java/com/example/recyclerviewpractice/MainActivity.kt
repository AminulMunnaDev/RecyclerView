package com.example.recyclerviewpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvAdapter: RvAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        loadData()
    }
    private fun loadData() {
        val datalist= ArrayList<RvModel>()
        datalist.add(RvModel(R.drawable.ic_food_item, "Fajitas", "Dhaka"))
        datalist.add(RvModel(R.drawable.ic_food_item, "aasdf", "ewrwer"))
        datalist.add(RvModel(R.drawable.ic_food_item, "asdf", "asdf"))
        datalist.add(RvModel(R.drawable.ic_food_item, "Fajsdfagitas", "Dhgjgjaka"))
        datalist.add(RvModel(R.drawable.ic_food_item, "fggfg", "asdfa"))
        datalist.add(RvModel(R.drawable.ic_food_item, "hshfh", "Dhaka"))
        datalist.add(RvModel(R.drawable.ic_food_item, "Fajitas", "Dhaka"))
        datalist.add(RvModel(R.drawable.ic_food_item, "Faji xv xcvtas", "ghfg"))
        datalist.add(RvModel(R.drawable.ic_food_item, "Fajiasdfwtas", "Dhaka"))
        datalist.add(RvModel(R.drawable.ic_food_item, "w", "Dhaka"))
        datalist.add(RvModel(R.drawable.ic_food_item, "t", "Dhaka"))
        datalist.add(RvModel(R.drawable.ic_food_item, "er", "Dhaka"))
        datalist.add(RvModel(R.drawable.ic_food_item, "Fajiasdfwtas", "Dhaka"))
        datalist.add(RvModel(R.drawable.ic_food_item, "dfa", "Dhaka"))
        datalist.add(RvModel(R.drawable.ic_food_item, "ew", "Dhaka"))
        rvAdapter = RvAdapter(datalist,this)
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        binding.recyclerView.adapter=rvAdapter
    }
}