package com.learn.kotlinoop.annotations

/**
 * @author Rizki Rian Anandita
 */

@Fancy(author = "Rizki")
class MyApplication(val name: String, val version: Int) {
    fun info(): String = "Applications $name-$version"
}

fun main() {
    val myApplications = MyApplication("Kotlin", 1)
    println(myApplications.info())
}