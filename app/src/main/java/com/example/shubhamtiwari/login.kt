package com.example.shubhamtiwari

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class login : AppCompatActivity() {

    lateinit var EditText: EditText
    lateinit var EditText1: EditText
    lateinit var btn_submit: Button
    lateinit var txtView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        EditText = findViewById(R.id.EditText)
        EditText1 = findViewById(R.id.EditText1)
        btn_submit = findViewById(R.id.btn_submit)
        txtView = findViewById(R.id.txtView)
    }
    override fun onStart() {
        super.onStart()

        btn_submit.setOnClickListener {
            var email:String = EditText.text.toString()
            var password:String = EditText1.text.toString()


            var intent = Intent(this,login1::class.java)
            intent.putExtra("email",email)
            intent.putExtra("Password",password)
            startActivity(intent)
        }
        txtView.setOnClickListener {
            var intent = Intent(this,Register::class.java)
            startActivity(intent)
        }
    }
}