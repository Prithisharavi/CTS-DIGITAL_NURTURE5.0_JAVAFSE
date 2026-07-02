package com.cognizant.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.cognizant.employeemanagementsystem.dto.EmployeeDTO;
import com.cognizant.employeemanagementsystem.entity.Employee;
import com.cognizant.employeemanagementsystem.projection.EmployeeProjection;
import com.cognizant.employeemanagementsystem.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id,
                                   @RequestBody Employee employee) {

        Employee existingEmployee = employeeService.getEmployee(id);

        if (existingEmployee != null) {
            existingEmployee.setName(employee.getName());
            existingEmployee.setEmail(employee.getEmail());
            existingEmployee.setDepartment(employee.getDepartment());

            return employeeService.saveEmployee(existingEmployee);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "Employee Deleted Successfully";
    }

    @GetMapping("/search/name/{name}")
    public List<Employee> searchByName(@PathVariable String name) {
        return employeeService.searchByName(name);
    }

    @GetMapping("/search/contains/{keyword}")
    public List<Employee> searchByNameContaining(@PathVariable String keyword) {
        return employeeService.searchByNameContaining(keyword);
    }

    @GetMapping("/search/starts/{prefix}")
    public List<Employee> searchByNameStartingWith(@PathVariable String prefix) {
        return employeeService.searchByNameStartingWith(prefix);
    }

    @GetMapping("/search/emailcontains/{keyword}")
    public List<Employee> searchByEmailContaining(@PathVariable String keyword) {
        return employeeService.searchByEmailContaining(keyword);
    }

    @GetMapping("/search/email/{email}")
    public List<Employee> searchEmployeeByEmail(@PathVariable String email) {
        return employeeService.searchEmployeeByEmail(email);
    }


    @GetMapping("/page")
    public Page<Employee> getEmployeesByPage(
            @RequestParam int page,
            @RequestParam int size) {

        return employeeService.getEmployeesByPage(page, size);
    }

    @GetMapping("/sort")
    public List<Employee> getEmployeesSorted(
            @RequestParam String field) {

        return employeeService.getEmployeesSorted(field);
    }

    @GetMapping("/page-sort")
    public Page<Employee> getEmployeesByPageAndSort(
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String field) {

        return employeeService.getEmployeesByPageAndSort(page, size, field);
    }

    @GetMapping("/projection")
    public List<EmployeeProjection> getEmployeeProjection() {
        return employeeService.getAllEmployeeProjection();
    }

    @GetMapping("/dto")
    public List<EmployeeDTO> getEmployeeDTO() {
        return employeeService.getAllEmployeeDTO();
    }

    @PostMapping("/batch")
    public String saveEmployees(@RequestBody List<Employee> employees) {

        employeeService.saveEmployees(employees);

        return "Employees Saved Successfully";

    }

}