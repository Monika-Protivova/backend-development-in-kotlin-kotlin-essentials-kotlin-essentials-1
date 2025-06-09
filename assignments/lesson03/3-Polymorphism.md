# Static Polymorphism

Also called compile-time polymorphism, static polymorphism is achieved by method overloading.
In method overloading, multiple methods with the same name are defined in the same class, but with different parameters.
The method to be called is determined at compile time based on the number and type of arguments passed to the method.

### Exercise
**Use the `../src/com/motycka/edu/lesson03/StaticPolymorphism.kt` file to complete the following exercise:**

Implement an object called **AreaCalculator** with the following methods:
- `fun calculateRectangleArea(a: Double, b: Double): Double`
- `fun calculateRectangleArea(a: Int, b: Int): Double`
- `fun calculateCircleArea(r: Double): Double`
- `fun calculateCircleArea(r: Int): Double`
- `fun calculateTriangleArea(a: Double, b: Double): Double`
- `fun calculateTriangleArea(a: Int, b: Int): Double`

The check will tolerate 0.001 inaccuracy.
