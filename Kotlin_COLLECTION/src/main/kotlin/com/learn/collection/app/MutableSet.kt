package com.learn.collection.app

import com.learn.collection.data.Person

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Rizki"))
    mutableSet.add(Person("Rian"))
    mutableSet.add(Person("Anandita"))
    mutableSet.add(Person("Rizki"))
    mutableSet.add(Person("Rian"))

    for (person in mutableSet) {
        println(person)
    }

//    val mutableSetString = mutableSetOf("Rizki", "Rian", "Anandita")
}