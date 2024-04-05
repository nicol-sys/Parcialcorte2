package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class formulario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)
        val datosTextView = findViewById<TextView>(R.id.datosTextView)
        val mostrarDatosButton = findViewById<View>(R.id.mostrarDatosButton)
        val nombre = intent.getStringExtra("nombre")
        val edad = intent.getStringExtra("edad")
        datosTextView.text = "Nombre: $nombre\nEdad: $edad"
        mostrarDatosButton.setOnClickListener {

            finish()
        }
    }
}

