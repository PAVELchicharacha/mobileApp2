package com.example.mobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ExitButton =findViewById<Button>(R.id.button)
        val AboutButton =findViewById<Button>(R.id.button2)
        val HelpButton =findViewById<Button>(R.id.button3)
        val TranslateButton =findViewById<Button>(R.id.button4)

        ExitButton.setOnClickListener{
            finish()
        }
        TranslateButton.setOnClickListener {
            val transIntent = Intent(this, Translate::class.java)
            startActivity(transIntent)
        }
    }
}