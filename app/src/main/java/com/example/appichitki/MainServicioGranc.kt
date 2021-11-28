package com.example.appichitki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast

class MainServicioGranc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_servicio_granc)
        val ratingforapp = findViewById<RatingBar>(R.id.ratingBar4)
        //val textViewPuntaje = findViewById<TextView>(R.id.textViewPuntaje)
        ratingforapp.setOnRatingBarChangeListener { ratinBar, fl, b ->
            //textViewPuntaje.text = fl.toString()
            Toast.makeText(this, "Tu calificacíón para Gran Colombia es: ${fl}!!", Toast.LENGTH_LONG).show()
            val intent: Intent = Intent (this, MainGranColombia::class.java)
            //intent.putExtra
            startActivity(intent)
            finish()
        }
    }
}