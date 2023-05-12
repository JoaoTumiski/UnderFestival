package com.example.underfestival.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.underfestival.databinding.FragmentArtistasBinding


class Artistas : Fragment() {

    private var _binding: FragmentArtistasBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentArtistasBinding.inflate(inflater, container, false)
        return binding.root

    }
}


