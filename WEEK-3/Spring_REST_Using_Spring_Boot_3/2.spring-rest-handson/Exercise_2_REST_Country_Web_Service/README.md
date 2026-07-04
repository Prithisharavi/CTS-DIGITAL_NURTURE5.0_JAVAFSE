# Exercise 2 - REST Country Web Service

## Objective
Create a RESTful Web Service that returns the details of India by loading the Country bean from a Spring XML configuration file.

## Technologies Used
- Java 17
- Spring Boot 3
- Spring Web
- Spring Core (XML Configuration)
- Maven
- SLF4J Logging

## REST Endpoint

### GET /country

**URL**

http://localhost:8083/country

**Response**

```json
{
  "code": "IN",
  "name": "India"
}
```

## Files Used

- SpringLearnApplication.java
- Country.java
- CountryController.java
- country.xml
- application.properties

## Output

Successfully implemented a RESTful Web Service that returns the Country object as a JSON response by loading the bean from Spring XML.