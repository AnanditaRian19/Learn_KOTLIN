package com.learn.kotlin.generic.app

/**
 * @author Rizki Rian Anandita
 */
class Invariant<T>(val data: T)

fun main() {
    val invariantString = Invariant("String")

//    val invariantAny: Invariant<Any> = invariantString // bisa
//    invariantAny.data = 100 // bahaya
}