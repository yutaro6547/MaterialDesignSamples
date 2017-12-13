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

        val button2 = findViewById(R.id.coordinator2)
        button2.setOnClickListener {
            val intent = Intent(this, CoordinatorLayout2Activity::class.java)
            startActivity(intent)
        }

        val button3 = findViewById(R.id.coordinator3)
        button3.setOnClickListener {
            val intent = Intent(this, CoordinatorLayout3Activity::class.java)
            startActivity(intent)
        }
    }
}
