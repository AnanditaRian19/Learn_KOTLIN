package com.learn.service

import com.learn.model.Person
import com.learn.repository.PersonRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import java.lang.Exception
import java.lang.IllegalArgumentException

/**
 * @author Rizki Rian Anandita
 */
@Extensions(
    value = [
        ExtendWith(MockitoExtension::class)
    ]
)
class PersonServiceTest {

    @Mock
    lateinit var personRepository: PersonRepository

    lateinit var personService: PersonService

    @BeforeEach
    fun beforeEach() {
        personService = PersonService(personRepository)
    }

    @Test
    fun testVersionIdIsNotValid() {
        assertThrows<IllegalArgumentException> {
            personService.get("      ")
        }
    }

    @Test
    fun testVersionNotFound() {
        assertThrows<Exception> {
            personService.get("Not Found")
        }
    }

    @Test
    fun testPersonSuccess() {
        Mockito.`when`(personRepository.selectById("Rizki")).thenReturn(Person("Rizki", "Anandita"))

        val person = personService.get("Rizki")
        assertEquals("Rizki", person.id)
        assertEquals("Rizki Anandita", person.name)
    }
}