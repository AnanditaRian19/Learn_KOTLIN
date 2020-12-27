package com.learn.kotlinfirst.Function

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    println(double(20))
    hi("Rizki")
}

fun double(a: Int): Int = a * 2

fun hi(name: String): Unit = println("Hi $name")