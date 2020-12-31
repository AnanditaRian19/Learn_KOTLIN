package com.learn.collection.app.takedrop

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val chars: List<Char> = ('a'..'z').toList()

    println(chars.take(3))
    println(chars.takeLast(3))
    println(chars.takeWhile { it < 'f' })
    println(chars.takeLastWhile { it > 'w' })

    println()

    println(chars.drop(3))
    println(chars.dropLast(3))
    println(chars.dropWhile { it < 'x' })
    println(chars.dropLastWhile { it > 'f' })
}