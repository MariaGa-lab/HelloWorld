package com.mintic.helloworld

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tituloTextView: TextView = findViewById(R.id.titulo_text_view)

        val nombre = intent.extras?.getString("Nombre")
        tituloTextView.text = nombre

        nombre?.let { Log.d("nombre", it) }
    }

}