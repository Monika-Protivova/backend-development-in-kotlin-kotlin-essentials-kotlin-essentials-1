package com.motycka.edu.lesson02

val coffeeOrders = mutableMapOf<Int, List<String>>()

fun main() {
    // You can write code here to try the functions
    processOrder(listOf(ESPRESSO, CAPPUCCINO, CAPPUCCINO, AMERICANO), 20.0)
    processOrder(listOf(ESPRESSO, FLAT_WHITE, AMERICANO), 10.0)
//    processOrder(listOf(ESPRESSO, ESPRESSO, DOUBLE_ESPRESSO), 5.0)
}

/* Implement the functions below */

fun processOrder(items: List<String>, payment: Double): Double {
    val orderId = placerOrder(items)
    val totalToPay = payOrder(orderId)

    val change = if (payment <= totalToPay) {
        error("Insufficient payment. Total to pay is $totalToPay, but received $payment.")
    } else {
        val change = payment - totalToPay
        println("Payment successful. Total paid: $payment, Total to pay: $totalToPay, change: $change")
        change
    }

    completeOrder(orderId)

    return change
}

fun placerOrder(items: List<String>): Int {
    val orderId = coffeeOrders.size
    coffeeOrders.put(orderId, items)
    return orderId
}

fun payOrder(orderId: Int): Double {
    val items = coffeeOrders[orderId] ?: error("Order ID $orderId not found.")

    val prices = items.map {
        getPrice(it)
    }

    val discount = if (items.size > 3) {
        prices.min()
    } else {
        0.0
    }

    return prices.sum() - discount
}

fun completeOrder(orderId: Int) {
    coffeeOrders[orderId] ?: error("Order ID $orderId not found.")
    coffeeOrders.remove(orderId)
}

fun getPrice(item: String): Double {
    return when (item) {
        ESPRESSO -> ESPRESSO_PRICE
        DOUBLE_ESPRESSO -> DOUBLE_ESPRESSO_PRICE
        CAPPUCCINO -> CAPPUCCINO_PRICE
        LATTE -> LATTE_PRICE
        AMERICANO -> AMERICANO_PRICE
        FLAT_WHITE -> FLAT_WHITE_PRICE
        else -> error("$item is not on the menu!")
    }
}
