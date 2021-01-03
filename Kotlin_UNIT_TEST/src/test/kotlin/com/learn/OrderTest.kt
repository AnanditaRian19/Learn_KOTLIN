package com.learn

import org.junit.jupiter.api.*

/**
 * @author Rizki Rian Anandita
 */

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS) // Anotasi jika akan perclass, defaultnya adalah per method
@TestMethodOrder(value = MethodOrderer.OrderAnnotation::class)
class OrderTest {

    var counter: Int = 0

    @Test
    @Order(3)
    fun testA() {
        println("C")
        counter++
        println(counter)
        println(this.hashCode())
    }

    @Test
    @Order(1)
    fun testB() {
        println("A")
        counter++
        println(counter)
        println(this.hashCode())
    }

    @Test
    @Order(2)
    fun testC() {
        println("B")
        counter++
        println(counter)
        println(this.hashCode())
    }

}