# Exercise 2 - Creating Users and Roles in Spring Security

## Objective

Implement role-based authentication in a Spring Boot RESTful Web Service using Spring Security. Create two in-memory users with different roles and restrict access to the `/countries` REST endpoint based on user roles.

---

## Technologies Used

- Java 17
- Spring Boot 3.5.16
- Spring Security
- Spring Web
- Maven
- Eclipse / Spring Tool Suite (STS)
- Git Bash
- Curl

---

## Features

- Created two in-memory users:
  - **admin** with role **ADMIN**
  - **user** with role **USER**
- Configured password encryption using **BCryptPasswordEncoder**.
- Enabled HTTP Basic Authentication.
- Restricted access to the `/countries` endpoint to users with the **USER** role.
- Returned appropriate HTTP status codes for authentication and authorization.

---

## Users Configured

| Username | Password | Role |
|----------|----------|------|
| admin | pwd | ADMIN |
| user | pwd | USER |

---

## Endpoint Security

| HTTP Method | URL | Access |
|-------------|-----|--------|
| GET | `/countries` | USER Role Only |

---

## Project Structure

```
controller/
    HelloController.java
    CountryController.java

service/
    CountryService.java

security/
    SecurityConfig.java

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

## Testing

### 1. Access with Valid USER Credentials

```bash
curl -i -u user:pwd http://localhost:8083/countries
```

**Expected Result**

- HTTP Status: **200 OK**
- Returns the list of countries.

---

### 2. Access with Invalid Password

```bash
curl -i -u user:pwd1 http://localhost:8083/countries
```

**Expected Result**

- HTTP Status: **401 Unauthorized**

---

### 3. Access with ADMIN Role

```bash
curl -i -u admin:pwd http://localhost:8083/countries
```

**Expected Result**

- HTTP Status: **403 Forbidden**

The ADMIN user is authenticated successfully but is not authorized to access the `/countries` endpoint because it is restricted to the USER role.

---

### 4. View Authorization Header

```bash
curl -v -u admin:pwd http://localhost:8083/countries
```

The request displays the **Authorization** header containing Base64 encoded credentials.

Example:

```
Authorization: Basic YWRtaW46cHdk
```

---

## Observations

- Spring Security authenticates users using in-memory credentials.
- Passwords are encrypted using BCrypt.
- Role-based authorization restricts access to protected REST endpoints.
- Incorrect credentials return **401 Unauthorized**.
- Users without the required role receive **403 Forbidden**.
- HTTP Basic Authentication sends credentials in Base64 encoding, which is not secure for production environments.

---

## Files Modified

- `SecurityConfig.java`

---

## Files Reused

- `CountryController.java`
- `CountryService.java`
- `Country.java`
- `GlobalExceptionHandler.java`
- `CountryNotFoundException.java`
- `SpringLearnApplication.java`
- `application.properties`
- `country.xml`
- `SpringLearnApplicationTests.java`
- `pom.xml`

---

## Conclusion

Successfully implemented role-based authentication using Spring Security by creating in-memory users and roles. The `/countries` REST endpoint is protected so that only users with the **USER** role can access it. Authentication and authorization were verified using Curl.
