package com.learn.kotlinoop

/**
 * @author Rizki Rian Anandita
 */

class Laptop(val name: String)
open class Handphone(val name: String)
class Smartphone(name: String, val os: String) : Handphone(name)

fun main() {
    val smartphone = Smartphone("Iphone 12 Pro", "Mac Os")
    println(smartphone.toString())
}