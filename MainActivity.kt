package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.myapplication.View // Replace with the correct package name

import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showRegistrationButton = findViewById<Button>(R.id.registration)
        showRegistrationButton.setOnClickListener {
            showRegistration()
        }
    }

    private fun showRegistration() {
        val name = findViewById<EditText>(R.id.name).text.toString()
        val email = findViewById<EditText>(R.id.email).text.toString()
        val dob = findViewById<EditText>(R.id.dob).text.toString()

        val intent = Intent(this, View::class.java)
        intent.putExtra("name", name)
        intent.putExtra("email", email)
        intent.putExtra("dob", dob)
        startActivity(intent)
    }
}




