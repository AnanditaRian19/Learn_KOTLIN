package com.learn.collection.app.convertion

/**
 * @author Rizki Rian Anandita
 */

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val range = 1..100

    val list = array.toList()
    val set = array.toSet()

    val mutableSet = range.toMutableSet()
    val mutableList = range.toMutableList()

    val listToMutableList = list.toMutableList()
    val setToMutableSet = set.toMutableSet()

    val sortedSet = array.toSortedSet()
}