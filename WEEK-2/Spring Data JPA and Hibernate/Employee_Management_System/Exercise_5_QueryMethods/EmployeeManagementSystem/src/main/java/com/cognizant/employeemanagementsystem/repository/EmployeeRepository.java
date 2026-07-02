package com.cognizant.employeemanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.employeemanagementsystem.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    List<Employee> findByName(String name);

    List<Employee> findByNameContaining(String keyword);

    List<Employee> findByEmailContaining(String keyword);

    List<Employee> findByNameStartingWith(String prefix);


    @Query("SELECT e FROM Employee e WHERE e.email LIKE %?1%")
    List<Employee> searchEmployeeByEmail(String email);

