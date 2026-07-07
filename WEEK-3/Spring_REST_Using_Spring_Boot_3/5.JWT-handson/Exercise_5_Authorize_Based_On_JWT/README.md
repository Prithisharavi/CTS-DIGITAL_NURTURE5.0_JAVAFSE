# Exercise 5 - Authorize Based on JWT

## Objective

Implement JWT authorization for RESTful web services using Spring Security. Authenticate users, generate JWT tokens, and authorize protected REST endpoints using a custom JWT authorization filter.

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

- Created JWT Authorization Filter.
- Validated JWT from Authorization header.
- Configured Spring Security to use JWT filter.
- Protected REST endpoints.
- Generated JWT token.
- Authorized requests using Bearer Token.

---

## REST APIs

### Generate JWT Token

GET

```
http://localhost:8080/authenticate
```

### Access Protected Resource

GET

```
http://localhost:8080/countries
```

---

## Testing

### Generate Token

```bash
curl -s -u user:pwd http://localhost:8080/authenticate
```

### Access Protected API

```bash
curl -s -H "Authorization: Bearer YOUR_TOKEN" http://localhost:8080/countries
```

### Test Invalid Token

```bash
curl -s -H "Authorization: Bearer INVALID_TOKEN" http://localhost:8080/countries
```

Expected Response

```
401 Unauthorized
```

---

## Files Added

- JwtAuthorizationFilter.java

---

## Files Modified

- SecurityConfig.java
- JwtUtil.java
- AuthenticationController.java

---

## Output

Successfully implemented JWT-based authorization using Spring Security. The application validates Bearer Tokens before allowing access to protected REST APIs.