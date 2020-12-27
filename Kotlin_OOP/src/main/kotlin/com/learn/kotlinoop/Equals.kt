package com.learn.kotlinoop

/**
 * @author Rizki Rian Anandita
 */
class Company(val name: String) {

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Company -> name == other.name
            else -> false
        }
    }
}

fun main() {
    val company = Company("Rizki")
    val company2 = Company("Rizki")

    println(company == company2)
}