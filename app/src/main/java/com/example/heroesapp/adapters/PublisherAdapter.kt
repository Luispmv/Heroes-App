package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroesapp.R
import com.example.heroesapp.models.Publisher
import com.squareup.picasso.Picasso

class PublisherAdapter(val publisherList: List<Publisher>): RecyclerView.Adapter<PublisherViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publisher_item, parent, false)
        return PublisherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return publisherList.count()
    }

    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
        val publisher = publisherList[position]
//        holder.image.src

        //Maybe esta linea esta mal
        Picasso.get().load(publisher.image).into(holder.image)
    }

}
class PublisherViewHolder(view: View): ViewHolder(view){
    val image : ImageView = view.findViewById(R.id.publisher_image)
}