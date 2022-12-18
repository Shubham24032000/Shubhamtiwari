package com.example.shubhamtiwari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Register : AppCompatActivity() {
    lateinit var EditText: EditText
    lateinit var EditText1: EditText
    lateinit var EditText2: EditText
    lateinit var btn_signup: Button
    lateinit var txtDisplay:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        EditText = findViewById(R.id.EditText)
        EditText1 = findViewById(R.id.EditText1)
        EditText2 = findViewById(R.id.EditText2)
        btn_signup = findViewById(R.id.btn_signup)
        txtDisplay = findViewById(R.id.txtDisplay)

            }
    override fun onStart() {
        super.onStart()
        btn_signup.setOnClickListener {
            var Name:String = EditText.text.toString()
            var Email:String = EditText1.text.toString()
            var Password:String = EditText2.text.toString()

            var intent = Intent(this,register1::class.java)
            intent.putExtra("Name",Name)
            intent.putExtra("Email",Email)
            intent.putExtra("Password",Password)
            startActivity(intent)
        }
        txtDisplay.setOnClickListener {
            var intent = Intent(this,login::class.java)
            startActivity(intent)
        }
    }
}