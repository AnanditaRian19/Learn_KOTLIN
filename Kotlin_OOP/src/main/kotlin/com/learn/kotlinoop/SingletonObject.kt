package com.learn.kotlinoop

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    Utilities.name = "Dirubah"

//    println(Utilities.name)
    println(Utilities.toUpper("Eko"))
    a()
    b()

    println()
    println(Application.Utilities.toUpper("Rizki"))
}

fun a() {
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}

object Utilities {
    var name: String = "My Utilities"

    fun toUpper(value: String): String {
        return value.toUpperCase()
    }
}

class Application(val name: String) {
    object Utilities {
        fun toUpper(name: String): String {
            return name.toUpperCase()
        }
    }
}