package com.example.loginprofileapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val loginContainer = findViewById<LinearLayout>(R.id.loginContainer)
        val profileContainer = findViewById<LinearLayout>(R.id.profileContainer)

        val usernameInput = findViewById<EditText>(R.id.usernameInput)
        val passwordInput = findViewById<EditText>(R.id.passworInput)
        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val resetBtn = findViewById<Button>(R.id.resetBtn)
        val forgetBtn = findViewById<TextView>(R.id.forgetBtn)
        val logoutBtn = findViewById<Button>(R.id.logoutBtn)

        resetBtn.setOnClickListener {
            usernameInput.text.clear()
            passwordInput.text.clear()
        }

        loginBtn.setOnClickListener {
            val userName = usernameInput.text.toString()
            val pass = passwordInput.text.toString()

            if (userName.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Please enter username & password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if(userName == "admin" && pass == "1234") {
                loginContainer.visibility = LinearLayout.GONE
                profileContainer.visibility = LinearLayout.VISIBLE
            } else {
                Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show()
            }
        }

        logoutBtn.setOnClickListener {
            loginContainer.visibility = LinearLayout.VISIBLE
            profileContainer.visibility = LinearLayout.GONE
        }

    }
}