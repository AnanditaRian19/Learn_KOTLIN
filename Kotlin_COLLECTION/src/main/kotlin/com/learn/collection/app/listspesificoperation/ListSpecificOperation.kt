package com.learn.collection.app.listspesificoperation

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val list = listOf("Rizki", "Rian", "Anandita")

    println(list.getOrNull(1))
    println(list.getOrElse(10) { index -> "Tidak Ada" })
    println(list.subList(0, 2))

    val sortedList = list.sorted()
    println(sortedList)
    println(sortedList.binarySearch("Rizki"))
    println(sortedList.binarySearch("Rian"))
    println(sortedList.binarySearch("Anandita"))

    val numbers = listOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5)
    println(numbers.indexOf(2))
    println(numbers.lastIndexOf(2))
    println(numbers.indexOfFirst { it > 3 })
    println(numbers.indexOfLast { it > 3 })
}