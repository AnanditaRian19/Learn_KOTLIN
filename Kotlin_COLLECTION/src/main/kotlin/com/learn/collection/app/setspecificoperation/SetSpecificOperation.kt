package com.learn.collection.app.setspecificoperation

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val number1 = (1..10).toSet()
    val number2 = (6..15).toSet()

    println(number1 union number2)
//    println(number1.union(number2))

    println(number1 intersect  number2) // Value di tengah/beririsan/diantara
//    println(number1.intersect(number2))

    println(number1 subtract number2) // Value yg tidak ada di number 1
    println(number2 subtract number1) // Value yg tidak ada di number 2
//    println(number1.subtract(number2))
}