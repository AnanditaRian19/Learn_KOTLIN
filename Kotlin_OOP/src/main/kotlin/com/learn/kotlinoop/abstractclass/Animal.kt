package com.learn.kotlinoop.abstractclass

/**
 * @author Rizki Rian Anandita
 */
abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Cat : Animal() {
    override val name: String = "Pussy"

    override fun run() {
        println("$name Run")
    }
}

class Dog : Animal() {
    override val name: String = "Dog"

    override fun run() {
        println("$name Run")
    }

}