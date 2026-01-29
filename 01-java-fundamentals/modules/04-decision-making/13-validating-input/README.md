<h1 align="center">
Lesson 13: Validating Input
</h1>

## Lesson Goal
Learn how to **validate user input** and handle invalid values safely.

Programs shouldn't assume users will always enter correct data. In this lesson, you'll learn how to check input and stop problems **before** they cause errors or incorrect behavior.

By the end, you'll be able to write guard checks that protect your program and display helpful error messages.

---

<h2 align=center>
1) Why Input Validation Matters
</h2>

Users can enter unexpected values:
- Negative numbers
- Empty text
- Values outside a valid range

If a program doesn't check input, it can behave incorrectly or crash.

Validation helps programs stay safe and predictable.

---

```java

<h2 align=center>
2) Guard Clauses
</h2>

A **guard clause** checks for a bad condition early and handles it immediately.

```java
if (age < 0) {
    System.out.println(Age cannot be negative.");
    return;
}
```

This stops the program early when input is invalid.

---

<h2 align=center>
Early return
</h2>

The `return;` statement ends the method immediately.

In `main`, it stops the program from continuing.

```java
if (password.length() < 8) {
    System.out.println("Password is too short.");
    return;
}
```

This prevents the rest of the code from running with bad data.

---

<h2 align=center>
4) Clear Error Messages
</h2>

Good validation tells the user **what went wrong** and **what to fix**.

❌ Bad message:
```text
Invalid input.
```

✔ Better message:
```text
Password must be at least 8 characters long.
```

---

<h2 align=center>
Mini Project — Character Creation Validator
</h2>

Before a character can begin their adventure, their stats must follow the game's rules.

In this project, you'll validate character creation data and stop the program early if something is invalid.

This introduces **guard clauses**, **early return**, and **clear feedback messages**.

### Objective

Create a Java program that:
- Store character creation information in variables
- Checks each value against game rules
- Strops early and prints an error message if any rule fails
- Prints a success message if all rules pass

### Rules
- ❌ No loops
- ❌ No methods
- ❌ No advances string techniques
- ✅ `if` statements, logical operators, and output.

### Requirements
Your program must declare and initialize:
- `String characterName`
- `String characterClass`
- `int level`
- `int health`

Then validate these rules **in order** using guard clauses:

|Rules | Condition|
|------|----------|
| Name cannot be empty | `characterName.length() > 0` |
| Class must be Warrior, Mage, or Rogue | match one of three valid options |
| Level must be between 1 and 60 | `level >= 1 && level <= 60` |
| Health must be greater than 0 | `health > 0` |

If any rule fails:
- Print a clear error message 
- End the program using `return`

If all rules pass, print:
```text
Character created successfully!
```

### Starter Template

```java
public class CharacterCreationValidator {
    public static void main(String[] args) {

        String characterName = "Arya"
        string characterClass  = "Mage"
        int level = 12;
        int health = 85;

        // Write validation checks here

        // Print results here
    }
}
```

### Example Output (Invalid Name)
> Character name cannot be empty.

### Example Output (Invalid Class)
> Class must be Warrior, Mage, or Rogue.

### Example Output (Valid Character)
> Character created successfully!

### Common Mistakes
- Forgetting to stop the program with `return`
- Checking rules out of order
- Writing unclear or vague error messages
- Using `=` instead of `==` when comparing values
- Trying to use loops or extra methods

<h2 align=center> Quick Recap </h2>

- Programs should never assume input is correct
- Guard clauses catch problems early
- `return` stops execution when input is invalid
- Clear error messages help users fix mistakes. 

Next lesson, you'll be ready to {{transition to next lesson}}
