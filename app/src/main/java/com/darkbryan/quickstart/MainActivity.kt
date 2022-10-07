package com.darkbryan.quickstart

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


    class MainActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val texto = findViewById<TextView>(R.id.texto_bueno) as TextView
         val numero1: Int = 15
         val numero2: Int = 10

         if(numero1 != numero2){
             texto.text = "VERDADERO"
         }else{
             texto.text = "FALSO"
         }

         /*
         > Mayor que
         < Menor que
         >= Mayor o igual
         <= Menor o igual
         == igual
         != distinto
          */









    }
}