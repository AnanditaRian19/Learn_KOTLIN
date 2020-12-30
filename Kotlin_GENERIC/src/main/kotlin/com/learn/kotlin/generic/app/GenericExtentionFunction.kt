package com.learn.kotlin.generic.app

/**
 * @author Rizki Rian Anandita
 */

class Data<T>(val data: T)

fun Data<String>.print() {
    val data: String = this.data
    println(data)
}

fun Data<Int>.printInt() {
    val data: Int = this.data
    println(data)
}

fun main() {
    val data1 = Data(2)
    val data2 = Data("Rizki")

    // Print
    data1.printInt()
    data2.print()
}