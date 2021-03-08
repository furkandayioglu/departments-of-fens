package com.example.deparmetnsoffens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class CivilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_civil)
        val btn_prev = findViewById(R.id.btn_civil_prev) as Button
        val btn_next = findViewById(R.id.btn_civil_next) as Button


        btn_prev.setOnClickListener{

            val intent = Intent(this, DepartmentsActivity::class.java).apply {

            }
            startActivity(intent)
        }


        btn_next.setOnClickListener {

            val intent = Intent(this, ComputerActivity::class.java).apply {

            }
            startActivity(intent)
        }
}
}
