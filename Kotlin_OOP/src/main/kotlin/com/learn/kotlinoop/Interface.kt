package com.learn.kotlinoop

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val human = Human("Rizki")
    human.sayHello("Rian")
    human.go()

    val jelma = Jelma("Anandita")
    jelma.move()
}

interface Interaction {
    val name: String
    fun sayHello(name: String)
}

interface Go {
    fun go() {
        println("Go!")
    }
}

interface MoveA {
    fun move() = println("Move A")
}

interface MoveB {
    fun move() = println("Move B")
}

class Jelma(val name: String) : Go, MoveA, MoveB {
    override fun move() {
//        println("Move Human")
        super<MoveA>.move()
        super<MoveB>.move()
    }

}

class Human(override val name: String) : Interaction, Go {
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

}