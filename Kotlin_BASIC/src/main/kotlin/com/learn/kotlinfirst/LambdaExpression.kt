package com.learn.kotlinfirst

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    yourName()
    sayHello()

    val toUpperCase: (String) -> String = ::toUpper
    val name = toUpperCase("Rizki Rian Anandita")
    println(name)

}

fun yourName() {
    val lambdaName: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = lambdaName("Rizki", "Anandita")
    println(result)
}

fun sayHello() {
    // Jika valuenya hanya satu bisa dikosongkan saja, otomatis akan terganti ke it
    val stringHello: (String) -> String = {
        "Hello $it"
    }

    println(stringHello("Rizki"))
}

// Method Reference
fun toUpper(value: String): String = value.toUpperCase()