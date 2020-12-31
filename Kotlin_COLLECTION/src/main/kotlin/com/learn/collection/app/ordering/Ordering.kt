package com.learn.collection.app.ordering

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val numbers = listOf(1, 4, 2, 4, 6, 3, 5)

    println(numbers.sorted()) // [1, 2, 3, 4, 4, 5, 6]
    println(numbers.sortedDescending()) //[6, 5, 4, 4, 3, 2, 1]
}