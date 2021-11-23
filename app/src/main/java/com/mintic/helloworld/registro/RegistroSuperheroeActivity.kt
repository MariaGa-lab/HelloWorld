package com.mintic.helloworld.registro

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.mintic.helloworld.detalle.DetalleActivity
import com.mintic.helloworld.R

class RegistroSuperheroeActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_superheroe)

        val registrarButton: Button = findViewById(R.id.registrar_button)
        val nombreEditText: EditText = findViewById(R.id.nombre_edit_text)
        val infoTextView: TextView = findViewById(R.id.info_text_view)
        val emailEditText: EditText = findViewById(R.id.email_edit_text)
        val estaturaEditText: TextInputEditText = findViewById(R.id.estatura_edit_text)
        val masculinoRadioButton: RadioButton = findViewById(R.id.masculino_radio_button)
        //val femeninoRadioButton:RadioButton = findViewById(R.id.femenino_radio_button)
        val fuerzaCheckBox: CheckBox = findViewById(R.id.super_fuerzacheck_Box)
        val velocidadCheckBox: CheckBox = findViewById(R.id.super_velocidad_check_Box)
        val telequinesisCheckBox: CheckBox = findViewById(R.id.telequinesis_check_Box)
        val ciudadNacimientoSpinner: Spinner = findViewById(R.id.ciudad_nacimiento_spinner)


        //registrarButton.setOnClickListener {
        //val nombre = nombreEditText.text
        //infoTextView.text = nombre
        //}
        registrarButton.setOnClickListener {

            if (nombreEditText.text.isEmpty() || estaturaEditText.text.toString() == "")
                Toast.makeText(this, "Debe digitar el nombre y la estatura", Toast.LENGTH_SHORT)
                    .show()
            else {

                val nombre = nombreEditText.text.toString()
                val email = emailEditText.text
                val estatura: Float = estaturaEditText.text.toString().toFloat()
                var poderes = ""
                val ciudadNacimiento = ciudadNacimientoSpinner.selectedItem.toString()

                val genero = if (masculinoRadioButton.isChecked)
                    getString(R.string.masculino)
                else
                    getString(R.string.femenino)

                if (fuerzaCheckBox.isChecked) poderes = getString(R.string.super_fuerza)
                if (velocidadCheckBox.isChecked) poderes =
                    poderes + " " + getString(R.string.super_velocidad)
                if (telequinesisCheckBox.isChecked) poderes =
                    poderes + " " + getString(R.string.telequinesis)

                infoTextView.text = getString(
                    R.string.nombre_info,
                    nombre,
                    estatura,
                    email,
                    genero,
                    poderes,
                    ciudadNacimiento

                )

                //val superheroe = Superheroe(nombre, email, estatura, poderes, ciudadNacimiento, genero)

                val intent = Intent(this, DetalleActivity::class.java)
                intent.putExtra("Nombre", nombre)
                startActivity(intent)
            }

        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("Método", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Método", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Método", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Método", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Método", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Método", "onRestart")
    }

}