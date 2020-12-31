package com.learn.collection.app

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val list1: List<String> = listOf("Rizki", "Rian", "Anandita")
//    val temp = mutableListOf<String>()
//    for (value in list1) { // cara manual
//        temp.add(value.toUpperCase())
//    }


//    val list2: List<String> = list1.map { value -> value.toUpperCase() }
    // atau
    val list2: List<String> = list1.map { it.toUpperCase() }
    println(list2)

    val set1 = setOf("Rizki", "Rian", "Anandita")
    val set2 = set1.map { it.toLowerCase() }
    println(set2)

    val names = listOf("Konyam", "Bool", "Radit", "Anandita", "Wicaksono", "Rian")
    val nameGanjil = names.mapIndexedNotNull { index, name ->
        if (index % 2 == 0) {
            null
        } else {
            name
        }
    }
    println(nameGanjil)

    val numbers = (1..100).toList()
    val ganjil = numbers.mapNotNull {
        if (it % 2 == 0) {
            null
        } else {
            it
        }
    }
    println(ganjil)
}