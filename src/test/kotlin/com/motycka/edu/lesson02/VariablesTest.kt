package com.motycka.edu.lesson02

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class VariablesTest : StringSpec({
    "coffee constants should have correct values" {
        espresso shouldBe "Espresso"
        cappuccino shouldBe "Cappuccino"
        espressoPrice shouldBe 2.5
        cappuccinoPrice shouldBe 3.0
    }

    "should calculate total price for no coffees" {
        val espressoQuantity = 0
        val cappuccinoQuantity = 0

        val totalPrice = (espressoPrice * espressoQuantity) + (cappuccinoPrice * cappuccinoQuantity)

        totalPrice shouldBe 0.0
    }

    "should calculate total price for one espresso" {
        val espressoQuantity = 1
        val cappuccinoQuantity = 0

        val totalPrice = (espressoPrice * espressoQuantity) + (cappuccinoPrice * cappuccinoQuantity)

        totalPrice shouldBe 2.5
    }

    "should calculate total price for one cappuccino" {
        val espressoQuantity = 0
        val cappuccinoQuantity = 1

        val totalPrice = (espressoPrice * espressoQuantity) + (cappuccinoPrice * cappuccinoQuantity)

        totalPrice shouldBe 3.0
    }

    "should calculate total price for multiple coffees" {
        val espressoQuantity = 2
        val cappuccinoQuantity = 1

        val totalPrice = (espressoPrice * espressoQuantity) + (cappuccinoPrice * cappuccinoQuantity)

        totalPrice shouldBe 8.0
    }
})
