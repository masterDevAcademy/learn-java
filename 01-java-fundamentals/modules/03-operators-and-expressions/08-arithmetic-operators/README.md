<h1 align="center">Lesson 8: Arithmetic Operators</h1>

## Lesson Goal
Learn how to update variables over time using assignment, compound operators, and increment/decrement.

By the end, you'll be able to **perform calculations in Java**, understand how numeric types affect results, and correctly split values using division and remainders.

---

<h2 align=center>1) Arithmetic Operators</h2>

Java supports common math operators:

- `+` addition
- `-` subtraction
- `*` multiplication
- `/` division
- `%` remainder (modulus)

Example:
```java
int total = 17 + 5;
int left = 17 % 5; // remainder (2)
```

---

<h2 align=center>2) Integer vs Double Division </h2>

When both numbers are integers, Java performs **integer division** (decimals are dropped).

```java
int a = 7 / 2; // 3
double b = 7 / 2; // still 3.0 (because 7/2 happens first)
double c = 7 / 2.0; // 3.5
```
To get decimal results, at least one value must be a `double`

---

<h2 align=center> Mini Project — Loot Splitter </h2>
Split a pile of loot evenly across a party and calculate leftovers.

### Objective
Create a program that:
- Stores a total amount of loot and a party size
- Calculates how much each player gets
- Calculates how much loot is left over (remainder)
- Prints a clean summary


### Rules
- ❌ No loops
- ❌ No conditionals
- ❌ No user input required (optional if you want)
- ✅ Variables + arithmetic operators + output

### Requirements
Your program must:
- Use `int` for total loot and party size
- Use `/` to compute each share
- Use `%` to compute leftover loot
- Print results using variables (no hardcoded computed values)
- Compile and run successfully

### Basic Example (yours should be different)
```text
LOOT SPLIT RESULTS
==================
Total Loot: 137 gold
Party Size: 4
Each Player Gets: 34 gold
Leftover Loot: 1 gold
```

### Common Mistakes
- Expecting `/` to keep decimals when using `int`
- Forgetting `%` gives the remainder
- Hardcoding answers instead of calculating them

---

<h2 align=center> Quick Recap </h2>

- Java uses arithmetic operators to perform math: `+ - * / %`
- Integer division drops decimal values
- Double division preserves decimals when at least one value is a `double`
- The `%` operator returns the remainder of a division

Next lesson, you'll be ready to **update and track values over time** using assignment, compound operators, and increment/decrement,
