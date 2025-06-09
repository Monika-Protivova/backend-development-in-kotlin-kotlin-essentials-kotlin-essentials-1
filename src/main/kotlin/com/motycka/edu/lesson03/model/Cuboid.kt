package com.motycka.edu.lesson03.model

class Cuboid(
    val width: Double,
    val height: Double,
    val depth: Double
) : Shape3D {

    override fun volume() = width * height * depth

    override fun surfaceArea() = 2 * (width * height + width * depth + height * depth)

}
