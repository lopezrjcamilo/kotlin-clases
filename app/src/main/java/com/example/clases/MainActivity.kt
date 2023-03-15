package com.example.clases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        classes()
    }

    fun  classes(){
        //creamos nuestra clase desde nuestro  proyecto
        val brais = Programmer("brais", 30, arrayOf(Programmer.Languaje.KOTLIN, Programmer.Languaje.SWIFT))
        println(brais.name)

        brais.age = 40
        brais.code()

        //creamos otro objeto llamado sara por ejemplo
        val sara = Programmer("sara", 35, arrayOf(Programmer.Languaje.JAVASCRIPT), arrayOf(brais))
        sara.code()
        println("${sara.friends?.first()?.name} es amigo de ${sara.name}")
    }

}