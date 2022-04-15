package com.example.mkk

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MenuActivity : AppCompatActivity() {


    private var btListReport: ConstraintLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btListReport = findViewById(R.id.btListReport)

        btListReport?.setOnClickListener{}

    }

}


