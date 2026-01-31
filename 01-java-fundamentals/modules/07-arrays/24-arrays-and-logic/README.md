<h1 align="center">
Lesson 24: Arrays + Logic
</h1>

## Lesson Goal
Learn how to combine arrays with decision-making logic.

Arrays store multiple values, but programs become powerful when they can **analyze** that data. In this lesson, you'll use loops and conditionals together to search arrays and count specific values.

By the end of this lesson, you'll be able to scan arrays and make decisions based on its contents.

---

<h2 align=center>
1) Searching an Array
</h2>

You can check each element to see if it matches a condition.


```java
String[] enemies = {"Goblin", "Wolf", "Goblin", "Bandit"};

for (int i = 0; i < enemies.length; i++) {
    if (enemies[i].equals("Goblin")) {
        System.out.println("Goblin found at position " + i);
    }
}
```


---

<h2 align=center>
2) Counting Matches
</h2>

You can count how many times something appears

```java
int goblinCount = 0;

for (String enemy: enemies) {
    if (enemy.equals("Goblin")) {
        goblinCount++;
    }
}
```

---

<h2 align=center>
3) Combining Arrays and Logic
</h2>

This pattern allows programs to::
- Count occurrences
- Filter values
- Track categories

These skills are used in data analysis, games, and simulations.

---

<h2 align=center> Mini Project — Encounter Tracker </h2>
Create a program that analyzes a list of enemies encountered during an adventure.

This project reinforces:
- Searching arrays
- Counting matches 
- Using conditionals inside loops

### Objective

Create a Java program that:
- Stores a list of enemy encounters in an array
- Counts how many times each enemy type appears
- Displays a summary report

### Rules
- ❌ No user input required
- ❌ No nested loops
- ❌ No arrays of Strings
- ✅ Use a `String[]` array and conditional logic

### Requirements
Your program must:
- Create an `String[]` array with at least 12 enemy names
- Include at least 3 different enemy types
- Use a loop to count each enemy type
- Print totals for each enemy
- Print total number of encounters
- Compile and run successfully

### Basic Example (yours should be different)
```text
ENCOUNTER REPORT
================
Goblin: 5
Wolf: 4
Bandit: 3
Total Encounters: 12
```

### Common Mistakes
- Using `==` instead of `.equals()` for Strings
- Forgetting to increment counters
- Forgetting to include all enemy types in conditions
- Misplacing braces

<h2 align=center> Quick Recap </h2>

- Arrays can be searched using loops
- Conditionals let you analyze array data
- Counting matches is a common programming pattern

Next module, you'll learn how to build your own **objects and classes**.
