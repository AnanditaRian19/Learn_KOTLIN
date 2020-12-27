package com.learn.kotlinfirst.Function

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val result0 = finalValue("Rizki Rian Anandita", 10, 10, 10, 10, 10, 10, 10)
    println(result0)

    val values = arrayOf(10, 10, 10, 10)
    val result = hitungTotal(values)
    println(result)
}

// varargs harus disimpan di ujung
fun finalValue(fullName: String, vararg values: Int): Int {
    var total = 0
    for (value in values) {
        total += value
    }
    println("$fullName $total")

    return total
}

fun hitungTotal(values: Array<Int>): Int {
    var total = 0
    for (value in values) {
        total += value
    }

    return total
}