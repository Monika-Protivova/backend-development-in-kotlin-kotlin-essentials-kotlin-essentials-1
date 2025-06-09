# Collections in Kotlin

Kotlin provides a rich set of collection types, including lists, maps, sets, and more. Collections can be either mutable (modifiable) or immutable (read-only).

## Lists

Lists are ordered collections of items. In Kotlin, you can create lists using the `listOf()` function for immutable lists or `mutableListOf()` for mutable lists.

```kotlin
// Immutable list
val coffeeMenu = listOf("Espresso", "Cappuccino", "Latte")

// Mutable list
val orders = mutableListOf("Espresso", "Cappuccino")
orders.add("Latte") // Adds an item to the list
```

## Maps

Maps store key-value pairs. You can create maps using the `mapOf()` function for immutable maps or `mutableMapOf()` for mutable maps.

```kotlin
// Immutable map
val prices = mapOf("Espresso" to 2.5, "Cappuccino" to 3.0)

// Mutable map
val orders = mutableMapOf<Int, List<String>>()
orders[1] = listOf("Espresso", "Cappuccino") // Adds an entry to the map
```

## Exercise
**Use the `../src/com/motycka/edu/lesson02/Collections.kt` file to complete the following exercise:**

1. Define constants for the following coffee types:
   - `ESPRESSO`: "Espresso"
   - `DOUBLE_ESPRESSO`: "Double Espresso"
   - `CAPPUCCINO`: "Cappuccino"
   - `LATTE`: "Latte"
   - `MACCHIATO`: "Macchiato"
   - `MOCHA`: "Mocha"
   - `FLAT_WHITE`: "Flat White"
   - `AMERICANO`: "Americano"

2. Create an immutable list called `coffeeMenu` that contains all the coffee types defined above.

3. Create a `main` function that:
   - Creates a mutable map called `orders` to store order IDs (Int) and lists of coffee items (List<String>)
   - Prints a welcome message and the coffee menu
   - Creates two orders with different coffee items
   - Adds the orders to the `orders` map
   - Prints all the orders

Example output:
```
Welcome to the Coffee Shop! Here is our menu:
Espresso
Double Espresso
Cappuccino
Latte
Macchiato
Mocha
Flat White
Americano

Orders placed:
Order ID: 1, Items: [Espresso, Cappuccino, Cappuccino, Americano]
Order ID: 2, Items: [Espresso, Double Espresso, Flat White]
```
