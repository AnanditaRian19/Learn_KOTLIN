package com.learn.kotlinoop

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val teacher = SuperTeacher("Rizki")
    println(teacher.name)
    teacher.test()
//    teacher.teach()
}

open class Teacher(val name: String) {
    private fun teach() {
        println("Teach!")
    }

    open protected fun test() {
        println("Test")
    }
}

class SuperTeacher(name: String) : Teacher(name) {
    override public fun test() {
        super.test()
    }
}