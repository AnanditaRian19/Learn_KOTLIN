package com.learn.collection.app.sequence

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    val lengthsList = words
        .filter {
            println("filter: $it")
            it.length > 3
        }
        .map {
            println("length $it")
            it.toUpperCase()
        }
        .take(4)

    println(lengthsList)

    println("=========")

//    val sequence = sequenceOf("a", "b", "c") // cara manual
    val sequence = words.asSequence() // cara konversi
    val resultSequence = sequence
        .filter {
            println("filter: $it")
            it.length > 3
        }
        .map {
            println("length $it")
            it.toUpperCase()
        }
        .take(4)
    println(resultSequence.toList())
}