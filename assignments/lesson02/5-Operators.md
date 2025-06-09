# Operators in Kotlin

Kotlin provides a rich set of operators for performing various operations on variables and values. These include arithmetic operators, comparison operators, and logical operators.

## Arithmetic Operators

Arithmetic operators are used to perform mathematical operations:

- `+` (Addition): Adds two values
- `-` (Subtraction): Subtracts the right operand from the left operand
- `*` (Multiplication): Multiplies two values
- `/` (Division): Divides the left operand by the right operand
- `%` (Modulus): Returns the remainder of dividing the left operand by the right operand

## Comparison Operators

Comparison operators are used to compare two values:

- `==` (Equal to): Returns true if the operands are equal
- `!=` (Not equal to): Returns true if the operands are not equal
- `>` (Greater than): Returns true if the left operand is greater than the right operand
- `<` (Less than): Returns true if the left operand is less than the right operand
- `>=` (Greater than or equal to): Returns true if the left operand is greater than or equal to the right operand
- `<=` (Less than or equal to): Returns true if the left operand is less than or equal to the right operand

## Logical Operators

Logical operators are used to combine conditional statements:

- `&&` (Logical AND): Returns true if both operands are true
- `||` (Logical OR): Returns true if either operand is true
- `!` (Logical NOT): Returns true if the operand is false and vice versa

## Exercise
**Use the `../src/com/motycka/edu/lesson02/Operators.kt` file to complete the following exercise:**

1. Create a function called `evaluate` that takes two Double parameters `a` and `b` and performs the following operations:
   - Calculate the sum of `a` and `b`
   - Calculate the difference between `a` and `b`
   - Calculate the product of `a` and `b`
   - Check if `a` is equal to `b`
   - Check if `a` is not equal to `b`
   - Check if `a` is greater than `b`
   - Check if `a` is less than or equal to `b`
   - Check if both `a` and `b` are above zero
   - Check if either `a` or `b` is above or equal to zero

2. Print the results of all these operations with appropriate labels.

Example output when calling `evaluate(2.4, 3.6)`:
```
Sum: 6.0
Difference: -1.2
Product: 8.64
Is Equal: false
Is Not Equal: true
A is Greater: false
A is Less or Equal: true
Both are above zero: true
Either is above or equal to zero: true
```
