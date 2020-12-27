package com.learn.kotlinoop.inheritance

/**
 * @author Rizki Rian Anandita
 */
open class Employee(val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name, My name is ${this.name}")
    }
}

// : Extends
open class Manager(name: String) : Employee(name) {
    final override fun sayHello(name: String) {
        println("Hello $name, My name is Manager ${this.name}")
    }
}

class SuperManager(name: String) : Manager(name) {
    // ERROR tidak bisa override karena sayHello di manager final
//    override fun sayHello(name: String) {
//        println("Hello $name, My name is Super Manager ${this.name}")
//    }
}

class VidePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, My name is Vice President ${this.name}")
    }
}