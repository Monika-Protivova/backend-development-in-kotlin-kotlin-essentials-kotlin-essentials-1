package com.motycka.edu.lesson02

/*
 Coffee Shop Menu
 */

const val ESPRESSO = "Espresso"
const val DOUBLE_ESPRESSO = "Double Espresso"
const val CAPPUCCINO = "Cappuccino"
const val LATTE = "Latte"
const val MACCHIATO = "Macchiato"
const val MOCHA = "Mocha"
const val FLAT_WHITE = "Flat White"
const val AMERICANO = "Americano"

val coffeeMenu = listOf(
    ESPRESSO,
    DOUBLE_ESPRESSO,
    CAPPUCCINO,
    LATTE,
    MACCHIATO,
    MOCHA,
    FLAT_WHITE,
    AMERICANO
)



fun main() {
    /*
     List to store orders
     */
    val orders = mutableMapOf<Int, List<String>>()

    println("\nWelcome to the Coffee Shop! Here is our menu:")
    coffeeMenu.forEach { println(it) }

    // Order 1x Espresso, 2x Cappuccino, and 1x Americano
    val order1 = listOf(
        ESPRESSO,
        CAPPUCCINO,
        CAPPUCCINO,
        AMERICANO,
    )

    orders.put(1, order1) // Using plus to add a new entry to the map

    // Order 1x Espresso, 1x Double Espresso, and 1x Flat White
    val order2 = listOf(
        ESPRESSO,
        DOUBLE_ESPRESSO,
        FLAT_WHITE,
    )

    orders.put(2, order2)

    println("\nOrders placed:")
    orders.forEach {
        println("Order ID: ${it.key}, Items: ${it.value}")
    }
}
