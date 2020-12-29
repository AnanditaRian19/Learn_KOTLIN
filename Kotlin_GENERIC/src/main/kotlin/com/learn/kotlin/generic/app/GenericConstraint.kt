package com.learn.kotlin.generic.app

/**
 * @author Rizki Rian Anandita
 */
open class Employee

class Manager : Employee()

class VicePresident : Employee()

class Company<T : Any>(val employee: T)

fun main() {
    val data1 = Company(Employee())
    val data2 = Company(Manager())
    val data3 = Company(VicePresident())
    val data4 = Company("String")
}