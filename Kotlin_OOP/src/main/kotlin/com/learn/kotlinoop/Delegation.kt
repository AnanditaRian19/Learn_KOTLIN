package com.learn.kotlinoop

/**
 * @author Rizki Rian Anandita
 */

fun main() {
    val base = MyBase()
    base.sayHello("Rizki")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Rian")
}

interface Base {
    fun sayHello(name: String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

// Delegation
class MyBaseDelegate(val base: Base) : Base by base {
    override fun sayHello(name: String) {
        println("Hi $name")
    }
}