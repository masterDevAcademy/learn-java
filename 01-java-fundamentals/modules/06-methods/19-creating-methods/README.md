<h1 align="center">
Lesson 19: Creating Methods
</h1>

## Lesson Goal
Learn how to create your own methods to organize and reuse code.

Up to now, all program logic has lived inside the `main` method. As programs grow, this becomes messy and hard to manage. Methods allow us to break programs into smaller, focused tasks.

By the end, you'll be able to define and call methods to perform specific actions.

---

<h2 align=center>
1) What is a method?
</h2>

A **method** is a named block of code that performs a task.

Instead of writing the same code multiple times, you can place it in a method and call it whenever you need it.

```java
public static void showMessage() {
    System.out.println("Welcome to the game!");
}
```

---

<h2 align=center>
2) Method Structure
</h2>

A basic method looks like this:

```java
public static void methodName() {
    // code here
}
```
<div align=center>

| Part | Meaning | 
|------|---------|
| `public` | Accessible from other classes (we'll explore this later) |
| `static` | Belongs to the class, not an object |
| `void` | Does not return a value | 
| `methodName` | Name of the method |
| `()` | Holds parameters (empty for now) |
| `{}` | Body of the method |

</div>

---

<h2 align=center>
3) Calling a Method 
</h2>

A method only runs when it is **called**.

```java 
public static void main(String[] args) {
    showMessage();
}
```

When the program runs, it jumps to the method and executes its code.

---

<h2 align=center>
4) Why Use Methods?\
</h2>

Methods help you:
- Avoid repeating code
- Make programs easier to read
- Break large problems into smaller steps
- Reuse logic in multiple places

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
