package com.example.deparmetnsoffens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ComputerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_computer)

        val btn_prev = findViewById(R.id.btn_computer_prev) as Button
        val btn_next = findViewById(R.id.btn_computer_next) as Button


        btn_prev.setOnClickListener{

            val intent = Intent(this, CivilActivity::class.java).apply {

            }
            startActivity(intent)
        }


        btn_next.setOnClickListener {

            val intent = Intent(this, ElectronicActivity::class.java).apply {

            }
            startActivity(intent)
        }
    }
}
