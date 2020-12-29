package com.learn.kotlin.generic.data

/**
 * @author Rizki Rian Anandita
 */
class Fruit(val name: String, val quantity: Int) : Comparable<Fruit> {

    override fun compareTo(other: Fruit): Int {
        return quantity.compareTo(other.quantity)
    }
}