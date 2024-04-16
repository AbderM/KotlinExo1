package com.example.networking

import android.content.Intent
import android.os.Bundle
import android.service.autofill.UserData
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BadgeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_badge)

        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val jobTextView = findViewById<TextView>(R.id.jobTextView)
        val mailTextView = findViewById<TextView>(R.id.mailTextView)

        val nameValue = intent.getStringExtra("nameKey")
        val jobValue = intent.getStringExtra("jobKey")
        val mailValue = intent.getStringExtra("mailKey")

        nameTextView.text = nameValue
        jobTextView.text = jobValue
        mailTextView.text = mailValue

    }
}