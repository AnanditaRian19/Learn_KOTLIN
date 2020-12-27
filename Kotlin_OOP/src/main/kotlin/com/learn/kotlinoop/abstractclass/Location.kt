package com.learn.kotlinoop.abstractclass

/**
 * @author Rizki Rian Anandita
 */
abstract class Location(val name: String)

class City(name: String) : Location(name)

class Country(name: String) : Location(name)