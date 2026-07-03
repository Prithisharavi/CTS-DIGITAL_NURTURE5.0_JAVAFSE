# Exercise 6 - Spring Core: Load List of Countries from Spring Configuration XML

## Objective
Load multiple Country beans from a Spring XML configuration file and retrieve them as a list using the Spring IoC Container.

## Technologies Used
- Java 17
- Spring Boot 3
- Spring Core
- Maven
- SLF4J Logging

## Features Implemented
- Spring XML Configuration
- Bean Definition
- Setter Injection
- List Collection Injection
- Bean References using `<ref>`
- ApplicationContext
- ClassPathXmlApplicationContext
- Logging using SLF4J

## Files Used
- SpringLearnApplication.java
- Country.java
- country.xml
- date-format.xml
- application.properties

## Bean Configuration

Configured four Country beans:

- India (IN)
- United States (US)
- Germany (DE)
- Japan (JP)

Configured a Country List using:

- `<list>`
- `<ref>`
- `<constructor-arg>`

## Methods Implemented

- displayDate()
- displayCountry()
- displayCountries()

## Output

Successfully loaded the list of countries from the Spring XML configuration file and displayed the country details using debug logging.

## Learning Outcomes

- Spring IoC Container
- XML Bean Configuration
- Collection Injection
- Bean References
- Logging in Spring Boot