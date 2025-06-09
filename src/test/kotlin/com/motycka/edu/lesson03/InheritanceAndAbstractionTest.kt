package com.motycka.edu.lesson03

import com.motycka.edu.lesson03.model.*
import io.kotest.core.spec.style.FreeSpec
import model.Circle
import model.Rectangle
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf

class InheritanceAndAbstractionTest : FreeSpec({

    "Shape" - {

        "Shape2D should be an interface with correct methods" {
            Shape2D::class.java.isInterface shouldBe true

            // Verify Shape2D interface has no properties
            Shape2D::class.java.declaredFields.isEmpty() shouldBe true

            // Verify Shape2D interface has area() and perimeter() methods
            Shape2D::class.java.methods.map { it.name }.toSet() shouldBe
                setOf("area", "perimeter")
        }

        "Shape3D should be an interface with correct methods" {
            Shape3D::class.java.isInterface shouldBe true

            // Verify Shape3D interface has no properties
            Shape3D::class.java.declaredFields.isEmpty() shouldBe true

            // Verify Shape3D interface has volume() and surfaceArea() methods
            Shape3D::class.java.methods.map { it.name }.toSet() shouldBe
                setOf("volume", "surfaceArea")
        }

        "Quadrilateral should be an interface with correct methods" {
            Quadrilateral::class.java.isInterface shouldBe true

            // Verify Quadrilateral interface has no properties
            Quadrilateral::class.java.declaredFields.isEmpty() shouldBe true

            // Verify Quadrilateral interface has area() and perimeter() methods
            Quadrilateral::class.java.methods.map { it.name }.toSet() shouldBe
                setOf("getLength", "to3D", "getWidth")
        }

        "Ellipse should be an interface with correct methods" {
            Ellipse::class.java.isInterface shouldBe true

            // Verify Ellipse interface has no properties
            Ellipse::class.java.declaredFields.isEmpty() shouldBe true

            // Verify Ellipse interface has area() and perimeter() methods
            Ellipse::class.java.methods.map { it.name }.toSet() shouldBe
                setOf("to3D", "getRadius")
        }
    }

    "Circle should implement Shape2D and Ellipse and have correct properties" {
        // Verify Circle implements correct interfaces
        Circle::class.java.interfaces.map { it.name }.toSet() shouldBe
            setOf(Shape2D::class.java.name, Ellipse::class.java.name)

        // Create a Circle instance and verify its properties and methods
        val circle = Circle(5.0)
        circle.radius shouldBe 5.0

        // Verify methods work correctly
        circle.area() shouldBe Math.PI * 25.0
        circle.perimeter() shouldBe 2 * Math.PI * 5.0

        // Verify to3D returns a Sphere
        val sphere = circle.to3D()
        sphere.shouldBeInstanceOf<Sphere>()
    }

    "Rectangle should implement Shape2D and Quadrilateral and have correct properties" {
        // Verify Rectangle implements correct interfaces
        Rectangle::class.java.interfaces.map { it.name }.toSet() shouldBe
            setOf(Shape2D::class.java.name, Quadrilateral::class.java.name)

        // Verify Rectangle is an open class (can be inherited)
        Rectangle::class.java.modifiers and java.lang.reflect.Modifier.FINAL shouldBe 0

        // Create a Rectangle instance and verify its properties and methods
        val rectangle = Rectangle(4.0, 6.0)
        rectangle.width shouldBe 4.0
        rectangle.length shouldBe 6.0

        // Verify methods work correctly
        rectangle.area() shouldBe 24.0
        rectangle.perimeter() shouldBe 20.0

        // Verify to3D returns a Cuboid
        val cuboid = rectangle.to3D(2.0)
        cuboid.shouldBeInstanceOf<Cuboid>()
        cuboid.width shouldBe 4.0
        cuboid.height shouldBe 6.0
        cuboid.depth shouldBe 2.0
    }

    "Square should extend Rectangle and have correct methods" {
        // Verify Square extends Rectangle
        val isSubclass = Rectangle::class.java.isAssignableFrom(Square::class.java)
        isSubclass shouldBe true

        // Create a Square instance and verify its properties
        val square = Square(5.0)
        square.width shouldBe 5.0
        square.length shouldBe 5.0

        // Verify inherited methods work correctly
        square.area() shouldBe 25.0
        square.perimeter() shouldBe 20.0

        // Verify to3D() method (no parameters) returns a Cuboid with equal dimensions
        val cuboid = square.to3D()
        cuboid.shouldBeInstanceOf<Cuboid>()
        cuboid.width shouldBe 5.0
        cuboid.height shouldBe 5.0
        cuboid.depth shouldBe 5.0
    }

    "Sphere should implement Shape3D and have correct methods" {
        // Verify Sphere implements Shape3D
        Sphere::class.java.interfaces.map { it.name }.toSet() shouldBe
            setOf(Shape3D::class.java.name)

        // Create a Sphere instance
        val sphere = Sphere(3.0)

        // Verify methods work correctly
        sphere.volume() shouldBe (4.0/3.0) * Math.PI * 27.0
        sphere.surfaceArea() shouldBe 4 * Math.PI * 9.0
    }

    "Cuboid should implement Shape3D and have correct properties and methods" {
        // Verify Cuboid implements Shape3D
        Cuboid::class.java.interfaces.map { it.name }.toSet() shouldBe
            setOf(Shape3D::class.java.name)

        // Create a Cuboid instance and verify its properties
        val cuboid = Cuboid(2.0, 3.0, 4.0)
        cuboid.width shouldBe 2.0
        cuboid.height shouldBe 3.0
        cuboid.depth shouldBe 4.0

        // Verify methods work correctly
        cuboid.volume() shouldBe 24.0
        cuboid.surfaceArea() shouldBe 2 * (2*3 + 2*4 + 3*4)
    }
})
