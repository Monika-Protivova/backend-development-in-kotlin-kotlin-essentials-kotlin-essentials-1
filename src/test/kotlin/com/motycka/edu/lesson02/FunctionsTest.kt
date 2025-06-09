package com.motycka.edu.lesson02

import com.motycka.edu.captureStdout
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly
import io.kotest.matchers.maps.shouldBeEmpty
import io.kotest.matchers.shouldBe

class FunctionsTest : StringSpec({

    beforeTest {
        coffeeOrders.clear()
    }

    "placerOrder should add items to coffeeOrders and return orderId" {
        val items = listOf(ESPRESSO, CAPPUCCINO)
        val orderId = placerOrder(items)

        orderId shouldBe 0
        coffeeOrders[orderId] shouldBe items
    }

    "payOrder should calculate correct total for a single item" {
        val orderId = placerOrder(listOf(ESPRESSO))
        val total = payOrder(orderId)

        total shouldBeExactly ESPRESSO_PRICE
    }

    "payOrder should calculate correct total for multiple items" {
        val orderId = placerOrder(listOf(ESPRESSO, CAPPUCCINO, AMERICANO))
        val total = payOrder(orderId)

        total shouldBeExactly (ESPRESSO_PRICE + CAPPUCCINO_PRICE + AMERICANO_PRICE)
    }

    "payOrder should apply discount for 3 or more items" {
        val orderId = placerOrder(listOf(ESPRESSO, CAPPUCCINO, AMERICANO, FLAT_WHITE))
        val total = payOrder(orderId)

        // Discount should be the price of the cheapest item (AMERICANO)
        total shouldBeExactly (ESPRESSO_PRICE + CAPPUCCINO_PRICE + FLAT_WHITE_PRICE)
    }

    "payOrder should throw error for non-existent order" {
        val exception = shouldThrow<IllegalStateException> {
            payOrder(999)
        }

        exception.message shouldBe "Order ID 999 not found."
    }

    "completeOrder should remove the order from coffeeOrders" {
        val orderId = placerOrder(listOf(ESPRESSO))

        coffeeOrders.size shouldBe 1

        completeOrder(orderId)

        coffeeOrders.size shouldBe 0
    }

    "completeOrder should throw error for non-existent order" {
        val exception = shouldThrow<IllegalStateException> {
            completeOrder(999)
        }

        exception.message shouldBe "Order ID 999 not found."
    }

    "getPrice should return correct price for each item" {
        getPrice(ESPRESSO) shouldBeExactly ESPRESSO_PRICE
        getPrice(DOUBLE_ESPRESSO) shouldBeExactly DOUBLE_ESPRESSO_PRICE
        getPrice(CAPPUCCINO) shouldBeExactly CAPPUCCINO_PRICE
        getPrice(LATTE) shouldBeExactly LATTE_PRICE
        getPrice(AMERICANO) shouldBeExactly AMERICANO_PRICE
        getPrice(FLAT_WHITE) shouldBeExactly FLAT_WHITE_PRICE
    }

    "getPrice should throw error for unknown item" {
        val exception = shouldThrow<IllegalStateException> {
            getPrice("Unknown Coffee")
        }

        exception.message shouldBe "Unknown Coffee is not on the menu!"
    }

    "processOrder should calculate correct change" {
        val items = listOf(ESPRESSO, CAPPUCCINO)
        val payment = 10.0
        val expectedTotal = ESPRESSO_PRICE + CAPPUCCINO_PRICE
        val expectedChange = payment - expectedTotal

        val change = processOrder(items, payment)

        change shouldBeExactly expectedChange
        coffeeOrders.shouldBeEmpty()
    }

    "processOrder should throw error for insufficient payment" {
        val items = listOf(ESPRESSO, CAPPUCCINO, LATTE)
        val payment = 5.0
        val expectedTotal = ESPRESSO_PRICE + CAPPUCCINO_PRICE + LATTE_PRICE

        val exception = shouldThrow<IllegalStateException> {
            processOrder(items, payment)
        }

        exception.message shouldBe "Insufficient payment. Total to pay is $expectedTotal, but received $payment."
    }

    "processOrder should print payment information" {
        val items = listOf(ESPRESSO, CAPPUCCINO)
        val payment = 10.0
        val expectedTotal = ESPRESSO_PRICE + CAPPUCCINO_PRICE
        val expectedChange = payment - expectedTotal

        val output = captureStdout {
            processOrder(items, payment)
        }

        output shouldBe "Payment successful. Total paid: $payment, Total to pay: $expectedTotal, change: $expectedChange"
    }
})
