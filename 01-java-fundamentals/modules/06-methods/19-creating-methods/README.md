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
4) Why Use Methods?
</h2>

Methods help you:
- Avoid repeating code
- Make programs easier to read
- Break large problems into smaller steps
- Reuse logic in multiple places

---

<h2 align=center> Mini Project — Game Message System </h2>
Create a program that uses methods to display different game messages.

Instead of writing all messages directly in `main`, you'll organize them into separate methods.

### Objective
Create a Java program that: 
- Defines multiple methods to display game-related messages
- Call those methods from `main`
- Keeps `main` short and readable


### Rules
- ❌ No return values yet
- ❌ No parameters yet
- ❌ No loops required
- ✅ Use `void` methods and method calls

### Requirements
Your program must:
- Define at least **three methods** besides `main`
- Each method must print a different message (examples: battle start, victory, damage taken)
- Call all methods from inside `main`
- Keep `main` clean and organized

### Basic Example (yours should be different)
```text
A wild enemy appears!
You take 10 damage!
Victory! You earned rewards.
```

### Common Mistakes
- Forgetting to call a method from `main`
- Placing methods inside `main` (not allowed)
- Misspelling the method name when calling it
- Forgetting parentheses when calling a method

<h2 align=center> Quick Recap </h2>

- Methods group related code into reusable units
- Methods must be **defined** and then **called**
- `void` methods do not return values
- Methods help keep programs organized

Next lesson, you'll learn how methods can accept input and return results using **parameters and return values**.