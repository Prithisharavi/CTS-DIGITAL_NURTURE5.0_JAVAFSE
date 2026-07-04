# Exercise 3 - REST Get All Countries

## Objective
Develop a RESTful Web Service using Spring Boot that returns a list of countries by loading the country list from a Spring XML configuration file.

## Technologies Used
- Java 17
- Spring Boot 3
- Spring Web
- Spring Core (XML Configuration)
- Maven
- SLF4J Logging

## REST Endpoint

### GET /countries

**URL**

http://localhost:8083/countries

**Response**

```json
[
  {
    "code": "IN",
    "name": "India"
  },
  {
    "code": "US",
    "name": "United States"
  },
  {
    "code": "JP",
    "name": "Japan"
  },
  {
    "code": "DE",
    "name": "Germany"
  }
]
```

## Files Used

- SpringLearnApplication.java
- Country.java
- CountryController.java
- country.xml
- application.properties

## Output

Successfully implemented a RESTful Web Service that returns all countries as a JSON array.