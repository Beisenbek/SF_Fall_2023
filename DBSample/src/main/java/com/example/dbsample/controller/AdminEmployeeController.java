package com.example.dbsample.controller;

import com.example.dbsample.domain.Employee;
import com.example.dbsample.repository.EmployeeRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@Tag(description = "EmployeeController", name = "Employee")
@RequestMapping("/admin")
public class AdminEmployeeController {
    private final EmployeeRepository employeeRepository;
    @GetMapping("/employees")
    @Operation(summary = "findAll employees")
    public Iterable<Employee> findAllEmployees() {
        return this.employeeRepository.findAll();
    }

    @PostMapping("/employees")
    @Operation(summary = "add One Employee")
    public Employee addOneEmployee(@RequestBody Employee employee) {
        return this.employeeRepository.save(employee);
    }

}
