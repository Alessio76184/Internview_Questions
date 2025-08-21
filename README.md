# Kotlin & SQL Coding Challenges – Personal Reference

This repository is a personal collection of coding challenges I've worked through while preparing for interviews. I'm putting them aside here in case I need to revisit them for practice, reference, or sharing in the future. I hope others might find this useful.

All solutions are written in Kotlin and are entirely self-contained. For now later I might include other languages as I get more challenges.

---

## ✅ Kotlin Challenges Included

### 1. Bracket Combinations (Catalan Numbers)
Calculates the number of valid bracket combinations for a given number of pairs.

kotlin
Input: 3
Output: 5

### 2. Tree Validator from Parent-Child Pairs
Determines whether a list of (child, parent) pairs forms a valid binary tree.

kotlin
Input: ["(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"]
Output: "true"

### 3. Max Profit from Stock Prices (One Transaction)
Returns the maximum profit from buying and selling a stock once.

kotlin
Input: [7, 1, 5, 3, 6, 4]
Output: 5

### 4. Longest Common Prefix
Finds the longest common prefix shared by all strings in an array.

kotlin

Input: ["cranberry", "crawfish", "crap"]
Output: "cra"

## 🛠 How to Use
All solutions are implemented as simple Kotlin functions.

You can copy and run any function using a standard Kotlin main() method.

File naming follows one function per file with .kt extensions.

---
## ✅ SQL Challenges Included

### 1. Most Sold Product
Identify the product with the highest quantity sold.
- Joins Products and OrderDetails
- Uses SUM(quantity) and ORDER BY DESC LIMIT 1

### 2. Customers Without Orders
Find customers who never placed an order.
- Uses LEFT JOIN between Customers and Orders
- Filters with WHERE order_id IS NULL

### 3. Orders with Wrong Totals
Identify orders where stored total_amount does not equal the calculated sum of (quantity × price).
- Joins Orders, OrderDetails, Products
- Groups by order_id and checks mismatches with HAVING

## 🛠 How to use SQL solutions:
Each challenge is stored in a .sql file, well-commented for clarity.

Files are executable on MySQL (and similar engines).

Each query block ends with ;.

Some files include optional SELECT * lines at the end to show raw data.
  
---

