package com.dorcas.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvMessage = findViewById<TextView>(R.id.tvMessage)
        val btnBack = findViewById<Button>(R.id.btnBack)

        // Read the message MainActivity attached to the Intent and show it
        val msg = intent.getStringExtra("msg_key")
        tvMessage.text = msg

        // Challenge 2: close this screen and go back to MainActivity
        btnBack.setOnClickListener {
            finish()
        }
    }
}
