package com.learn.kotlinoop

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val man = Gender.MALE
    val women = Gender.FEMALE
    val allGender: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val womenFromString = Gender.valueOf("FEMALE")

    println(man)
    println(women)
    println(allGender.toList())

    man.showDescription()
    women.showDescription()
}

enum class Gender(val description: String) {
    MALE("Male"),
    FEMALE("Female");

    fun showDescription() {
        println(description)
    }
}