package com.learn.kotlinfirst.Function

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    fullName(firstName = "Rizki",
            lastName = "Anandita",
            middleName = "Rian")
}

fun fullName(firstName: String,
             middleName: String,
             lastName: String) {
    println("Hello $firstName $middleName $lastName")
}