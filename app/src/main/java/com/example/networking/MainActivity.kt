package com.example.networking

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val verifbutton = findViewById<Button>(R.id.start_verifactivity);
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val jobEditText = findViewById<EditText>(R.id.jobEditText)
        val mailEditText = findViewById<EditText>(R.id.mailEditText)

        verifbutton.setOnClickListener{
            val intent = Intent(this, VerifActivity::class.java)
            intent.putExtra("nameKey", nameEditText.text.toString())
            intent.putExtra("jobKey", jobEditText.text.toString())
            intent.putExtra("mailKey", mailEditText.text.toString())
            startActivity(intent)

        }


        //log
        Log.v(ContentValues.TAG, "Verbose message")
        Log.d(ContentValues.TAG, "Message Debug")
        Log.i(ContentValues.TAG, "Message Info")
        Log.w(ContentValues.TAG, "Message Warning")
        Log.e(ContentValues.TAG, "Message Error")
        Log.println(Log.ASSERT, ContentValues.TAG, "Alerte Message")
    }
}

