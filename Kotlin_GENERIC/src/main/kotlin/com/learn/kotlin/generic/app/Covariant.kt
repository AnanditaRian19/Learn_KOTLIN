package com.learn.kotlin.generic.app

/**
 * @author Rizki Rian Anandita
 */
class Covariant<out T>(val data: T) {
    fun data(): T {
        return data
    }
}

fun main() {
    val covariantString = Covariant<String>("Rizki")
    val covariantAny: Covariant<Any> = covariantString

    covariantAny.data()
}