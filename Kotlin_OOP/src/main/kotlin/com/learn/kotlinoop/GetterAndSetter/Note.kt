package com.learn.kotlinoop.GetterAndSetter

/**
 * @author Rizki Rian Anandita
 */
class Note(title: String) {
    var title: String = title
        // get() = field // atau dibawah dengan body
        get() {
            println("Call getter function")
            return field
        }
        set(value) {
            println("Call setter function")
            if (value.isNotBlank()) {
                field = value
            } else {
                println("Invalid title")
            }
        }
}

class BigNote(val title: String) {
    val bigTitle: String
        get() = title.toUpperCase()
}