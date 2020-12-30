package com.learn.collection.app

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf()
    mutableMap.put("a", "Rizki")
    // atau
    mutableMap["b"] = "Rian"
    mutableMap["c"] = "Anandita"

    println(mutableMap["a"])
    // atau
    println(mutableMap.get("b"))
    println(mutableMap.get("c"))
    println(mutableMap.getOrDefault("d", "Tidak Ada"))
    println(mutableMap.get("d"))

    mutableMap.remove("b")

    for ((key, value) in mutableMap) {
        println("$key to $value")
    }
}