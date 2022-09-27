package com.darkbryan.quickstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.sql.DriverManager.println

class MainActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun mostrarHola(){
        println("Hola KOTLIN")
    }

}