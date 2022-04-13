package com.example.mkk

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private var tvVersion: TextView? = null
    private var tvCodeVersion: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_MKK)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_acivity)

        tvVersion = findViewById(R.id.txVersion)
        tvCodeVersion = findViewById(R.id.txVerCode)

        setBuildVersion()

        setBuildCode()

        Handler().postDelayed({
            openMainActivity()
        }, 2000)
    }

    private fun setBuildVersion() {
        tvVersion?.text = getString(R.string.version, BuildConfig.VERSION_NAME)
    }

    private fun setBuildCode() {

        tvCodeVersion?.text = getString(R.string.versionName, BuildConfig.VERSION_CODE)
    }

    private fun openMainActivity() {
        val intent = Intent(this, RegistrationActivity::class.java)
        startActivity(intent)
        finish()
    }
}
