package com.learn.collection.app

/**
 * @author Rizki Rian Anandita
 */
fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
    /*
    for (value in iterable) {
        println(value)
    }
    */ // fungsi secara otomatis, manual nya seperti dibawah

    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
//        println(iterator.next()) // atau
//        iterator.remove() // Menghapus data di iterasi saat ini
        println(value)
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Rizki", "Rian", "Anandita"))
    displayMutableIterable(mutableSetOf("Rizki", "Rian", "Anandita"))
}