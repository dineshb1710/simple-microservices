package com.techiecookie.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tbl_employee")
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
}
