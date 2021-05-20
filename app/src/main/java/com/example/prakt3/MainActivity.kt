package com.example.prakt3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val textView = findViewById<TextView>(R.id.textView)

        var sum1 = 0

        button.setOnClickListener {
            val random = Random.nextInt(10, 99) + 1
            textView.text = random.toString()

            val btn = findViewById<Button>(R.id.button3)
            count++
            var button = findViewById(R.id.button) as TextView
            button3.text = "Ты нажмякал $count"


            var num1 = random
            sum1 = sum1 + num1
            if (count == 1) {
                button2.text = "тут одно число"
            }
            if (count==0)
                button2.text="click"
            if (count>0)
                button2.text="сумма = $sum1"



        }
    }
}