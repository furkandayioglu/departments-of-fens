package com.example.deparmetnsoffens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IndustrialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_industrial)

        val btn_prev = findViewById(R.id.btn_industrial_prev) as Button
        val btn_next = findViewById(R.id.btn_mechatronics_next) as Button


        btn_prev.setOnClickListener{

            val intent = Intent(this, ElectronicActivity::class.java).apply {

            }
            startActivity(intent)
        }


        btn_next.setOnClickListener {

            val intent = Intent(this, MechatronicActivity::class.java).apply {

            }
            startActivity(intent)
        }
    }
}
