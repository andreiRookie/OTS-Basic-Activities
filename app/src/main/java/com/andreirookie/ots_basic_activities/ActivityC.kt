package com.andreirookie.ots_basic_activities

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val buttonToOpenActivityA =findViewById<Button>(R.id.toOpenActivityA)
        val buttonToOpenActivityD =findViewById<Button>(R.id.toOpenActivityD)
        val buttonToCloseActivityC =findViewById<Button>(R.id.toCloseActivityC)
        val buttonToCloseStack =findViewById<Button>(R.id.toCloseStack)


        buttonToOpenActivityA.setOnClickListener {

        }

        buttonToOpenActivityD.setOnClickListener {

        }

        buttonToCloseActivityC.setOnClickListener {

        }

        buttonToCloseStack.setOnClickListener {

        }
        setContentView(R.layout.activity_c)
    }
}