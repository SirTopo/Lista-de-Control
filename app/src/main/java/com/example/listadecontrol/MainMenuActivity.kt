package com.example.listadecontrol
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val logoutTextView = findViewById<TextView>(R.id.logoutTextView)
        val profileImageView = findViewById<ImageView>(R.id.profileImageView)
        val cartImageView = findViewById<ImageView>(R.id.cartImageView)
        val categoriesImageView = findViewById<ImageView>(R.id.categoriesImageView)

        logoutTextView.setOnClickListener {
            // Código para cerrar sesión y volver a la pantalla de inicio de sesión
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        profileImageView.setOnClickListener {
            // Código para ir a la pantalla de perfil
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        cartImageView.setOnClickListener {
            // Código para ir a la pantalla del carrito
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }

        categoriesImageView.setOnClickListener {
            // Código para ir a la pantalla de categorías
            val intent = Intent(this, StorageActivity::class.java)
            startActivity(intent)
        }
    }
}