package com.dorcas.helloworld

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
        val etMessage = findViewById<EditText>(R.id.etMessage)
        val btnOpenSecond = findViewById<Button>(R.id.btnOpenSecond)

        // Challenge 1 & 2: show a personal greeting when the button is clicked
        btnGreet.setOnClickListener {
            tvGreeting.text = "Hello, Dorcas Taiwo!"
        }

        // Challenge 3: change the greeting colour to blue
        btnColor.setOnClickListener {
            tvGreeting.setTextColor(Color.BLUE)
        }

        // Lab 2: open SecondActivity and pass a message via the Intent.
        // Use whatever the user typed, or a default if the field is empty.
        btnOpenSecond.setOnClickListener {
            val typed = etMessage.text.toString().trim()
            val message = if (typed.isNotEmpty()) typed else "Hello from MainActivity!"
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("msg_key", message)
            startActivity(intent)
        }
    }
}
