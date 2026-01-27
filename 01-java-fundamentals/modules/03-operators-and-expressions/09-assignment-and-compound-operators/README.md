<h1 align="center">Lesson 9: Assignment & Compound Operators</h1>

## Lesson Goal
Learn how to **update and modify values over time** using assignment, compound operators, and increment/decrement.

So far, variables have held fixed values. In this lesson, variables begin to **change**, allowing programs to track progress, totals, and state across multiple steps.

By the end, you'll be understand how Java updates values efficiently and read expressions that modify data in place.

---

<h2 align=center>
1) Assignment Operator (<code>=</code>)
</h2>

The assignment operator stores a value in a variable.

```java
int score = 0;
```
This sets the `score` to `0`;

---

<h2 align=center> 2) Updating Variables </h2>

Variables can be reassigned using their current value.

```java
score = score + 10;
```
This pattern is very common — so Java provides shortcuts.

---

<h2 align=center> 3) Compound Assignment Operators </h2>

Compound operators combine assignment with arithmetic.

```java
score += 10; // same as score = score + 10
score -= 5;
score *= 2;
score /= 2;
```
These operators:
- Reduce repetition
- Improve readability
- Are used constantly in real programs.

---

<h2 align=center> 4) Increment & Decrement </h2>

The increment and decrement operators add or subtract 1.

```java
score++;
lives--;
```
These are commonly used for:
- Counting rounds
- Tracking attempts
- Updating totals step-by-step

---

<h2 align=center> Mini Project — Lives Tracker </h2>

Create a program that tracks a player's remaining lives as events occur during gameplay.

This project focuses on **updating variables overtime** using assignment, compound operators, and increment/decrement — without using loops or conditionals

### Objective

Create a Java program that:
- Starts a player with a fixed number of lives
- Updates the lives count as player takes damage or gains bonuses
- Prints the number of lives after each event

### Rules
- ❌ No loops
- ❌ No conditionals
- ❌ No user input required
- ❌ No randomization
- ✅ Assignment, compound operators, and increment/decrement only

### Requirements
Your program must:
- Declare an initial `int` variable for lives
- Update the lives count **at least 4 times**
- Use at least:
    - One compound operator (`+=` or `-=`)
    - One increment or decrement (`++` or `--`)
- Print the lives count after each update
- Compile and run successfully

### Basic Example (yours should be different)
```text
Starting Lives: 5
After hit: 4
After heavy hit: 3
After bonus life: 4
Final lives: 3
```

### Common Mistakes
- Forgetting that `--` and `++` change the variable immediately
- Reassigning lives incorrectly (`lives =- 1` instead of `lives -= 1`)
- Hardcoding results instead of updating the variable
- Using logic or conditions too early

---

<h2 align=center> Quick Recap </h2>

- `=` assigns a value to a variable
- Compound operators update variables in place
- `++` and `--` change values by one
- Variables can evolve as a program runs

Next lesson, you'll be ready to to **compare values and evaluate rules** using relational and logical operators
