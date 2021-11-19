package com.mintic.helloworld

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SuperHeroesAdapter(
    private val superheroesList: ArrayList<Superheroe>
    ) : RecyclerView.Adapter<SuperHeroesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_superheroe_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val superheroe = superheroesList[position]
        holder.bind(superheroe)

    }

    override fun getItemCount(): Int = superheroesList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private var nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
        private var aliasTextView: TextView = itemView.findViewById(R.id.alias_text_view)
        private var pictureImageView: ImageView = itemView.findViewById(R.id.picture_image_view)


        fun bind(superheroe: Superheroe){
            nameTextView.text = superheroe.name
            aliasTextView.text = superheroe.alias
            //pictureImageView.
        }
    }

}