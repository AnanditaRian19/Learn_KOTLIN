package com.learn

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito

/**
 * @author Rizki Rian Anandita
 */
class MockTest {

    @Test
    fun testMock() {
        val list: List<String> = Mockito.mock(List::class.java) as List<String>

        Mockito.`when`(list.get(0)).thenReturn("Rizki")
        Mockito.`when`(list.get(1)).thenReturn("Anandita")

        assertEquals("Rizki", list.get(0))
        assertEquals("Rizki", list.get(0))
        assertEquals("Anandita", list.get(1))

        Mockito.verify(list, Mockito.times(2)).get(0)
        Mockito.verify(list).get(1)

//        println(list.get(0))
//        println(list.get(1))
    }
}