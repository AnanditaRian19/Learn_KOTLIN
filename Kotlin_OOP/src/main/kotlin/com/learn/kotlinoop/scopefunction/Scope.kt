package com.learn.kotlinoop.scopefunction

import com.learn.kotlinoop.extention.Student

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    val student = Student("Rizki", 15)

    // Let mengakses semua objek yang ada di dalam
    student.let {
        println(it.name)
        println(it.age)
    }

    // atau
    val result = student.let {
        "Name ${it.name}, age ${it.age}"
    }
    println(result)
    println()

    // run
    val result2: String = student.run {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result2)
    println()

    // apply
    val result3: Student = student.apply {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result3)
    println()

    val result4 = student.also {
        "Name ${it.name}, age ${it.age}"
    }
    println(result4)
    println()

    val result5: String = with(student) {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result5)
    println()

    /**
     * Function     ObjectReference     ReturnValue     Is Extention Function
     * let              it              LambdaResult              yes
     * run              this            LambdaResult              yes
     * run              -               LambdaResult              no: called without the context object
     * with             this            LambdaResult              no: takes the context object as an argument
     * apply            this            Context Object            yes
     * also             it              Context Object            yes
     */
}