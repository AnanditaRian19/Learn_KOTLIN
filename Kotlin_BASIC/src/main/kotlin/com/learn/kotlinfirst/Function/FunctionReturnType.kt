package com.learn.kotlinfirst.Function

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val result = sum(10, 10)
    println(result)
    // atau
    println(sum(20, 10))

    println(bagi(100, 0))
}

fun bagi(a: Int, b: Int): Int {
    if (b == 0) {
        return 0
    } else {
        val result = a / b
        return result
    }
}

fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}