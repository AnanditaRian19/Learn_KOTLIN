package com.learn.kotlin.generic.data

/**
 * @author Rizki Rian Anandita
 */

// Generic Class
class MyData<T, U>(val firstData: T, val secondData: U) {

    fun getData(): T = firstData

    fun getSecond(): U = secondData

    fun printData() {
        println("Data is $firstData $secondData")
    }
}