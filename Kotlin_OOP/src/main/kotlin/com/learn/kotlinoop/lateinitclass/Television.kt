package com.learn.kotlinoop.lateinitclass

/**
 * @author Rizki Rian Anandita
 */
class Television {
    lateinit var brand: String

    fun initTelevision(brand: String) {
        this.brand = brand
    }
}