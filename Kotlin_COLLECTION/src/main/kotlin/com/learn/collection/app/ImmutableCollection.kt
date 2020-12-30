package com.learn.collection.app

/**
 * @author Rizki Rian Anandita
 */
fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun main() {
//    displayMutableCollection(listOf("Rizki", "Rian")) // ERROR bukan turunan mutable
    displayMutableCollection(mutableListOf("Rizki", "Rian"))
//    displayMutableCollection(setOf("Rizki", "Rian")) // ERROR bukan turunan mutable
    displayMutableCollection(mutableListOf("Rizki", "Rian"))
    displayMutableCollection(mutableMapOf("Rizki" to "Rian").entries)
}