package com.example.underfestival.Ui

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.vectordrawable.graphics.drawable.Animatable2Compat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.gif.GifDrawable
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.example.underfestival.R
import com.example.underfestival.databinding.ActivityAnimationBinding

class Animation : AppCompatActivity() {

    private lateinit var binding: ActivityAnimationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val imageView = findViewById<ImageView>(R.id.AnimationView)

        Glide.with(this)
            .asGif()
            .load(R.drawable.animation_logo)
            .into(object : SimpleTarget<GifDrawable>() {
                override fun onResourceReady(
                    resource: GifDrawable,
                    transition: Transition<in GifDrawable>?
                ) {
                    resource.setLoopCount(1) // Define o número de vezes que o GIF será reproduzido
                    resource.registerAnimationCallback(object : Animatable2Compat.AnimationCallback() {
                        override fun onAnimationEnd(drawable: Drawable) {
                            // O GIF terminou. Navegue para a próxima tela.
                            val intent = Intent(applicationContext, Home::class.java)
                            startActivity(intent)
                            finish()
                        }
                    })

                    imageView.setImageDrawable(resource)
                    resource.start()
                }
            })
    }
}