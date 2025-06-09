# Inheritance

Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.
It is an important part of OOP (Object-Oriented programming).

## Exercise
**Use the `../src/com/motycka/edu/lesson03/InheritanceAndAbstraction.kt` file to complete the following exercise:**

### Part 1: Inheritance
1. Create an **open** class **Rectangle** class with the following:
    - Properties:
        - `width: Double`, make it **protected**
        - `legth: Double`, make it **protected**
        - **constructor** that initializes both fields
    - Methods:
        - method `area()` that returns the area of the shape
        - method `perimeter()` that returns the perimeter of the shape

2. Create a class **Square** that extends **Rectangle**
    - Now, if you instantiate either **Square** or **Rectangle** and call the `area()` and `perimeter()` methods, you should get the correct results.

3. Create another class called **Cuboid** with the following:
    - Properties:
        - `width: Double`
        - `legth: Double`
        - `height: Double`
        - **constructor** that initializes all fields
    - Methods:
        - method `volume()` that returns the volume of the block
        - method `surfaceArea()` that returns the surface area of the block

4. Update the **Rectangle** class, add method `to3D(height: Double)` that returns a new `Cuboid` object with the same width, height, and length.

5. Update the **Square** class, add method `to3D()` that returns a new `Cuboid` object with the same width, height, and length. You can proxy the call to the `toCuboid` method of the `Rectangle` class.

   On this example you can see that **Square** inherits all **Rectangle** methods and properties, and you can also add new methods to it.


## Part 2: Abstraction

The main purpose of an abstract class is encapsulating common behavior that can be shared among multiple subclasses,
while allowing each subclass to implement its own behavior either by overriding abstract methods,
adding new methods or fields, or overriding non-abstract methods.

## Exercise 2 - Abstraction

1. Define interface **Quadrilateral**, which is going to represent rectangles. It should have the following properties and methods:
   - `val width: Double`
   - `val length: Double`
   - `fun to3D(depth: Double): Shape3D`

2. Define interface **Ellipse**, which is going to represent circles and ellipses. It should have the following methods:
   - `val radius: Double`
   - `fun to3D(): Shape3D`

3. Define interface **Shape2D**, which is going to represent 2-dimensional objects. It should have the following methods:
   - `fun area(): Double`
   - `fun perimeter(): Double`

4. Define interface **Shape3D**, which is going to represent 3-dimensional objects. It should have the following methods:
   - `fun volume(): Double`
   - `fun surfaceArea(): Double`

5. Update your Rectangle class to implement the **Shape2D** and **Quadrilateral** interfaces.

6. Modify class **Square** appropriately, since it extends **Rectangle** which already implements all interfaces.

7. Create a class **Circle** that implements the **Shape2D** and **Ellipse** interfaces.

8. Update your Cuboid class to **implement** the **Shape3D** interface.

9. Create a class **Sphere** that implements the **Shape3D** interface.

10. Use the main function as a reference to see if all is working as expected.
