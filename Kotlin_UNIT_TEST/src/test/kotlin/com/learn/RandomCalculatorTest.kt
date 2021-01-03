package com.learn

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import java.util.*

/**
 * @author Rizki Rian Anandita
 */
//@Extensions(
//    value = [
//        ExtendWith((RandomParameterResolver::class))
//    ]
//)
class RandomCalculatorTest : ParentCalculatorTest() {

//    private val calculator = Calculator()

    @Test
    fun testRandom(testInfo: TestInfo, random: Random) {
        val first = random.nextInt(1000)
        println(first)
        val second = random.nextInt(1000)
        println(second)

        val result = calculator.add(first, second)

        assertEquals(first + second, result)
    }

    @DisplayName("Test Calculator Random")
    @RepeatedTest(
        value = 10, // Diulang berapa kali ? 10
        name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    fun testRandomRepeated(testInfo: TestInfo, random: Random, repetitionInfo: RepetitionInfo) {
        println("==> ${testInfo.displayName} ke ${repetitionInfo.currentRepetition} dari ${repetitionInfo.totalRepetitions}")

        val first = random.nextInt(1000)
        println(first)
        val second = random.nextInt(1000)
        println(second)

        val result = calculator.add(first, second)

        assertEquals(first + second, result)
    }
}