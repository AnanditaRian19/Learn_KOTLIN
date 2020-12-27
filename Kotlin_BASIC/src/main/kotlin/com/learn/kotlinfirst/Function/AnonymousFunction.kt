package com.learn.kotlinfirst.Function

/**
 * @author Rizki Rian Anandita
 */
fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val anonymousUpper = fun(value: String): String {
        if (value.isBlank()) { // atau value == ""
            return "Ups"
        }
        return value.toUpperCase()
    }

    println(hello("Rizki", anonymousUpper))
    println(hello("", anonymousUpper))

    // atau

    println(hello("", fun(value: String): String {
        return value.toLowerCase()
    }))
}