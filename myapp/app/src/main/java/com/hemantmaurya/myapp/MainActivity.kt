package com.hemantmaurya.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickme = findViewById<Button>(R.id.button1)
        val textview1 = findViewById<TextView>(R.id.textView1)
        val btnReset = findViewById<Button>(R.id.button2)
        var clicked = 0
        btnClickme.setOnClickListener {
            clicked += 1
            textview1.text = clicked.toString()
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        btnReset.setOnClickListener {
            clicked -= 1
            textview1.text = clicked.toString()
            Toast.makeText(this,"Reset",Toast.LENGTH_SHORT).show()
        }

    }
}