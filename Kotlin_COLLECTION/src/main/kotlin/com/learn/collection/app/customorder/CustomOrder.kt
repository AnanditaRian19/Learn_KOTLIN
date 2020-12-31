package com.learn.collection.app.customorder

/**
 * @author Rizki Rian Anandita
 */
data class Fruit(val name: String, val quantity: Int)

fun main() {
    val fruits = listOf(
        Fruit("Apple", 10),
        Fruit("Orange", 5),
        Fruit("Banana", 7)
    )

//    println(fruits.sortedBy { fruit -> fruit.name })
    // atau
    println(fruits.sortedBy { it.name })
    println(fruits.sortedBy { it.quantity })

    println()

    println(fruits.sortedByDescending { it.name })
    println(fruits.sortedByDescending { it.quantity })

    println()

    // Sama, tinggal milih yang lebih simple
    println(
        fruits.sortedWith(Comparator { fruit1, fruit2 ->
            fruit1.quantity.compareTo(fruit2.quantity)
        })
    )
    fruits.sortedWith(compareBy { it.quantity })
    fruits.sortedBy { it.quantity }
}