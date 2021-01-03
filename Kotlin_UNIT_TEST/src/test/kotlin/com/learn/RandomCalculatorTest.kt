package com.learn

import com.learn.resolver.RandomParameterResolver
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
import java.util.*

/**
 * @author Rizki Rian Anandita
 */
@Extensions(
    value = [
        ExtendWith((RandomParameterResolver::class))
    ]
)
class RandomCalculatorTest {

    private val calculator = Calculator()

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