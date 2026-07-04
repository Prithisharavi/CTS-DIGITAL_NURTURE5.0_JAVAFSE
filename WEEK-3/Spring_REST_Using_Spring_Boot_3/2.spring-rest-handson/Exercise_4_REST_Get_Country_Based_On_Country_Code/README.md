# Exercise 4 - REST Get Country Based on Country Code

## Objective

Develop a RESTful Web Service using Spring Boot that returns a specific country based on the country code provided in the URL. The country code matching should be case-insensitive.

---

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Spring Core (XML Configuration)
- Maven
- SLF4J Logging

---

## REST Endpoint

### Get Country by Country Code

**Method**

```
GET
```

**URL**

```
http://localhost:8083/countries/{code}
```

### Sample Requests

```
http://localhost:8083/countries/in
```

```
http://localhost:8083/countries/IN
```

```
http://localhost:8083/countries/us
```

---

## Sample Response

```json
{
    "code": "IN",
    "name": "India"
}
```

---

## Features

- Returns a country based on the country code.
- Country code comparison is case-insensitive.
- Uses `@PathVariable` to retrieve the country code from the URL.
- Uses a Service class to separate business logic.
- Loads country data from `country.xml`.
- Returns the response in JSON format.
- Includes logging using SLF4J.

---

## Project Structure

```
src/main/java
│
├── com.cognizant.springlearn
│   ├── controller
│   │   ├── HelloController.java
│   │   └── CountryController.java
│   │
│   ├── service
│   │   └── CountryService.java
│   │
│   ├── Country.java
│   └── SpringLearnApplication.java

src/main/resources
│
├── application.properties
└── country.xml
```

---

## Files Used

- SpringLearnApplication.java
- Country.java
- CountryController.java
- CountryService.java
- country.xml
- application.properties

---

## Testing

### Browser

```
http://localhost:8083/countries/in
```

### Postman

Method:

```
GET
```

URL:

```
http://localhost:8083/countries/in
```

Expected Response:

```json
{
    "code": "IN",
    "name": "India"
}
```

---

## Output

Successfully implemented a RESTful Web Service that retrieves a country based on the country code using `@PathVariable` and a Service class. The country details are loaded from the Spring XML configuration file and returned as a JSON response.