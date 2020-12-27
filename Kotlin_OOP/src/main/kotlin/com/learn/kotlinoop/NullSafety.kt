package com.learn.kotlinoop

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    sayHello(Friend("Rian"))
    sayHello(null)
}

data class Friend(val name: String)

fun sayHello(friend: Friend?) {
//    if (friend != null) {
//        println("Hello ${friend.name}")
//    }

//    val name = friend?.name ?: "" // Jika null makan akan diganti dengan String kosong
//    println("Hello $name")

    // !! jika ada data yang null maka akan ERROR
    val notNullFriend = friend!!
    val name = notNullFriend.name
    println("Hello $name")
}