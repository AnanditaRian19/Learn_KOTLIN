package com.learn.kotlinfirst

/**
 * @author Rizki Rian Anandita
 */
fun main() {

    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 100000000L

    var value: Float = 98.98F
    var radius: Double = 234424234.2343

    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0001

    var ageU: Byte = 3_0
    var heightU: Int = 1_7_0
    var distanceU: Short = 2_000
    var balanceU: Long = 100_000_000

    var number: Int = 100
    //Conversion
    var byteC: Byte = number.toByte()
    var shortC: Short = number.toShort()
    var intC: Int = number.toInt()
    var longC: Long = number.toLong()
    var floatC: Float = number.toFloat()
    var doubleC: Double = number.toDouble()
}