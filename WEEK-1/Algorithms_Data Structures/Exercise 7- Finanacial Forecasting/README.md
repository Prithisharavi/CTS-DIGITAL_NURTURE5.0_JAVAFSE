# Exercise 7: Financial Forecasting

## 1. Understanding Recursive Algorithms

Recursion is a programming technique where a method calls itself to solve a problem.

A recursive solution consists of:

### Base Case
The condition that stops the recursion.

### Recursive Case
The method calls itself with a smaller problem.

### Advantages of Recursion
- Simplifies complex problems.
- Produces shorter and cleaner code.
- Useful for mathematical and divide-and-conquer problems.

---

## 2. Setup

Created a method:

calculateFutureValue()

Parameters:
- currentValue
- growthRate
- years

---

## 3. Implementation

The recursive algorithm calculates the future value using the formula:

Future Value = Current Value × (1 + Growth Rate)^Years

The method repeatedly applies the growth rate until the number of years becomes zero.

---

## 4. Time Complexity Analysis

### Time Complexity
O(n)

where n = number of years

The recursive function executes once for each year.

### Space Complexity
O(n)

because each recursive call is stored in the call stack.

---

## Optimization

To avoid excessive computation:

### Iterative Approach
Replace recursion with a loop.

Advantages:
- O(1) space complexity
- No recursion overhead

### Memoization
Store previously computed results and reuse them.

Advantages:
- Avoids repeated calculations.
- Improves efficiency for complex recursive problems.

---

## Conclusion

The Financial Forecasting System uses recursion to predict future values based on growth rates and demonstrates how recursive algorithms can be applied to financial calculations.