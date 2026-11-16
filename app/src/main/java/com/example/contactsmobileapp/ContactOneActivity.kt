package com.example.contactsmobileapp

import android.os.Bundle
import android.widget.Button
import android.app.Activity

// Student: Todd Upshaw
// Contact 1 details screen.
class ContactOneActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_one)
        findViewById<Button>(R.id.btnBackOne).setOnClickListener { finish() }
    }
}
