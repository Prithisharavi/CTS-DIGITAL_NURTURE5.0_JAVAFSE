# Exercise 1 - RESTful Web Service using HTTP Methods (GET, POST, PUT, DELETE)

## Objective

Implement RESTful Web Services using Spring Boot that demonstrate all HTTP request methods (GET, POST, PUT, DELETE) following REST resource naming conventions.

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

This exercise demonstrates the implementation of RESTful Web Services using the four major HTTP methods:

- GET
- POST
- PUT
- DELETE

The application manages country information stored in Spring XML configuration and exposes REST APIs to retrieve, create, update, and delete country data.

---

## REST API Endpoints

| HTTP Method | URL | Description |
|-------------|-----|-------------|
| GET | `/countries` | Retrieve all countries |
| GET | `/countries/{code}` | Retrieve a country by code |
| POST | `/countries` | Create a new country |
| PUT | `/countries` | Update an existing country |
| DELETE | `/countries/{code}` | Delete a country by code |

---

## Sample Requests and Responses

### 1. Get All Countries

**Request**

```
GET http://localhost:8083/countries
```

**Response**

```json
[
  {
    "code": "IN",
    "name": "India"
  },
  {
    "code": "US",
    "name": "United States"
  }
]
```

---

### 2. Get Country by Code

**Request**

```
GET http://localhost:8083/countries/IN
```

**Response**

```json
{
  "code": "IN",
  "name": "India"
}
```

---

### 3. Add Country

**Request**

```
POST http://localhost:8083/countries
```

**Body**

```json
{
    "code":"FR",
    "name":"France"
}
```

**Response**

```json
{
    "code":"FR",
    "name":"France"
}
```

---

### 4. Update Country

**Request**

```
PUT http://localhost:8083/countries
```

**Body**

```json
{
    "code":"IN",
    "name":"Bharat"
}
```

**Response**

```json
{
    "code":"IN",
    "name":"Bharat"
}
```

---

### 5. Delete Country

**Request**

```
DELETE http://localhost:8083/countries/FR
```

**Response**

```
Country deleted successfully
```

---

## Project Structure

```
controller/
    CountryController.java
    HelloController.java

service/
    CountryService.java

exception/
    CountryNotFoundException.java

Country.java

SpringLearnApplication.java

resources/
    application.properties
    country.xml
```

---

## Features

- RESTful URL naming conventions
- GET service to retrieve country details
- POST service to create a new country
- PUT service to update an existing country
- DELETE service to remove a country
- JSON Request and Response handling
- Spring XML configuration
- Exception handling for invalid country codes
- Logging using SLF4J

---

## How to Run

1. Import the project into STS/Eclipse.
2. Update Maven dependencies.
3. Run `SpringLearnApplication.java`.
4. Open Postman.
5. Test all the REST endpoints using the URLs mentioned above.

---

## Files Used

- SpringLearnApplication.java
- CountryController.java
- CountryService.java
- Country.java
- CountryNotFoundException.java
- country.xml
- application.properties
- pom.xml

---

## Output

Successfully implemented RESTful Web Services using Spring Boot with support for all HTTP methods (GET, POST, PUT, DELETE). The APIs were tested using Postman and returned the expected JSON responses.

---

## Screenshots

- GetAllCountries_Postman.png
- GetCountry_Postman.png
- AddCountry_Postman.png
- UpdateCountry_Postman.png
- DeleteCountry_Postman.png
- ConsoleOutput.png