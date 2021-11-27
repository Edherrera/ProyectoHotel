package com.example.appichitki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class ListaServicioIchitki : AppCompatActivity() {

    val hotelNames = arrayListOf<String>("Restaurante","Habitaciones","Parqueadero","Eventos") // 1. crear arreglo de datos
    var adapter: ArrayAdapter<String>?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_servicio_ichitki)


        adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, hotelNames) // 2. crear un adapter usando el arreglo de datos
        val simpsonsListView = findViewById<ListView>(R.id.hotelList2)
        simpsonsListView.adapter = adapter // 3. conectar el adapter con el listview
        simpsonsListView.setOnItemClickListener { listview, listitem, index, id ->
            println("item: $listitem, index: $index, id: $id")
            val textview = listitem as TextView
            Toast.makeText(this, "Seleccionaste a ${textview.text}", Toast.LENGTH_SHORT).show()
            openCharacterDetail2(hotelNames[index])


        }

    }



    fun openCharacterDetail2(name: String){

        when (name) {
            "Hotel Ichitki" -> {
                val detailIntent = Intent(this, MainActivity3::class.java)
                startActivity(detailIntent)
            }
        }

        when (name) {
            "Hotel Juyasirain" -> {
                val detailIntent = Intent(this, MainActivity2::class.java)
                startActivity(detailIntent)
            }
        }

        when (name) {
            "Hotel Uribia" -> {
                val detailIntent = Intent(this, MainHotelUribiaG::class.java)
                startActivity(detailIntent)
            }
        }

        when (name) {
            "Hotel Gran Colombia" -> {
                val detailIntent = Intent(this, MainGranColombia::class.java)
                startActivity(detailIntent)
            }
        }


    }

}