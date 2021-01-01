package com.learn.collection.app.mapspecificoperation

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val map = mapOf("a" to "Rizki", "b" to "Rian", "c" to "Anandita")

//    println(map.getValue("Tidak Ada")) // Exception
    println(map.getValue("a"))
    println(map.getOrElse("Tidak Ada") { "Ups" })
    println(map.filter { entry -> entry.value.length > 5 })
    println(map.filterKeys { it != "b" })
    println(map.filterValues { it.length > 5 })
}