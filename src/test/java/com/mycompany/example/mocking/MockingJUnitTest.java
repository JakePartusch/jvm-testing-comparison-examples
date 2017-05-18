package com.mycompany.example.mocking;

import com.mycompany.example.employees.Employee;
import com.mycompany.example.employees.EmployeeDao;
import com.mycompany.example.employees.EmployeeService;
import com.mycompany.util.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static com.mycompany.util.EmployeeUtil.employees;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MockingJUnitTest {

    EmployeeService employeeService;

    @BeforeEach
    void init(@Mock EmployeeDao dao) {
        when(dao.getAll()).thenReturn(employees());
        employeeService = new EmployeeService(dao);
    }

    @Test
    @DisplayName("find employee by name returns employee with matching name")
    void findEmployeeByName() {
        Employee employee = employeeService.findEmployeeByName("Jake");
        assertThat(employee.getJobTitle()).isEqualTo("Sr. Consultant");
    }

}
