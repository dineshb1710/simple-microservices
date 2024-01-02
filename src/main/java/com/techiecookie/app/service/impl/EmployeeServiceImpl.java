package com.techiecookie.app.service.impl;

import com.techiecookie.app.exception.EmployeeNotFoundException;
import com.techiecookie.app.model.Employee;
import com.techiecookie.app.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public Employee save(Employee employee) {
        if (employee.getId() == null || employee.getId().isEmpty()) {
            employee.setId(UUID.randomUUID().toString());
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }

    @Override
    public Employee get(String id) {
        return employeeList.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found with id : " + id));
    }

    @Override
    public String delete(String id) {
        Employee employee = get(id);
        employeeList.remove(employee);
        return "Employee Deleted with Id : " + id;
    }
}
