# Exercise 2 - Inventory Management System with Service Discovery

## Objective

Develop an Inventory Management System using Spring Boot Microservices with Service Discovery and Centralized Configuration.

## Modules

- Product Service
- Inventory Service
- Eureka Discovery Server
- Spring Cloud Config Server

## Technologies Used

- Java 17
- Spring Boot 3.5.16
- Spring Cloud 2025.0.3
- Spring Web
- Eureka Discovery Server
- Spring Cloud Config Server
- Maven
- GitHub

## Features

- Product Service manages product information.
- Inventory Service manages stock details.
- Eureka Server performs service registration and discovery.
- Config Server provides centralized configuration from GitHub.
- Both services are registered with Eureka.
- Configuration files are maintained in a GitHub Config Repository.

## APIs

### Product Service

GET /products/{id}

Example:

http://localhost:8081/products/1

### Inventory Service

GET /inventory/{id}

Example:

http://localhost:8082/inventory/1

## Eureka Dashboard

http://localhost:8761

## Config Server

http://localhost:8888/product-service/default

## Project Structure

Exercise 2
- product-service
- inventory-service
- eureka-discovery-server
- config-server
- Screenshots

## Outcome

Successfully implemented Inventory Management System using Spring Boot Microservices with Eureka Discovery Server and Spring Cloud Config Server.