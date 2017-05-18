package com.mycompany.example.employees;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {

    private final EmployeeDao dao;

    @Autowired
    public EmployeeService(EmployeeDao dao) {
        this.dao = dao;
    }

    public Employee findEmployeeByName(String name) {
        return dao.getAll()
                    .stream()
                    .filter(employee -> employee.getName().equalsIgnoreCase(name))
                    .findAny()
                    .orElse(null);
    }
}
