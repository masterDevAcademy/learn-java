<h1 align="center">Lesson 4: Variables & Primitive Data Types</h1>

## Lesson Goal
Learn how Java **stores information** using variables and how different **data types** represent different kinds of values.

Up to this point, Java programs have only printed fixed text. In this lesson, programs begin to **remember information**, reuse it, and display it dynamically.

By the end of this lesson, you'll understand how to declare variables, assign values to them, and choose the correct data type for the information you want to store.

---

<h2 align=center>
1) What Is a Variable?
</h2>

A **variable** is a named container that stores a value in memory.

Think of a variable as a **labeled box**:
- The label is the variable name
- The box holds a value
- The type of box determines what kind of value it can hold

```java
// Example code snippet
int level = 10;
```

Here:
- `int` is the **data type**
- `level` is the **variable name**
- `10` is the **value**

---

<h2 align=center> 2) Declaring vs Initializing Variables </h2>

These are two related but distinct steps 

### Declaring a variable

Tells Java **what kind of data** the variable will store and **what it will be called**.

```java
int score;
```

### Initializing a variable

Assigns a value to the variable.
```java
score = 100;
```

### Declaring and initializing at once
This is one of the most common pattern:
```java
int score = 100;
```

> A variable must be **initialized before it is used**.

---

<h2 align=center>3) Variable Naming Rules</h2>

Java variable names must follow these rules:
- Must start with a letter, `_`, or `$`
- Cannot start with a number
- Cannot be a Java keyword
- Cannot contain spaces

Valid examples:
```java
int playerLevel;
double healthPoints;
boolean isAlive;
```

Invalid examples:
```java
int 2level;     // starts with a number
double player-health;   // contains hyphen
boolean public;     // keyword
```

### Naming Convention (Important)

Java uses **camelCase** for variable names:
```java
int maxHealth;
double critChance;
boolean hasShield;
```

---

<h2 align=center>4) Primitive Data Types</h2>

Primitive data types store **simple values** directly.

In this lesson, we focus on the most common ones:

### `int` — Whole Numbers
Used for counting discrete values.

```java
int level = 12;
int lives = 3;
```

### `double` — Decimal Numbers
Used for measurements and precision.

```java
double accuracy = 98.6;
double critChance = 0.25;
```

### `boolean` — True / False
Used for conditions and state.

```java
boolean isAlive = true;
boolean hasKey = false;
```

### `char` — Single Characters
Stores exactly **one character**, wrapped in single quotes.

```java
char rank = 'A';
char grade = 'S';
```

> `char` is not the same as a `String`

<div align=center>

<h3>Data Types Chart</h3>

| Type | Purpose | Default Value | Default Value | Size |
|------|---------|---------------|----------|------|
| **int** | Whole numbers (e.g., `10`, `-500`)| `0` | 32-bit | 
| **double** | Decimal numbers (e.g., `3.14`, `19.99`) | `0.0` | 64-bit |
| **boolean** | Logical values: `true` or `false` | `false` | 1-bit* |
| **char** | A single Unicode character (e.g., `A`) | `\u0000` | 16-bit |
| **String** (*A reference data type, but you will need to know it for the mini project.) | A sequence of characters (e.g., `"Hello"`) | `null` | Varies |
| **long** (*not covered in this module but should know*) | Very large whole numbers | `0L` | 64-bit |

</div>

### A Note About <code>String</code>

You may notice that Java programs often use `String` to store text:

```java
String name = "Halsin";
```

Even though `String` looks like a primitive type, it **is not**. 
- `String` is a **reference type**, not a primitive
- It represents a sequence of characters
- It has built-in methods for working with text

For now, it's enough to know that:
> **`String` is used to store text, but it behaves differently from primitive data types** 
- In the next lesson, we'll explore `String` in depth and learn how to combine, analyze and manipulate text.

<h2 align=center>5) Using Variables in Output</h2>

Variables can be printed by combining them with text using `+`:

```java
System.out.println("Level: " + level);
System.out.println("Alive: " + isAlive);
```

Java automatically converts values to text when printing.

<h2 align=center> Mini Project — Player Stats Engine </h2>

Last module, we printed a player card using Java. You're going to do something similar in this project. You can either use the same character, or a new one!

In this version, your program should **store player information in variables** and print the result using those values. Nothing in the output should be hardcoded except labels and formatting.

This project focuses on **storing data**, not calculating or modifying it.

> You will use `String` variables in this project only to store and display text. You do not need to understand String operations yet — those are covered in the next lesson.

### Objective

Create a Java program that:
- Declares variables to represent player information
- Assigns values to those variables
- Prints a formatted player stats report using the stored values

### Rules
- ❌ No user input (`Scanner`)
- ❌ No conditional logic (`if`, `switch`)
- ❌ No loops
- ❌ No calculations or game logic
- ❌ No modifying variables after initialization
- ✅ Variables + `System.out.print` / `System.out.println`

### Requirements
Your program must:

- Declare and initialize **at least one variable of each type**:
    - `String`
    - `int`
    - `double`
    - `boolean`
    - `char`
- Use **meaningful variable names** (camelCase)
- Print all values using variables (no hardcoded stats)
- Include a clear title header and visual separators
- Compile and run without errors
- Be cleanly indented and readable

---

### Starter Template
```java
public class PlayerStats { 
    public static void main(String[] args) {

        // Declare and initialize your variables here
        
        // Print the player stats report here

    }
}
```

### Basic Example (yours should be different)
```text
====================
PLAYER STATUS REPORT
==================== 
Name: Halsin
Level: 12
Health: 87
Crit Chance: 23.5
Rank: A
Alive: true
==================== 
```

### Common Mistakes
- Hardcoding values instead of using variables
- Using a variable before initializing it
- Mixing up `char` and `String`
- Forgetting semicolons
- Using unclear or inconsistent variable names

<h2 align=center> Quick Recap </h2>

- Variables store data in memory
- Data types define what kind of data can be stored
- Variables must be declared and initialized before use
- `int`, `double`, `boolean` and `char` are primitive data types
- Variables allow programs to become dynamic.

In the next lesson, you'll learn how Java handles **text data** using `String` and how to manipulate it using built-in methods.
