package model

import com.motycka.edu.lesson03.model.Ellipse
import com.motycka.edu.lesson03.model.Shape2D
import com.motycka.edu.lesson03.model.Sphere
import kotlin.math.PI

class Circle(
    override val radius: Double
): Shape2D, Ellipse {

    override fun area() = PI * radius * radius

    override fun perimeter() = 2 * PI * radius

    override fun to3D() = Sphere(radius)

}
