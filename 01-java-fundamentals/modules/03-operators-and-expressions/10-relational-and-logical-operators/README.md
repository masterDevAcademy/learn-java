<h1 align="center">Lesson 20: Relational & Logical Operators</h1>

## Lesson Goal
Learn how Java **compares values** and evaluates **true/false conditions** using relational and logical operators.

In this lesson, programs don't make decisions yet — but they *evaluate rules*. These boolean results will power `if` statements in the next module.

By the end, you'll be able to write expressions that check whether certain conditions are met.

---

<h2 align=center>
1) Relational Operators
</h2>

Relational operators compare two values and produce a `boolean`.

<div align=center>

| Operator | Meaning |
-----------|---------|
| == | equal to |
| != | not equal to |
| > | greater than |
| < | less than |
| >= | greater than or equal to |
|<= | less than or equal to |

</div>

Example: 
```java
int age = 16;
boolean canPlay = age >= 13;
```

---

<h2 align=center> 2) Logical Operators </h2>

Logical operators combine or modify boolean values.

<div align=center>

| Operator | Meaning |
|----------|---------|
| && | AND|
| \|\| | OR |
| ! | NOT |

</div>

```java
boolean hasPermission = true;
boolean hasID = false;

boolean allowed = hasPermission && hasID;
```

---

<h2 align=center>3) Reading Boolean Expressions</h2>

Boolean expressions should be read **left to right**, like a sentence.

```java
age >= 17 && hasGuardian
```
"Age is at least 17 AND has a guardian."

---

<h2 align=center> Mini Project — Game Rating Gate </h2>

Create a program that checks whether a player is allowed to access a game based on age and additional rules.

This project evaluates rules but **does not make decisions yet**.

### Objective

Create a Java program that:
- Stores player information in variables
- Evaluates access rules using relational and logical operators
- Prints the results of each rule check

### Rules
- ❌ No `if` statement
- ❌ No loops
- ❌ No user input required
- ❌ No branching logic
- ✅ Boolean expressions and output early

### Requirements
Your program must:
- Store at least:
    - Player age
    - Game rating age requirement
    - At least one additional boolean condition (e.g. parental permission)
- Use relational operators to compare numeric values
- Use logical operators to combine conditions
- Store results in boolean variables
- Print whether access is allowed

### Example Scenario
- Player age: 15
- Game rating: 17+ 
- Has parental permission: true

### Basic Example (yours should be different)
```text
GAME ACCESS CHECK
=================
Player Age: 15
Required Age: 17
Parental Permission: true

Meets Age Requirement: false
Access Allowed: false
```

### Common Mistakes
- Using `=` instead of `==`
- Forgetting logical operator precedence
- Trying to use `if` statements too early
- Confusing `&&` and `||`

<h2 align=center> Quick Recap </h2>

- Relational operators compare values
- Logical operators combine conditions
- Boolean expressions evaluate to true or false
- Programs can check rules without making decisions yet

Next module, you'll begin using `if/else` to **act on these conditions** and control program flow. 
