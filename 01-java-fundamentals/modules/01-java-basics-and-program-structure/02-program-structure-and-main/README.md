<h1 align="center">Lesson 2: Java Program Structure & <code>main()</code></h1>

Welcome back!

In this lesson, we take a closer look at the **structure of a Java program**. Instead of focusing on what the code **does**, we'll focus on how it's **organized**, how Java knows **where to start running**, and how code blocks are formed and read.

Understanding this structure is essential before moving on to more complex programs.

## Lesson Goal
Understand the **basic structure of a Java program** and how Java knows **where to begin execution**:

- What a **Java class** is and why every program needs one
- How to write a **class declaration**
- The role and shape of the `public static void main(String[] args)` method
- How Java uses `main()` as the **entry point** of a program
- How **curly braces** define code blocks
- Why **indentation and formatting** matter for readability

By the end of the lesson, you'll be able to **recognize, read, and write a correctly structured Java program** and understand how its execution flows from top to bottom

---

<h2 align=center>
1) What is a Java Class?
</h2>

In Java, **all code lives inside a class.**

A class is like a container that holds your program

For now, don't worry about *why* — just remember this rule:

> **Every Java program must have at least one class**

---

<h2 align=center> 
2) Class Declaration Syntax
</h2>

Here's the simplest form of a Java class:

```java
public class MyProgram {

}
```

Let's break it down:
- `public`
    - Makes the class accessible to Java
- `class`
    - Tells Java you're defining a class
- `MyProgram`
    - The name of the class **MUST match the file name exactly**
- `{ }`
    - Curly braces define the **body** of the class

---

<h2 align=center>
3) The Structure of a Java Program
</h2>

A basic Java program looks like this:

```java
public class MyProgram {

    public static void main(String[] args) {
        // Code goes here
    }
}
```
There are **three main layers**:
1. The **class**
2. The `main` **method**
3. The **code inside** `main`

---

<h2 align=center>
4) The <code>main</code> Method (Very Important)
</h2>

This line may look scary at first:

```java
public static void main(String[] args)
```

For now, just remember this:
> **This is where your program starts running**

When you run a Java program, Java:
1. Looks for a class
2. Finds the `main` method
3. Starts executing code **top to bottom** inside it.

You don't need to understand every word yet — just recognize it.

---

<h2 align=center>
5) Curly Braces <code>{ }</code> and Code Blocks
</h2>

Curly braces define **blocks of code.**

Example:
```java
public class Example {
    public static void main(String[] args) { 
        System.out.println("Inside main");
    }
}
```

- Everything inside the class braces belongs to the class
- Everything inside the `main` braces runs when the program starts
- **Curly braces must always:**
    - Come in pairs
    - Open `{` and close `}` in the correct order

---

<h2 align=center>
5) Indentation & Readability
</h2>
Java **does not require** indentation — but **humans do**

Compare these:

Hard to read:
```java
public class Bad {
public static void main(String[] args) {
System.out.println("Yikes");
}
}
```
Clean and readable:
```java
public class Good {
    public static void main(String[] args) {
        System.out.println("Much better");
    }
}
```

Good indentation:
- Shows structure
- Prevents mistakes
- Makes your code easier to understand

---

<h2 align=center>
6) Example: A Complete Java Program
</h2>

```java
public class HelloStructure {
    
    public static void main(String[] args) {
        System.out.println("Java programs have structure!");
    }
}
```
**Output:**
```text
Java programs have structure!
```

---

<h2 align=center>
Mini Project — Program Banner
</h2>

Now it's your turn!

### Objective
Create a Java program that prints a **boxed ASCII banner** to the console. 

This project is about **program structure**, not logic or formatting tricks. Focus on:
- A correct class declaration
- A properly written `main()` method
- Clean curly brace placement
- Readable indentation

Try this on your own first! Here's a template to start you off:

#### `PlayerBanner.java`
```java
public class ProgramBanner {
    public static void main(String[] args) {
        System.out.println(/* code */);
        // Insert your code here
    }
}
```

*Hint: Java starts running your program inside `main()`*

### Rules
- ❌ No variables
- ❌ No user input
- ❌ No loops or conditionals
- ❌ No additional methods
- ❌ No packages
- ✅ Just program structure and output

### Requirements
Your program must:
- Compile and run successfully
- Contain **exactly one class**
- Contain **exactly one** `main()` method
- Print a boxed banner using text characters
- Use multiple `System.out.println()
- Be cleanly indented and easy to read

### Basic Example (yours should be different)

```text
+-------------------+
| Java Fundamentals |
|      Lesson 2     |
+-------------------+
```

### Common Mistakes
- Misplaced or missing curly braces
- Class name or not matching the file name
- Code written outside the `main()` method
- Inconsistent indentation
- Trying to add logic instead of focusing on structure

---

<h2 align=center>
Quick Recap
</h2>

- Every Java program is wrapped inside a class
- The **class name must match the file name**
- Curly braces `{ }` define **code blocks**
- Java starts running your program inside the `main()` **method**
- Code inside `main()` runs **top to bottom**
- Clean indentation makes program structure easier to read and understand

Next lesson, you'll start giving your programs more control over what they output and how it looks. 