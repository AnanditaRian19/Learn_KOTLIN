package com.learn.collection.app

import com.learn.collection.data.Person

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val set: Set<Person> = setOf(
        Person("Rizki"), Person("Rian"), Person("Anandita"),
        Person("Rizki"), Person("Rian")
    )

    println(set.size)
    println(set.contains(Person("Rizki")))

    for (person in set) {
        println(person)
    }
}