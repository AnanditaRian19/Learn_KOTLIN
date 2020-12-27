package com.learn.kotlinoop.exception

/**
 * @author Rizki Rian Anandita
 */

// sangat direcomended menggunakan Custom Exception
class ValidationException(message: String) : Throwable(message) {
}