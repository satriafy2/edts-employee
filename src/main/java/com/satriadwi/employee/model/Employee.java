package com.satriadwi.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "employee", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_employee")
    private Long id;

    private String name;
    private Double salary;
    
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "level_id", nullable = false)
    private EmployeeLevel level;
}
