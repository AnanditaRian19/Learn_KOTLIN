package com.learn

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
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
    fun testRandom(random: Random) {
        val first = random.nextInt(1000)
        println(first)
        val second = random.nextInt(1000)
        println(second)

        val result = calculator.add(first, second)

        assertEquals(first + second, result)
    }
}