package com.betterise.maladiecorona

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*

/**
 * Created by Alexandre on 01/07/20.
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        logo.postDelayed({
            startActivity(Intent(this, AgentActivity::class.java))
            finish()
        }, 3000)
    }
}