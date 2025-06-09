# Encapsulation

Encapsulation is a concept of controlling access to the internal state of an object, protecting it from unauthorized
access and ensuring data integrity.

In Java/Kotlin, this is typically achieved using access modifiers (private, protected, internal) and getter/setter methods.

By using getter/setter methods, the class can enforce its own data validation rules to ensure its internal state remains valid and consistent.

## Exercise
**Use the `../src/com/motycka/edu/lesson03/Encapsulation.kt` file to complete the following exercise:**

1. Create a class **Assignment** with the following properties:
      - `dueDate: LocalDate` - should be public, immutable and initialized in the constructor
      - `assignee: String` - should be public, immutable and initialized in the constructor
      - `finalGrade: Int?` - should be private, mutable and initialized to null (nullable)


2. Add the following methods:
      - `fun setFinalGrade(grade: Int)` - should set the final grade, but only if it is between 0 and 100 (inclusive). Use 
      - `fun getFinalGrade(): Int?` - should return the final grade


   For the final grade validation, you can use the following code:
   
   ```kotlin
   require(finalGrade in 0..100) { "Final grade must be between 0 and 100" }
   this.finalGrade = finalGrade
   ```
