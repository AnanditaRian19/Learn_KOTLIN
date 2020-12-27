package com.learn.kotlinoop

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val account = Account()
    println(account.name)
}

class Account {
    val name: String by lazy {
        println("Name is called")
        "Rizki"
    }
}