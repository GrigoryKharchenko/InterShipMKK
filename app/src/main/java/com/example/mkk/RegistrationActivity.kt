package com.example.mkk

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {

    private var btnSendApplication: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        btnSendApplication = findViewById(R.id.btnSendApplication)


        btnSendApplication?.setOnClickListener(){
            val intent = Intent(this, RegistrationInPersonalArea::class.java)
            startActivity(intent)
        }

    }

}