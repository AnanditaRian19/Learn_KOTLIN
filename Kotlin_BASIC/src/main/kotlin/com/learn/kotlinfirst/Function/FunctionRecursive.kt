package com.learn.kotlinfirst.Function

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    println(factorial(4))
    println(factorialRecursive(3))
}

fun factorial(value: Int): Int {
    var result = 1
    for (i in value downTo 1) {
        result *= i
    }

    return result
}

fun factorialRecursive(value: Int): Int {
    return when (value) {
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}