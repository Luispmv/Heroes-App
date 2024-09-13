package com.example.heroesapp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroesapp.R
import com.squareup.picasso.Picasso

class HeroDetailActivity : AppCompatActivity() {

    lateinit var backbtn : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hero_detail)


        //Regresando al activity anterior
        backbtn = findViewById(R.id.back_list)
        backbtn.setOnClickListener{
            val intent = Intent(this@HeroDetailActivity, PublisherActivity::class.java)
            startActivity(intent)
            finish()
        }

        val heroName = intent.getStringExtra("heroName")
        val heroImage = intent.getStringExtra("heroImage")

        // Actualizar las vistas
        val heroNameTextView: TextView = findViewById(R.id.heroname)
        val heroImageView: ImageView = findViewById(R.id.cardview)

        heroNameTextView.text = heroName
        Picasso.get().load(heroImage).into(heroImageView)
    }
}