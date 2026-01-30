<h1 align="center">
Lesson 18: Nested Loops
</h1>

## Lesson Goal
Learn how loops can run **inside other loops** to create patterns, grids, and multi-step logic.

So far, your loops have handled one repeating process at a time. Now, you'll learn how one loop can control another, allowing your program to work in rows, columns, and structured layouts.

By the end, you'll understand how nested loops work together and how to control their execution.

---

<h2 align=center>
1) What Is a Nested Loop?
</h2>

A **nested loop** is a loop inside another loop.


```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 2; j++) {
        System.out.println("i=" + i + ", j=" +j);
    }
}
```

The **outer loop** controls how many times the **inner loop** runs.

---

<h2 align=center>
2) Understanding Loop Flow
</h2>

Think of it like rows and columns.
- Outer loop = rows
- Inner loop = columns

Example output:

```text
i=1, j=1
i=1, j=2
1=2, j=1
i=2, j=2
i=3, j=1
i=3, j=2
```

For every tow, the inner loop runs fully.

---

<h2 align=center>
3) Visualizing Nested Loops
</h2>

This code prints a 3x4 grid of stars:

```java
for (int row = 1; row <= 3; row++) {
    for (int col = 1; col <= 4; col++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

Output:

```text
* * * * 
* * * *
* * * *
```

---

<h2 align=center>
4) Key Rules to Remember
</h2>

- The inner loop finished **every time** the outer loop runs
- Each loop needs its **own counter variable**
- Indentation is important for readability

---

<h2 align=center> Mini Project — {{Mini Project Title}} </h2>

### Objective

{{What the student should create or accomplish}}

{{JavaFileName.java}}
```java
public class {{JavaFileName}} {
    public static void main(String[] args) {
        // Insert your code here
    }
}
```
*Hint: {{Optional hint}}*

### Rules
- ❌ {{Rule 1}}
- ❌ {{Rule 2}}
- ❌ {{Rule 3}}
- ✅ {{Allowed actions}}

### Requirements
{{Detailed requirements for the project}}

### Basic Example (yours should be different)
```text
{{Example output}}
```

### Common Mistakes
- {{Mistake 1}}
- {{Mistake 2}}
- {{Mistake 3}}

<h2 align=center> Quick Recap </h2>

- {{Key takeaway 1}}
- {{Key takeaway 2}}
- {{Key takeaway 3}}
- {{Key takeaway 4}}

Next lesson, you'll be ready to {{transition to next lesson}}
