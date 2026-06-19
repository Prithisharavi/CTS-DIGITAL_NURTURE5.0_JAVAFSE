# Exercise 5: Task Management System

## 1. Understanding Linked Lists

A Linked List is a linear data structure where elements are stored as nodes. Each node contains data and a reference to the next node.

### Types of Linked Lists

#### Singly Linked List
- Each node points to the next node.
- Traversal is only in one direction.
- Requires less memory.

#### Doubly Linked List
- Each node contains references to both next and previous nodes.
- Traversal is possible in both directions.
- Requires extra memory.

## 2. Setup

Created a Task class with the following attributes:
- taskId
- taskName
- status

## 3. Implementation

Implemented a Singly Linked List with the following operations:

- Add Task
- Search Task
- Traverse Tasks
- Delete Task

## 4. Time Complexity Analysis

| Operation | Time Complexity |
|------------|----------------|
| Add Task | O(n) |
| Search Task | O(n) |
| Traverse Tasks | O(n) |
| Delete Task | O(n) |

## Advantages of Linked Lists over Arrays

1. Dynamic Size
   - Can grow and shrink during runtime.

2. Efficient Insertions and Deletions
   - No shifting of elements required.

3. Better Memory Utilization
   - Memory allocated as needed.

4. Flexible Data Structure
   - Suitable for applications where data changes frequently.

## Conclusion

The Task Management System uses a Singly Linked List to efficiently manage tasks and perform add, search, traverse, and delete operations.