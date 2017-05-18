package com.mycompany.example.calculator;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("describe a calculator")
public class CalculatorJUnitTest {

    Calculator calculator = new Calculator();

    @Nested
    @DisplayName("describe addition")
    class add {

        @Test
        @DisplayName("should calculate the sum of two numbers")
        void withTwoNumbers() {
            int sum = calculator.add(2, 4);
            assertThat(sum).isEqualTo(6);
        }
    }

    @Nested
    @DisplayName("describe subtraction")
    class subtract {

        @Test
        @DisplayName("should calculate the difference of two numbers")
        void withTwoNumbers() {
            int difference = calculator.subtract(4, 2);
            assertThat(difference).isEqualTo(2);
        }
    }
}
