package com.learn.kotlinoop

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    println(operation(10, 10, Plus()))
    println(operation(10, 5, Minus()))
    println(operation(10, 2, Modulo()))
}

sealed class Operation(val name: String)
class Plus : Operation("Plus")
class Minus : Operation("Minus")
class Modulo : Operation("Modulo")

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}