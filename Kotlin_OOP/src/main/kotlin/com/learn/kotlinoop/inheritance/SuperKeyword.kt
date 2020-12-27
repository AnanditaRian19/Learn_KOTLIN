package com.learn.kotlinoop.inheritance

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val rectangle = Rectangle()
    println("Corner ${rectangle.corner}")
    println("Parent Corner ${rectangle.parentCorner}")

    rectangle.printName()
}