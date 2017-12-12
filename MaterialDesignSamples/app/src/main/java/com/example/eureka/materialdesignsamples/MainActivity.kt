package com.example.eureka.materialdesignsamples

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById(R.id.coordinator1)
        button1.setOnClickListener {
            val intent = Intent(this, CoordinatorLayout1Activity::class.java)
            startActivity(intent)
        }
    }
}
