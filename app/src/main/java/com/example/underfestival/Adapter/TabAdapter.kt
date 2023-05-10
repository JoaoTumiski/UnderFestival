@file:Suppress("DEPRECATION")

package com.example.underfestival.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.underfestival.Fragments.*

@Suppress("DEPRECATION")
internal class TabAdapter(fm: FragmentManager, var TotalTabs: Int) :
    FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return TotalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Inicio()
            }

            1 -> {
                Projeto()
            }

            2 -> {
                Potencial()
            }

            3 -> {
                Proposta()
            }

            4 -> {
                Artistas()
            }

            5 -> {
                Cotas()
            }

            6 -> {
                ComboArtistas()
            }

            7 -> {
                LogisticaDeVendas()
            }

            8 -> {
                Estrutura()
            }

            9 -> {
                Lucro()
            }
            else -> getItem(position)
        }
    }

}