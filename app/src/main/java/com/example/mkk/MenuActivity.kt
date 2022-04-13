package com.example.mkk

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MenuActivity : AppCompatActivity() {

    private var btnOpenShift: ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        btnOpenShift = findViewById(R.id.imgBtOpenShift)

        openShiftClickListeners()

    }

    private fun openShiftClickListeners(){

        btnOpenShift?.setOnClickListener{openShiftClickDialog()}
    }

    private fun openShiftClickDialog(){
        MaterialAlertDialogBuilder(this)
            .setView(R.layout.edit_text_dialog)
            .show()
    }
}

