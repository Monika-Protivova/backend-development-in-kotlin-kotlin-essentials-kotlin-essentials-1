package com.motycka.edu.lesson04

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

// By convention, the name of the test class should be the name of the class under test + "Test"
class TemperatureConverterTest : StringSpec({

    "convert Celsius to Fahrenheit where celsius is 0" {
        // given
        val celsius = 0.0

        // when
        val fahrenheit = TemperatureConverter.toFahrenheit(celsius)

        // then
        fahrenheit shouldBe 32.0
    }

    "convert Celsius to Fahrenheit where celsius is 1" {
        // given
        val celsius = 1.0

        // when
        val fahrenheit = TemperatureConverter.toFahrenheit(celsius)

        // then
        fahrenheit shouldBe 33.8
    }

    "convert Celsius to Fahrenheit where celsius is -1" {
        // given
        val celsius = -1.0

        // when
        val fahrenheit = TemperatureConverter.toFahrenheit(celsius)

        // then
        fahrenheit shouldBe 30.2
    }
})
