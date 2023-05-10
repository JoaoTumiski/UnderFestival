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

class Proposta : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_proposta, container, false)

        val corDestaque = ContextCompat.getColor(requireContext(), R.color.yelow)
        val texto = getString(R.string.Proposta_text)
        val spannableString = SpannableString(texto)

        val destaques = listOf(
            "diversos espaços interativos",
            "marcas locais",
            " O nosso festival"
        )

        for (destaque in destaques) {
            val startIndex = texto.indexOf(destaque)
            val endIndex = startIndex + destaque.length
            val foregroundColorSpan = ForegroundColorSpan(corDestaque)
            spannableString.setSpan(foregroundColorSpan, startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }

        val textView = view.findViewById<TextView>(R.id.text_projeto)
        textView.text = spannableString

        // destaque 2

        val corDestaque2 = ContextCompat.getColor(requireContext(), R.color.yelow)
        val texto2 = getString(R.string.propostaTitle)
        val spannableString2 = SpannableString(texto2)

        val destaques2 = listOf(
            "PRoPoSTa é uM FeSTIVaL"

        )

        for (destaque in destaques2) {
            val startIndex2 = texto2.indexOf(destaque)
            val endIndex2 = startIndex2 + destaque.length
            val foregroundColorSpan2 = ForegroundColorSpan(corDestaque2)
            spannableString2.setSpan(foregroundColorSpan2, startIndex2, endIndex2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }

        val textView2 = view.findViewById<TextView>(R.id.title_proposta)
        textView2.text = spannableString2


        return view
    }
}