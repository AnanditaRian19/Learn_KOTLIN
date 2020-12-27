package com.learn.kotlinfirst.Function

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    println(hello { "Rizki" })
    println(hello { "Anandita" })
}

inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}