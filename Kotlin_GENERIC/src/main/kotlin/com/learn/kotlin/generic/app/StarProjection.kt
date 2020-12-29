package com.learn.kotlin.generic.app

/**
 * @author Rizki Rian Anandita
 */

fun displayLength(array: Array<*>) {
    println("Total array is ${array.size}")
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val arrayString: Array<String> = arrayOf("Rizki", "Rian", "Anandita")

    displayLength(arrayInt)
    displayLength(arrayString)
}