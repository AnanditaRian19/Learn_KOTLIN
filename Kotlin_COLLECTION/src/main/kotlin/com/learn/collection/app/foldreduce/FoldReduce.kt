package com.learn.collection.app.foldreduce

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val numbers = (1..100).toList()

    val max = numbers.reduce { first, second ->
        if (first > second) first
        else second
    }
    println(max)

    val min = numbers.reduce { first, second ->
        if (first < second) first
        else second
    }
    println(min)

    val sum = numbers.fold(0) { first, second ->
        first + second
    }
    println(sum)
    println(numbers.sum())

    val names = listOf("Rizki", "Rian", "Anandita")
    val count = names.fold(0) { first, second ->
        first + 1
    }
    println(count)
    println(numbers.count())
}