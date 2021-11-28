package com.example.appichitki

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainHotelUribiaG : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_hotel_uribiag)
        val btnImpliciUribia = findViewById<Button>(R.id.buttonIrWeb)
        val btnSecond = findViewById<Button>(R.id.buttonSerUribia)

        btnSecond.setOnClickListener { goToSecondActivityUribia() }
        btnImpliciUribia.setOnClickListener { gotoUribia() }

    }

    fun goToSecondActivityUribia() {
        val secondIntent = Intent(this,MainServicioUribia::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, " Bienvenido a Hotel Uribia!!!", Toast.LENGTH_LONG).show()
    }


    fun gotoUribia(){
        val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co/Hotel_Review-g2440191-d12392330-Reviews-Hotel_Uribia-Uribia_La_Guajira_Department.html"))
        startActivity(implicitIntent)

    }
}
