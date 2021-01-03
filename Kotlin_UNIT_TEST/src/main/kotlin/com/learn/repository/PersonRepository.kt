package com.learn.repository

import com.learn.model.Person

/**
 * @author Rizki Rian Anandita
 */
interface PersonRepository {

    fun selectById(id: String): Person?
}