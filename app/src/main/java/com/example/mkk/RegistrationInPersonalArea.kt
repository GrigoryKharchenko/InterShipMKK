package com.example.mkk

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mkk.databinding.ActivityRegistrationInPersonalAreaBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class RegistrationInPersonalArea : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationInPersonalAreaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationInPersonalAreaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.btnRegistration.setOnClickListener { showCLearListConfirmationDialog() }
    }

    private fun showCLearListConfirmationDialog() {
        MaterialAlertDialogBuilder(this)
            .setTitle(getString(R.string.congratulations))
            .setMessage(resources.getString(R.string.message_dialog))
            .setPositiveButton(R.string.next) { dialog: DialogInterface, _: Int ->
                dialogClickListener()
                dialog.dismiss()
            }
            .show()
    }

    private fun dialogClickListener() {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
}
