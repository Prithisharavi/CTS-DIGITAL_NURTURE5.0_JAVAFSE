# HandsOn 1 - Spring Data JPA Query Methods

## Objective

To demonstrate the implementation of Query Methods in Spring Data JPA using the Country entity.

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Eclipse / Spring Tool Suite (STS)

---

## Project Structure

```
orm-learn
│
├── src/main/java
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
│
├── src/main/resources
│   └── application.properties
│
└── pom.xml
```

---

## Query Methods Implemented

### 1. Find Country by Code

```java
Country findByCode(String code);
```

### 2. Search Country by Name (Containing)

```java
List<Country> findByNameContainingIgnoreCase(String text);
```

### 3. Search Country by Name (Starting With)

```java
List<Country> findByNameStartingWithIgnoreCase(String text);
```

### 4. Sort Countries by Name

```java
List<Country> findAllByOrderByNameAsc();
```

---

## Service Methods

- getAllCountries()
- findCountryByCode()
- searchCountries()
- searchCountriesStartingWith()
- getCountriesSorted()

---

## Test Cases Executed

### Search by Containing

```
Input : Ind

Output :
India
Indonesia
British Indian Ocean Territory
```

---

### Search by Starting With

```
Input : A

Output :
Afghanistan
Albania
Algeria
American Samoa
Andorra
Angola
Argentina
Australia
Austria
...
```

---

### Sort Countries

```
Countries displayed in alphabetical order.
```

---

## Expected Output

```
Start

Countries=[Country [code=IN, name=India],
Country [code=ID, name=Indonesia],
Country [code=IO, name=British Indian Ocean Territory]]

End

Start

Countries=[Country [code=AF, name=Afghanistan],
Country [code=AL, name=Albania],
Country [code=DZ, name=Algeria],
...]

End

Start

Countries=[Country [code=AF, name=Afghanistan],
...
Country [code=ZW, name=Zimbabwe]]

End
```

---

## Conclusion

Successfully implemented Spring Data JPA Query Methods to:

- Search countries using partial text
- Search countries using starting characters
- Retrieve countries in sorted order

The application was tested successfully using the MySQL database and Spring Boot.