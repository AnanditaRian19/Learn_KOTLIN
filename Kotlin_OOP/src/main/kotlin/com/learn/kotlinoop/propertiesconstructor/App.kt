package com.learn.kotlinoop.propertiesconstructor

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val user1 = User("Rizki ", "Anandita")
    val user2 = User("Rian ", "Anandita")

    user1.username = "Konyam "
    user1.password = "Bau Bool"

    print(user1.username)
    println(user1.password)

    print(user2.username)
    print(user2.password)
}