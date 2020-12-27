package com.learn.kotlinfirst.Perulangan

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val names = arrayOf("Rizki", "Rian", "Anandita")
    var total = 0
    for (name in names) {
        println(name)
        total++
    }

    println("Total $total")

    for (value in 0..10 step 2) {
        println(value)
    }

    for (value in 10 downTo 0 step 5) {
        println(value)
    }
    val arraySize = names.size - 1
    for (i in 0..arraySize) {
        println("Index $i = ${names.get(i)}")
    }

}