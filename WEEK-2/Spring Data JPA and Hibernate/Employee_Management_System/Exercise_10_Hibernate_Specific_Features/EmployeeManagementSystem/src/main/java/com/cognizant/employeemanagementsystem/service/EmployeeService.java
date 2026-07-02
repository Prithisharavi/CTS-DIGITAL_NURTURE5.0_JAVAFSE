package com.cognizant.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cognizant.employeemanagementsystem.dto.EmployeeDTO;
import com.cognizant.employeemanagementsystem.entity.Employee;
import com.cognizant.employeemanagementsystem.projection.EmployeeProjection;
import com.cognizant.employeemanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public List<Employee> searchByName(String name) {
        return employeeRepository.findByName(name);
    }

    public List<Employee> searchByNameContaining(String keyword) {
        return employeeRepository.findByNameContaining(keyword);
    }

    public List<Employee> searchByNameStartingWith(String prefix) {
        return employeeRepository.findByNameStartingWith(prefix);
    }

    public List<Employee> searchByEmailContaining(String keyword) {
        return employeeRepository.findByEmailContaining(keyword);
    }

    public List<Employee> searchEmployeeByEmail(String email) {
        return employeeRepository.searchEmployeeByEmail(email);
    }

    // ==========================
    // Exercise 6 - Pagination
    // ==========================

    public Page<Employee> getEmployeesByPage(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return employeeRepository.findAll(pageable);
    }

    public List<Employee> getEmployeesSorted(String field) {
        return employeeRepository.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    public Page<Employee> getEmployeesByPageAndSort(int page, int size, String field) {

        Pageable pageable = PageRequest.of(
                page,
                size,
                Sort.by(Sort.Direction.ASC, field));

        return employeeRepository.findAll(pageable);
    }

    public List<EmployeeProjection> getAllEmployeeProjection() {
        return employeeRepository.findAllProjectedBy();
    }

    public List<EmployeeDTO> getAllEmployeeDTO() {
        return employeeRepository.getAllEmployeeDTO();
    }


    public List<Employee> saveEmployees(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }

}