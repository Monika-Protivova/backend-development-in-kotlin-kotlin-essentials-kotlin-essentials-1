package com.motycka.edu.lesson02


// Prices for different coffee types
const val ESPRESSO_PRICE = 2.5
const val DOUBLE_ESPRESSO_PRICE = 3.0
const val CAPPUCCINO_PRICE = 3.0
const val LATTE_PRICE = 3.5
const val AMERICANO_PRICE = 2.0
const val FLAT_WHITE_PRICE = 3.2

fun main() {
    val coffeeOrders = mapOf(
        1 to listOf(ESPRESSO, CAPPUCCINO, LATTE, AMERICANO),
        2 to listOf(ESPRESSO, DOUBLE_ESPRESSO, FLAT_WHITE)
    )

    coffeeOrders.forEach { orderId, items ->

        println("Processing Order ID: $orderId")
        println("Items: $items")

        val prices = items.map {
            when (it) {
                ESPRESSO -> ESPRESSO_PRICE
                CAPPUCCINO -> CAPPUCCINO_PRICE
                LATTE -> LATTE_PRICE
                AMERICANO -> AMERICANO_PRICE
                FLAT_WHITE -> FLAT_WHITE_PRICE
                DOUBLE_ESPRESSO -> DOUBLE_ESPRESSO_PRICE
                else -> error("$it is not on the menu!")
            }
        }

        val discount = if (items.size >= 3) {
            println("You ordered 3 or more coffees, you get 1 for free!")
            prices.min()
        } else {
            0.0
        }

        val total = prices.sum() - discount

        println("Total price for Order ID $orderId: $total")
    }

}
