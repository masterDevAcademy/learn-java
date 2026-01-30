<h1 align="center">
Lesson 15: For Loops
</h1>

## Lesson Goal
Learn how to use a `for` loop to repeat actions a **specific number of times**.

In the previous lesson, you used `while` loops to repeat based on a condition. Now, you'll learn how to use `for` loops when you already know **how many times** something should happen.

By the end, you'll be able to write loops that count up, count down, and follow predictable patterns.

---

<h2 align=center>
1) What is a For Loop?
</h2>

A `for` loop repeats code a set number of times using a loop counter.

```java
for (initialization; condition; update) {
    // code runs repeatedly
}
```

Each part has a role:

| Part | Purpose |
|------|---------|
| Initialization | Creates the loop counter |
| Condition | Determines when the loop stops | 
| Update | Change the counter each loop |

---

<h2 align=center>
2) Example: Count Up
</h2>

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

This prints numbers from 1 to 5

---

<h2 align=center>
3) Example: Counting Down
</h2>

```java
for (int i = 5; i > 0; i--) {
    System.out.println(i);
}
```

This prints numbers from 5 down to 1.

---

<h2 align=center>
When to Use a For Loop?
</h2>

Use a `for` loop when:
- You know exactly how many times something should repeat
- You are counting or tracking steps
- You want clean, compact loop structure

Use a `while` loop when:
- You repeat until a condition changes unpredictably

<h2 align=center> Mini Project — Level Countdown </h2>
Create a program that simulated a game countdown before a level begins.

This introduces **count-controlled loops** and loop counters.

### Objective
Create a Java program that:
- Uses a `for` loop to count down from a starting number
- Prints each number on a new line
- Prints a "GO!" message when the countdown finishes


### Rules
- ❌ No `while` loops
- ❌ No user input
- ❌ No nested loops
- ✅ Use a `for` loop and output

### Requirements
Your program must:
- Use a `for` loop
- Count down from at least 5 to 1
- Print "GO!" after the loop
- Compile and run successfully

### Basic Example (yours should be different)
```text
5
4
3
2
1
GO!
```

### Common Mistakes
- Forgetting to update the loop counter
- Using the wrong condition (like `<` instead of `<=`)
- Creating an infinite loop by never changing the counter
- Putting semicolons in the wrong place

<h2 align=center> Quick Recap </h2>

- A `for` loop repeats code a set number of times
- It includes initialization, condition, and update
- It's ideal for counting patters

Next lesson, you'll learn how to change loop behavior using **break** and **continue**.
