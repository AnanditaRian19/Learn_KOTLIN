package com.learn.collection.app.zipping

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val list: List<Pair<String, String>> = listOf(
        "Rizki" to "Programmer",
        "Rian" to "Zaman",
        "Anandita" to "Now"
    )

    val pair: Pair<List<String>, List<String>> = list.unzip()
    println(pair)
    println(pair.first)
    println(pair.second)

    println()
    val (list1, list2) = list.unzip()
    println(list1)
    println(list2)
}