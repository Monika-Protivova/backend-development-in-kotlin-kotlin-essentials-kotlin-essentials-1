# Nullable Types in Kotlin

Kotlin's type system is designed to eliminate the danger of null references, often called "The Billion Dollar Mistake." By default, variables in Kotlin cannot hold null values, which helps prevent null pointer exceptions.

## Nullable Types

To allow a variable to hold a null value, you must explicitly mark it as nullable by adding a `?` after the type:

```kotlin
var name: String = "John"      // Non-nullable String, cannot be null
var nullableName: String? = null  // Nullable String, can be null
```

## Safe Calls

When working with nullable types, you can use the safe call operator `?.` to safely access properties or call methods on a nullable reference:

```kotlin
val length = nullableName?.length  // Returns null if nullableName is null
```

## Elvis Operator

The Elvis operator `?:` provides a default value when a nullable expression is null:

```kotlin
val length = nullableName?.length ?: 0  // Returns 0 if nullableName is null
```

## Not-null Assertion

If you're absolutely sure a nullable reference is not null, you can use the not-null assertion operator `!!` to convert it to a non-nullable type:

```kotlin
val length = nullableName!!.length  // Throws NullPointerException if nullableName is null
```

## Review code in `Nullables.kt` to understand how nullable types work in Kotlin.
**Use the `../src/com/motycka/edu/lesson02/Nullables.kt` file to complete the following exercise:**
