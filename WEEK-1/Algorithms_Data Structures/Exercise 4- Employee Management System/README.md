# Exercise 4: Employee Management System

## Objective
To implement an Employee Management System using Arrays and perform basic operations such as Add, Search, Traverse, and Delete employee records.

## Array Representation

Arrays store elements in contiguous memory locations. Each element can be accessed directly using its index.

### Advantages of Arrays
- Fast access using index (O(1))
- Easy traversal
- Memory efficient

## Classes Used

### Employee
Attributes:
- employeeId
- name
- position
- salary

### EmployeeManagementSystem
Methods:
- addEmployee()
- searchEmployee()
- traverseEmployees()
- deleteEmployee()

## Time Complexity Analysis

| Operation | Time Complexity |
|-----------|----------------|
| Add       | O(1) |
| Search    | O(n) |
| Traverse  | O(n) |
| Delete    | O(n) |

## Limitations of Arrays
- Fixed size
- Costly insertion and deletion
- Memory wastage if array is underutilized

## When to Use Arrays
- Fixed-size collections
- Fast index-based access
- Small to medium datasets