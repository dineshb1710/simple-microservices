package com.techiecookie.app.repo;

import com.techiecookie.app.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String> {
    // Custom methods goes here..
}
