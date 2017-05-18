package com.mycompany.example.calculator

import org.assertj.core.api.Assertions
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.jupiter.api.Assertions.assertEquals

class CalculatorSpekSpec : Spek({

    describe("a calculator") {
        val calculator = Calculator()

        describe("addition") {
            it("should calculate the sum of two numbers") {
                val sum = calculator.add(2, 4)
                Assertions.assertThat(sum).isEqualTo(6)
            }
        }
        describe("subtraction") {
            it("should calculate the difference of two numbers") {
                val difference = calculator.subtract(4, 2)
                Assertions.assertThat(difference).isEqualTo(2)
            }
        }
    }
})
