package com.learn.kotlinoop.thisclass

/**
 * @author Rizki Rian Anandita
 */
class Student {
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
    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, My name is ${this.firstName}")
    }

    fun run() {
        println("I'm Run")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}