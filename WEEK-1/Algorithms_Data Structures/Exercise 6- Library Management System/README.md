# Exercise 6: Library Management System

## 1. Understanding Search Algorithms

### Linear Search

Linear Search checks each element one by one until the required item is found or the list ends.

#### Steps:
1. Start from the first element.
2. Compare with the target value.
3. If matched, return the result.
4. Otherwise continue until the end.

#### Characteristics:
- Works on both sorted and unsorted data.
- Easy to implement.

---

### Binary Search

Binary Search repeatedly divides the search space into two halves.

#### Steps:
1. Find the middle element.
2. Compare it with the target value.
3. If equal, return the result.
4. If target is smaller, search the left half.
5. If target is greater, search the right half.

#### Characteristics:
- Requires sorted data.
- Faster than linear search for large datasets.

---

## 2. Setup

Created a Book class with:

- bookId
- title
- author

---

## 3. Implementation

Implemented:

### Linear Search
- Searches books by title.
- Works on unsorted data.

### Binary Search
- Searches books by title.
- Requires the book list to be sorted by title.

---

## 4. Time Complexity Analysis

| Operation | Time Complexity |
|------------|----------------|
| Linear Search | O(n) |
| Binary Search | O(log n) |

---

## Comparison

### Linear Search
Advantages:
- Works on unsorted data.
- Simple implementation.

Disadvantages:
- Slow for large datasets.

### Binary Search
Advantages:
- Very fast for large datasets.

Disadvantages:
- Requires sorted data.

---

## When to Use

### Use Linear Search When:
- Dataset is small.
- Data is unsorted.
- Simplicity is preferred.

### Use Binary Search When:
- Dataset is large.
- Data is already sorted.
- Faster searching is required.

---

## Conclusion

The Library Management System demonstrates both Linear Search and Binary Search techniques for locating books efficiently based on their titles.