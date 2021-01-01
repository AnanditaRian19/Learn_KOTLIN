package com.learn.collection.app.propertiesonmap

/**
 * @author Rizki Rian Anandita
 */

class Application(map: Map<String, Any>) {
    val name: String by map
    val version: Int by map
}

fun main() {
    val application = mapOf(
        "name" to "Belajar Kotlin",
        "version" to 1.0
    )

    val app = Application(application)

    println(app.name)
    println(app.version)
}