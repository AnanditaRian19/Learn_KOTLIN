package com.learn.collection.app

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val mutableList: MutableList<String> = mutableListOf()

    mutableList.add("Rizki")
    mutableList.add("Rian")
    mutableList.add("Anandita")

//    mutableList.set(0, "Konyam") // mengubah data
//    mutableList[0] = "Konyam" // mengubah data

//    println(mutableList[0])
//    println(mutableList[1])
//    println(mutableList[2])
    // atau
    for (value in mutableList) {
        println(value)
    }
    println(mutableList.isEmpty())
}