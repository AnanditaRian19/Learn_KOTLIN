package com.learn.collection.app.filtering

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val list1 = listOf("Rizki", "Rian", "Anandita")
    // Menampilkan list yang value nya lebih dari 5
    val list2 = list1.filter { it.length > 5 }
    println(list2)

    // mengambil value yang genap saja
    val list3 = list1.filterIndexed { index, value -> index % 2 == 0 }
    println(list3)

    val list4 = listOf(null, 1, "Rizki", "Anandita", 2, null)
    // mengambil lsit String
    val listString = list4.filterIsInstance<String>()
    println(listString)

    // mengambil list Interger
    val listInt = list4.filterIsInstance<Int>()
    println(listInt)

    // mengambil value yang tidak null
    val listNotNull = list4.filterNotNull()
    println(listNotNull)
}