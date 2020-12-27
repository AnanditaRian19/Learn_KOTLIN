package com.learn.kotlinoop.GetterAndSetter

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val note = Note("Konyam")
    // Set
    println(note.title)

    // Get
    note.title = ""
    println(note.title)

    val bigNote = BigNote("Belajar Kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)
}