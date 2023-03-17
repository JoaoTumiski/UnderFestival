package com.example.underfestival.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.example.underfestival.R

class ViewPagerAdapter(private var seguidores: List<String>, private var inscritos: List<String>,
                       private var ouvintes: List<String>, private var cache: List<String>,private var nome: List<String>,
                       private var images: List<Int>): RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>(){

    inner class Pager2ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val itemSeguidores: TextView = itemView.findViewById(R.id.Seguidores)
        val itemInscritos: TextView = itemView.findViewById(R.id.Inscritos)
        val itemOuvintes: TextView = itemView.findViewById(R.id.ouvintes)
        val itemCache: TextView = itemView.findViewById(R.id.cache)
        val itemNome: TextView = itemView.findViewById(R.id.NomeArtista)
        val itemImage: ImageView = itemView.findViewById(R.id.ArtistaImage)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerAdapter.Pager2ViewHolder {
       return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false))
    }

    override fun onBindViewHolder(holder:ViewPagerAdapter.Pager2ViewHolder, position: Int) {
        holder.itemImage.setImageResource(images[position])
        holder.itemSeguidores.text = seguidores[position]
        holder.itemInscritos.text = inscritos[position]
        holder.itemOuvintes.text = ouvintes[position]
        holder.itemCache.text = cache[position]
        holder.itemNome.text = nome[position]
    }

    override fun getItemCount(): Int {
        return cache.size
    }

}