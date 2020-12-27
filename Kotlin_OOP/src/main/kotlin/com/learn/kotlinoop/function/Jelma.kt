package com.learn.kotlinoop.function

/**
 * @author Rizki Rian Anandita
 */
class Jelma {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String) {
        println("Hello $name, My name is $firstName")
    }

    // function overloading
    fun sayHello(name: Int) {
        println("Hello $name, My name is $firstName")
    }

    // function overloading
    fun sayHello(firstNameParam: String, lastNameParam: String) {
        println("Hello $firstNameParam $lastNameParam, My name is $firstName")
    }

    fun run() {
        println("I'm Run")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}