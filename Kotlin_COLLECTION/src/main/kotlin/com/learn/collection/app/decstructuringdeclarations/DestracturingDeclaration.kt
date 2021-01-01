package com.learn.collection.app.decstructuringdeclarations

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val map = mapOf(
        "a" to "Rizki",
        "b" to "Rian",
        "c" to "Anandita"
    )

    for ((key, value) in map) {
        println("$key : $value")
    }

//    map.forEach { entry -> println("${entry.component1()} : ${entry.component2()}") }
    // Menggunakan Desctruturing
    map.forEach { (key, value) -> println("$key : $value") }
}