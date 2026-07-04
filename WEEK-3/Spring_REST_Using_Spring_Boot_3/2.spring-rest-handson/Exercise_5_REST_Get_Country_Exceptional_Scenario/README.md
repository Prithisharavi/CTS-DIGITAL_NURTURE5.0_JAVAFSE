# Exercise 5 - REST Get Country Exceptional Scenario

## Objective
Handle invalid country codes in a RESTful Web Service using a custom exception and return an HTTP 404 (Not Found) response.

## Technologies Used
- Java 17
- Spring Boot 3
- Spring Web
- Spring Core (XML Configuration)
- Maven
- SLF4J Logging

## REST Endpoint

### GET /countries/{code}

#### Valid Request

GET /countries/in

Response

```json
{
  "code": "IN",
  "name": "India"
}
```

#### Invalid Request

GET /countries/az

Response

```json
{
  "status": 404,
  "error": "Not Found",
  "message": "Country not found"
}
```

## Files Used

- CountryController.java
- CountryService.java
- CountryNotFoundException.java
- Country.java
- country.xml
- application.properties

## Output

Successfully implemented exception handling using `@ResponseStatus` and returned **HTTP 404 Not Found** for invalid country codes.