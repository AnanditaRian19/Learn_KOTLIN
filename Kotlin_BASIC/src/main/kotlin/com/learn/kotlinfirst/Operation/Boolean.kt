package com.learn.kotlinfirst.Operation

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val finalExam = 80
    val attendant = 70

    val passFinalExam = finalExam > 75
    val passAttendant = attendant > 80

    val pass = passFinalExam || passAttendant

    println(pass)
}