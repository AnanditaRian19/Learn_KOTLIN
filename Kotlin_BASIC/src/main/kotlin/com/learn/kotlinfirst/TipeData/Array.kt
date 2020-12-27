package com.learn.kotlinfirst.TipeData

/**
 * @author Rizki Rian Anandita
 */
fun main() {

    val members: Array<String> = arrayOf("Rizki", "Rian", "Anandita")
    val values: Array<Byte> = arrayOf(100, 90,95)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 30_000)

    members[0] = "Rudi"
    // atau
    members.set(0, "Rudi")
    println(members[0])

    val names: Array<String?> = arrayOfNulls(5)
    names.set(0, "Rizki")
    names.set(1, "Rian")
    names.set(2, "Anandita")
    names.set(3, "Bau")
    names.set(4, "Bool")
    println(names[2])
}