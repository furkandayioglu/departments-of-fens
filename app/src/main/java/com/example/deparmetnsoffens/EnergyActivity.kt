package com.example.deparmetnsoffens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EnergyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_energy)

        val btn_prev = findViewById(R.id.btn_energy_prev) as Button
        val btn_next = findViewById(R.id.btn_energy_next) as Button
    }
}
