package com.learn.kotlinfirst.TipeData

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    var firstName: String  = "Rizki"
    var middleName: String = "Rian"
    var lastName: String  = "Anandita"
    var fullName: String = "$firstName $middleName $lastName"
    var address: String    = """
        |Jalan belum jadi, RT 01 RW 01
        |Kabupaten Subang
        |Jawa Barat
        |Indonesia
    """.trimIndent()

    println("Total $fullName length = ${fullName.length}")
    println(address)
}