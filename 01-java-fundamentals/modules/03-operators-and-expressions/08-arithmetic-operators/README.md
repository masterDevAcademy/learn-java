<h1 align="center">Lesson 8: Arithmetic Operators</h1>

## Lesson Goal
Learn how to perform calculations in Java using arithmetic operators.

By the end, you'll be able to **perform calculations in Java**, understand how numeric types affect results, and correctly split values using division and remainders.

> Arithmetic operators are used everywhere in programming — from game scores and banking apps to inventory and data analysis. 
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

<h2 align=center>
2) Order of Operations
</h2>

Java follows the same basic order of operations you learned in math class:

1. **Parentheses** `()`
2. **Multiplication** `*`, **Division** `/`, **Remainder** `%`
3. **Addition** `+`, **Subtraction** `-`

This means Java evaluates expressions in a specific order unless you use parentheses to change it.

Example:

```java
int result1 = 10 + 5 * 2; // 20
int result2 = (10 + 5) * 2 // 30
```

In the first line, multiplication happens first.

In the second line, parentheses force addition to happen first.

> *When in doubt, use parentheses to make your math clear* 

---

<h2 align=center>
3) Integer vs Double Division
</h2>

When both numbers are integers, Java performs **integer division** (decimals are dropped).

```java
int a = 7 / 2; // 3
double b = 7 / 2; // still 3.0 (because 7/2 happens first)
double c = 7 / 2.0; // 3.5 (because 2.0 is a double)
double d = 7.0 / 2; // 3.5 (because 7.0 is a double)
```
To get decimal results, at least one value must be a `double`. Java decides the *type of division* **before** storing the result.

---

<h2 align=center> Mini Project — Loot Splitter </h2>
Split a pile of loot evenly across a party and calculate leftovers.

```md
If you have 137 gold and 4 players:

137 ÷ 4 = 34 each
137 % 4 = 1 left over

So `/` gives you the share, and `%` gives what couldn't be divided evenly.
```

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
- Do NOT print numbers directly like `34` — calculate them using variables.
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
- Forgetting that multiplication/division happen before addition/subtraction (use parentheses)

### Try changing these values!
After your program works, try different numbers:
- What happens if loot is smaller than party size?
- What happens if loot divides evenly?
- What happens if party size is 1?

---

<h2 align=center> Quick Recap </h2>

- Java uses arithmetic operators to perform math: `+ - * / %`
- Integer division drops decimal values
- Double division preserves decimals when at least one value is a `double`
- The `%` operator returns the remainder of a division

<details>
<summary align=center><strong style="font-size: 1.4rem">Explore More (Optional)</strong></summary>

<br>

After completing the mini project, you can continue practicing in the folders below:

### `playground/`
Small experimental programs where you can freely test arithmetic operators.

### `challenges/`
Extra mini-programs that extend this lesson's ideas.
</details>


---

Next lesson, you'll be ready to **update and track values over time** using assignment, compound operators, and increment/decrement.
