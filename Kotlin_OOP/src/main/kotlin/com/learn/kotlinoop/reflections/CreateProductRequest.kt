package com.learn.kotlinoop.reflections

import com.learn.kotlinoop.exception.ValidationException

/**
 * @author Rizki Rian Anandita
 */
data class CreateProductRequest(
    @NoteBlank val id: String,
    @NoteBlank val name: String,
    @NoteBlank val price: Long
)

data class CategoryRequest(
    @NoteBlank val id: String,
    @NoteBlank val name: String
)