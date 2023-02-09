package com.andreirookie.ots_basic_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val button = findViewById<Button>(R.id.toOpenActivityB)

        button.setOnClickListener {

        }


        setContentView(R.layout.activity_a)
    }
}