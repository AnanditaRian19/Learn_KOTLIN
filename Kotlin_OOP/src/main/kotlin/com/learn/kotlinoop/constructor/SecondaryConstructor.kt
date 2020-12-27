package com.learn.kotlinoop.constructor

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val address = Alamat("Jalan A", "City")
    val address2 = Alamat("Jalan A", "City", "Indihe")

    println(address.country)
    println(address2.country)
}