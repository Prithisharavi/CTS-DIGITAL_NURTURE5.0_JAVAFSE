# Exercise 1: Control Structures using PL/SQL

## Objective

To understand and implement PL/SQL control structures such as loops, conditional statements, cursors, and database updates in a banking system.

## Scenario 1: Loan Interest Rate Discount for Senior Citizens

### Problem Statement

The bank wants to provide a 1% discount on loan interest rates for customers whose age is greater than 60 years.

### Solution

A cursor is used to iterate through all customers. For each customer, the age is checked. If the customer is above 60 years old, the loan interest rate is reduced by 1%.

### PL/SQL Concepts Used

* Cursor
* FOR Loop
* IF Statement
* UPDATE Statement

### Expected Output

Interest rates are updated for eligible customers and a confirmation message is displayed.

---

## Scenario 2: Promote Customers to VIP Status

### Problem Statement

Customers with an account balance greater than $10,000 should be marked as VIP customers.

### Solution

The PL/SQL block iterates through all customer records and updates the IsVIP flag to TRUE when the balance exceeds $10,000.

### PL/SQL Concepts Used

* Cursor
* FOR Loop
* IF Statement
* UPDATE Statement

### Expected Output

Eligible customers are promoted to VIP status and confirmation messages are displayed.

---

## Scenario 3: Loan Due Reminder

### Problem Statement

The bank wants to send reminders to customers whose loan due dates fall within the next 30 days.

### Solution

The PL/SQL block retrieves all loans due within the next 30 days and prints reminder messages using DBMS_OUTPUT.

### PL/SQL Concepts Used

* Cursor
* Date Functions
* FOR Loop
* DBMS_OUTPUT

### Expected Output

Reminder messages are displayed for customers with upcoming loan due dates.

---

## Learning Outcomes

After completing this exercise, I learned:

1. How to use PL/SQL cursors.
2. How to implement loops and conditional statements.
3. How to update records using PL/SQL.
4. How to work with date calculations.
5. How to generate output using DBMS_OUTPUT.

## Conclusion

This exercise demonstrates the practical usage of PL/SQL control structures in a banking application. It improves understanding of loops, conditions, record processing, and database manipulation operations.
