package com.satriadwi.employee.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.satriadwi.employee.model.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> fetchEmployees();
    Employee updateEmployee(Employee employee, Long employeeId);
    HttpStatus deleteEmployee(Long employeeId);
}
