package com.example.contactsmobileapp

import android.os.Bundle
import android.widget.Button
import android.app.Activity

// Student: Todd Upshaw
// Contact 2 details screen.
class ContactTwoActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_two)
        findViewById<Button>(R.id.btnBackTwo).setOnClickListener { finish() }
    }
}
