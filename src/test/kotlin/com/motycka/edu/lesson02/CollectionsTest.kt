package com.motycka.edu.lesson02

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldContainAll
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.maps.shouldContainKey
import io.kotest.matchers.shouldBe

class CollectionsTest : StringSpec({
    "coffee constants should have correct values" {
        ESPRESSO shouldBe "Espresso"
        DOUBLE_ESPRESSO shouldBe "Double Espresso"
        CAPPUCCINO shouldBe "Cappuccino"
        LATTE shouldBe "Latte"
        MACCHIATO shouldBe "Macchiato"
        MOCHA shouldBe "Mocha"
        FLAT_WHITE shouldBe "Flat White"
        AMERICANO shouldBe "Americano"
    }

    "coffeeMenu should contain all coffee types" {
        coffeeMenu shouldHaveSize 8
        coffeeMenu shouldContainAll listOf(
            ESPRESSO,
            DOUBLE_ESPRESSO,
            CAPPUCCINO,
            LATTE,
            MACCHIATO,
            MOCHA,
            FLAT_WHITE,
            AMERICANO
        )
    }

    "coffeeMenu should be accessible and contain expected items" {
        // Check individual items
        coffeeMenu shouldContain ESPRESSO
        coffeeMenu shouldContain CAPPUCCINO
        coffeeMenu shouldContain LATTE

        // Check the order of items
        coffeeMenu[0] shouldBe ESPRESSO
        coffeeMenu[1] shouldBe DOUBLE_ESPRESSO
        coffeeMenu[7] shouldBe AMERICANO
    }

    "should be able to create and manipulate mutable maps" {
        val orders = mutableMapOf<Int, List<String>>()

        // Add orders to the map
        val order1 = listOf(ESPRESSO, CAPPUCCINO)
        orders[1] = order1

        val order2 = listOf(LATTE, MOCHA)
        orders[2] = order2

        // Verify the map contains the expected entries
        orders.size shouldBe 2
        orders shouldContainKey 1
        orders shouldContainKey 2
        orders[1] shouldBe order1
        orders[2] shouldBe order2

        // Update an existing entry
        val updatedOrder = listOf(ESPRESSO, CAPPUCCINO, AMERICANO)
        orders[1] = updatedOrder

        orders[1] shouldBe updatedOrder

        // Remove an entry
        orders.remove(2)

        orders.size shouldBe 1
        orders shouldContainKey 1
    }

    "should be able to create and manipulate lists" {
        // Create a list of coffee items
        val order = listOf(ESPRESSO, CAPPUCCINO, AMERICANO)

        // Verify list properties
        order.size shouldBe 3
        order shouldContain ESPRESSO
        order shouldContain CAPPUCCINO
        order shouldContain AMERICANO

        // Check specific positions
        order[0] shouldBe ESPRESSO
        order[1] shouldBe CAPPUCCINO
        order[2] shouldBe AMERICANO
    }
})
