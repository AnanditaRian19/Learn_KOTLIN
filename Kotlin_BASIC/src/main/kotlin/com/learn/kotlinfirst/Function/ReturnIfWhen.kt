package com.learn.kotlinfirst.Function

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    fun sayHello(name: String = ""): String {
        return if (name == "") {
            "Hello Bro"
        } else {
            "Hello $name"
        }
    }

    println(sayHello("Rizki"))

    fun sayWhen(name: String): String {
        return when (name) {
            "" -> "Hello Bro"
            else -> "Hello $name"
        }
    }

    println(sayWhen("Rian"))
}