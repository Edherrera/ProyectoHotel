package com.example.appichitki

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainGranColombia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_gran_colombia)
        val btnImpliciUribia = findViewById<Button>(R.id.buttonIrWebGran)
        val btnSecond = findViewById<Button>(R.id.buttonSerGranc)
        val btnGaleria = findViewById<Button>(R.id.btnGaleriaGran)

        btnSecond.setOnClickListener { goToSecondActivityGranc() }
        btnImpliciUribia.setOnClickListener { gotoGranc() }
        btnGaleria.setOnClickListener { irGaleria() }

    }

    fun goToSecondActivityGranc() {
        val secondIntent = Intent(this,MainServicioGranc::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, " Bienvenido a Hotel Gran Colombia!!!", Toast.LENGTH_LONG).show()
    }


    fun gotoGranc(){
        val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://es-la.facebook.com/hotel1enuribia/"))
        startActivity(implicitIntent)

    }

    fun irGaleria() {
        val secondIntent = Intent(this,MainGaleriaGran::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Galeria al Hotel Gran colombia!!!", Toast.LENGTH_LONG).show()
    }
}