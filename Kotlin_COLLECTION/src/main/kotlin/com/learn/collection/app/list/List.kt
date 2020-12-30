package com.learn.collection.app

/**
 * @author Rizki Rian Anandita
 */

fun main() {
    val list: List<String> = listOf("Rizki", "Rian", "Anandita")
    println(list.get(0))
    println(list.get(1))
    println(list.get(2))
    println(list.indexOf("Anandita"))
    println(list.indexOf("Tidak Ada")) // data yang tidak ada
    println(list.contains("Rizki")) // data yang mengndung
    println(list.contains("Tidak Ada")) // mengandung data yang tidak ada
    println(list.containsAll(listOf("Rizki", "Rian")))
    println(list.isEmpty())
    println(list.isNotEmpty())
}