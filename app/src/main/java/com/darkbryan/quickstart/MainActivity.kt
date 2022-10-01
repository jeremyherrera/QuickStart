package com.darkbryan.quickstart

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


    class MainActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val textView = findViewById<TextView>(R.id.texto_hola)

         textView.text = "HOLA KOTLIN"



    }
}