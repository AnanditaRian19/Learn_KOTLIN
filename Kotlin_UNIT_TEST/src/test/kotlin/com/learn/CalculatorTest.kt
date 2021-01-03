package com.learn

import com.learn.generator.SimpleDisplayNameGenerator
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.opentest4j.TestAbortedException

/**
 * @author Rizki Rian Anandita
 */
@DisplayNameGeneration(SimpleDisplayNameGenerator::class)
class CalculatorTest {

    companion object {

        // Dijalankan sekali diawal
        @BeforeAll
        @JvmStatic
        fun beforeAll() {
            println("Sebelum semua unit test")
        }

        // Dijalankan sekali di akhir
        @AfterAll
        @JvmStatic
        fun afterAll() {
            println("Setelah semua unit test")
        }

    }

    val calculator = Calculator()

    // Dijalankan setiap sebelum melakukan test
    @BeforeEach
    fun beforeEach() {
        println("Sebelum Unit Test")
    }

    // Dijalanlkan setiap setelah test
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

    // Jika value environment-nya terisi makan akan dijalankan
    // Jika value environment-nya kosong/belum terisi makan method akan dibatalkan
    @Test
    fun testAborted() {
        val profile = System.getenv()["PROFILE"]
        if ("DEV" != profile) {
            // Membatalkan Test
            throw TestAbortedException()
//            throw java.lang.IllegalArgumentException() // Maka akan di anggap error
        }
        println("Test Not Aborted")
    }

}