package com.smarthred.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_loginpage.*

class LoginPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)
        edtSignUp.setOnClickListener {
            var intent=Intent(this,SignUpPage::class.java)
            startActivity(intent)
        }
    }
}
