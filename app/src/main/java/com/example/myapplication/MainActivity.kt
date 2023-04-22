package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val but = findViewById<Button>(R.id.btn)
        val edit = findViewById<EditText>(R.id.edit)
        val txt = findViewById<TextView>(R.id.txt)

        but.setOnClickListener { txt.text = edit.text }

    }
}