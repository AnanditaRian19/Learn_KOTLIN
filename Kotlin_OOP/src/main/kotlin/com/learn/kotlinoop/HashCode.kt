package com.learn.kotlinoop

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val company1 = Company("Rizki")
    val company2 = Company("Rizki")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
}