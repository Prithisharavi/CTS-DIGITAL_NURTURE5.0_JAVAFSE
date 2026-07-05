# Exercise 6 - MockMVC Test Get Country Service

## Objective

Test the REST Country Web Service using MockMVC in a Spring Boot application.

---

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Spring Test
- MockMVC
- JUnit 5
- Maven

---

## Project Description

This exercise demonstrates how to perform unit testing on REST APIs using MockMVC.

The following test cases are implemented:

- Verify that the `CountryController` is loaded successfully.
- Invoke the `/country` REST endpoint.
- Verify the HTTP response status.
- Verify the JSON response values.

---

## Test Cases

### Test Case 1

Verify that the Spring Context loads successfully.

```java
assertNotNull(countryController);
```

Expected Result

```
CountryController is loaded successfully.
```

---

### Test Case 2

Invoke

```
GET /country
```

Verify

- HTTP Status = 200 OK
- code exists
- code = "IN"
- name exists
- name = "India"

---

## REST Endpoint

```
GET http://localhost:8083/country
```

---

## Expected Response

```json
{
    "code": "IN",
    "name": "India"
}
```

---

## Files Included

```
controller/
    HelloController.java
    CountryController.java

service/
    CountryService.java

exception/
    CountryNotFoundException.java

Country.java

SpringLearnApplication.java

SpringLearnApplicationTests.java

country.xml

application.properties
```

---

## How to Run

1. Import the project into STS/Eclipse.
2. Update Maven Dependencies.
3. Run `SpringLearnApplication`.
4. Right-click `SpringLearnApplicationTests.java`.
5. Select **Run As → JUnit Test**.

---

## Test Result

```
Runs: 2
Errors: 0
Failures: 0
```

All test cases executed successfully.

---

## Screenshots

- Project Structure
- SpringLearnApplicationTests
- JUnit Success
- Console Output

---

## Output

Successfully tested the REST Country Web Service using MockMVC.

The controller was loaded successfully, and the REST endpoint returned the expected JSON response with HTTP Status **200 OK**.