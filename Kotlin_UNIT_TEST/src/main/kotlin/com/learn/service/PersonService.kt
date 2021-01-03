package com.learn.service

import com.learn.model.Person
import com.learn.repository.PersonRepository

/**
 * @author Rizki Rian Anandita
 */
class PersonService(val personRepository: PersonRepository) {

    fun get(id: String): Person {
        if (id.isBlank()) {
            throw IllegalArgumentException("Person id is not valid")
        }

        val person = personRepository.selectById(id)
        if (person != null) {
            return person
        } else {
            throw Exception("Person not found")
        }
    }
}