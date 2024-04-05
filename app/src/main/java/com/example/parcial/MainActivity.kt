package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nombreEditText = findViewById<EditText>(R.id.nombreEditText)
        val edadEditText = findViewById<EditText>(R.id.edadEditText)
        val irAlFormularioButton = findViewById<View>(R.id.irAlFormularioButton)
        irAlFormularioButton.setOnClickListener {
            val nombre = nombreEditText.text.toString()
            val edad = edadEditText.text.toString()
            val intent = Intent(this, formulario::class.java)
            intent.putExtra("nombre", nombre)
            intent.putExtra("edad", edad)
            startActivity(intent)
        }
    }
}
