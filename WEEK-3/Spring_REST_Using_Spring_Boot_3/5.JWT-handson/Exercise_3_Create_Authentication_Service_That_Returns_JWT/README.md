# Exercise 3 - Create Authentication Service That Returns JWT

## Objective

Create a RESTful authentication service that accepts user credentials using HTTP Basic Authentication and returns a JSON Web Token (JWT). The generated JWT can be used in subsequent requests instead of sending the username and password repeatedly.

---

## Technologies Used

- Java 17
- Spring Boot 3.5.16
- Spring Security
- JJWT 0.11.5
- Maven
- Eclipse / STS
- Git Bash
- Curl

---

## Features

- Created an Authentication REST Controller.
- Implemented `/authenticate` endpoint.
- Read Authorization header.
- Decoded Base64 encoded credentials.
- Extracted username and password.
- Generated JWT token.
- Returned JWT token as JSON response.

---

## REST Endpoint

### Authenticate User

**Method**

GET

**URL**

```
http://localhost:8083/authenticate
```

---

## Testing

### Curl Command

```bash
curl -s -u user:pwd http://localhost:8083/authenticate
```

### Response

```json
{
    "token":"eyJhbGciOiJIUzI1NiJ9..."
}
```

---

## Project Structure

```
controller/
    AuthenticationController.java
    CountryController.java
    HelloController.java

model/
    AuthenticationResponse.java

security/
    SecurityConfig.java

service/
    CountryService.java

util/
    JwtUtil.java

exception/
    CountryNotFoundException.java
    GlobalExceptionHandler.java

Country.java

SpringLearnApplication.java
```

---

## Files Added

- AuthenticationController.java
- AuthenticationResponse.java
- JwtUtil.java

---

## Files Modified

- SecurityConfig.java
- pom.xml

---

## Output

Successfully implemented an authentication REST service that generates and returns a JWT token after validating user credentials using HTTP Basic Authentication.