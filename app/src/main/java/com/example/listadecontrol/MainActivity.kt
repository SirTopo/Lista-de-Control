package com.example.listadecontrol

import android.content.SharedPreferences
import android.os.Bundle
import android.text.Editable
import androidx.appcompat.app.AppCompatActivity
import com.example.listadecontrol.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inicializar SharedPreferences
        sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)

        // Recuperar los datos guardados
        val savedEmail = sharedPreferences.getString("EMAIL", "") ?: ""
        val savedPassword = sharedPreferences.getString("PASSWORD", "") ?: ""

// Convertir String a Editable
        val editableEmail: Editable = Editable.Factory.getInstance().newEditable(savedEmail)
        val editablePassword: Editable = Editable.Factory.getInstance().newEditable(savedPassword)

// Usar los datos guardados (puedes mostrarlos en el UI o usarlos de otra manera)
        binding.emailEditText.text = editableEmail
        binding.passwordEditText.text = editablePassword
// Comparar los datos almacenados para mostar los errores




        // iniciar sesión automáticamente si los datos existen
        //if (!savedEmail.isNullOrEmpty() && !savedPassword.isNullOrEmpty()) {
        // Lógica para iniciar sesión automáticamente o validar credenciales
        //startActivity(Intent(this, SomeOtherActivity::class.java))
        // }
    }
}