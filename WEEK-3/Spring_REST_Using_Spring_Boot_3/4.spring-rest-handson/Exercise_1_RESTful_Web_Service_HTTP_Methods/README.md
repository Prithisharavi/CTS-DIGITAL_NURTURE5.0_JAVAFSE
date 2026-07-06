# Exercise 1 - REST Resource Naming Convention

## Objective

Modify the existing Country REST API to follow standard RESTful resource naming conventions.

---

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Maven
- SLF4J Logging

---

## REST Endpoints

### Get All Countries

GET /countries

### Get Country By Code

GET /countries/{code}

---

## Features

- REST resource naming based on HTTP methods.
- Class-level `@RequestMapping("/countries")`.
- `@GetMapping` for retrieving all countries.
- `@GetMapping("/{code}")` for retrieving a specific country.
- Returns JSON responses.

---

## Files Used

- CountryController.java
- CountryService.java
- Country.java
- country.xml

---

## Output

Successfully modified the Country REST API to follow RESTful URL naming conventions.