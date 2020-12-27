package com.learn.kotlinoop.function

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val rian = Jelma()
    rian.firstName = "Rizki"
    rian.middleName = "Rian"
    rian.lastName = "Anandita"

    rian.sayHello("Konyam")
    rian.run()
    val fullName = rian.getFullName()
    println(fullName)
}