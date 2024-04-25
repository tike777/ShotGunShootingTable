package com.example.shootingtable

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.graphics.Typeface

class MainActivity : AppCompatActivity() {
    var greenCount = 0
    var redCount = 0
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //CheckShootingType()
    val buttonOsu = findViewById<Button>(R.id.buttonOsu)
        val buttonOhi = findViewById<Button>(R.id.buttonOhi)
        val text2 = findViewById<TextView>(R.id.textView2)
        text2.setTypeface(null, Typeface.BOLD)
        val kiekkonumero = findViewById<TextView>(R.id.kiekkonumero)
        kiekkonumero.setTypeface(null, Typeface.BOLD)
        val ohiCount = findViewById<TextView>(R.id.ohiCount)
        val osuCount = findViewById<TextView>(R.id.osuCount)


        buttonOhi.setBackgroundColor(Color.parseColor("#FF0000"));
        buttonOsu.setBackgroundColor(Color.parseColor("#00FF00"));

        buttonOsu.setOnClickListener {
            count++
            greenCount++
            CheckTotalCount()
            kiekkonumero.text = count.toString()
            osuCount.text = greenCount.toString()
        }

        buttonOhi.setOnClickListener {
            count++
            redCount++
            CheckTotalCount()
            kiekkonumero.text = count.toString()
            ohiCount.text = redCount.toString()
        }
    }
    private fun CheckTotalCount() {
        val totalCount = greenCount + redCount
        if (totalCount > 24) {
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("redCount", redCount)
            intent.putExtra("greenCount", greenCount)
            startActivity(intent)
        }
    }

    private fun CheckShootingType() {
        val intent = Intent(this, Activity3::class.java)
        startActivity(intent)
    }
}
