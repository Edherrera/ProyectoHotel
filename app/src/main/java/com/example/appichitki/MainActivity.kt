package com.example.appichitki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSecond = findViewById<Button>(R.id.btnSecondActivity)

        btnSecond.setOnClickListener { goToSecondActivity() }


    }

    fun goToSecondActivity() {
        val secondIntent = Intent(this,MainActivity_List::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Lista de Hoteles de Uribia!!!", Toast.LENGTH_LONG).show()
    }

}