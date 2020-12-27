package com.learn.kotlinfirst.Function

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val upperTransformer = { value: String -> value.toUpperCase() }
    val lowerTransformer = { value: String -> value.toLowerCase() }
    println(hello("Anandita", upperTransformer))
    println(hello("Rizki", lowerTransformer))

    // Trailing lambda
    val result1 = hello("Rizki") { value: String ->
        value.toUpperCase()
    }

    val result2 = hello("Anandita") { value: String ->
        value.toLowerCase()
    }
}

fun hello(value: String, transformer: (String) -> String): String {
    return "Hello ${transformer(value)}"
}