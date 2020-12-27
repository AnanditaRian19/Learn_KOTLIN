package com.learn.kotlinfirst.Percabangan

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val examValue = 50

    if (examValue > 75) {
        println("Good")
    } else if (examValue > 60) {
        println("Bad")
    } else {
        println("Try Again")
    }
}