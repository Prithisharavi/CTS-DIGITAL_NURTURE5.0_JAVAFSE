# Exercise 6 - Find Country by Code using Spring Data JPA

## Objective

Implement a service to retrieve a country based on its country code using Spring Data JPA. If the specified country code does not exist, a custom exception (`CountryNotFoundException`) is thrown.

---

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

---

## Project Structure

```
src
└── main
    ├── java
    │   └── com.cognizant.ormlearn
    │       ├── model
    │       │   └── Country.java
    │       ├── repository
    │       │   └── CountryRepository.java
    │       ├── service
    │       │   ├── CountryService.java
    │       │   └── exception
    │       │       └── CountryNotFoundException.java
    │       └── OrmLearnApplication.java
    └── resources
        └── application.properties
```

---

## Features Implemented

- Find a country using its country code.
- Uses Spring Data JPA `findById()` method.
- Implements a custom exception (`CountryNotFoundException`) when the country is not found.
- Uses `@Transactional` for transaction management.

---

## Files Created / Modified

### New File
- CountryNotFoundException.java

### Modified Files
- CountryService.java
- OrmLearnApplication.java

---

## Methods Implemented

### CountryService

```java
findCountryByCode(String countryCode)
```

### OrmLearnApplication

```java
getAllCountriesTest()
```

---

## Expected Output

```
Start

Country=Country [code=IN, name=India Updated]

End
```

If an invalid country code is provided:

```
Start

Country Not Found

End
```

---

## Conclusion

The application successfully retrieves country details based on the country code using Spring Data JPA. A custom exception is thrown when the requested country is unavailable, demonstrating proper exception handling in the service layer.