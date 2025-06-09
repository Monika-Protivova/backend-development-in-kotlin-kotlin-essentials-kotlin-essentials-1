package com.motycka.edu.lesson03

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.time.LocalDate

class EncapsulationTest : StringSpec({

    "Assignment constructor should initialize properties correctly" {
        // given
        val dueDate = LocalDate.of(2023, 12, 31)
        val assignee = "John Doe"

        // when
        val assignment = Assignment(dueDate, assignee)

        // then
        assignment.dueDate shouldBe dueDate
        assignment.assignee shouldBe assignee
        assignment.getFinalGrade() shouldBe null
    }

    "getFinalGrade should return null when grade is not set" {
        // given
        val assignment = Assignment(LocalDate.now(), "Jane Smith")

        // when
        val grade = assignment.getFinalGrade()

        // then
        grade shouldBe null
    }

    "setFinalGrade should set a valid grade" {
        // given
        val assignment = Assignment(LocalDate.now(), "Alice Johnson")
        val validGrade = 85

        // when
        assignment.setFinalGrade(validGrade)

        // then
        assignment.getFinalGrade() shouldBe validGrade
    }

    "setFinalGrade should accept minimum valid grade (0)" {
        // given
        val assignment = Assignment(LocalDate.now(), "Bob Brown")
        val minGrade = 0

        // when
        assignment.setFinalGrade(minGrade)

        // then
        assignment.getFinalGrade() shouldBe minGrade
    }

    "setFinalGrade should accept maximum valid grade (100)" {
        // given
        val assignment = Assignment(LocalDate.now(), "Charlie Davis")
        val maxGrade = 100

        // when
        assignment.setFinalGrade(maxGrade)

        // then
        assignment.getFinalGrade() shouldBe maxGrade
    }

    "setFinalGrade should throw exception for grade below 0" {
        // given
        val assignment = Assignment(LocalDate.now(), "David Wilson")
        val invalidGrade = -1

        // when/then
        val exception = shouldThrow<IllegalArgumentException> {
            assignment.setFinalGrade(invalidGrade)
        }

        // then
        exception.message shouldBe "Final grade must be between 0 and 100"
    }

    "setFinalGrade should throw exception for grade above 100" {
        // given
        val assignment = Assignment(LocalDate.now(), "Eva Martinez")
        val invalidGrade = 101

        // when/then
        val exception = shouldThrow<IllegalArgumentException> {
            assignment.setFinalGrade(invalidGrade)
        }

        // then
        exception.message shouldBe "Final grade must be between 0 and 100"
    }
})
