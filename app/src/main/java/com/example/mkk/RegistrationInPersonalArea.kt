package com.example.mkk

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class RegistrationInPersonalArea : AppCompatActivity() {

    private var buttonClear: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_in_personal_area)

        buttonClear = findViewById(R.id.btnRegistration)

        setupClickListeners()
    }

    private fun setupClickListeners() {
        buttonClear?.setOnClickListener { showCLearListConfirmationDialog() }
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

    private fun dialogClickListener(){
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
}
