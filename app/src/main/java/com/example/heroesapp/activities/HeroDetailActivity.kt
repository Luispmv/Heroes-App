package com.example.heroesapp.activities

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
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
        val description = intent.getStringExtra("description")
        val heroId = intent.getIntExtra("heroId", 0)


        // Actualizar las vistas
        val heroNameTextView: TextView = findViewById(R.id.heroname)
        val heroImageView: ImageView = findViewById(R.id.cardview)
        val descriptionTextView: TextView = findViewById(R.id.descripcion)
        val scrollView: ScrollView = findViewById(R.id.detailactivity)


        heroNameTextView.text = heroName
        Picasso.get().load(heroImage).into(heroImageView)
        descriptionTextView.text = description


        val redColor = Color.parseColor("#ED1D24")  // Rojo
        val blueColor = Color.parseColor("#0078F2") // Azul
        val defaultBackgroundColor = Color.parseColor("#FFFFFF") // Blanco por defecto

        val backgroundColor = when {
            heroId in 1..10 -> redColor
            heroId in 11..20 -> blueColor
            else -> defaultBackgroundColor
        }

        scrollView.setBackgroundColor(backgroundColor)
    }
}