package com.example.underfestival.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.underfestival.Fragments.Inicio
import com.example.underfestival.Fragments.Potencial
import com.example.underfestival.Fragments.Projeto

internal class TabAdapter(var context: Context, fm: FragmentManager, var TotalTabs: Int) :
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
            else -> getItem(position)
        }
    }

}