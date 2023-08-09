package com.satriadwi.employee.service;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.satriadwi.employee.entity.Employee;
import com.satriadwi.employee.entity.EmployeeView;
import com.satriadwi.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<EmployeeView> fetchEmployees() {
        return employeeRepository.findByDeletedAtIsNull();
        // return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee, Long employeeId) {
        // EmployeeView createdEmployee = employeeRepository.save(employee);
        return employeeRepository.save(employee);
    }

    @Override
    public HttpStatus deleteEmployee(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).get();
        if (employee == null) return HttpStatus.NOT_FOUND;

        employee.setDeletedAt(LocalTime.now());
        employeeRepository.save(employee);
        return HttpStatus.OK;
    }
}
