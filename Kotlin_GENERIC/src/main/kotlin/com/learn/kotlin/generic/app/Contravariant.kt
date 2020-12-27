package com.learn.kotlin.generic.app

/**
 * @author Rizki Rian Anandita
 */
class Contravariant<in T> {
    fun sayHello(param: String) {
        println("Hello $param")
    }
}

fun main() {
    val contravariantAny = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariantAny

    contravariantString.sayHello("Rizki")
}