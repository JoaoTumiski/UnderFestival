package com.example.underfestival.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.underfestival.Adapter.ViewPagerAdapter
import com.example.underfestival.R
import com.example.underfestival.databinding.FragmentArtistasBinding


class Artistas : Fragment() {

    private var _binding: FragmentArtistasBinding? = null
    private val binding get() = _binding!!

    private var titleList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()
    private var dataList: List<Triple<String, String, Int>>? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentArtistasBinding.inflate(inflater, container, false)

        val view_pager2 = binding.viewPager2

        if (dataList == null) {
            // se a lista ainda não foi criada, crie-a aqui
            dataList = listOf(
                Triple("Title 1", "description 1", R.drawable.majorrd),
                Triple("Title 1", "description 1", R.drawable.baco),
                Triple("Title 1", "description 1", R.drawable.borges),
                Triple("Title 1", "description 1", R.drawable.haikaiss),
                Triple("Title 1", "description 1", R.drawable.murica),
                Triple("Title 1", "description 1", R.drawable.raffa_moreira),
                Triple("Title 1", "description 1", R.drawable.akarasta),
                Triple("Title 1", "description 1", R.drawable.cjota),
                Triple("Title 1", "description 1", R.drawable.binladen),
                Triple("Title 1", "description 1", R.drawable.sidoka)
            )
        }

        postToList(dataList!!)

        view_pager2.adapter = ViewPagerAdapter(titleList, descList, imagesList)

        val indicator = binding.indicator
        indicator.setViewPager2(view_pager2)

        return binding.root
    }

    private fun addToList(title: String, description: String, image: Int) {

        titleList.add(title)
        descList.add(description)
        imagesList.add(image)
    }

    private fun postToList(data: List<Triple<String, String, Int>>) {
        data.forEach { (title, description, image) ->
            addToList(title, description, image)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}