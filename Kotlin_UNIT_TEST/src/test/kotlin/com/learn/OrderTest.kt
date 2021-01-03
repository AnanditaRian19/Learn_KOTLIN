package com.learn

import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

/**
 * @author Rizki Rian Anandita
 */
@TestMethodOrder(value = MethodOrderer.OrderAnnotation::class)
class OrderTest {

    @Test
    @Order(3)
    fun testA() {
        println("C")
    }

    @Test
    @Order(1)
    fun testB() {
        println("A")
    }

    @Test
    @Order(2)
    fun testC() {
        println("B")
    }

}