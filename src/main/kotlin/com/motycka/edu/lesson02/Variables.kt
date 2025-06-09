package com.motycka.edu.lesson02

/*
Define String variables for two types of coffee: espresso and cappuccino.
 */
const val espresso = "Espresso"
const val cappuccino = "Cappuccino"

/*
Define Double variables for the prices of espresso and cappuccino.
 */
const val espressoPrice = 2.5
const val cappuccinoPrice = 3.0

fun main(args: Array<String>) {

    val espressoQuantity = args.count { it == espresso }
    val cappuccinoQuantity = args.count { it == cappuccino }

    val totalPrice = (espressoPrice * espressoQuantity) + (cappuccinoPrice * cappuccinoQuantity)

    println(totalPrice)
}
