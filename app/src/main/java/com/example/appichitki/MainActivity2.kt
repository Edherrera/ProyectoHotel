package com.example.appichitki

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btnImpliciIchitki = findViewById<Button>(R.id.buttonWebJuya)
        val btnSecond = findViewById<Button>(R.id.btnActividadTres)
        val btnGaleria = findViewById<Button>(R.id.btnGaleriaJuya)

        btnSecond.setOnClickListener { goToSecondActivity() }
        btnImpliciIchitki.setOnClickListener { gotoJuyasirain() }
        btnGaleria.setOnClickListener { irGaleria() }

    }

    fun goToSecondActivity() {
        val secondIntent = Intent(this,MainServicioJuyasirain::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, " Bienvenido a Hotel Juyasirain!!!", Toast.LENGTH_LONG).show()
    }


    fun gotoJuyasirain(){
        val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co/Hotel_Review-g2440191-d2701993-Reviews-Hotel_Juyasirain-Uribia_La_Guajira_Department.html"))
        startActivity(implicitIntent)

    }

    fun irGaleria() {
        val secondIntent = Intent(this,MainGaleriaJuyasirain::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Galeria al Hotel Juyasirain!!!", Toast.LENGTH_LONG).show()
    }
}