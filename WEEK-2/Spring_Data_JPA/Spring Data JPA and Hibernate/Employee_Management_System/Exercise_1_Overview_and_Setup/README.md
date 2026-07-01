# Exercise 1 - Employee Management System (Overview & Setup)

## Objective

Create a Spring Boot project and configure an H2 in-memory database.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Spring Web
- Lombok
- Maven

## Dependencies

- Spring Web
- Spring Data JPA
- H2 Database
- Lombok

## application.properties

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update

spring.h2.console.enabled=true
```

## Output

- Spring Boot application started successfully.
- Connected successfully to the H2 database.
- H2 Console accessible at:

```
http://localhost:8080/h2-console
```

## Conclusion

Successfully created and configured the Employee Management System using Spring Boot and H2 Database.