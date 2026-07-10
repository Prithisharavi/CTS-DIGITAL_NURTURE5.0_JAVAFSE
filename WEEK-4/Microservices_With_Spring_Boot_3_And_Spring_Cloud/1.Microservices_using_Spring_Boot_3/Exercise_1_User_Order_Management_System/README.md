# User and Order Management System

## Exercise 1 - Spring Boot 3 Microservices

### Objective

Develop two Spring Boot microservices:

- User Service
- Order Service

The Order Service communicates with the User Service using **Spring WebClient** to retrieve user details. Both services expose REST APIs and demonstrate basic microservice communication.

---

## Technologies Used

- Java 17
- Spring Boot 3.5.16
- Spring Web
- Spring WebFlux (WebClient)
- Maven
- Eclipse / Spring Tool Suite (STS)
- Postman
- Git & GitHub

---

## Project Structure

```
Exercise_1_User_Order_Management_System
│
├── user-service
├── order-service
└── Screenshots
```

---

## Modules

### 1. User Service

**Port:** 8081

**Endpoint**

```
GET /users/{id}
```

Sample Request

```
http://localhost:8081/users/1
```

Sample Response

```json
{
  "id": 1,
  "name": "Prithisha",
  "email": "prithisha@gmail.com",
  "phone": "9876543210"
}
```

---

### 2. Order Service

**Port:** 8082

**Endpoint**

```
GET /orders/{id}/user
```

Sample Request

```
http://localhost:8082/orders/101/user
```

Sample Response

```json
{
  "orderId": 101,
  "productName": "Laptop",
  "quantity": 1,
  "price": 55000.0,
  "user": {
    "id": 1,
    "name": "Prithisha",
    "email": "prithisha@gmail.com",
    "phone": "9876543210"
  }
}
```

---

## Features

- Developed two independent Spring Boot microservices.
- Implemented REST APIs.
- Used Spring WebClient for inter-service communication.
- Retrieved user information from the User Service inside the Order Service.
- Tested APIs successfully using Postman.

---

## Testing

### User Service

```
GET http://localhost:8081/users/1
```

### Order Service

```
GET http://localhost:8082/orders/101/user
```

---

## Steps Performed

- Created User Service using Spring Initializr.
- Implemented User REST API.
- Created Order Service using Spring Initializr.
- Configured Spring WebClient.
- Called User Service from Order Service.
- Returned combined Order and User response.
- Tested both services successfully using Postman.

---

## Output

- User Service returns user details successfully.
- Order Service successfully communicates with User Service.
- Combined Order and User information is returned as a single JSON response.

---

## Screenshots

Screenshots are available in the **Screenshots** folder.

They include:

- User Service API Output
- Order Service API Output
- Combined Response in Postman
- Application Running in STS

---

## Author

**Name:** Prithisha Ravi

**Organization:** Cognizant Digital Nurture Program

**Exercise:** User and Order Management System (Spring Boot 3 Microservices)