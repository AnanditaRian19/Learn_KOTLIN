package com.learn.collection.app.aggregate

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val numbers = (1..100).toList()

    println(numbers.max())
    println(numbers.min())
    println(numbers.average())
    println(numbers.sum())

    println(numbers.sumBy { it / 2 })
}