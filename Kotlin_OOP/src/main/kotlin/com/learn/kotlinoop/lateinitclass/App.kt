package com.learn.kotlinoop.lateinitclass

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val television = Television()
//    println(television.brand) // Error

    television.initTelevision("Sumsang")
    println(television.brand)
}