package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    lateinit var tvPrevious4: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        tvPrevious4 = findViewById(R.id.tvPrevious4)
        tvPrevious4.setOnClickListener {
            val intent = Intent( this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}