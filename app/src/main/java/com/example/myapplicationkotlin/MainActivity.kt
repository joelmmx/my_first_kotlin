package com.example.myapplicationkotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        var textViewNombre:TextView
        textViewNombre = findViewById(R.id.text_nombre) as TextView
        textViewNombre.text = "Hola Kotlin Ine"

    }
}