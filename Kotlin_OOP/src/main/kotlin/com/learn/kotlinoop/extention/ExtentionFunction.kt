package com.learn.kotlinoop.extention

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val student = Student("Rizki", 25)
    student.sayHello("Konyam")

    println(student.upperName)
}

class Student(val name: String, val age: Int)

fun Student?.sayHello(name: String) {
    if (this != null) {
        println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
    }
}

// Extention Properties
val Student.upperName: String
    get() = this.name.toUpperCase()