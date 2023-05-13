package com.example.underfestival.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.underfestival.R

class ApAdapter(private val artistas: List<String>, private val valores: List<String>, private val Tipo: String) :
    RecyclerView.Adapter<ApAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_artistas_principais, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val artista = artistas[position]
        val valor = valores[position]
        val tipo = Tipo
        holder.bind(artista, valor, tipo)
    }

    override fun getItemCount(): Int {
        return artistas.size
    }

    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val artistaTextView: TextView = itemView.findViewById(R.id.artista)
        private val valorTextView: TextView = itemView.findViewById(R.id.valor)
        private val TipoArtistaTextView: TextView = itemView.findViewById(R.id.textPrincipal)

        fun bind(artista: String, valor: String, tipo:String) {
            artistaTextView.text = artista
            valorTextView.text = valor
            TipoArtistaTextView.text = tipo

            if (tipo == "(NACIONAL)"){
                TipoArtistaTextView.setTextColor(itemView.context.resources.getColor(R.color.pink))
            }else if (tipo == "(REGIONAL)"){
                TipoArtistaTextView.setTextColor(itemView.context.resources.getColor(R.color.details))
            }else {
                TipoArtistaTextView.setTextColor(itemView.context.resources.getColor(R.color.yelow))
            }
        }
    }
}