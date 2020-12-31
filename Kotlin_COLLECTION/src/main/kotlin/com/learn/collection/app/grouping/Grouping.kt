package com.learn.collection.app.grouping

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val list = listOf("a", "a", "b", "b", "c", "c", "aa", "aa", "bb", "abc")
    val map: Map<String, List<String>> = list.groupBy { value -> value } // atau bisa di it
    println(map)

    // groupBy balikannya Map
    val map2: Map<Int, List<String>> = list.groupBy { value -> value.length } // atau bisa di it
    println(map2)

    // groupBy balikannya Grouping
    val grouping: Grouping<String, String> = list.groupingBy { it }
    println(grouping)
}