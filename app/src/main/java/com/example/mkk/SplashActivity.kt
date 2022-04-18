package com.example.mkk

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.mkk.databinding.ActivitySplashAcivityBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashAcivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_MKK)
        binding = ActivitySplashAcivityBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        

        setBuildVersion()
        setBuildCode()
        openMainActivity()
    }

    private fun setBuildVersion() {
        binding.txVersion.text = getString(R.string.version, BuildConfig.VERSION_NAME)
    }

    private fun setBuildCode() {
        binding.tvVerCode.text = getString(R.string.versionName, BuildConfig.VERSION_CODE)
    }

    private fun openMainActivity() {
        val intent = Intent(this, RegistrationActivity::class.java)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(intent)
            finish()
        }, SPLASH_TIME)
    }

    companion object {
        const val SPLASH_TIME: Long = 2000
    }
}
