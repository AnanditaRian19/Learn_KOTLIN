package com.learn.kotlinfirst.TipeData

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val range = 1..1000 step 2

    // Range terbalik
    val rangeReverse = 1000 downTo 1

    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)
}