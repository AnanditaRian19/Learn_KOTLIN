package com.learn.collection.app

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val pair: Pair<String, String> = Pair("Rizki", "Rian")
    println(pair.first)
    println(pair.second)

    val pair2: Pair<String, String> = "Rizki" to "Rian"
    println(pair2.first)
    println(pair2.second)
}