package com.springbootdemo.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Employee {

    int empId;
    String empName;
    String empDept;

    public Employee(String empName, String empDept) {
        this.setEmpName(empName);
        this.setEmpDept(empDept);
    }

}
