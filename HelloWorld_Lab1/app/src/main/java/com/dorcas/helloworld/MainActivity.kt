package com.dorcas.helloworld

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Grab the views defined in activity_main.xml by their ids
        val tvGreeting = findViewById<TextView>(R.id.tvGreeting)
        val btnGreet = findViewById<Button>(R.id.btnGreet)
        val btnColor = findViewById<Button>(R.id.btnColor)

        // Challenge 1 & 2: show a personal greeting when the button is clicked
        btnGreet.setOnClickListener {
            tvGreeting.text = "Hello, Dorcas Taiwo!"
        }

        // Challenge 3: change the greeting colour to blue
        btnColor.setOnClickListener {
            tvGreeting.setTextColor(Color.BLUE)
        }
    }
}
