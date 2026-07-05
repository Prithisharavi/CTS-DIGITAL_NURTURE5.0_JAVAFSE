# Exercise 1 - Create Static Employee List using Spring XML Configuration

## Objective

Create a static list of employees using Spring XML configuration and expose the employee data through a RESTful Web Service.

---

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Spring Core (XML Configuration)
- Maven
- SLF4J Logging

---

## Description

This exercise demonstrates how to configure employee data using Spring XML and expose it through a RESTful Web Service.

The employee information, departments, and skills are configured in `employee.xml`. The data is loaded into the application using the DAO layer and returned through a REST API.

---

## Features

- Create Department beans.
- Create Skill beans.
- Create multiple Employee beans.
- Store all employees in an ArrayList using Spring XML.
- Load employee data through `EmployeeDao`.
- Implement a Service layer.
- Expose employee details through a REST Controller.
- Return employee data in JSON format.

---

## REST Endpoint

### Get All Employees

**Method**

```
GET
```

**URL**

```
http://localhost:8083/employees
```

---

## Sample Response

```json
[
  {
    "id": 101,
    "name": "John",
    "salary": 65000.0,
    "permanent": true,
    "department": {
      "id": 1,
      "name": "Information Technology"
    },
    "skills": [
      {
        "id": 1,
        "name": "Java"
      },
      {
        "id": 2,
        "name": "Spring Boot"
      }
    ]
  }
]
```

---

## Project Structure

```
src/main/java
│
├── controller
│   └── EmployeeController.java
│
├── dao
│   └── EmployeeDao.java
│
├── model
│   ├── Department.java
│   ├── Employee.java
│   └── Skill.java
│
├── service
│   └── EmployeeService.java
│
└── EmployeeManagementApplication.java

src/main/resources
│
├── application.properties
└── employee.xml
```

---

## Files Included

- EmployeeManagementApplication.java
- EmployeeController.java
- EmployeeService.java
- EmployeeDao.java
- Employee.java
- Department.java
- Skill.java
- employee.xml
- application.properties

---

## How to Run

1. Import the project into STS/Eclipse.
2. Update Maven Dependencies.
3. Run `EmployeeManagementApplication.java`.
4. Open the browser or Postman.
5. Send a GET request to:

```
http://localhost:8083/employees
```

---

## Output

The application successfully loads employee data from the Spring XML configuration file and returns the employee list as a JSON response through the REST API.

---

## Screenshots

- ProjectStructure.png
- EmployeeXml.png
- EmployeeDao.png
- EmployeeService.png
- EmployeeController.png
- BrowserOutput.png
- PostmanOutput.png
- ConsoleOutput.png