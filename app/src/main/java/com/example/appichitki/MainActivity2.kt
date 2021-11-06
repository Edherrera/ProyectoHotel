package com.example.appichitki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnSecond = findViewById<Button>(R.id.btnActividadTres)

        btnSecond.setOnClickListener { goToSecondActivity() }


    }

    fun goToSecondActivity() {
        val secondIntent = Intent(this,MainActivity3::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Hoteles de Uribia!!!", Toast.LENGTH_LONG).show()
    }
}