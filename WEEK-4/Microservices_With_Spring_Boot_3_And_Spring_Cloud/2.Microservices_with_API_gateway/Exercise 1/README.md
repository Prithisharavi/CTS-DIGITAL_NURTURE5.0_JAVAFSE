# Microservices with API Gateway

## Exercise 1 - Account and Loan Microservices

### Objective

Develop two independent Spring Boot microservices:

- Account Service
- Loan Service

Each microservice exposes REST APIs independently. The services run on different ports and return dummy data without any backend database connectivity.

---

## Technologies Used

- Java 17
- Spring Boot 3.5.16
- Spring Web
- Maven
- Eclipse / Spring Tool Suite (STS)
- Postman
- Git & GitHub

---

## Project Structure

```
Exercise 1
│
├── account
├── loan
└── Screenshots
```

---

## Modules

### 1. Account Service

**Port:** 8080

#### Endpoint

```
GET /accounts/{number}
```

#### Sample Request

```
http://localhost:8080/accounts/00987987973432
```

#### Sample Response

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

#### Endpoint

```
GET /loans/{number}
```

#### Sample Request

```
http://localhost:8081/loans/H00987987972342
```

#### Sample Response

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

## Features

- Created two independent Spring Boot microservices.
- Implemented REST APIs using Spring Web.
- Configured different server ports for each service.
- Returned dummy JSON responses without database connectivity.
- Tested both APIs successfully using Browser and Postman.

---

## Testing

### Account Service

```
GET http://localhost:8080/accounts/00987987973432
```

### Loan Service

```
GET http://localhost:8081/loans/H00987987972342
```

---

## Steps Performed

- Created the Account microservice using Spring Initializr.
- Implemented Account REST API.
- Created the Loan microservice using Spring Initializr.
- Configured Loan Service to run on port **8081**.
- Tested both microservices independently.
- Verified API responses using Browser/Postman.

---

## Output

- Account Service is accessible on port **8080**.
- Loan Service is accessible on port **8081**.
- Both services return the expected JSON responses successfully.

---

## Screenshots

The **Screenshots** folder contains:

- Account Service API Output
- Loan Service API Output
- Account Service Running
- Loan Service Running

---

## Author

**Name:** Prithisha Ravi

**Organization:** Cognizant Digital Nurture Program

**Exercise:** Exercise 1 - Account and Loan Microservices