package com.motycka.edu.lesson03

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlin.math.PI

class StaticPolymorphismTest : StringSpec({


    "calculateRectangleArea with Double parameters should calculate correct area" {
        // given
        val a = 5.0
        val b = 10.0

        // when
        val area = AreaCalculator.calculateRectangleArea(a, b)

        // then
        area shouldBe 50.0
    }

    "calculateRectangleArea with Int parameters should calculate correct area" {
        // given
        val a = 5
        val b = 10

        // when
        val area = AreaCalculator.calculateRectangleArea(a, b)

        // then
        area shouldBe 50.0
    }

    "calculateCircleArea with Double parameter should calculate correct area" {
        // given
        val r = 5.0

        // when
        val area = AreaCalculator.calculateCircleArea(r)

        // then
        area shouldBe PI * r * r
    }

    "calculateCircleArea with Int parameter should calculate correct area" {
        // given
        val r = 5

        // when
        val area = AreaCalculator.calculateCircleArea(r)

        // then
        area shouldBe PI * r * r
    }

    "calculateTriangleArea with Double parameters should calculate correct area" {
        // given
        val a = 5.0
        val b = 10.0

        // when
        val area = AreaCalculator.calculateTriangleArea(a, b)

        // then
        area shouldBe 25.0
    }

    "calculateTriangleArea with Int parameters should calculate correct area" {
        // given
        val a = 5
        val b = 10

        // when
        val area = AreaCalculator.calculateTriangleArea(a, b)

        // then
        area shouldBe 25.0
    }
})
