<h1 align=center>Lesson 6: Input with Scanner</h1>

## Lesson Goal
Learn how to make Java programs **interactive** by accepting input from the user using the `Scanner` class.

So far, your programs have only worked with information written directly into the code. In this lesson, programs begin to **receive data from outside the program**, allowing users to influence what the program does.

By the end of this lesson, you'll be able to read text and numbers from the console and store them in variables.

---

<h2 align=center>
1) What Is User Input?
</h2>

User input allows a program to receive information while it is running.

Instead of hardcoding values like this:

```java
String name = "masterDev";
```
We can ask the user
```text
What is your name?
```
... and store their response.

---

<h2 align=center>
2) Introducing the Scanner Class
</h2>
Java provides the `Scanner` class to read input from the keyboard.

To use it, you must:
1. Import it
2. Create a Scanner object
3. Call methods to read input

```java
import java.util.Scanner;
```

---

<h2 align=center>
3) Creating a Scanner
</h2>

```java
Scanner scanner = new Scanner(System.in);
```
- `System.in` represents keyboard input
- `scanner` is the variable that reads user input

This scanner will be used throughout the program.

---

<h2 align=center>
4) Reading Text Input (<code>nextLine()</code>)
</h2>

Use `nextLine()` to read an entire line of text.

```java
System.out.print("Enter your name: ");
String name = scanner.nextLine();
```
This reads everything the user types until they press Enter.

---

<h2 align=center>
5) Reading Numeric Input
</h2>

Scanner provides different methods depending on the data type.

### Reading an integer
```java
System.out.print("Enter your age: ");
int age = scanner.nextInt();
```

### Reading a decimal
```java
System.out.print("Enter your height: ");
double height = scanner.nextDouble();
```

> The method you use must match the type of variable you are storing the input in.

---

<h2 align=center>
6) Printing User Input
</h2>

Once input is stored in variables, it can be printed like any other value:

```java
System.out.println("Name: " + name);
System.out.println("Age: " + age);
```

---

<h2 align=center>
Mini Project — Interactive Character Profile
</h2>

Create a program that asks the user for information and prints a completed character profile.

This project focuses on input flow not validation or logic.

### Objective
Create a Java program that:
- Prompts the user for multiple pieces of information
- Reads both text and numeric input using `Scanner`
- Stores user input in variables
- Prints a formatted summary using the collected data

### Rules
- ❌ No conditional logic
- ❌ No loops
- ❌ No input validation
- ❌ No error handling
- ❌ No fixing input bugs yet
- ✅ Scanner input + variables + output only

### Requirements
Your program must:
- Import `java.util.Scanner`
- Create exactly one `Scanner` object
- Use at least:
    - One `nextLine()`
    - One `nextInt()` or `nextDouble()`
- Store input in appropriately typed variables
- Print a clean, labeled profile summary
- Compile and run successfully

### Starter Template
```java
import java.util.Scanner;

public class CharacterProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read user input here

        // Print the character profile here
    }
}
```

### Basic Example (yours should be different)

```text
=== CHARACTER PROFILE ===
Name: Astarion Ancunin
Age: 263 
City: Baldur's Gate
Weapon: Daggers
=========================
```

### Common Mistakes
- Forgetting to import `Scanner`
- Using the wrong input method for a data type
- Assuming input is always valid
- Confusing `System.in` and `System.out`
- Thinking input bugs are your fault (they're not... yet)

--- 

<h2 align=center>
Quick Recap
</h2>

- User input allows programs to receive data at runtime
- `Scanner` reads input from the keyboard
- `nextLine()` reads text
- `nextInt()` and `nextDouble()` read numbers
- Input validation be stored and printed like any other variable

In the next lesson, you'll learn why Scanner sometimes behaves unexpectedly and how to fix the most common input bugs in Java.

