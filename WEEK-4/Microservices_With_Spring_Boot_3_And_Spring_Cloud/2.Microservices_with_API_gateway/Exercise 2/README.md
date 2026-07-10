# Microservices with API Gateway

## Exercise 2 - Spring Boot 3 & Spring Cloud

### Objective
Develop two Spring Boot microservices (Account Service and Loan Service), register them with a Eureka Discovery Server, and access them through a Spring Cloud API Gateway. Implement a Global Filter to log every incoming request.

---

## Technologies Used

- Java 17
- Spring Boot 3.5.16
- Spring Cloud 2025.0.3
- Spring Web
- Spring Cloud Netflix Eureka
- Spring Cloud Gateway
- Maven
- Eclipse / Spring Tool Suite (STS)
- Postman
- Git & GitHub

---

## Project Structure

```
2.Microservices_With_API_Gateway
│
├── account
├── loan
├── eureka-discovery-server
├── api-gateway
└── Screenshots
```

---

## Modules

### 1. Account Service

**Port:** 8080

**Endpoint**

```
GET /accounts/{number}
```

Sample Response

```json
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
}
```

---

### 2. Loan Service

**Port:** 8081

**Endpoint**

```
GET /loans/{number}
```

Sample Response

```json
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```

---

### 3. Eureka Discovery Server

**Port:** 8761

Responsibilities:

- Registers all microservices
- Provides service discovery
- Displays registered services through the Eureka Dashboard

Dashboard URL

```
http://localhost:8761
```

---

### 4. API Gateway

**Port:** 9090

Responsibilities

- Routes incoming requests to the appropriate microservice.
- Uses Eureka Discovery for dynamic routing.
- Logs every incoming request using a Global Filter.

---

## Gateway URLs

### Account Service

```
http://localhost:9090/account-service/accounts/00987987973432
```

### Loan Service

```
http://localhost:9090/loan-service/loans/H00987987972342
```

---

## Global Filter

A custom `LogFilter` is implemented using Spring Cloud Gateway.

It logs every incoming request URI before forwarding the request to the respective microservice.

Example Console Output

```
Request URI : http://localhost:9090/account-service/accounts/00987987973432
```

---

## Steps Performed

- Created Account Microservice
- Created Loan Microservice
- Created Eureka Discovery Server
- Registered Account Service with Eureka
- Registered Loan Service with Eureka
- Created Spring Cloud API Gateway
- Configured Dynamic Routing
- Implemented Global Logging Filter
- Tested all APIs using Browser/Postman

---

## Output

- Account Service successfully accessed directly.
- Loan Service successfully accessed directly.
- Both services successfully registered with Eureka.
- API Gateway successfully routed requests.
- Global Filter successfully logged every request.

---

## Screenshots

Screenshots are available in the **Screenshots** folder.

They include:

- Eureka Dashboard
- Account Service Output
- Loan Service Output
- Account API through Gateway
- Loan API through Gateway
- API Gateway Console Logs

---

## Author

**Name:** Prithisha Ravi

**Organization:** Cognizant Digital Nurture Program

**Exercise:** Microservices with API Gateway