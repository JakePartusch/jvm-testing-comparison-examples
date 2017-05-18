package com.mycompany.example.mocking

import com.mycompany.example.employees.Employee
import com.mycompany.example.employees.EmployeeDao
import com.mycompany.example.employees.EmployeeService
import spock.lang.Specification

import static com.mycompany.util.EmployeeUtil.employees

class MockingSpockSpec extends Specification {

    EmployeeDao employeeDao = Mock()

    EmployeeService employeeService

    def setup() {
        employeeService = new EmployeeService(employeeDao)
    }

    def "findEmployeeByName"() {
        given:
        String expectedJobTitle = "Sr. Consultant"

        when:
        def actualEmployee = employeeService.findEmployeeByName("Jake")

        then:
        1 * employeeDao.getAll() >> employees()
        actualEmployee.jobTitle == expectedJobTitle
    }

}
