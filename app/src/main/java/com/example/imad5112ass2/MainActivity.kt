package com.example.imad5112ass2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var buttonstart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the button using its ID
        buttonstart = findViewById(R.id.btnstart)

        // Set up the click listener for the button
        buttonstart.setOnClickListener {
            // Create an Intent to start the screen2 activity
            val intent = Intent(this,screen2 :: class.java)
            startActivity(intent)
        }
    }
}
