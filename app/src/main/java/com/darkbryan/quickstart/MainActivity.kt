package com.darkbryan.quickstart

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var  texto : TextView
    var nombre : String = "BRYA"

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         texto = findViewById<TextView>(R.id.texto_bueno) as TextView

         texto.text = "HOLA COMO ESTAS?"


         cambiaText( nombre )

    }
    fun cambiaText( nom : String ){
        texto.text = nom
    }





}