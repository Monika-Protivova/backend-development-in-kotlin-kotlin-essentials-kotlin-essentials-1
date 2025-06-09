package model

import com.motycka.edu.lesson03.model.Cuboid
import com.motycka.edu.lesson03.model.Quadrilateral
import com.motycka.edu.lesson03.model.Shape2D

open class Rectangle(
    override val width: Double,
    override val length: Double
) : Shape2D, Quadrilateral {

    override fun area() = width * length

    override fun perimeter() = 2 * (width + length)

    override fun to3D(depth: Double) = Cuboid(
        width = width,
        height = length,
        depth = depth
    )

}
