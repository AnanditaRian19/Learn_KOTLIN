package com.learn.collection.app.flatenning

/**
 * @author Rizki Rian Anandita
 */
class Member(val name: String, val hobies: List<String>)

fun main() {
    val list1: List<List<String>> = listOf(
        listOf("Rizki", "Rian", "Anandita"),
        listOf("Programmner", "Zaman", "Now")
    )

    val listString: List<String> = list1.flatten()
    println(listString)

    val members: List<Member> = listOf(
        Member("Rizki", listOf("Reading", "Coding")),
        Member("Rian", listOf("Hobbies", "Traveling"))
    )

//    val hobies = members.map { it.hobies }.flatten()
    val hobies: List<String> = members.flatMap { it.hobies }
    println(hobies)
}