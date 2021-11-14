package com.mintic.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegistroSuperheroeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_superheroe)

        var registrarButton: Button = findViewById(R.id.registrar_button)
        //var nombreEditText: EditText = findViewById(R.id.nombre_edit_text)
        var infoTextView: TextView = findViewById(R.id.info_text_view)
        var emailEditText: EditText = findViewById(R.id.email_edit_text)

        //registrarButton.setOnClickListener {
            //val nombre = nombreEditText.text
            //infoTextView.text = nombre
        //}
        registrarButton.setOnClickListener {
            val email = emailEditText.text
            infoTextView.text = email
        }

    }

}