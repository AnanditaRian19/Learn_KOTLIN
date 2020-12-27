package com.learn.kotlinoop.constructor

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val human = Person("Rizki", null, "Anandita")

//    println(human.firstName)
//    println(human.middleName)
//    println(human.lastName)

    val human2 = Person("Rizki", "Anandita")
    println(human2.lastName)

    val human3 = Person("Rizki")
    println(human3.firstName)
}