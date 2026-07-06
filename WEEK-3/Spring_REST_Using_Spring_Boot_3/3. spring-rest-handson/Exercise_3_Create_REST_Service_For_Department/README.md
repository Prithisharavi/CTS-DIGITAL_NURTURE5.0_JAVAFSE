# Exercise 3 - Create REST Service for Department

## Objective

Develop a RESTful Web Service that retrieves all departments from the Spring XML configuration and returns them as a JSON response.

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

- Load department data from `employee.xml`.
- Store department data in a static list using `DepartmentDao`.
- Implement the business logic in `DepartmentService`.
- Expose a REST endpoint using `DepartmentController`.
- Return department details in JSON format.

---

## REST Endpoint

### Get All Departments

**Method**

GET

**URL**

```
http://localhost:8083/departments
```

---

## Sample Response

```json
[
  {
    "id": 1,
    "name": "Information Technology"
  },
  {
    "id": 2,
    "name": "Human Resources"
  },
  {
    "id": 3,
    "name": "Finance"
  }
]
```

---

## Files Used

- DepartmentController.java
- DepartmentService.java
- DepartmentDao.java
- Department.java
- employee.xml
- application.properties

---

## Output

Successfully implemented a RESTful Web Service that returns all department details from the Spring XML configuration as a JSON response.

---

## Screenshots

- BrowserOutput.png
- PostmanOutput.png
- ConsoleOutput.png