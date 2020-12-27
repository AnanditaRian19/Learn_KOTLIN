package com.learn.kotlinoop

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    fireAction(sampleAction())

    // Anonymous Class
    fireAction(object : Action {
        override fun action() {
            println("Action One")
        }
    })

    fireAction(object : Action {
        override fun action() {
            println("Action Two")
        }
    })
}

fun fireAction(action: Action) {
    action.action()
}

class sampleAction : Action {
    override fun action() {
        println("This is sample action")
    }
}

interface Action {
    fun action()
}