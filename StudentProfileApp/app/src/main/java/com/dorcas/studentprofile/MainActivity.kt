package com.dorcas.studentprofile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val rgGender = findViewById<RadioGroup>(R.id.rgGender)
        val btnViewProfile = findViewById<Button>(R.id.btnViewProfile)

        btnViewProfile.setOnClickListener {
            val name = etName.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val phone = etPhone.text.toString().trim()

            // Challenge 1: validate the form before navigating
            if (name.isEmpty()) {
                etName.error = "Please enter your name"
                return@setOnClickListener
            }
            if (email.isEmpty()) {
                etEmail.error = "Please enter your email"
                return@setOnClickListener
            }
            if (phone.isEmpty()) {
                etPhone.error = "Please enter your phone"
                return@setOnClickListener
            }
            if (rgGender.checkedRadioButtonId == -1) {
                Toast.makeText(this, "Please select a gender", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val gender = if (findViewById<RadioButton>(R.id.rbMale).isChecked) "Male" else "Female"

            // Pass the collected data to ProfileActivity via the Intent
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("email", email)
            intent.putExtra("phone", phone)
            intent.putExtra("gender", gender)
            startActivity(intent)
        }
    }
}
