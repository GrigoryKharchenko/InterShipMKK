package com.example.mkk

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mkk.PhoneNumberValidator.Companion.ALLOWED_CHARACTERS
import com.example.mkk.PhoneNumberValidator.Companion.PHONE_LENGTH
import com.example.mkk.databinding.ActivityRegistrationBinding


class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSendApplication.setOnClickListener {
            val intent = Intent(this, RegistrationInPersonalArea::class.java)
            startActivity(intent)
        }
        setFocusPhoneNumber()
    }

    private fun setFocusPhoneNumber() {
        binding.tiePhoneNumber.setOnFocusChangeListener { _, focused ->
            if (!focused) {
                val number = PhoneNumberValidator()
                val res = number.validate("")
                binding.tilPhoneNumber.helperText = res?.let { getString(it) }
            }
        }
    }
}
