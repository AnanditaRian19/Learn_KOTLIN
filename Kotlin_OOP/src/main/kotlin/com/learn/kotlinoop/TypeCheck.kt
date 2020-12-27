package com.learn.kotlinoop

/**
 * @author Rizki Rian Anandita
 */
fun printObject(any: Any) {
    if (any is Laptop) {
        println("Laptop ${any.name}")
    } else if (any is Handphone) {
        println("Handphone ${any.name}")
    } else {
        println(any)
    }
}

fun printValue(any: Any) {
    when (any) {
        is Laptop -> println("Laptop ${any.name}")
        is Handphone -> println("Handphone ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any) {
    val value: String? = any as? String // Bisa null
    println(value)
}

fun main() {
    printObject("Rizki")
    println(1)
    printObject(Laptop("Sumsang"))
    printObject(Handphone("Ipong"))

    printValue(Laptop("Konyam"))
    printValue(Handphone("Bau Bool"))

    printString("Rizki")
//    printString(1) // ERROR // ? = null
}