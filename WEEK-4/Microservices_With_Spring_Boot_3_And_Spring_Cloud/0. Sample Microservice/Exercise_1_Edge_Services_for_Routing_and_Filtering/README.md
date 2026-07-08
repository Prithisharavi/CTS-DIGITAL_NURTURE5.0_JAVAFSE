# Exercise 1 - Implementing Edge Services for Routing and Filtering

## Objective

Implement an Edge Service using Spring Boot 3 and Spring Cloud Gateway to route client requests and log incoming requests using a custom Global Filter.

---

## Technologies Used

- Java 17
- Spring Boot 3.5.x
- Spring Cloud Gateway
- Spring WebFlux
- Maven

---

## Features

- Configured API Gateway routing.
- Implemented a custom Global Filter.
- Logged request URI and HTTP method.
- Routed requests to the target service.

---

## Route Configuration

```
http://localhost:8080/example/**
```

Routes to:

```
https://example.org
```

---

## Testing

### Browser

```
http://localhost:8080/example/test
```

### Git Bash

```bash
curl http://localhost:8080/example/test
```

---

## Console Output

```
Incoming Request
URI : http://localhost:8080/example/test
Method : GET
```

---

## Files Created

- LoggingFilter.java

## Files Modified

- pom.xml
- application.properties

---

## Result

Successfully implemented an API Gateway with request routing and a custom logging filter using Spring Boot 3 and Spring Cloud Gateway.