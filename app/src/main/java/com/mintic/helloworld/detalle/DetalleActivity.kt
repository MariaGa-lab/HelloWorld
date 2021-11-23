package com.mintic.helloworld.detalle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mintic.helloworld.databinding.ActivityDetalleBinding
import com.mintic.helloworld.model.SuperheroeItem
import com.squareup.picasso.Picasso

class DetalleActivity : AppCompatActivity() {

    private lateinit var detalleBinding: ActivityDetalleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        detalleBinding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(detalleBinding.root)


        val superheroe: SuperheroeItem = intent.extras?.getSerializable("superheroe") as SuperheroeItem
        with(detalleBinding){
            nameTextView.text = superheroe.name
            cityTextView.text = superheroe.city
            occupationTextView.text = superheroe.occupation
            powersTextView.text = superheroe.powers
            aliasTextView.text = superheroe.alias
            facebookTextView.text = superheroe.facebook
            Picasso.get().load(superheroe.urlPicture).into(pictureImageView)
        }

    }

}