package com.example.clases

//import org.intellij.lang.annotations.Language
//import java.sql.Array

class Programmer(
    val name: String,
    var age: Int,
    val languajes: Array<Languaje>,
    val friends: Array<Programmer>? = null
) {

    //ahora podemos utilizar los enumerados
    enum class Languaje{
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT,
    }

    //Dentro de nuestras clases podemos crear una función
    fun code(){
        for (languaje in languajes){
            println("$name Estoy programando en $languaje")
        }
    }

}