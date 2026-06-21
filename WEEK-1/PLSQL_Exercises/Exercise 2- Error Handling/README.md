# Exercise 2 - Error Handling

## Objective

The objective of this exercise is to understand and implement exception handling mechanisms in PL/SQL. Error handling is an important aspect of database programming as it helps maintain data integrity, prevents unexpected failures, and provides meaningful feedback to users when errors occur.

---

## Scenario 1: Safe Transfer of Funds Between Accounts

### Problem Statement

The bank needs a secure mechanism to transfer funds between customer accounts. During the transfer process, errors such as insufficient account balance may occur. The transaction should be rolled back if any error is encountered to ensure data consistency.

### Procedure Name

SafeTransferFunds

### Description

The procedure transfers a specified amount from one account to another. Before performing the transfer, the available balance of the source account is checked. If sufficient funds are available, the transfer is completed successfully. Otherwise, an error message is generated and the transaction is rolled back.

### PL/SQL Concepts Used

* Exception Handling
* RAISE_APPLICATION_ERROR
* COMMIT
* ROLLBACK
* SELECT INTO
* Conditional Statements (IF)

### Expected Outcome

* Successful transfer when sufficient balance exists.
* Error message displayed when funds are insufficient.
* Database consistency maintained through rollback.

---

## Scenario 2: Update Employee Salary with Exception Handling

### Problem Statement

The bank wants to increase employee salaries by a specified percentage. However, if an invalid Employee ID is provided, the procedure should handle the exception and notify the user appropriately.

### Procedure Name

UpdateSalary

### Description

The procedure updates the salary of an employee based on the given percentage increase. If the specified employee does not exist in the Employees table, an exception is raised and an appropriate error message is displayed.

### PL/SQL Concepts Used

* SQL%ROWCOUNT
* Exception Handling
* RAISE_APPLICATION_ERROR
* UPDATE Statement
* COMMIT

### Expected Outcome

* Salary is updated successfully for valid employees.
* Error message is displayed for invalid Employee IDs.
* No unwanted database modifications occur.

---

## Scenario 3: Add New Customer with Duplicate Check

### Problem Statement

The bank wants to add new customer records to the Customers table. Duplicate customer IDs should not be allowed, and any attempt to insert a duplicate record must be handled properly.

### Procedure Name

AddNewCustomer

### Description

The procedure inserts a new customer into the Customers table. If the customer ID already exists, Oracle raises a DUP_VAL_ON_INDEX exception. The exception is caught and a meaningful error message is displayed.

### PL/SQL Concepts Used

* Exception Handling
* DUP_VAL_ON_INDEX
* INSERT Statement
* COMMIT

### Expected Outcome

* New customer records are inserted successfully.
* Duplicate customer IDs are prevented.
* Appropriate error messages are displayed.

---

## Tables Used

### Customers

* CustomerID
* Name
* DOB
* Balance
* LastModified

### Accounts

* AccountID
* CustomerID
* AccountType
* Balance
* LastModified

### Employees

* EmployeeID
* Name
* Position
* Salary
* Department
* HireDate

---

## Learning Outcomes

After completing this exercise, I learned:

1. How to implement exception handling in PL/SQL.
2. How to use EXCEPTION blocks effectively.
3. How to generate custom error messages using RAISE_APPLICATION_ERROR.
4. How to maintain database consistency using COMMIT and ROLLBACK.
5. How to handle duplicate records and invalid inputs.
6. How to improve reliability and robustness of database applications.

---

## Result

Thus, the PL/SQL procedures for handling fund transfer errors, employee salary update errors, and duplicate customer insertion errors were successfully implemented and executed. The exercise demonstrated the importance of exception handling in maintaining data integrity and ensuring reliable database operations.
