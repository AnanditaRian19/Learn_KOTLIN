package com.learn.collection.app.mapping

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val map: Map<Int, String> = mapOf(
        1 to "Rizki",
        2 to "Rian",
        3 to "Anandita"
    )

    val mapKeys = map.mapKeys { it.key * 10 }
    println(mapKeys)

    val mapValues = map.mapValues { it.value.toUpperCase() }
    println(mapValues)
}