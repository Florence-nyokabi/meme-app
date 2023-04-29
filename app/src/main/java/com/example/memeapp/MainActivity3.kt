package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    lateinit var tvNext3: TextView
    lateinit var tvPrevious22: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        tvNext3 = findViewById(R.id.tvNext3)
        tvPrevious22 = findViewById(R.id.tvPrevious22)
        tvNext3.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        tvPrevious22.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
        }

    }
}