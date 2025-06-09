package com.motycka.edu.lesson03

import java.time.LocalDate

data class Assignment(
    val dueDate: LocalDate,
    val assignee: String,
) {
    private var finalGrade: Int? = null

    fun getFinalGrade(): Int? {
        return finalGrade
    }

    fun setFinalGrade(finalGrade: Int) {
        require(finalGrade in 0..100) { "Final grade must be between 0 and 100" }
        this.finalGrade = finalGrade
    }
}

fun main() {
    val assignment = Assignment(LocalDate.now(), "John Doe")
    assignment.setFinalGrade(90)
    println(assignment.getFinalGrade())
}
