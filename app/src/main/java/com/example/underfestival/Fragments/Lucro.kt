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

class Lucro : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_lucro, container, false)

        val corDestaque = ContextCompat.getColor(requireContext(), R.color.yelow)
        val texto = getString(R.string.lucrotext)
        val spannableString = SpannableString(texto)

        val destaques = listOf(
            "UnderFest visa explorar esse potencial enorme da cidade e a crescente no turismo",
            "mais jovens atingido idades e liberdade financeiras",
            "dobrará o movimento turistico na cidade",
            "potencial turistico e cultural"
        )

        for (destaque in destaques) {
            val startIndex = texto.indexOf(destaque)
            val endIndex = startIndex + destaque.length
            val foregroundColorSpan = ForegroundColorSpan(corDestaque)
            spannableString.setSpan(foregroundColorSpan, startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }

        val textView = view.findViewById<TextView>(R.id.text_potencial)
        textView.text = spannableString

        return view

    }
}