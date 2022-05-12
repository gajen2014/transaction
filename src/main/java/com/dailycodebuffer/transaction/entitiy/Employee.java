package com.dailycodebuffer.transaction.entitiy;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private String empName;

    private String email;

    private Long departmentId;

}
