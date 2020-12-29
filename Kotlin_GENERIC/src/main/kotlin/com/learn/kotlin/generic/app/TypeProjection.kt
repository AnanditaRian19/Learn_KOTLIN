package com.learn.kotlin.generic.app

/**
 * @author Rizki Rian Anandita
 */
class Container<T>(var data: T)

fun copyContainer(from: Container<out Any>, to: Container<in Any>) {
    to.data = from.data
}

fun main() {
    val container1 = Container("Rizki")
    val container2: Container<Any> = Container("Rian")

    copyContainer(container1, container2)

    println(container1.data)
    println(container2.data)
}