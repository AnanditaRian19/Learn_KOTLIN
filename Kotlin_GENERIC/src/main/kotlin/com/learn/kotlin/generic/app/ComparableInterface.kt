package com.learn.kotlin.generic.app

import com.learn.kotlin.generic.data.Fruit

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val fruit1 = Fruit("Apple", 10)
    val fruit2 = Fruit("Apple", 10)

    println(fruit1 > fruit2)
    println(fruit1 >= fruit2)
    println(fruit1 < fruit2)
    println(fruit1 <= fruit2)
}