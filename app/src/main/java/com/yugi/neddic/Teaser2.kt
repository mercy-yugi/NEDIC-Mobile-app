package com.yugi.neddic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Teaser2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var tvNext2:TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teaser2)

        tvNext2 = findViewById(R.id.tvNext2)
        tvNext2.setOnClickListener {
            val intent = Intent(this, Teaser3::class.java)
            startActivity(intent)
finish()
        }
    }
}