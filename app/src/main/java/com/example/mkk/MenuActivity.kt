package com.example.mkk

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mkk.databinding.ActivityMenuBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dialogViewNameCashier()
        setButtonInvisible()
    }

    private fun dialogViewNameCashier() {
        binding.btOpenShift.setOnClickListener {

            val dialogViewOpenShift = layoutInflater.inflate(R.layout.edit_text_dialog, null)

            val builderOpenShift = MaterialAlertDialogBuilder(this)
                .setView(dialogViewOpenShift)
                .show()

            builderOpenShift.findViewById<TextView>(R.id.tvNext)?.setOnClickListener {
                toastOpenShift()
                setButtonsVisibility(View.VISIBLE)
                builderOpenShift.dismiss()
            }

            builderOpenShift.findViewById<TextView>(R.id.tvCancel)?.setOnClickListener {
                builderOpenShift.dismiss()
            }
        }
    }

    private fun setButtonsVisibility(visibility: Int) {
        binding.btReportX.visibility = visibility
        binding.btnClosedShift.visibility = visibility
    }

    private fun toastOpenShift() {
        Toast.makeText(applicationContext,(R.string.new_shift_open), Toast.LENGTH_SHORT)
            .show()
    }

    private fun setButtonInvisible() {
        binding.btnClosedShift.setOnClickListener {
            setButtonsVisibility(View.GONE)
        }
    }
}
