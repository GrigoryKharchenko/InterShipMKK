package com.example.mkk

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import com.example.mkk.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding
    lateinit var preferences: SharedPreferences
    lateinit var editor: SharedPreferences.Editor


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dialogEditText()
        btnClosedShift()
        initPrefs()


    }

    private fun dialogEditText() {
        binding.btOpenShift.setOnClickListener {

            val dialogOpenShift = LayoutInflater.from(this).inflate(R.layout.edit_text_dialog, null)

            val builderOpenShift = AlertDialog.Builder(this)

                .setView(dialogOpenShift)
                .show()
            visibleBtn()

        }
    }

    private fun initPrefs(){
        preferences = getSharedPreferences("myPrefs",Context.MODE_PRIVATE)
        editor = preferences.edit()
    }

    private fun visibleBtn() {
        binding.btReportX.visibility = View.VISIBLE
        binding.btnClosedShift.visibility = View.VISIBLE
    }

    private fun notVisibleBtn() {
        binding.btReportX.visibility = View.GONE
        binding.btnClosedShift.visibility = View.GONE
    }

    private fun toast() {
        Toast.makeText(applicationContext, "Новая смена открыта", Toast.LENGTH_LONG).show()
    }

    private fun btnClosedShift() {
        binding.btnClosedShift.setOnClickListener {
            notVisibleBtn()
        }
    }

    private fun btnNext(){
    }
}
