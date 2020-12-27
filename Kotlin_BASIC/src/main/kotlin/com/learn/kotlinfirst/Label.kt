package com.learn.kotlinfirst

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    test("") test@{
        if (it == "") {
            return@test
        } else {
            println("Rizki")
        }
    }
}

fun test(name: String, param: (String) -> Unit): Unit = param(name)

fun labelContinue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                continue@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}

fun labelBreak() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            println("$i * $j = ${i * j}")
            if (j == 10) {
                break@loopI
            }
        }
    }
}