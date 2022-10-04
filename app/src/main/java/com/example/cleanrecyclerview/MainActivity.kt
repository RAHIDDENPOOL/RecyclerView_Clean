package com.example.cleanrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

        foodList.add(Food(R.drawable.burger, "Burger"))
        foodList.add(Food(R.drawable.pasta, "Pasta"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.sushi, "Sushi"))
        foodList.add(Food(R.drawable.dinner, "Dinner"))
        foodList.add(Food(R.drawable.lanch, "Lanch"))
        foodList.add(Food(R.drawable.burger, "Burger"))
        foodList.add(Food(R.drawable.pasta, "Pasta"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.sushi, "Sushi"))
        foodList.add(Food(R.drawable.dinner, "Dinner"))
        foodList.add(Food(R.drawable.lanch, "Lanch"))
        foodList.add(Food(R.drawable.burger, "Burger"))
        foodList.add(Food(R.drawable.pasta, "Pasta"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.sushi, "Sushi"))
        foodList.add(Food(R.drawable.dinner, "Dinner"))
        foodList.add(Food(R.drawable.lanch, "Lanch"))
        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter

        foodAdapter.onItemClick = {
            val s = Intent(this, DetailActivity::class.java)
            s.putExtra("food", it)
            startActivity(s)
        }
    }
}