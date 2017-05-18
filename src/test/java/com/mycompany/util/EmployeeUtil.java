package com.mycompany.util;

import com.mycompany.example.employees.Employee;

import java.util.List;

import static java.util.Arrays.asList;

public class EmployeeUtil {

    public static List<Employee> employees() {
        return asList(new Employee("Jake", "Sr. Consultant"),
                        new Employee("Jane", "CEO"),
                        new Employee("John", "HR"));
    }
}
