package com.learn.kotlinfirst.Function

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val name: String = "Rizki"
    val hello: String = name.hello()
    println(hello)

    name.printHello()
    "Rian".printHello()
}

fun String.hello(): String {
    return "Hello $this"
}

fun String.printHello(): Unit = println("Hello $this")