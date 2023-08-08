package com.satriadwi.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "employee_level", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeLevel extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_employee_level")
    private Integer id;

    private String name;

    @Column(length = 5)
    private Float bonusPercentage;
}
