package com.motycka.edu.lesson03
// implement AreaCalculator object

/**
 * Main function to demonstrate static polymorphism.
 */
fun main() {
    println(AreaCalculator.calculateRectangleArea(5, 10))
}

object AreaCalculator {

    fun calculateRectangleArea(a: Double, b: Double): Double {
        return a * b
    }

    fun calculateRectangleArea(a: Int, b: Int): Double {
        return calculateRectangleArea(a.toDouble(), b.toDouble())
    }

    fun calculateCircleArea(r: Double): Double {
        return Math.PI * r * r
    }

    fun calculateCircleArea(r: Int): Double {
        return calculateCircleArea(r.toDouble())
    }

    fun calculateTriangleArea(a: Double, b: Double): Double {
        return 0.5 * a * b
    }

    fun calculateTriangleArea(a: Int, b: Int): Double {
        return calculateTriangleArea(a.toDouble(), b.toDouble())
    }
}
