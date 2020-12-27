package com.learn.kotlinfirst

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous Function Incrment")
        counter++
    }

    fun functionIncrement() {
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}