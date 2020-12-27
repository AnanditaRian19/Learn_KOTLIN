package com.learn.kotlinoop.constructor

/**
 * @author Rizki Rian Anandita
 */
open class Customer(val name: String, val type: String, val balance: Long) {
    constructor(name: String, type: String) : this(name, type, 0)
    constructor(name: String) : this(name, "Standar")
}

class PremiumCustomer : Customer {
    constructor(name: String) : super(name, "Premium")
    constructor(name: String, balance: Long) : super(name, "Premium", balance)
}

class ExecutiveCustomer(name: String, balance: Long) : Customer(name, "Executive", balance) {
    constructor(name: String) : this(name, 0)
}

fun main() {
    val premiumConstructor = PremiumCustomer("Rizki")
    println(premiumConstructor.name)

    val executiveCustomer = ExecutiveCustomer("Konyam", 100_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}