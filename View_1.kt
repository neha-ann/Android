package com.example.myapplication

import android.os.Bundle
import com.example.myapplication.R
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view)

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val dob = intent.getStringExtra("dob")

        val displayName = findViewById<TextView>(R.id.displayName)
        val displayEmail = findViewById<TextView>(R.id.displayEmail)
        val displayDOB = findViewById<TextView>(R.id.displayDOB)

        displayName.text = "Name: $name"
        displayEmail.text = "Email: $email"
        displayDOB.text = "Date of Birth: $dob"
    }
}


