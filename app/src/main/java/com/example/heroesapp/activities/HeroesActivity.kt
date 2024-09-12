package com.example.heroesapp.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R
import com.example.heroesapp.adapters.CharacterItemAdapter
import com.example.heroesapp.models.CharacterItem

class HeroesActivity : AppCompatActivity() {

    lateinit var backHeroes : ImageView
    lateinit var itemRecyclerView: RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)
        val colorHex = intent.getStringExtra("COLOR")

        // Verificar que el color no sea nulo y aplicarlo
        colorHex?.let {
            val color = Color.parseColor(it)
            window.decorView.setBackgroundColor(color)
        }
        backHeroes = findViewById(R.id.back_heroes)
        backHeroes.setOnClickListener{
            val intent = Intent(this@HeroesActivity, PublisherActivity::class.java)
            startActivity(intent)
            finish()
        }

        itemRecyclerView = findViewById(R.id.heroes_list)
        itemRecyclerView.adapter = CharacterItemAdapter(CharacterItem.characters)
        itemRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }
}