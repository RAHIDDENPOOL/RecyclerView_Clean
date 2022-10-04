package com.example.cleanrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {


    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val food = intent.getParcelableExtra<Food>("food")
        if (food != null) {
            val textView: TextView = findViewById(R.id.DetailTxt)
            val imageView: ImageView = findViewById(R.id.DetailImg)

            textView.text = food.name
            imageView.setImageResource(food.image)
        }
    }
}