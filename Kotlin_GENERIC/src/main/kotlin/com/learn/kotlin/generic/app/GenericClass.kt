package com.learn.kotlin.generic

import com.learn.kotlin.generic.data.MyData

/**
 * @author Rizki Rian Anandita
 */
fun main() {
    /**
     * Generic Class
     */
    val myDataString: MyData<String, Int> = MyData<String, Int>("Rian", 19)
    myDataString.printData()

    val myDataInt: MyData<Int, String> = MyData(10, "Rian")
    myDataInt.printData()
}