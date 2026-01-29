<h1 align="center">
Lesson 12: Nested Conditionals
</h1>

## Lesson Goal
Learn how to use **nested `if` statements** to handle more complex decision-making.

In the previous lesson, you learned how programs choose between outcomes using `if / else if / else`. Sometimes, a decision depends on **another decision**. That's when we use **nested conditionals**.

By the end, you'll be able to structure layered logic clearly and read nested decision trees.

---

<h2 align=center>
1) What Are Nested Conditionals?
</h2>

A nested conditional is an `if` statement **inside another `if` statement**.

```java
if (questTier == 3) {
    if (reputation >= 70) {
        System.out.println("Legendary reward!");
    } else {
        System.out.println("Rare reward!");
    }
}
```

The inner `if` only runs if the outer `if` condition is true. 

---

<h2 align=center>
2) Why Nest Conditionals?
</h2>

Example in a game:
1. First check the **quest difficulty**
2. Then check the **player's reputation**
3. Then decide the reward

This creates **layers** of logic.

---

<h2 align=center>
3) Reading Nested Logic
</h2>

Indentation helps show structure:

```java
if (difficulty == 3) {
    if (reputation >= 70) {
        reward = "Legendary";
    } else {
        reward = "Rare";
    }
} else {
    reward = "Common";
}
```

Always read nested conditionals from **top to bottom**, following the branches.

---

<h2 align=center>
4) Keeping Nested Code Readable
</h2>

Nested logic can get messy if not formatted well.

✔ Use consistent indentation
✔ Keep conditions simple
✔ Add comments if needed

---

<h2 align=center>
Mini Project — Quest Reward System
</h2>

Create a program the determines the reward a player earns after completing a quest.

This project uses **nested conditionals** to simulate layered game rules.

### Objective

Create a Java program that:
- Stores quest difficulty and player stats
- Uses nested `if` statements to determine the reward tier
- Prints the final reward earned


### Rules
- ❌ No loops
- ❌ No methods
- ❌ No user input required
- ✅ Nested `if` statements and output only

### Requirements
Your program must:
- Declare and initialize 
    - `int questDifficulty` (1 = Easy, 2 = Normal, 3 = Hard)
    - `int reputation` (0-100)
    - `boolean hasGuildBadge`
- Use nested conditionals to follow these rules:

    | Quest Difficulty | Condition | Reward |
    |------------------|-----------|--------|
    | Hard (3) | reputation >= 70 | Legendary |
    | Hard (3) | reputation < 70 | Rare |
    | Normal (2) | hasGuildBadge | Rare |
    | Normal (2) | no badge | Common |
    | Easy (1) | (any) | Common |

- Print the reward clearly
- Compile and run successfully 

### Starter Template 
```java
public class QuestRewardSystem{
    public static void main(String[] args) {

        int questDifficulty = 3;
        int reputation = 65;
        boolean hasGuildBadge = false;

        String reward = "";

        // Write nested decision logic here

        // Print results here
    }
}
```

### Basic Example (yours should be different)
```text
QUEST REWARD RESULT 
===================
Quest Difficulty: 3
Reputation: 65
Guild Badge: false
Reward Earned: Rare
```

### Common Mistakes
- Forgetting that inner `if` runs only if outer condition is true
- Mixing up which conditions belong inside others
- Forgetting braces `{}` around nested blocks
- Poor indentation making logic hard to read

<h2 align=center> Quick Recap </h2>

- Nested conditionals are `if` statements inside other `if` statements
- They are used when decisions depend on multiple layers
- Indentation makes nested logic readable

Next lesson, you'll learn how to **validate user input** and handle incorrect or unexpected values safely.
