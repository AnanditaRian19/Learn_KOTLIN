package com.learn.kotlinoop

import com.learn.kotlinoop.exception.ValidationException

/**
 * @author Rizki Rian Anandita
 */
fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Rian")
        validateAndSayHello("")
        println("Konyam")
    } catch (error: ValidationException) {
        println("Terjadi error ${error.message}")
    } catch (error: NullPointerException) {
        println("Terjadi error null ${error.message}")
    } finally {
        println("Finnaly will always be exceuted") // finnaly akan selalu di eksekusi
    }
}