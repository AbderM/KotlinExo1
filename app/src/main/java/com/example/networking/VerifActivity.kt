package com.example.networking

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.service.autofill.UserData
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.networking.Profile

class VerifActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_verif)

        val profile: Profile? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
            intent.getParcelableExtra("profile", Profile::class.java)
        }else {
            intent.getParcelableExtra("profile")
        }

        findViewById<TextView>(R.id.nameTextView)?.text = profile?.name
        findViewById<TextView>(R.id.jobTextView)?.text = profile?.job
        findViewById<TextView>(R.id.mailTextView)?.text = profile?.mail

        val validbutton = findViewById<Button>(R.id.start_badgeactivity);
        validbutton.setOnClickListener{
            val intent = Intent(this, BadgeActivity::class.java)
            intent.putExtra("profile", profile)
            startActivity(intent)
        }
    }
}


