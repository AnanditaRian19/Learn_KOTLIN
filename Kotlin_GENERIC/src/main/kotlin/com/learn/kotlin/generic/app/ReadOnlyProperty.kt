package com.learn.kotlin.generic.app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * @author Rizki Rian Anandita
 */

class LogReadOnlyProperty(val data: String) : ReadOnlyProperty<Any, String> {
    var counter: Int = 0
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access property ${property.name} with value $data")
        counter++
        return data.toUpperCase() + counter
    }
}

class NameWithLog(param: String) {
    val name: String by LogReadOnlyProperty(param)
}

fun main() {
    val nameWithLog = NameWithLog("Rizki Rian Anandita")

    println(nameWithLog.name)
    println(nameWithLog.name)
}