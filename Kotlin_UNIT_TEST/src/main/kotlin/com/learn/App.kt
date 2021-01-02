package com.learn

/**
 * @author Rizki Rian Anandita
 */
class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
    println("Belajar Kotlin")
}