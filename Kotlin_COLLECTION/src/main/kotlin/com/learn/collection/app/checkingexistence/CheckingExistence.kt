package com.learn.collection.app.checkingexistence

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val numbers = (1..10).toList()

    println(numbers.contains(5))
    println(numbers.containsAll(listOf(1, 2, 3)))
    println(numbers.isEmpty())
    println(numbers.isNotEmpty())
}