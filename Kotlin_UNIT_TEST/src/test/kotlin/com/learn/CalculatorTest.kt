package com.learn

import com.learn.generator.SimpleDisplayNameGenerator
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

/**
 * @author Rizki Rian Anandita
 */
@DisplayNameGeneration(SimpleDisplayNameGenerator::class)
class CalculatorTest {

    companion object {

        @BeforeAll
        @JvmStatic
        fun beforeAll() {
            println("Sebelum semua unit test")
        }

        @AfterAll
        @JvmStatic
        fun afterAll() {
            println("Setelah semua unit test")
        }

    }

    val calculator = Calculator()

    @BeforeEach
    fun beforeEach() {
        println("Sebelum Unit Test")
    }

    @AfterEach
    fun afterEach() {
        println("Setelah Unit Test")
    }

    // Test penjumlahan Success
    @Test
//    @DisplayName("Test success for function calculator.add(10, 10")
    fun testAddSuccess() {
        println("Unit Test Add Success")
        val result = calculator.add(10, 10)
        assertEquals(20, result, "Hasil harusnya 20")
    }

    // Test pembagian Success
    @Test
//    @DisplayName("Test success for function calculator.divide(100, 10")
    fun testDivideSuccess() {
        println("Unit Test Divide Success")
        val result = calculator.divide(100, 10)
        assertEquals(10, result)
    }

    // Test pembagian Error
    @Test
//    @DisplayName("Test failed for function calculator.divide(100, 0")
    fun testDivideError() {
        println("Unit Test Divide Error")
        assertThrows<IllegalArgumentException> {
            calculator.divide(100, 0)
        }
    }

    @Test
    @Disabled("Sedang diperbaiki")
    fun testComingSoon() {
        // Belum selesai
    }

}