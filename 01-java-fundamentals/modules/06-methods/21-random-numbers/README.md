<h1 align="center">
Lesson 21: Random Numbers
</h1>

## Lesson Goal
Learn how to generate random numbers in Java and use them to add unpredictability to programs.

So far, your programs have followed predictable logic. Now, you'll introduce randomness — a key feature in games, simulations, and real-world applications.

By the end of this lesson, you'll be able to use Java's `Random` class to generate numbers within specific ranges.

---

<h2 align=center>
1) Importing the Random Class
</h2>

Java provides a built-in class for randomness called `Random`

To use it, you must import it:

```java
import java.util.Random;
```

---

<h2 align=center>
2) Creating a Random Object
</h2>

You create a `Random` object to generate values.

```java
Random random = new Random();
```


---

<h2 align=center>
3) Generating Random Integers
</h2>

The `nextInt()` method generates a random number.

```java 
int number = random.nextInt(6);
```

This produces values from **0 to 5**.

To shift the range:

```java
int diceRoll = rand.nextInt(6) + 1;
```

Now the range is **1 to 6**.

---

<h2 align=center>
4) Using Random Numbers in Programs
</h2>

Random values can simulate:
- Dice rolls
- Loot drops
- Enemy attacks
- Coin flips

Example:

```java
int damage = random.nextInt(10) + 1;
System.out.println("You dealt " + damage + "damage!");
```


---

<h2 align=center> Mini Project — Enemy Encounter Simulator</h2>
Create a program that simulates random enemy encounters as a player travels through a dangerous area.

Each step the player takes has a chance of triggering an encounter. You'll use random numbers to determine when enemies appear.


This project reinforces: 
- Using `Random` class
- Generating numbers in a range
- Using randomness inside a loop
- Tracking totals

### Objective
Create a Java program that: 
- Simulates multiple steps taken by a player
- Uses a random number to decide if an enemy appears
- Tracks how many encounters happen
- Displays a summary at the end



### Rules
- ❌ No arrays yet
- ❌ No methods required
- ❌ No user input required
- ✅ Use `Random` and a loop

### Requirements
Your program must:
- Create a `Random` object
- Use a loop to simulate at least 10 travel steps
- Generate a random number each step to determine if an encounter occurs
- Use a condition to decide if an enemy appears (example: 1 in 4 chance)
- Track and display the total number of encounters
- Compile and run successfully

### Basic Example (yours should be different)
```text
Step 1: Area is clear.
Step 2: Enemy encountered!
Step 3: Area is clear.
Step 4: Area is clear.
Step 5: Enemy encountered!
Step 6: Area is clear.
Step 7: Area is clear.
Step 8: Enemy encountered!
Step 9: Area is clear.
Step 10: Area is clear.

Total Encounters: 3
```

### Common Mistakes
- Forgetting to import `java.util.Random`
- Forgetting to create a `Random` object
- Misunderstanding that `nextInt(4)` produces 0-3
- Not updating the encounter counter

<h2 align=center> Quick Recap </h2>

- The `Random` class generates random values
- `nextInt(n) produces values from 0 to n-1
- Adding 1 shifts the range
- Random numbers make programs dynamic and unpredictable

Next module, you'll learn how to store multiple values using arrays.
