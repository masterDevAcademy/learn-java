<h1 align="center">Lesson 7: Scanner Gotchas & Input Bugs</h1>

## Lesson Goal
Understand why Scanner input sometimes behaves **unexpectedly** and learn how to fix the most common input bugs in Java.

If you've every had a program skip input, read empty values, or behave inconsistently, you're not alone — and you didn't do anything wrong.

By the end of this lesson, you'll understand **why these bugs happen** and how to prevent them using safe input patterns.

---

<h2 align=center>
1) The Problem: Skipped Input
</h2>

Consider this code:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter age: ");
int age = scanner.nextInt();

System.out.print("Enter city: ");
String city = scanner.nextLine();
```

When this runs, the program appears to **skip** the city input.

This is one of the most common beginner bugs in Java.

--- 

<h2 align=center>
2) Why This Happens
</h2>

The issue is not with `nextLine()` — it's with **what's left behind in the input buffer**.
- `nextInt()` reads the number
- The **newline character** (`\n`) remains in the buffer
- `nextLine()` immediately reads that leftover newline

Result: an empty String.

---

<h2 align=center>
3) Visualizing the Input Buffer
</h2>

User input:
```text
25↵
```

What happens internally:
```text
25\n
```
- `nextInt()` reads `25`
- `\n` is still waiting
- `nextLine()` reads the leftover newline

---

<h2 align=center>
4) The Fix: Clearing the Buffer
</h2>

To fix this, consume the leftover newline **before** calling `nextLine()`.

```java
scanner.nextLine(); // clear buffer
String city = scanner.nextLine();
```

This extra call ensures the buffer is clean before reading text.

---

<h2 align=center>
5) Safe Scanner Pattern
</h2>

When mixing numeric input and text input:

```java
int age = scanner.nextInt();
scanner.nextLine(); // always clear buffer
String city = scanner.nextLine();
```

This pattern prevents skipped input bugs.

<h2 align=center>
Mini Project — Fix the Broken Input
</h2>

In this project, you'll be given a program that behaves incorrectly due to Scanner input bugs.

Your job is to **identify the issue** and **fix it** using the patterns learned in this lesson.

### Objective
Fix a Java program that:
- Uses both numeric and text input
- Skips user input unexpectedly 
- Produces incorrect or empty output

### Rules
- ❌ No rewriting the entire program
- ❌ No removing input prompts
- ❌ No changing variable types
- ❌ No adding conditionals or loops
- ✅ Only fix Scanner usage


### Broken Code (Intentionally Wrong)

Copy and paste this into your IDE: 

BrokenProfile.java

```java
import java.util.Scanner;

public class BrokenProfile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}

```

### Expected Behavior (After Fix)
```text
Enter age: 25
Enter city: Paris
Age: 25
City: Paris
```

### Common Mistakes
- Blaming `nextLine()` instead of the buffer
- Adding unnecessary logic instead of fixing input flow
- Removing `nextLine()` entirely
- Forgetting that numeric input leaves a newline behind

<h2 align=center> Quick Recap </h2>

- Scanner reads input from a buffer
- Numeric input methods leave behind newline characters
- `nextLine()` reads until the next newline
- Clearing the buffer prevents skipped input
- The bug is common — even experienced developers hit it

With input bugs understood, you're not ready to move on to **logic and decision-making**, where programs can react differently based on user input.

