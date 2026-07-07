# Exercise 4 - Generate Token Based on User

## Objective

Generate a JSON Web Token (JWT) for the authenticated user and return it as a JSON response from the authentication service.

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

- Read the authenticated username.
- Generate JWT token.
- Return JWT as JSON response.
- Use JJWT library for token generation.

---

## REST Endpoint

### Authenticate User

**Method**

GET

**URL**

```
http://localhost:8080/authenticate
```

---

## Curl Command

```bash
curl -s -u user:pwd http://localhost:8080/authenticate
```

---

## Response

```json
{
    "token":"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiaWF0IjoxNzgzNDQwNzM0LCJleHAiOjE3ODM0NDE5MzR9.PwrY_RLxSNVxGC-PcelMvuQRMKO3CQhE7kDiT5Ba-VM"
}
```

---

## Files Added

- AuthenticationResponse.java
- JwtUtil.java

---

## Files Modified

- AuthenticationController.java

---

## Output

The authentication service successfully generates a JWT token for the authenticated user and returns it as a JSON response. The generated token will be used in the next exercise for JWT authorization.