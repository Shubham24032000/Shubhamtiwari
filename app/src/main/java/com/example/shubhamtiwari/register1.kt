package com.example.shubhamtiwari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class register1 : AppCompatActivity() {

    lateinit var txtDisplay: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register1)
        txtDisplay = findViewById(R.id.txtDisplay)

        var intent = getIntent()
        var Name:String = getIntent().getStringExtra("Name").toString()
        var Email:String = getIntent().getStringExtra("Email").toString()
        var Password:String = getIntent().getStringExtra("Password").toString()

        txtDisplay.setText("Your Registeration is successfull")

    }
}