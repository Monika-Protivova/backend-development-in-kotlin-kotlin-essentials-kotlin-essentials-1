# Testing in Kotlin with Kotest

Testing is a crucial part of software development that helps ensure your code works as expected. In this exercise, you'll learn how to write tests for Kotlin code using the Kotest framework.

## Kotest Framework

Kotest is a flexible and comprehensive testing framework for Kotlin with support for multiple testing styles. In this exercise, we'll use the StringSpec style, which allows for simple, string-based test descriptions.

```kotlin
class MyTest : StringSpec({
    "this is a test" {
        // test code here
    }
})
```

## Assertions

Kotest provides a variety of matchers for assertions. The most common is `shouldBe`:

```kotlin
value shouldBe expectedValue
```

Other useful matchers include:
- `shouldNotBe` - asserts that a value is not equal to another
- `shouldBeNull` - asserts that a value is null
- `shouldNotBeNull` - asserts that a value is not null
- `shouldBeGreaterThan` - asserts that a value is greater than another

## Test Structure

A good test typically follows the Given-When-Then pattern:
- **Given**: Set up the test conditions
- **When**: Execute the code being tested
- **Then**: Verify the results

```kotlin
"test description" {
    // given
    val input = someValue
    
    // when
    val result = functionUnderTest(input)
    
    // then
    result shouldBe expectedValue
}
```

## Exercise

Your task is to write tests for the `TemperatureConverter` object, which provides methods for converting temperatures between Celsius and Fahrenheit.

1. Open the `TemperatureConverterTest.kt` file in the test directory.
2. Notice that there are already tests for the `toFahrenheit` method.
3. Add tests for the `toCelsius` method following the same pattern.

Your tests should cover at least the following cases:
- Converting 32°F to Celsius (should be 0°C)
- Converting 212°F to Celsius (should be 100°C)
- Converting 98.6°F to Celsius (should be approximately 37°C)
- Converting a negative Fahrenheit value to Celsius

Remember to:
- Follow the Given-When-Then pattern
- Use descriptive test names that explain what is being tested
- Use appropriate assertions to verify the results

## Bonus Challenge

Add additional tests to cover edge cases or interesting scenarios, such as:
- Very large temperature values
- Very small temperature values
- Testing the round-trip conversion (Celsius → Fahrenheit → Celsius)

## Example

Here's an example of what one of your tests might look like:

```kotlin
"convert Fahrenheit to Celsius where fahrenheit is 32" {
    // given
    val fahrenheit = 32.0
    
    // when
    val celsius = TemperatureConverter.toCelsius(fahrenheit)
    
    // then
    celsius shouldBe 0.0
}
```
