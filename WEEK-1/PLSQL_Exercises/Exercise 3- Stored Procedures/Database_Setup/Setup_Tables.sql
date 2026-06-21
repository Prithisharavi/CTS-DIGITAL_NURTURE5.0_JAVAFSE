CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    AccountType VARCHAR2(20),
    Balance NUMBER
);

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(50),
    Department VARCHAR2(30),
    Salary NUMBER
);

INSERT INTO Accounts VALUES (101,'Ravi','Savings',10000);
INSERT INTO Accounts VALUES (102,'Priya','Savings',15000);
INSERT INTO Accounts VALUES (103,'Kumar','Current',20000);

INSERT INTO Employees VALUES (1,'Arun','IT',50000);
INSERT INTO Employees VALUES (2,'Meena','IT',60000);
INSERT INTO Employees VALUES (3,'Raj','HR',45000);

COMMIT;