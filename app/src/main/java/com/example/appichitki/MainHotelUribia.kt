package com.example.appichitki

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainHotelUribia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_hotel_uribia)
        val btnImpliciIchitki = findViewById<Button>(R.id.btnImplicit1)
        val buttonIchitki = findViewById<Button>(R.id.buttonSerUribia)

        btnImpliciIchitki.setOnClickListener { gotoIchitki() }
        buttonIchitki.setOnClickListener { iruribia() }

    }


    fun iruribia() {
        val secondIntent = Intent(this,MainServicioJuyasirain::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Bienvenido al Hotel Uribia!!!", Toast.LENGTH_LONG).show()
    }

    fun gotoIchitki(){
        val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co/Hotel_Review-g2440191-d12392330-Reviews-Hotel_Uribia-Uribia_La_Guajira_Department.html"))
        startActivity(implicitIntent)

    }
}