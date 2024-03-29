package com.dalilandoulsi.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var foodList = arrayListOf("Mexican", "Italian", "Chinese", "Pizza", "Hamburger")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideBtn.setOnClickListener {
            val random = Random
            val randomFood = random.nextInt(foodList.count())
            foodTv.text = foodList[randomFood]

            addFoodBtn.setOnClickListener {
                val newFood = addFoodTxt.text.toString()
                    foodList.add(newFood)
                    addFoodTxt.text.clear()
                println("mylist"+foodList.toString())
            }
        }
    }
}
