package com.example.deparmetnsoffens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MolecularActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_molecular)

        val btn_prev = findViewById(R.id.btn_molecular_prev) as Button
        val btn_next = findViewById(R.id.btn_molecular_next) as Button


        btn_prev.setOnClickListener{

            val intent = Intent(this, MechatronicActivity::class.java).apply {

            }
            startActivity(intent)
        }


        btn_next.setOnClickListener {

            Toast.makeText(this@MolecularActivity, "No Previous Department", Toast.LENGTH_SHORT).show()
        }
    }
}
