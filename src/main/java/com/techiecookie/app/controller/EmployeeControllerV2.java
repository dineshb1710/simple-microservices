package com.techiecookie.app.controller;

import com.techiecookie.app.model.Employee;
import com.techiecookie.app.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/employee")
@RequiredArgsConstructor
public class EmployeeControllerV2 {

    private final EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employee;
    }

}
