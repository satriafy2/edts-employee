package com.satriadwi.employee.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.satriadwi.employee.entity.Employee;
import com.satriadwi.employee.entity.EmployeeView;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<EmployeeView> fetchEmployees();
    Employee updateEmployee(Employee employee, Long employeeId);
    HttpStatus deleteEmployee(Long employeeId);
}
