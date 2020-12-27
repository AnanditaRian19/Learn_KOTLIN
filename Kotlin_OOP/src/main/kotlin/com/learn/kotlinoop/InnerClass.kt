package com.learn.kotlinoop

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val employee = Boss("Rizki")
    val rizki = employee.Employee("Rizki")
    rizki.hi()
    val rian = employee.Employee("Rian")
    rian.hi()
}

class Boss(val name: String) {
    inner class Employee(val name: String) {
        fun hi() {
            println("Hi my name is $name, my boss name is ${this@Boss.name}")
        }
    }
}