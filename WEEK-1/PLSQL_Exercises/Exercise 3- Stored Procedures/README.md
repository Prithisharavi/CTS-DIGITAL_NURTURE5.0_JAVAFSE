# Exercise 3 - Stored Procedures

## Objective

To understand and implement PL/SQL Stored Procedures for performing database operations such as interest calculation, employee bonus updates, and fund transfers.

---

## Scenario 1: Process Monthly Interest

### Problem Statement

The bank needs to process monthly interest for all savings accounts by applying an interest rate of 1% to the current balance.

### Procedure Name

`ProcessMonthlyInterest`

### Description

The procedure updates the balance of all savings accounts by adding 1% interest to their existing balance.

### Expected Result

Savings account balances are increased by 1%.

---

## Scenario 2: Update Employee Bonus

### Problem Statement

The bank wants to implement a bonus scheme for employees based on their department and performance.

### Procedure Name

`UpdateEmployeeBonus`

### Description

The procedure accepts department name and bonus percentage as parameters and updates employee salaries accordingly.

### Expected Result

Employees belonging to the specified department receive the bonus percentage added to their salary.

---

## Scenario 3: Transfer Funds

### Problem Statement

Customers should be able to transfer funds between their accounts.

### Procedure Name

`TransferFunds`

### Description

The procedure transfers a specified amount from one account to another after verifying that the source account has sufficient balance.

### Expected Result

* Transfer is completed successfully when sufficient balance exists.
* Appropriate message is displayed for insufficient balance.

---

## Tables Used

### Accounts

* AccountID
* CustomerName
* AccountType
* Balance

### Employees

* EmployeeID
* EmployeeName
* Department
* Salary

---

## PL/SQL Concepts Used

* Stored Procedures
* Parameters
* Conditional Statements (IF)
* UPDATE Statements
* SELECT INTO
* DBMS_OUTPUT
* COMMIT

---

## Learning Outcomes

After completing this exercise, I learned:

1. How to create and execute stored procedures.
2. How to pass parameters to procedures.
3. How to perform database updates using procedures.
4. How to implement business logic using PL/SQL.
5. How to handle account transactions securely.

---

## Result

Thus, the PL/SQL Stored Procedures for processing monthly interest, updating employee bonuses, and transferring funds were successfully implemented and executed.
