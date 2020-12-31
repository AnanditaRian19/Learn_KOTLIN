package com.learn.collection.app.testing

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val list = listOf("Rizki", "Rian", "Anandita")
    println(list.any { it.length > 5 })
    println(list.none { it.length > 5 })
    println(list.all { it.length > 5 })
    println(list.any())
    println(list.none())
}