package com.techiecookie.app.controller;

import com.techiecookie.app.model.Employee;
import com.techiecookie.app.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping("/all")
    public List<Employee> fetchAll() {
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        return employeeService.get(id);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable String id) {
        return employeeService.delete(id);
    }
}
