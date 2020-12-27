package com.learn.kotlinoop.abstractclass

/**
 * @author Rizki Rian Anandita
 */

fun main() {
    val city = City("Bandung")
    val country = Country("Cakalta")

    println(city.name)
    println(country.name)

    // Abstract properties and function
    val cat = Cat()
    cat.run()

    val dog = Dog()
    dog.run()
}