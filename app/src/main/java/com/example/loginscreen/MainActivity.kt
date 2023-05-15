package com.example.loginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

private lateinit var auth: FirebaseAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = Firebase.auth

        // get reference to all views
        var etusername = findViewById(R.id.editTextTextPersonName) as EditText
        var etpassword = findViewById(R.id.editTextTextPassword) as EditText
        var btnreset = findViewById(R.id.btnReset) as Button
        var btnsubmit = findViewById(R.id.btnLogin) as Button

        btnreset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            etusername.setText("")
            etpassword.setText("")
        }

        // set on-click listener
        btnsubmit.setOnClickListener {
            val username = etusername.text;
            val password = etpassword.text;
            Toast.makeText(this@MainActivity, username, Toast.LENGTH_LONG).show()
        }
    }
}