package com.mycompany.example.calculator

import spock.lang.Specification

class CalculatorSpockSpec extends Specification {

    Calculator example = new Calculator()

    def "describe addition"() {
        when:
        def result = example.add(2, 4)

        then:
        result == 6
    }

    def "describe subtraction"() {
        when:
        def result = example.subtract(4, 2)

        then:
        result == 2
    }
}