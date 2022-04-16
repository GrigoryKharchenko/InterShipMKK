package com.example.mkk

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.mkk.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btOpenShift.setOnClickListener {

            val dialogOpenShift = LayoutInflater.from(this).inflate(R.layout.edit_text_dialog, null)

            val builderOpenShift = AlertDialog.Builder(this)
                .setView(dialogOpenShift)
                .show()

        }

    }



}


