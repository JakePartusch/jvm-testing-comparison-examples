package com.mycompany.example.mocking

import com.mycompany.example.employees.Employee
import com.mycompany.example.employees.EmployeeDao
import com.mycompany.example.employees.EmployeeService
import com.mycompany.util.EmployeeUtil
import org.assertj.core.api.Assertions.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.mockito.Mockito
import org.mockito.Mockito.`when`

class MockingSpekSpec : Spek({

    describe("Employee Service") {

        val dao : EmployeeDao = mock()
        val employeeService : EmployeeService = EmployeeService(dao)

        beforeEachTest {
            `when`(dao.all).thenReturn(EmployeeUtil.employees())
        }

        describe("findEmployeeByName") {
            it("should return the correct employee") {
                val actualEmployee : Employee = employeeService.findEmployeeByName("Jake")
                assertThat(actualEmployee.jobTitle).isEqualTo("Sr. Consultant")
            }
        }
    }


})

inline fun <reified T : Any> mock(): T = Mockito.mock(T::class.java)