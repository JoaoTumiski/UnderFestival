package com.example.underfestival.Fragments

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.underfestival.R

class Projeto : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_projeto, container, false)

        val corDestaque = ContextCompat.getColor(requireContext(), R.color.yelow)
        val texto = getString(R.string.projeto)
        val spannableString = SpannableString(texto)

        val destaques = listOf(
            "A cidade de Foz do Iguaçu é multicultural",
            "A diversidade também se expressa",
            "hip hop",
            "liberdade e fúria",
            "UNDER FEST nasce para celebrar esse sentimento"
        )

        for (destaque in destaques) {
            val startIndex = texto.indexOf(destaque)
            val endIndex = startIndex + destaque.length
            val foregroundColorSpan = ForegroundColorSpan(corDestaque)
            spannableString.setSpan(foregroundColorSpan, startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }

        val textView = view.findViewById<TextView>(R.id.text_projeto)
        textView.text = spannableString

        return view
    }
}