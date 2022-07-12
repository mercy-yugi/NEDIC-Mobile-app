package com.yugi.neddic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Teaser3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var tvNext3:TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teaser3)

        tvNext3= findViewById(R.id.tvNext3)
        tvNext3.setOnClickListener {
            val intent = Intent(this, Telephone::class.java)
            startActivity(intent)

        }
    }
}