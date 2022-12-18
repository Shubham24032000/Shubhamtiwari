package com.example.shubhamtiwari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class login1 : AppCompatActivity() {


    lateinit var txtDisplay: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)
        txtDisplay = findViewById(R.id.txtDisplay)


        var email:String = getIntent().getStringExtra("email").toString()
        var password:String = getIntent().getStringExtra("password").toString()

        txtDisplay.setText("Welcome Your Login is Successful")

    }
}