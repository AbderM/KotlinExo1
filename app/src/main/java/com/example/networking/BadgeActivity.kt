package com.example.networking

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.service.autofill.UserData
import android.util.Log
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

        val profile: Profile? = if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
            Log.i("Probleme", "Je suis dans le tiramisu")
            intent.getParcelableExtra("profile", Profile::class.java)
        } else {
            Log.i("Probleme", "je suis depreciate")
            intent.getParcelableExtra("profile")
        }

        findViewById<TextView>(R.id.nameTextView)?.text = profile?.name
        findViewById<TextView>(R.id.jobTextView)?.text = profile?.job
        findViewById<TextView>(R.id.mailTextView)?.text = profile?.mail

    }
}