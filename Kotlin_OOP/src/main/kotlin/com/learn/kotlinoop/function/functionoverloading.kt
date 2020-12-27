package com.learn.kotlinoop.function

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val rian = Jelma()
    rian.firstName = "Rian"

    rian.sayHello("Rizki")
    rian.sayHello(10)
    rian.sayHello("Rizki", "Rian")
}