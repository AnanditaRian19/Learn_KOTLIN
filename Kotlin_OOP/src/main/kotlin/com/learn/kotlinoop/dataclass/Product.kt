package com.learn.kotlinoop.dataclass

/**
 * @author Rizki Rian Anandita
 */
// Data Class
data class Product(
    val name: String,
    val price: Int,
    val category: String
)

fun main() {
    val product = Product("Indomie", 3000, "Makanan")
    println(product)

    // Copy Data Class
    val product2 = product.copy(name = "Supermie")
    println(product)
    println(product2)
}
