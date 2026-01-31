<h1 align="center">
Lesson 23: Looping Through Arrays
</h1>

## Lesson Goal
Learn how to use loops to process every element in an array.

In the previous lesson, you access array elements one at a time using index numbers. Now, you'll use loops to automatically move through the entire array.

By the end of this lesson, you'll be able to calculate totals and averages using array data.

---

<h2 align=center>
1) What Loop Through Arrays?
</h2>

Arrays often hold many values. Instead of writing separate lines of code for each one, we use loops to process them all.

Example array:

```java
int[] damageLog = {8, 12, 5, 10, 7};
```

A loop lets us work with each value automatically.

---

<h2 align=center>
2) Using a <code>for</code> Loop with Indexes
</h2>

```java
for (int i = 0; i < damageLog.length; i++) {
    System.out.println("Hit " + (i + 1) + ": " + damageLog[i]);
} 
```

- `i` is the index
- `damageLog[i] is the value at that position

---

<h2 align=center>
3) Using an Enhanced <code>for</code> Loop
</h2>

Java also has a simpler loop for arrays:

```java
for (int damage : damageLog) {
    System.out.println("Damage: " + damage);
}
```

This loop gives you each value directly, without using indexes.


---

<h2 align=center>
4) Calculating Totals
</h2>

You can use a loop to add all values together.

```java
int totalDamage = 0;

for (int damage : damageLog) {
    totalDamage += damage;
}
```

---

<h2 align=center>
5) Calculating Averages
</h2>

To calculate the average:

```java
double averageDamage = (double) totalDamage / damageLog.length;
```

---

<h2 align=center> Mini Project — Damage Log Analyzer </h2>
Create a program that analyzes damage dealt during a battle.

You'll store damage using values in an array, then use loops to calculate statistics.

This project reinforces:
- Looping through arrays
- Using `.length`
- Calculating totals and averages

### Objective

Create a Java program that:
- Stores multiple damage values in an array
- Prints each hit's damage
- Calculates average damage
- Displays a summary at the end

### Rules
- ❌ No user input required
- ❌ No nested loops
- ❌ No arrays of Strings
- ✅ Use loops and an int[] array

### Requirements
Your program must:
- Create an `int[]` array with at least 8 damage values
- Use a loop to print each value
- Use a loop to calculate the total damage
- Calculate the average damage as a `double`
- Print all results clearly
- Compile and run successfully

### Basic Example (yours should be different)
```text
DAMAGE LOG
==========
Hit 1: 8
Hit 2: 12
Hit 3: 5
Hit 4: 10
Hit 5: 7
Hit 6: 9
Hit 7: 11
Hit 8: 6

Total Damage: 68
Average Damage: 8.5
```

### Common Mistakes
- Using `<=` instead of `<` in the loop condition
- Forgetting to initialize the total variable
- Dividing integers instead of casting to double
- Forgetting to use `.length`

<h2 align=center> Quick Recap </h2>

- Loops let you process every element in an array 
- `.length` tells how many elements exist 
- Totals and averages are common loop patterns

Next lesson, you'll learn how to **search arrays and use logic with array data**.
