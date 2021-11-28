package com.example.appichitki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast

class MainServicioUribia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_servicio_uribia)
        val ratingforapp = findViewById<RatingBar>(R.id.ratingBar3)
        //val textViewPuntaje = findViewById<TextView>(R.id.textViewPuntaje)
        ratingforapp.setOnRatingBarChangeListener { ratinBar, fl, b ->
            //textViewPuntaje.text = fl.toString()
            Toast.makeText(this, "Tu calificacíón para Uribia es: ${fl}!!", Toast.LENGTH_LONG).show()
            val intent: Intent = Intent (this, MainHotelUribiaG::class.java)
            //intent.putExtra
            startActivity(intent)
            finish()
        }
    }
}