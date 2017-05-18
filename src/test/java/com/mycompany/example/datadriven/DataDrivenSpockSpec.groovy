package com.mycompany.example.datadriven

import spock.lang.Specification

class DataDrivenSpockSpec extends Specification {

    def "data driven example"() {
        when:
        def result = Math.max(a, b)

        then:
        result == expected

        where:
        a | b | expected
        1 | 2 | 2
        7 | 3 | 7
        5 | 9 | 9
    }
}
