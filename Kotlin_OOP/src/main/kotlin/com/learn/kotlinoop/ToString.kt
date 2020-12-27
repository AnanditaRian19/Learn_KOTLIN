package com.learn.kotlinoop

/**
 * @author Rizki Rian Anandita
 */
class User(var username: String, var password: String) {

    override fun toString(): String {
        return "User with username = $username"
    }
}

fun main() {
    val user = User("Rizki", "Rian")
    println(user)
}