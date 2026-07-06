# Exercise 2 - Create REST Service to Get All Employees

## Objective

Develop a RESTful Web Service that retrieves all employee details from the DAO layer through the Service layer and returns the data as a JSON response.

---

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Spring Core (XML Configuration)
- Maven
- SLF4J Logging

---

## Features

- Retrieve employee data from `EmployeeDao`.
- Implement business logic using `EmployeeService`.
- Use `@Transactional` in the service layer.
- Expose a REST endpoint using `@RestController`.
- Return employee details as JSON.

---

## REST Endpoint

### Get All Employees

**Method**

GET

**URL**

http://localhost:8083/employees

---

## Expected Response

```json
[
  {
    "id": 101,
    "name": "John",
    "salary": 65000.0,
    "permanent": true
  }
]
```

---

## Files Used

- EmployeeController.java
- EmployeeService.java
- EmployeeDao.java
- Employee.java
- Department.java
- Skill.java
- employee.xml
- application.properties

---

## Output

Successfully implemented a RESTful Web Service that retrieves all employee records and returns them as a JSON response.

---

## Screenshots

- BrowserOutput.png
- PostmanOutput.png
- ConsoleOutput.png