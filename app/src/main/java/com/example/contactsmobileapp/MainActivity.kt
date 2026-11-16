package com.example.contactsmobileapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.app.Activity

// Student: Todd Upshaw
// Contacts Mobile App - displays two contacts whose names begin with A.
class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnContactOne).setOnClickListener {
            startActivity(Intent(this, ContactOneActivity::class.java))
        }
        findViewById<Button>(R.id.btnContactTwo).setOnClickListener {
            startActivity(Intent(this, ContactTwoActivity::class.java))
        }
    }
}
