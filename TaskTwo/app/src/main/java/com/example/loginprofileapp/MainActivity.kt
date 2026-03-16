package com.example.loginprofileapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val usernameInput = findViewById<EditText>(R.id.usernameInput)
        val passwordInput = findViewById<EditText>(R.id.passworInput)
        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val resetBtn = findViewById<Button>(R.id.resetBtn)
        val forgetBtn = findViewById<TextView>(R.id.forgetBtn)

        resetBtn.setOnClickListener {
            usernameInput.text.clear()
            passwordInput.text.clear()
        }

    }
}