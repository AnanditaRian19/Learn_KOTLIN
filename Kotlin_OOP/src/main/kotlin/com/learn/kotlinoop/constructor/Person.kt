package com.learn.kotlinoop.constructor

/**
 * @author Rizki Rian Anandita
 */
class Person(
    firstNameParam: String,
    middleNameParam: String? = null,
    lastNameParam: String
) {

    // Second constructor with only 2 value
    constructor(firstNameParam: String, lastNameParam: String) :
            this(firstNameParam, null, lastNameParam) {
    }

    constructor(firstDude: String) : this(firstDude, lastNameParam = "null") {
    }

    // Initializer Block
    /*
    init {
        println("Human $firstNameParam name")
    }
    */

    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName: String = lastNameParam
}