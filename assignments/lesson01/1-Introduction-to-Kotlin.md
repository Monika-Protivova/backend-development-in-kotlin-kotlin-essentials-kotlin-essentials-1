# Main Function

In Kotlin, the entry point to a program is the `main` function. This function is called when the program is executed.

```kotlin
fun main(args: Array<String>) {
    // Your code here
}
```

The `main` function can optionally take an array of strings as a parameter, which represents the command-line arguments passed to the program.

## Exercise
**Use the `../src/com/motycka/edu/lesson01/Main.kt` file to complete the following exercise:**

1. Create a Kotlin program with a `main` function that:
   - Prints "Hello, Kotlin!" to the console
   - Prints the program arguments in the format "Program arguments: arg1, arg2, arg3"

2. Run the program with different command-line arguments to see how they are displayed.

Example output when run with arguments "arg1", "arg2", "arg3":
```
Hello, Kotlin!
Program arguments: arg1, arg2, arg3
```

Example output when run with no arguments:
```
Hello, Kotlin!
Program arguments: 
```

**Hint:**
You can use the `joinToString` function to format the arguments array into a string.

```kotlin
println("Program arguments: ${args.joinToString(", ")}")
```

This exercise will help you understand the basic structure of a Kotlin program and how to handle command-line arguments.
