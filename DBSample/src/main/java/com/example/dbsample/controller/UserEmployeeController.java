package com.example.dbsample.controller;

import com.example.dbsample.domain.Employee;
import com.example.dbsample.repository.EmployeeRepository;
import com.example.dbsample.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@Tag(description = "EmployeeController", name = "Employee")
@RequestMapping("/user")
public class UserEmployeeController {
    private final EmployeeService employeeService;
    @GetMapping("/employees")
    @Operation(summary = "findAll employees")
    public Page<Employee> findAllEmployees(@ParameterObject Pageable pageable) {
        return this.employeeService.findAll(pageable);
    }
}
