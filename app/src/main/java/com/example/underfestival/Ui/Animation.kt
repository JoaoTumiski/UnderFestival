package com.example.underfestival.Ui

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView
import com.example.underfestival.R
import com.example.underfestival.databinding.ActivityAnimationBinding

class Animation : AppCompatActivity() {

    private lateinit var binding: ActivityAnimationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val lottieAnimationView = findViewById<LottieAnimationView>(R.id.lottieAnimationView)
        lottieAnimationView.addAnimatorListener(object : Animator.AnimatorListener {

            override fun onAnimationStart(animation: Animator) {
            }

            override fun onAnimationEnd(animation: Animator) {
                // Inicia a próxima activity após o término da animação
                val intent = Intent(applicationContext, Home::class.java)
                startActivity(intent)
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                finish()
            }

            override fun onAnimationCancel(animation: Animator) {

            }

            override fun onAnimationRepeat(animation: Animator) {

            }
        })
    }
}