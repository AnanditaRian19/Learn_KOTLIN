package com.learn

import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

/**
 * @author Rizki Rian Anandita
 */
class Nested {

    @Test
    fun test1() {
        println("Test1")
    }

    @Nested
    inner class MyNestedTest {

        @Test
        fun test1() {
            println("Test2")
        }

    }

}