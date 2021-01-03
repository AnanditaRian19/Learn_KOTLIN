package com.learn

import org.junit.jupiter.api.*

/**
 * @author Rizki Rian Anandita
 */

@DisplayName("Test with TestInfo")
class InformationTest {

    @Test
    @Tags(
        value = [
            Tag("Contoh1"),
            Tag("Contoh2")]
    )

    // Untuk mendapatkan informasi secara real time saat unit test sedang dijalankan
    @DisplayName("Sample Test")
    fun sampleTest(testInfo: TestInfo) {
        println(testInfo.displayName)
        println(testInfo.tags)
        println(testInfo.testClass)
        println(testInfo.testMethod)
    }

}