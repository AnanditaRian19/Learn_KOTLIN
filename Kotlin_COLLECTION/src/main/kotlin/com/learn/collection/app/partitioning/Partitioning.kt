package com.learn.collection.app.partitioning

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val list: List<String> = listOf("Rizki", "Rian", "Anandita")

    val (listMatch, listNotMatch) = list.partition { it.length > 5 }
    println(listMatch)
    println(listNotMatch)
}