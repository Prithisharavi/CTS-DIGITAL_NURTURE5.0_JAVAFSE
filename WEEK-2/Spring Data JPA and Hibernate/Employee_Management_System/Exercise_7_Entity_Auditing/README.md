# Exercise 7 - Entity Auditing

## Objective
Implement JPA Auditing to automatically track entity creation and modification.

## Technologies Used
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven

## Features Implemented
- @CreatedDate
- @LastModifiedDate
- @CreatedBy
- @LastModifiedBy
- @EnableJpaAuditing
- AuditorAware Implementation

## Output
- Successfully audited Employee and Department entities.
- Audit fields are automatically populated when records are created or updated.