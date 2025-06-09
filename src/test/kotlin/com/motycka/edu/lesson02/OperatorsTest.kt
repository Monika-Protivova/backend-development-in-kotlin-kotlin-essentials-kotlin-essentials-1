package com.motycka.edu.lesson02

import com.motycka.edu.captureStdout
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.doubles.plusOrMinus
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class OperatorsTest : StringSpec({

    "should evaluate positive numbers" {
        val output = captureStdout { evaluate(5.0, 3.0) }

        output shouldContain "Sum: 8.0"
        output shouldContain "Difference: 2.0"
        output shouldContain "Product: 15.0"
        output shouldContain "Is Equal: false"
        output shouldContain "Is Not Equal: true"
        output shouldContain "A is Greater: true"
        output shouldContain "A is Less or Equal: false"
        output shouldContain "Both are above zero: true"
        output shouldContain "Either is above or equal to zero: true"
    }

    "should evaluate negative numbers" {
        val output = captureStdout { evaluate(-2.0, -4.0) }

        output shouldContain "Sum: -6.0"
        output shouldContain "Difference: 2.0"
        output shouldContain "Product: 8.0"
        output shouldContain "Is Equal: false"
        output shouldContain "Is Not Equal: true"
        output shouldContain "A is Greater: true"
        output shouldContain "A is Less or Equal: false"
        output shouldContain "Both are above zero: false"
        output shouldContain "Either is above or equal to zero: false"
    }

    "should evaluate equal numbers" {
        val output = captureStdout { evaluate(3.5, 3.5) }

        output shouldContain "Sum: 7.0"
        output shouldContain "Difference: 0.0"
        output shouldContain "Product: 12.25"
        output shouldContain "Is Equal: true"
        output shouldContain "Is Not Equal: false"
        output shouldContain "A is Greater: false"
        output shouldContain "A is Less or Equal: true"
        output shouldContain "Both are above zero: true"
        output shouldContain "Either is above or equal to zero: true"
    }

    "should evaluate positive A and negative B" {
        val output = captureStdout { evaluate(2.0, -1.0) }

        output shouldContain "Sum: 1.0"
        output shouldContain "Difference: 3.0"
        output shouldContain "Product: -2.0"
        output shouldContain "Is Equal: false"
        output shouldContain "Is Not Equal: true"
        output shouldContain "A is Greater: true"
        output shouldContain "A is Less or Equal: false"
        output shouldContain "Both are above zero: false"
        output shouldContain "Either is above or equal to zero: true"
    }

    "should evaluate negative A and positive B" {
        val output = captureStdout { evaluate(-1.0, 2.0) }

        output shouldContain "Sum: 1.0"
        output shouldContain "Difference: -3.0"
        output shouldContain "Product: -2.0"
        output shouldContain "Is Equal: false"
        output shouldContain "Is Not Equal: true"
        output shouldContain "A is Greater: false"
        output shouldContain "A is Less or Equal: true"
        output shouldContain "Both are above zero: false"
        output shouldContain "Either is above or equal to zero: true"
    }
})
