package com.learn.collection.app.iterator

/**
 * @author Rizki Rian Anandita
 */
fun <T> displayListIterator(listIterator: ListIterator<T>) {
    println("Display next")
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }

    println("Display Previous")
    while (listIterator.hasPrevious()) {
        println(listIterator.previous())
    }
}

fun main() {
    displayListIterator(listOf("Rizki", "Rian", "Anandita").listIterator())
}