package com.example.mkk

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mkk.databinding.ActivityRegistrationBinding


class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSendApplication.setOnClickListener() {
            val intent = Intent(this, RegistrationInPersonalArea::class.java)
            startActivity(intent)
        }
        phoneFocus()
    }

    private fun phoneFocus() {
        binding.tiePhoneNumber.setOnFocusChangeListener { _, focused ->
            if (!focused) {
                binding.tilPhoneNumber.helperText = phoneText()
            }
        }
    }

    private fun phoneText(): String? {
        val phoneText = binding.tiePhoneNumber.text.toString()
        if (!phoneText.matches(".*[0-9].*".toRegex())) {
            return "Введите корректный номер"
        }
        if (phoneText.length != 12) {
            return "Введите корректный номер"
        }
        return null
    }
}

