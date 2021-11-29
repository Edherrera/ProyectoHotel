package com.example.appichitki

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val btnImpliciIchitki = findViewById<Button>(R.id.btnImplicit1)
        val buttonIchitki = findViewById<Button>(R.id.buttonIchitki)
        val btnGaleria = findViewById<Button>(R.id.btnGaleria)

        btnImpliciIchitki.setOnClickListener { gotoIchitki() }
        buttonIchitki.setOnClickListener { irichitki() }
        btnGaleria.setOnClickListener { irGaleria() }

    }


    fun irichitki() {
        val secondIntent = Intent(this,MainServicioIchitki::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Bienvenido al Hotel Ichitki!!!", Toast.LENGTH_LONG).show()
    }

    fun gotoIchitki(){
        val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hotelichitki.com/"))
        startActivity(implicitIntent)

    }

    fun irGaleria() {
        val secondIntent = Intent(this,MainGaleriaIchitki::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Galeria al Hotel Ichitki!!!", Toast.LENGTH_LONG).show()
    }
}