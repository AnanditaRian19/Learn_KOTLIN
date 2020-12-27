package com.learn.kotlinoop.properties.app

import com.learn.kotlinoop.properties.data.Person

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val rian = Person()
    rian.firstname = "Rizki"
    rian.middleName
    rian.lastName = "Anandita"

    println(rian.middleName)
}