package com.example.heroesapp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R
import com.example.heroesapp.models.Publisher

class PublisherActivity : AppCompatActivity() {
    lateinit var logoutBtn : ImageView
    lateinit var publisherRecyclerView:  RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.publisher_activity)
        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
        logoutBtn = findViewById(R.id.logoutBtn)



        logoutBtn.setOnClickListener{
            Log.i("LOGOUT","CERRANDO SESION")
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            // Para navegar entre activities usamos intent
            val intent = Intent(this@PublisherActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}