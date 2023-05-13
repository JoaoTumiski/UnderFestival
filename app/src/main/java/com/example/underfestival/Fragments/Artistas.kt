package com.example.underfestival.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.underfestival.Adapter.ApAdapter
import com.example.underfestival.R


class Artistas : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_artistas, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.artistasRecyclerView)
        val layoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = layoutManager

        val artistas = listOf("MATUE", "teto", "ryan mc", "kayblack", "major rd", "baco", "borges", "sidoka", "caveirinha", "haikaiss")
        val valores = listOf("R$200 mil", "R$100 mil", "R$200 mil", "R$150 mil", "R$30 mil", "R$80 mil", "R$30 mil", "R$40 mil", "R$20 mil", "R$25 mil")
        val tipo = "(PRINCIPAL)"

        val adapter = ApAdapter(artistas, valores, tipo)

        recyclerView.adapter = adapter

        //adapter Nacional

        val recyclerView2: RecyclerView = view.findViewById(R.id.artistasRecyclerView2)
        val layoutManager2 = LinearLayoutManager(requireContext())
        recyclerView2.layoutManager = layoutManager2

        val artistas2 = listOf("salvador", "hyperanhas", "uclã", "felp", "akarasta", "cjota", "murica", "raffa moreira", "mc bin laden", "teteu mc")
        val valores2 = listOf("R$20 mil", "R$18 mil", "R$14 mil", "R$15 mil", "R$8 mil", "R$8 mil", "R$7 mil", "R$10 mil", "R$5 mil", "R$5 mil")
        val tipo2 = "(NACIONAL)"

        val adapter2 = ApAdapter(artistas2, valores2, tipo2)

        recyclerView2.adapter = adapter2

        //Adapter Regional

        val recyclerView3: RecyclerView = view.findViewById(R.id.artistasRecyclerView3)
        val layoutManager3 = LinearLayoutManager(requireContext())
        recyclerView3.layoutManager = layoutManager3

        val artistas3 = listOf("PHILO", "RUBIN", "BIG SHOW")
        val valores3 = listOf("R$5 mil", "R$5 MIL", "R$5 MIL")
        val tipo3 = "(REGIONAL)"

        val adapter3 = ApAdapter(artistas3, valores3, tipo3)

        recyclerView3.adapter = adapter3

        return view
    }
}


