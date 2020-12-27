package com.learn.kotlinoop.constructor

/**
 * @author Rizki Rian Anandita
 */
class Alamat {
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    // Constructor Kosong
    constructor(paramStreet: String, paramCity: String) {
        street = paramStreet
        city = paramCity
    }

    constructor(paramStreet: String, paramCity: String, paramCountry: String) :
            this(paramStreet, paramCity) {
        country = paramCountry
    }
}