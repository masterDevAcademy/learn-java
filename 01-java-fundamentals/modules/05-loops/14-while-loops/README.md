<h1 align="center">
Lesson 14: While Loops
</h1>

## Lesson Goal
Learn how to use a `while` loop to repeat actions **as long as a condition is true**.

Up to this point, your programs ran from top to bottom one time. Now, programs can repeat actions, process multiple inputs, and simulate turns in a game.

By the end, you'll be able to write loops that continue running until a stop condition is reached.

---

<h2 align=center>
1) What is a While Loop?
</h2>

A `while` loop repeats a block of code while a condition remains true.

```java
// Example code snippet
while (condition) {
    // code runs repeatedly
}
```

Before each loop, Java checks the condition:
- If **true**, the loop runs
- If **false**, the loop stops

---

<h2 align=center>
2) Example: Countdown
</h2>

```java
int count = 5;

while (count > 0) {
    System.out.println(count);
    count--;
}
```

This prints numbers from 5 down to 1.

---

<h2 align=center>
Changing the Loop Variable
</h2>

A loop must eventually stop. That means **something inside the loop must change**.

```java
int lives = 3;

while (lives > 0) {
    System.out.println("You are alive!");
    lives--;
}
```

If `lives` never changes, the loop would run forever (an *infinite loop*).

---

<h2 align=center>
Sentinel Values
</h2>

A **sentinel value** is a special value that tells a loop when to stop.

Example: Using `-1` to quit.

```java
int number = 0;

while (number != -1) {
    System.out.println("Enter a number (-1 to quit): ");
    number = scanner.nextInt();
}
```

When the user enters `-1`, the loop stops.

---

<h2 align=center> Mini Project — Points Tracker </h2>
Create a program that allows a player to enter numbers representing points earned in different rounds. The loop continues until the player enters a sentinel value to quit.

This introduces **input loops**, **sentinel values**, and **tracking totals**.

### Objective
Create a Java program that:
- Continuously asks the user to enter numbers 
- Stops when the user enters a sentinel value (like `-1`) 
- Tracks how many numbers were entered
- Tracks the total of all numbers entered
- Displays the results when the loop ends


### Rules
- ❌ No `for` loops
- ❌ No arrays yet
- ❌ No methods
- ✅ Use a `while` loop and a sentinel value

### Requirements
Your program must:
- Use a `while` loop
- Use a sentinel value to stop the loop
- Track: 
    - Count of numbers entered
    - Sum of numbers entered
- Print a summary at the end

### Basic Example (yours should be different)
```text
Enter numbers to track points. Enter -1 to quit.
Enter points: 10
Enter points: 5
Enter points: 12
Enter points: -1

Rounds Played: 3
Total Points: 27
```

### Common Mistakes
- Forgetting to update the loop variable
- Using the sentinel value incorrectly
- Creating an infinite loop by never changing the condition
- Placing `scanner.nextInt()` outside the loop

<h2 align=center> Quick Recap </h2>

- A `while` loop runs as long as its condition is true
- A sentinel value tells the loop when to stop
- Loop variables must change to avoid infinite loops

Next lesson, you'll be ready to repeat actions a specific number of times using a **for loop**.
