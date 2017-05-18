package com.mycompany.example.datadriven;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;

public class DataDrivenJUnitTest {

    @ParameterizedTest(name = "{index} ==> max of {0} and {1} is {2}")
    @CsvSource({ "1, 2, 2", "3, 7, 7", "9, 5, 9" })
    void testWithCsvSource(int a, int b, int expected) {
        Assertions.assertThat(Math.max(a, b)).isEqualTo(expected);
    }

    @Test
    void someOtherTestBecauseIntellijDoesntRecognizeParameterizedTestAnnotation() {

    }
}
