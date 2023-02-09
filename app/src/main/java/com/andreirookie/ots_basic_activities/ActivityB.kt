package com.andreirookie.ots_basic_activities

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val button = findViewById<Button>(R.id.toOpenActivityC)

        button.setOnClickListener {

        }


        setContentView(R.layout.activity_b)
    }
}