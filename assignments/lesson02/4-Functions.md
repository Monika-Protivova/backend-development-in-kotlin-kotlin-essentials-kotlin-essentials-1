# Functions in Kotlin

Functions in Kotlin are declared using the `fun` keyword. They can have parameters, return values, and can be organized to create modular, reusable code.

## Basic Function Syntax

```kotlin
fun functionName(param1: Type1, param2: Type2): ReturnType {
    // Function body
    return result
}
```

## Functions with No Return Value

Functions that don't return a value have a return type of `Unit`, which can be omitted:

```kotlin
fun printMessage(message: String) {
    println(message)
}
```

## Single-Expression Functions

If a function returns a single expression, the curly braces can be omitted and the body can be specified after a `=` sign:

```kotlin
fun double(x: Int): Int = x * 2
```

## Exercise
**Use the `../src/com/motycka/edu/lesson02/Functions.kt` file to complete the following exercise:**

In this exercise, you'll implement a coffee shop order processing system using functions. You'll need to create the following functions:

1. `fun processOrder(items: List<String>, payment: Double): Double`
   - This function should:
     - Place an order with the given items
     - Calculate the total to pay
     - Check if the payment is sufficient
     - If payment is insufficient, throw an error with a message
     - If payment is sufficient, print a success message and calculate the change
     - Complete the order
     - Return the change

2. `fun placerOrder(items: List<String>): Int`
   - This function should:
     - Add the items to the `coffeeOrders` map with a new order ID
     - Return the order ID

3. `fun payOrder(orderId: Int): Double`
   - This function should:
     - Retrieve the items for the given order ID
     - If the order ID doesn't exist, throw an error
     - Calculate the price of each item
     - Apply a discount (the price of the cheapest item) if there are more than 3 items
     - Return the total price

4. `fun completeOrder(orderId: Int)`
   - This function should:
     - Check if the order ID exists
     - If not, throw an error
     - Remove the order from the `coffeeOrders` map

5. `fun getPrice(item: String): Double`
   - This function should:
     - Return the price of the given coffee item
     - If the item is not on the menu, throw an error

Note: This exercise uses the coffee type constants and price constants defined in the previous exercises. Make sure you have completed those exercises first.
