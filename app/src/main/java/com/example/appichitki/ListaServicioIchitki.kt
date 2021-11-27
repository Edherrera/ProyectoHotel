package com.example.appichitki

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class ListaServicioIchitki : AppCompatActivity() {

    val hotelNames = arrayListOf<String>("Restaurante","Habitacion","Parqueadero","Eventos") // 1. crear arreglo de datos
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
            "Restaurante" -> {
                val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hotelichitki.com/index.php/servicios#"))
                startActivity(implicitIntent)
            }
        }

        when (name) {
            "Habitacion" -> {
                val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hotelichitki.com/index.php/contacto"))
                startActivity(implicitIntent)
            }
        }

        when (name) {
            "Parqueadero" -> {
                val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hotelichitki.com/index.php/contacto"))
                startActivity(implicitIntent)
            }
        }

        when (name) {
            "Eventos" -> {
                val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hotelichitki.com/index.php/contacto"))
                startActivity(implicitIntent)
            }
        }


    }

}