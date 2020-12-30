package com.learn.collection.app.operations

/**
 * @author Rizki Rian Anandita
 */
fun main() {
//    for (value in listOf("Rizki", "Rian", "Anandita")) {
//        println(value)
//    }

    listOf("Rizki", "Rian", "Anandita").forEach {
        println(it)
    }

    mutableListOf("Rizki", "Rian", "Anandita").forEachIndexed { index, value ->
        println("$index : $value")
    }
}