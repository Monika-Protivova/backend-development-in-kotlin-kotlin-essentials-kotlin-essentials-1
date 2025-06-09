package com.motycka.edu.lesson03.model

import model.Rectangle

class Square(
    side: Double
) : Rectangle(side, side) {

    fun to3D(): Cuboid = to3D(width)

}
