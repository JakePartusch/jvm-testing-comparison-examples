package com.mycompany.example.datadriven

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.data_driven.data
import org.jetbrains.spek.data_driven.on
import org.junit.jupiter.api.Assertions

class DataDrivenSpekSpec : Spek({

    describe("data driven example") {
        val data = arrayOf(
                data(4, 2, expected = 4),
                data(1, 3, expected = 3),
                data(5, 7, expected = 7)
        )
        on("max of %s and %s", with = *data) { a, b, expected ->

            it("returns $expected") {
                Assertions.assertEquals(expected, Math.max(a, b))
            }
        }
    }
})
