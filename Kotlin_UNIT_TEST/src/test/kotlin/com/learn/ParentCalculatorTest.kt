package com.learn

import com.learn.resolver.RandomParameterResolver
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions

/**
 * @author Rizki Rian Anandita
 */
@Extensions(
    value = [
        ExtendWith(RandomParameterResolver::class)
    ]
)
abstract class ParentCalculatorTest {

    val calculator = Calculator()

    @BeforeEach
    fun beforeEach() {
        println("Before Each")
    }
}