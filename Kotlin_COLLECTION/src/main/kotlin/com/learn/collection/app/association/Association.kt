package com.learn.collection.app.association

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val list1: List<String> = listOf("Rizki", "Rian", "Anandita")

    val map: Map<String, Int> = list1.associate { value -> Pair(value, value.length) }
    // atau
//    val map: Map<String, Int> = list1.associate { Pair(it, it.length) }
    println(map)

    val map2: Map<String, Int> = list1.associateWith { it.length }
    println(map2)

    val map3: Map<Int, String> = list1.associateBy { it.length }
    println(map3)
}