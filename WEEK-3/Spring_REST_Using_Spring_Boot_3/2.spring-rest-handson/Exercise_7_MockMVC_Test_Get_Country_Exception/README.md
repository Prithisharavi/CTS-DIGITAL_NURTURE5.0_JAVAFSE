# Exercise 7 - MockMVC Test Get Country Service for Exceptional Scenario

## Objective

Test the REST Country Web Service for an exceptional scenario using MockMVC.

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

## Description

This exercise verifies that the REST API returns the correct HTTP status and error message when an invalid country code is requested.

---

## Test Cases

### Test Case 1

Verify that the `CountryController` loads successfully.

### Test Case 2

Verify that `/country` returns:

- HTTP Status: **200 OK**
- Code: **IN**
- Name: **India**

### Test Case 3

Invoke:

```
GET /countries/az
```

Verify:

- HTTP Status: **404 Not Found**
- Reason: **Country not found**

---

## Files Used

- SpringLearnApplicationTests.java
- CountryController.java
- CountryService.java
- CountryNotFoundException.java
- Country.java
- country.xml
- application.properties

---

## Test Result

```
Runs : 3
Errors : 0
Failures : 0
```

All MockMVC test cases passed successfully.

---

## Screenshots

- Project Structure
- SpringLearnApplicationTests
- JUnit Success
- Console Output

---

## Output

Successfully tested the REST Country Web Service for both valid and invalid country codes using MockMVC.