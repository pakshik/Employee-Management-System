package com.demo.employeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.employee;

@Repository
public interface employeeRepo extends JpaRepository<employee , Integer> {

}
