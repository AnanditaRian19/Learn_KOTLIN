package com.learn.collection.app

/**
 * @author Rizki Rian Anandita
 */
fun <T> displayCollection(collection: Collection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun main() {
    displayCollection(listOf("Rizki", "Rian"))
    displayCollection(mutableListOf("Rizki", "Rian"))
    displayCollection(setOf("Rizki", "Rian"))
    displayCollection(mutableListOf("Rizki", "Rian"))
    displayCollection(mapOf("Rizki" to "Rian").entries)
//    displayCollection(mapOf("Rizki" to "Rian")) // ERROR, Map bukan turunan COllection
}