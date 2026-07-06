# Exercise 2 - RESTful Web Service using POST Request with Validation and Global Exception Handling

## Objective

Implement a RESTful Web Service using Spring Boot that handles HTTP POST requests with request body validation and global exception handling.

---

## Technologies Used

- Java 17
- Spring Boot 3.5.16
- Spring Web
- Spring Validation
- Maven
- SLF4J Logging
- Postman
- Git Bash

---

## Features

- Create Country using HTTP POST
- Read JSON payload using `@RequestBody`
- Validate request using `@Valid`
- Validate country code using:
  - `@NotNull`
  - `@Size`
- Global Exception Handling using `@ControllerAdvice`
- Return validation errors in JSON format
- Logging using SLF4J

---

## REST API

### Add Country

**Method**

```
POST
```

**URL**

```
http://localhost:8083/countries
```

---

## Valid Request

### Request Body

```json
{
    "code":"IN",
    "name":"India"
}
```

### Response

```json
{
    "code":"IN",
    "name":"India"
}
```

---

## Invalid Request

### Request Body

```json
{
    "code":"I",
    "name":"India"
}
```

### Response

```json
{
    "timestamp":"2026-07-06T06:02:33.011+00:00",
    "status":400,
    "errors":[
        "Country code should be 2 characters"
    ]
}
```

---

## Validation

The `Country` class uses Bean Validation annotations.

```java
@NotNull(message = "Country code cannot be null")

@Size(
    min = 2,
    max = 2,
    message = "Country code should be 2 characters"
)
private String code;
```

---

## Global Exception Handler

Implemented using:

- `@ControllerAdvice`
- `ResponseEntityExceptionHandler`

It catches validation errors from all controllers and returns a structured JSON response.

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
    GlobalExceptionHandler.java

Country.java

SpringLearnApplication.java

resources/
    application.properties
    country.xml
```

---

## Files Included

- SpringLearnApplication.java
- CountryController.java
- CountryService.java
- Country.java
- CountryNotFoundException.java
- GlobalExceptionHandler.java
- country.xml
- application.properties
- pom.xml

---

## How to Run

1. Import the project into STS/Eclipse.
2. Update Maven dependencies.
3. Run `SpringLearnApplication.java`.
4. Open Postman.
5. Send a POST request to:

```
http://localhost:8083/countries
```

6. Test with:
   - Valid JSON request
   - Invalid JSON request

7. Verify the validation error response.

---

## Curl Commands

### Valid Request

```bash
curl -i -H "Content-Type: application/json" -X POST -d "{\"code\":\"IN\",\"name\":\"India\"}" http://localhost:8083/countries
```

### Invalid Request

```bash
curl -i -H "Content-Type: application/json" -X POST -d "{\"code\":\"I\",\"name\":\"India\"}" http://localhost:8083/countries
```

---

## Output

- Successfully implemented HTTP POST using Spring Boot.
- Request payload mapped to a Java Bean using `@RequestBody`.
- Bean Validation performed using `@Valid`.
- Validation errors handled globally using `@ControllerAdvice`.
- Error responses returned in JSON format with HTTP Status **400 Bad Request**.

---

## Screenshots

- ValidRequest_Postman.png
- InvalidRequest_Postman.png
- Curl_Valid_Request.png
- Curl_Invalid_Request.png
- ConsoleOutput.png