package com.learn.collection.app

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val map: Map<String, String> = mapOf(
        Pair("a", "Rizki"),
        "b" to "Rian",
        "c" to "Anandita"
    )

    for ((key, value) in map) {
        println("$key to $value")
    }
}