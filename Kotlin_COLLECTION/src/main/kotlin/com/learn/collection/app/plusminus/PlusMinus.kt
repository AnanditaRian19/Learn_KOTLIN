package com.learn.collection.app.plusminus

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val list1 = listOf("Rizki", "Rian", "Anandita")
    val list2 = list1 + "Programmer"
    println(list2)

    val list3 = list1 + listOf("Programmer", "Zaman", "Now")
    println(list3)

    val list4 = list1 - "Rizki"
    println(list4)

    val list5 = list1 - listOf("Rizki", "Anandita")
    println(list5)

    // Bisa digunakan juga terhadap map
    val map1 = mapOf("a" to "Rizki", "b" to "Rian")
    val map2 = map1 + ("c" to "Anandita")
    println(map2)

    // Mau menhapus
    val map3 = map1 - "a"
    println(map3)
}