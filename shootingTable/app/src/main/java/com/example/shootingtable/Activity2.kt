package com.example.shootingtable

import android.app.Activity
import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val result = findViewById<TextView>(R.id.result)
        result.setTypeface(null, Typeface.BOLD)
        val button = findViewById<Button>(R.id.button)

        val redCount = intent.getIntExtra("redCount", 0)
        val greenCount = intent.getIntExtra("greenCount", 0)
        // Set the retrieved value to the TextView
        result.text = "$greenCount / 25"

        button.setOnClickListener {
            BackToStart()
        }
    }
    private fun BackToStart() {
        val intent = Intent(this, Activity::class.java)
        startActivity(intent)
        }
    }




