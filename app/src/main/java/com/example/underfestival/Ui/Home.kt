package com.example.underfestival.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager.widget.ViewPager
import com.example.underfestival.Adapter.TabAdapter
import com.example.underfestival.Fragments.Artistas
import com.example.underfestival.R
import com.example.underfestival.databinding.ActivityHomeBinding
import com.google.android.material.tabs.TabLayout

class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val ArtistasFragment = Artistas()

        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransition: FragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransition.replace(R.id.activity_main, ArtistasFragment).commit()

        //tab View

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.activity_main)

        tabLayout.addTab(tabLayout.newTab().setText("Under Festival"))
        tabLayout.addTab(tabLayout.newTab().setText("Projeto"))
        tabLayout.addTab(tabLayout.newTab().setText("Potencial"))
        tabLayout.addTab(tabLayout.newTab().setText("Artistas"))
        tabLayout.addTab(tabLayout.newTab().setText("Estrutura"))
        tabLayout.addTab(tabLayout.newTab().setText("Lucro"))
        tabLayout.tabGravity = TabLayout.GRAVITY_CENTER

        val adapter = TabAdapter(
            supportFragmentManager, tabLayout.tabCount
        )
        viewPager.adapter = adapter

        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })
    }
}