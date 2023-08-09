package com.satriadwi.employee.entity;

public interface EmployeeView {
    Long getId();
    String getName();
    Double getSalary();
    EmployeeLevelView getLevel();
}
