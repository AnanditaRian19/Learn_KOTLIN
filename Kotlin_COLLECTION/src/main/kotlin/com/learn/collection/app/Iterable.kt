package com.learn.collection.app

/**
 * @author Rizki Rian Anandita
 */
fun <T> displayIterable(iterable: Iterable<T>) {
    /*
    for (value in iterable) {
        println(value)
    }
    */ // fungsi secara otomatis, manual nya seperti dibawah

    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
//        println(iterator.next()) // atau
        println(value)
    }
}

fun main() {
    displayIterable(listOf("Rizki", "Rian", "Anandita"))
    displayIterable(setOf("Rizki", "Rian", "Anandita"))
}