package com.cognizant.employeemanagementsystem.projection;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeProjection {

    String getName();

    String getEmail();

    @Value("#{target.name + ' - ' + target.email}")
    String getFullName();

}