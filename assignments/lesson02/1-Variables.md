# Variables in Kotlin

In Kotlin, variables are declared using the `val` or `var` keywords:
- `val` (immutable): The value cannot be changed after initialization.
- `var` (mutable): The value can be changed after initialization.

For constants that are known at compile time, you can use the `const` modifier with `val`.

## Type Inference

Kotlin has type inference, which means you don't always need to specify the type explicitly:

```kotlin
val name = "John" // Type is inferred as String
var age = 30      // Type is inferred as Int
```

You can also specify the type explicitly:

```kotlin
val name: String = "John"
var age: Int = 30
```

## Exercise
**Use the `../src/com/motycka/edu/lesson02/Variables.kt` file to complete the following exercise:**

1. Define the following constant variables:
   - `espresso`: A String constant with the value "Espresso"
   - `cappuccino`: A String constant with the value "Cappuccino"
   - `espressoPrice`: A Double constant with the value 2.5
   - `cappuccinoPrice`: A Double constant with the value 3.0

2. Create a `main` function that:
   - Takes command-line arguments (args) representing coffee orders
   - Counts how many espressos and cappuccinos were ordered
   - Calculates the total price based on the quantities and prices
   - Prints the total price

Example:
```kotlin
fun main(args: Array<String>) {
    val espressoQuantity = args.count { it == espresso }
    val cappuccinoQuantity = args.count { it == cappuccino }

    val totalPrice = (espressoPrice * espressoQuantity) + (cappuccinoPrice * cappuccinoQuantity)

    println(totalPrice)
}
```

When run with arguments ["Espresso", "Cappuccino", "Espresso"], the program should output:
```
8.0
```
(2 Espressos at 2.5 each + 1 Cappuccino at 3.0 = 8.0)
