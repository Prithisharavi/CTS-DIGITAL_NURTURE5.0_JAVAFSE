# 📘 Exercise 2: Difference between JPA, Hibernate and Spring Data JPA

## 🎯 Objective

Understand the differences between **JPA**, **Hibernate**, and **Spring Data JPA**, and how they work together in Java applications.

---

# 🏗️ Technology Stack

| Technology | Purpose |
|------------|---------|
| ☕ Java | Programming Language |
| 🌱 Spring Boot | Application Framework |
| 🗄️ Spring Data JPA | Simplifies database operations |
| 🔄 Hibernate | ORM Framework |
| 💾 MySQL | Database |

---

# 📌 What is JPA?

> **JPA (Java Persistence API)** is a Java Specification (JSR 338) that defines standards for Object Relational Mapping (ORM).

### Features

- ✅ Java Specification
- ✅ Defines ORM standards
- ✅ No implementation
- ✅ Requires an implementation like Hibernate

---

# 📌 What is Hibernate?

> **Hibernate** is an ORM Framework that implements the JPA specification.

### Features

- ✅ Implements JPA
- ✅ Maps Java Objects to Database Tables
- ✅ Performs CRUD Operations
- ✅ Handles SQL Generation Automatically

---

# 📌 What is Spring Data JPA?

> **Spring Data JPA** is a Spring Framework module built on top of JPA.

### Features

- ✅ Built on top of JPA
- ✅ Uses Hibernate internally
- ✅ Reduces Boilerplate Code
- ✅ Provides Repository Interfaces
- ✅ Supports Transaction Management

---

# 📊 Comparison Table

| Feature | JPA | Hibernate | Spring Data JPA |
|----------|-----|-----------|-----------------|
| Type | Specification | ORM Framework | Spring Module |
| Purpose | Defines ORM Standards | Implements JPA | Simplifies JPA |
| Implementation | ❌ No | ✅ Yes | Uses Hibernate |
| CRUD Support | Through Provider | ✅ Yes | ✅ Simplified |
| Repository Support | ❌ No | ❌ No | ✅ JpaRepository |
| Transaction Management | Limited | Manual | Automatic |

---

# 🏛️ Architecture

```text
+----------------------+
|  Spring Data JPA     |
+----------+-----------+
           |
           v
+----------------------+
|         JPA          |
+----------+-----------+
           |
           v
+----------------------+
|      Hibernate       |
+----------+-----------+
           |
           v
+----------------------+
|    MySQL Database    |
+----------------------+
```

---

# 💻 Hibernate Example

```java
Session session = factory.openSession();
Transaction tx = session.beginTransaction();

session.save(employee);

tx.commit();
session.close();
```

---

# 💻 Spring Data JPA Example

```java
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
```

```java
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Transactional
    public void addEmployee(Employee employee) {
        repository.save(employee);
    }
}
```

---

# ⚡ Key Differences

| JPA | Hibernate | Spring Data JPA |
|-----|-----------|-----------------|
| 📖 Specification | ⚙️ Implementation | 🌱 Spring Module |
| Defines ORM Rules | Implements ORM | Simplifies ORM |
| Requires Provider | Acts as Provider | Uses JPA Provider |
| No Direct CRUD | CRUD Supported | CRUD via Repository |

---

# ✅ Advantages

### JPA

- Standard API
- Database Independent
- Portable

### Hibernate

- Powerful ORM
- Automatic SQL Generation
- Caching Support

### Spring Data JPA

- Minimal Code
- Easy CRUD Operations
- Repository Pattern
- Automatic Transactions

---

# 🎯 Conclusion

✔ **JPA** defines the persistence standard.

✔ **Hibernate** implements the JPA specification.

✔ **Spring Data JPA** sits on top of JPA and makes database operations much easier by reducing boilerplate code through repository interfaces.

---

## 📚 Outcome

Successfully studied and understood the relationship and differences between **JPA**, **Hibernate**, and **Spring Data JPA**, along with their architecture and implementation approach.