package com.example.appichitki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainServicioIchitki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_servicio_ichitki)
        val btnSecond = findViewById<Button>(R.id.btnSecondActivity2)
        btnSecond.setOnClickListener { goToSecondActivity() }
    }


    fun goToSecondActivity() {
        val secondIntent = Intent(this,ListaServicioIchitki::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Lista de servicios!!!", Toast.LENGTH_LONG).show()
    }
}