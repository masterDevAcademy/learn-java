<h1 align="center">
Lesson 11: 
    <code>if</code>,
    <code>else if</code>,
    <code>else</code>
</h1>

## Lesson Goal
Learn how Java programs **make decisions** using `if`, `else if`, and `else`. 

Up to this point, your programs could **store data**, **perform calculations**, **and evaluate conditions**. Now, programs will begin to **act differently depending on those conditions**.

By the end, you'll be able to write branching logic that produces outcomes based on program state.

---

<h2 align=center>
1) The <code>if</code> Statement
</h2>

An `if` statement runs a block of code **only if** a condition is true.  

```java
if (health <= 0) {
    System.out.println("Game Over");
}
```

If the condition inside the parentheses is `true`, the code inside the braces runs. If it's `false`, it is skipped.

---

<h2 align=center>
2) The <code>else</code> Statement
</h2>

An `else` block runs when the `if` condition if false.

```java
if (health <= 0) {
    System.out.println("Game Over");
} else {
    System.out.println("Still alive!");
}
```

Only **one branch** will run.

---

<h2 align=center>
3) The <code>else if</code> Ladder
</h2>

When there are **multiple possible outcomes**, you can chain conditions.

```java
if (roll == 20) {
    System.out.println("Critical Hit!");
} else if (roll >= armorClass) {
    System.out.println("Hit");
} else {
    System.out.println("Miss!");
}
```

Java checks conditions **in order** and stops at the first true one.

---

<h2 align=center>
4) Condition Order Matters
</h2>

More specific conditions must come **before** broader ones.

❌ Wrong order:
```java
if (roll >= armorClass) {
    System.out.println("Hit");
} else if (role == 20){
    System.out.println("Critical Hit!");
}
```

✔ Correct order:
```java
if (roll == 20) {
    System.out.println("Critical Hit!");
} else if (roll >= armor class) {
    System.out.println("Hit!");
}
```

The critical hit would never be reached in the first example.

---

<h2 align=center> Mini Project — Combat Outcome Calculator</h2>

Build a small program that determines the outcome of a combat attack.

This project introduces **branching logic** using game-style rules. 

### Objective

Create a Java program that:
- Stores an attack roll and enemy armor class
- Uses `if / else if / else` to determine the attack result
- Prints whether the attack was a **critical hit**, **hit**, or **miss**


### Rules
- ❌ No loops
- ❌ No methods (keep everything in `main` for now)
- ❌ No complex math or damage systems
- ✅ Conditionals and output only

### Requirements
Your program must:
- Declare and initialize:
    - `int attackRoll`
    - `int armorClass`
- Use:
    - One `if`
    - At lease one `else if`
    - One `else`
- Follow this logic:

    | Condition | Result |
    |-----------|--------|
    |`attackRoll == 20` | Critical Hit |
    |`attackRoll >= armorClass` | Hit|
    | Otherwise | Miss |

- Print the result clearly
- Compile and run successfully

### Starter Template

```java
public class CombatCalculator {
    public static void main(String[] args) {

        int attackRoll = 18;
        int armorClass = 15;

        // Write your decision logic here
    }
}
```

### Basic Example (yours should be different)
```text
ATTACK RESULT 
=============
Attack Roll: 18
Armor Class: 15
Outcome: Hit!
```

### Common Mistakes
- Using `=` instead of `==`
- Forgetting that only one branch runs
- Putting conditions in the wrong order
- Forgetting braces `{}`

<h2 align=center> Quick Recap </h2>

- `if` runs code when a condition is true
- `else` runs when previous conditions were false
- `else if` allows multiple condition checks
- Conditions are checked **top to bottom**

Next lesson, you'll learn how to handle **multiple layers of decisions** using nested conditionals.
