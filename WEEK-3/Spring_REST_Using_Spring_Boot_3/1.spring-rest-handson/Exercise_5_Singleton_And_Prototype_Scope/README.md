# Exercise 5 - Spring Core: Demonstration of Singleton Scope and Prototype Scope

## Objective
Demonstrate the Singleton and Prototype bean scopes in Spring using XML-based bean configuration.

## Technologies Used
- Java 17
- Spring Boot 3
- Spring Core
- Maven
- SLF4J Logging

## Features Implemented
- Spring XML Bean Configuration
- Singleton Scope
- Prototype Scope
- Bean Creation using Spring IoC Container
- ApplicationContext
- ClassPathXmlApplicationContext
- Logging using SLF4J

## Files Used
- SpringLearnApplication.java
- Country.java
- country.xml
- date-format.xml
- application.properties

## Methods Implemented

- displayDate()
- displayCountry()

## Scope Demonstration

### Singleton Scope
- Default scope in Spring.
- Only one instance of the Country bean is created.
- Multiple calls to `getBean()` return the same object.
- Constructor is invoked only once.

### Prototype Scope
- A new instance of the Country bean is created for every `getBean()` call.
- Constructor is invoked each time a new object is requested.

## Output

- Successfully demonstrated Singleton Scope.
- Successfully demonstrated Prototype Scope.
- Verified bean creation through constructor logging.

## Learning Outcomes

- Spring IoC Container
- XML Bean Configuration
- Singleton Bean Scope
- Prototype Bean Scope
- Bean Lifecycle
- Logging using SLF4J