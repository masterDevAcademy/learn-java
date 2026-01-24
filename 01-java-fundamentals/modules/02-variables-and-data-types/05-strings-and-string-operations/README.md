<h1 align="center">Lesson 5: Strings & String Operations</h1>

## Lesson Goal
Learn how Java represents **text data** using the `String` type and how to **combine and manipulate text** using built-in String operations.

In the previous lesson, you worked with primitive data types like numbers and booleans. Text behaves differently in Java, and understanding how `String` works is essential for building real programs.

By the end of this lesson, you'll be able to create, combine, and extract parts of text stored in Strings.

---

<h2 align=center>
1) What Is a String?
</h2>

A `String` represents **text** in Java.

Examples:
```java
String name = "Astarion";
String city = "Baldur's Gate";
```

Unlike primitive data types (`int`, `double`, etc.), a `String` is not a primitive. It is an **object**.

For now, the most important thing to remember is:

> A `String` stores a sequence of characters and comes with built-in tools for working with text.

- {{Tip or note about usage}}

---

<h2 align=center> 2) String vs. Primitive Types </h2>

Primitive types:
- Store simple values
- Do not have methods

```java
int level = 10;
boolean isAlive = true;
```

Strings:
- Store text
- Have **methods** you can call

```java
String username = "ShadowHeart";
int length = username.length();
```

You'll learn more about objects later. For now, focus on **what strings can do**. 

---

<h2 align=center>
3) String Concatenation
</h2>

**Concatenation** means joining text together.

In Java, this is doing using the `+` operator.

```java
String first = "Astarion";
String last = "Ancunin";

String fullName = first + last;
```

You can also combine Strings with variables and text:

```java
System.out.println("User: " + fullName);
```
**Output:**

```text
User: Astarion Ancunin
```

Java automatically converts non-String values into text when concatenating.

--- 

<h2 align=center>
4) The <code>length()</code> Method
</h2>

The `length()` method returns the number of characters in a String.

```java
String alias = "Astarion";
int count = alias.length();
```
This include: 
- Letters
- Numbers
- Spaces
- Symbols

Example: 
```java
"Hi there".length(); //8
```

---

<h2 align=center>
The <code>substring()</code> Method
</h2>

The `substring()` method extracts part of a String.

```java
String name = "ShadowHeart";
String shortName = name.substring(0, 6);
```

This produces
```text
Shadow
```

### How it works
- The first number is the **starting index**
- The second number is the **ending index (not included)**

Indexes start at 0.

```text
S h a d o w H e a r t
0 1 2 3 4 5 6 7 8 9 10
```

---

<h2 align=center> Mini Project — Alias Generator </h2>

Create a program that generates a **custom alias** using String operations.

This project focuses on combining and manipulating text using `String` variables and methods.

### Objective

Create a Java program that:
- Stores text values in String variables
- Combines multiple Strings into a single alias
- Uses `length()` and `substring()` to analyze and modify text
- Prints the results in a clean, readable format

### Rules
- ❌ No user input (`Scanner`)
- ❌ No conditional logic
- ❌ No loops
- ❌ No randomization
- ✅ String variables, concatenation, and String methods only

### Requirements
Your program must:
- Declare and initialize **at least three `String` variables**
- Create a combined alias using concatenation
- Display the length of at least one string
- Extract part of a String using `substring()`
- Print all results using variables (no hardcoded output values)
- Compile and run without errors

> *Hint: Try building your final alias by adding a short prefix (like a title,mood, or role) in front of your base name using concatenation

### Starter Template
```java
public class AliasGenerator {
    public static void main(String[] args) {

        // Declare and initialize your String variables

        // Build your alias here

        // Print your results here

    }
}
```

### Basic Example (yours should be different)
```text
ALIAS GENERATED
===============
Base Name: ShadowHeart
Name Length: 11
Short Tag: Shadow
Final Alias: Dark_ShadowHeart
```

### Common Mistakes
- Forgetting that `substring()` indexes start at 0
- Mixing up the start and end indexes
- Treating `String` like a primitive type
- Hardcoding output instead of using variables
- Forgetting semicolons

---

<h2 align=center> Quick Recap </h2>

- `String` is used to store text in Java
- Strings are not primitive data types
- Text is combined using (`+`)
- `length()` counts characters
- `substring()` extracts part of a String

In the next lesson, you'll learn how to make your programs interactive by accepting input from the user using the `Scanner` class.
