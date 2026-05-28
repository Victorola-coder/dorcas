package com.dorcas.studentprofile

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Read the data MainActivity attached to the Intent
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("phone")
        val gender = intent.getStringExtra("gender")

        findViewById<TextView>(R.id.tvName).text = "Name: $name"
        findViewById<TextView>(R.id.tvEmail).text = "Email: $email"
        findViewById<TextView>(R.id.tvPhone).text = "Phone: $phone"
        findViewById<TextView>(R.id.tvGender).text = "Gender: $gender"

        // Challenge 2: go back to MainActivity
        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}
