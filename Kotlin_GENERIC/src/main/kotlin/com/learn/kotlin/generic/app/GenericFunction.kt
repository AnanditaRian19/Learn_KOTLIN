package com.learn.kotlin.generic.app

import com.learn.kotlin.generic.data.Function

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val function = Function("Rian")

    function.sayHello("Rizki")
    function.sayHello<String>("Rizki")

    function.sayHello(10)
    function.sayHello<Int>(10)
}