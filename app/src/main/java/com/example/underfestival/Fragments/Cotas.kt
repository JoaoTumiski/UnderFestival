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

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCotasBinding.inflate(inflater, container, false)
        return binding.root

    }
}


