package com.example.shubhamtiwari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var registration:Button
    lateinit var login:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registration = findViewById(R.id.registration)
        login = findViewById(R.id.login)
    }

    override fun onStart() {
        super.onStart()
        login.setOnClickListener {
            var intent = Intent(this,com.example.shubhamtiwari.login::class.java)
            startActivity(intent)
        }
        registration.setOnClickListener {
            var intent = Intent(this,Register::class.java)
            startActivity(intent)
        }
    }
}