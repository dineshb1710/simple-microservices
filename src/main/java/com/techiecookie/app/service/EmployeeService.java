package com.techiecookie.app.service;

import com.techiecookie.app.model.Employee;

import java.util.List;


public interface EmployeeService {
    Employee save(Employee employee);

    List<Employee> getAll();

    Employee get(String id);

    String delete(String id);
}
