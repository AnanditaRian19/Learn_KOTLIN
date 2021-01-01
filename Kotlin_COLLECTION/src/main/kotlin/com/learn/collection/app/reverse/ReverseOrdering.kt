package com.learn.collection.app.reverse

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val list = mutableListOf("Rizki", "Rian", "Anandita")

    val listReversed = list.reversed()
    val listAsReversed = list.asReversed()

    println(listReversed)
    println(listAsReversed)

    list.add("Programmer")

    println(listReversed)
    println(listAsReversed)
}