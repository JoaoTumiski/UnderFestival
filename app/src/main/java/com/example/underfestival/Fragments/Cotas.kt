package com.example.underfestival.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.underfestival.Adapter.ViewPagerAdapter
import com.example.underfestival.R
import com.example.underfestival.databinding.FragmentArtistasBinding
import com.example.underfestival.databinding.FragmentCotasBinding


class Cotas : Fragment() {

    private var _binding: FragmentCotasBinding? = null
    private val binding get() = _binding!!

    private var seguiList = mutableListOf<String>()
    private var InscList = mutableListOf<String>()
    private var ouviList = mutableListOf<String>()
    private var cacheList = mutableListOf<String>()
    private var nomeList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCotasBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        postToList()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val view_pager2 = binding.viewPager2

        view_pager2.adapter = ViewPagerAdapter(seguiList, InscList, ouviList, cacheList, nomeList, imagesList)

        val indicator = binding.indicator
        indicator.setViewPager2(view_pager2)

    }

    private fun addToList(seguidores: String, inscritos: String, ouvintes: String, caches: String, nomes: String, image: Int) {
        seguiList.add(seguidores)
        InscList.add(inscritos)
        ouviList.add(ouvintes)
        cacheList.add(caches)
        nomeList.add(nomes)
        imagesList.add(image)
    }

    private fun postToList() {
        val artistas = listOf(
            Artista("840 mil seguidores", "430 mil Inscritos","2.5 milhões ouvintes", "30 mil reais","Major RD", R.drawable.majorrd),
            Artista("2,3 milhões seguidores", "1,45 milhões Inscritos","3.4 milhões ouvintes", "40 mil reais","Baco", R.drawable.baco),
            Artista("2,6 milhões seguidores", "854 mil Inscritos","3.5 milhões ouvintes", "30 mil reais","Borges", R.drawable.borges),
            Artista("658 mil seguidores", "3,43 milhões Inscritos","1.1 milhões ouvintes", "25 mil reais","Haikaiss", R.drawable.haikaiss),
            Artista("51,5 mil seguidores", "44,4 mil Inscritos", "1.2 milhões ouvintes", "7 mil reais","Murica",R.drawable.murica),
            Artista("587 mil seguidores", "768 mil Inscritos","3.2 milhões ouvintes", "10 mil reais","Raffa Moreira", R.drawable.raffa_moreira),
            Artista("511 mil seguidores", "370 mil Inscritos","932 mil ouvintes", "8 mil reais","Akarasta", R.drawable.akarasta),
            Artista("205 mil seguidores", "69,7 mil Inscritos","1.3 milhões ouvintes", "5 mil reais","CJota", R.drawable.cjota),
            Artista("3,4 milhões seguidores", "38,5 milhões Inscritos","2.4 mil ouvintes", "10 mil reais","Mc Binladen", R.drawable.binladen),
            Artista("4 milhões seguidores", "1.8 milhões Inscritos", "80 milhões ouvintes", "45 mil reais","Sidoka",R.drawable.sidoka)
        )
        artistas.forEach { artista ->
            addToList(artista.seguidores, artista.inscritos, artista.ouvintes, artista.caches, artista.nomes, artista.image)
        }
    }

    data class Artista(val seguidores: String, val inscritos: String, val ouvintes: String, val caches: String, val nomes: String, val image: Int)

    override fun onDestroy() {
        super.onDestroy()
        seguiList.clear()
        InscList.clear()
        ouviList.clear()
        cacheList.clear()
        nomeList.clear()
        imagesList.clear()
    }
}


