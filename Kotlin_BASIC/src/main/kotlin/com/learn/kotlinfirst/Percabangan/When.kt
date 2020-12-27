package com.learn.kotlinfirst.Percabangan

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val finalExam = 'E'

    when (finalExam) {
        'A' -> {
            println("Amazing")
        }
        'B' -> {
            println("Good")
        }
        'C' -> {
            println("Not Bad")
        }
        'D' -> {
            println("Bad")
        }
        'E' -> {
            println("Try again next year")
        }
        else -> {
            println("Ups")
        }
    }

    when (finalExam) {
        'A', 'B', 'C' -> {
            println("Selamat anda lulus")
        }
        'D', 'E' -> {
            println("Coba lagi tahun depan")
        }
        else -> {
            println("Coba lagi tahun depan")
        }
    }

    // Mutliple Expression
    val passExam: Array<Char> = arrayOf('A', 'B', 'C')
    when (finalExam) {
        in passExam -> println("Pass")
        !in passExam -> println("Fail")
    }

    // Expression is
    val name = "Rian"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    val examValue = 91
    when {
        examValue > 100 -> println("Lulus")
        examValue > 90 -> println("Tidak Lulus")
        examValue > 80 -> println("So Bad")
        else -> println("Try again next year")
    }
}