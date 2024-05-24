package com.example.listadecontrol

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.listadecontrol.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inicializar SharedPreferences
        sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)

        // Escuchar el evento de clic en el botón de registro
        binding.registerButton.setOnClickListener {
            val email = binding.registerEmailEditText.text.toString().trim()
            val password = binding.registerPasswordEditText.text.toString().trim()

            // Guardar el correo y la contraseña en SharedPreferences
            val editor = sharedPreferences.edit()
            editor.putString("EMAIL", email)
            editor.putString("PASSWORD", password)
            editor.apply()

            // Puedes iniciar la actividad de inicio de sesión después de guardar los datos
            //startActivity(Intent(this, MainActivity::class.java))

            // Colocar mensaje de registro completado
            setContentView(R.layout.activity_register)

                val registerButton = findViewById<Button>(R.id.registerButton)

                registerButton.setOnClickListener {
                    //Conectar con la pantalla principal 
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
        }
    }
}