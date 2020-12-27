package com.learn.kotlin.generic.data

/**
 * @author Rizki Rian Anandita
 */
class Function(val name: String) {

    fun <T> sayHello(param: T) {
        println("Hello $param, my name is $name")
    }
}