package com.example.mkk

import android.app.Activity
import android.content.Intent

inline fun <reified T: Activity> Activity.startActivity() {
    val intent = Intent(this, T::class.java)
    this.startActivity(intent)
}
