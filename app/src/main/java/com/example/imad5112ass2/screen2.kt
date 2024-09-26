package com.example.imad5112ass2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView



class screen2 : AppCompatActivity() {

    private lateinit var buttonFeed: Button
    private lateinit var buttonClean: Button
    private lateinit var buttonPlay: Button
    private lateinit var imageView: ImageView
    var txthun: Int = 10


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        buttonFeed = findViewById(R.id.btnfeed)
        buttonClean = findViewById(R.id.btnclean)
        buttonPlay = findViewById(R.id.btnplay)  // Corrected ID and type
        imageView = findViewById(R.id.eimageView)


        buttonFeed.setOnClickListener {
            // Toggle between images when the feed button is clicked
            if (imageView.tag == "Eat") {
                imageView.setImageResource(R.drawable.eat)
              println(txthun)

            } else {
                imageView.setImageResource(R.drawable.eat)
                println( txthun)
            }
        }


        buttonClean.setOnClickListener {

            if (imageView.tag == "bath") {
                imageView.setImageResource(R.drawable.bath)
                imageView.tag = "Bath"
            }
            else {
                imageView.setImageResource(R.drawable.bath)
                imageView.tag = "bath"
            }
        }

        buttonPlay.setOnClickListener {
            // Toggle between images when the feed button is clicked
            if (imageView.tag == "first") {
                imageView.setImageResource(R.drawable.jump)
                imageView.tag = "feed"
            } else {
                imageView.setImageResource(R.drawable.jump)
                imageView.tag = "first"
            }


        }
    }
}
