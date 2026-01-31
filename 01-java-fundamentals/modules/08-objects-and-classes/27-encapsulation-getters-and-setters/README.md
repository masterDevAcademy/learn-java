<h1 align="center">
Lesson 27: Encapsulation (Getters and Setters)
</h1>

## Lesson Goal
Learn how to protect object data using encapsulation with getters and setters.

So far, your classes have allowed direct access to their fields. This can lead to problems, like setting invalid values. Encapsulation protects data by making fields private and controlling access through methods.

By the end of this lesson, you'll understand how to use getters and setters to keep object data safe
---

<h2 align=center>
1) What Is a Encapsulation?
</h2>

**Encapsulation** means keeping an object's data private and only allowing access through controlled methods.

Instead of:

```java
hero.health = -50; // Dangerous!
```

We use methods to prevent invalid values. 

---

<h2 align=center>
2) Making Fields Private
</h2>

Fields are made private so they can't be changed directly.

```java
class Character {
    private int health;
}
```

Now `health` cannot be accessed from outside the class.

---

<h2 align=center>
3) Getter Methods
</h2>

A **getter** returns the value of the private field.

```java
public int getHealth() {
    return health;
}
```

---

<h2 align=center>
4) Setter Methods
</h2>

A **setter** changes the value of a private field in a controlled way.

```java
public void setHealth(int h) {
    if (h >= 0) {
        health = h;
    }
}
```

This prevents negative health values.

---

<h2 align=center> Mini Project — Secure Character Profile</h2>

Create a character class that protects its data using encapsulation.


This project reinforces::
- Private fields
- Getters and setters
- Validating values before assigning them

### Objective

Create a Java program that:
- Defines a `Character` class with private fields
- Uses getters and setters to access and modify those fields
- Prevents invalid values using logic in setters
- Demonstrates using those methods in `main`

### Rules
- ❌ No direct access to fields
- ❌ No user input required
- ❌ No loops required
- ✅ Use getters and setters

### Requirements
Your program must:
- Have at least 3 private fields (example: name, level, health)
- Include a getter and setter for at least two fields
- Include validation in at least one setter (e.g., health cannot be negative)
- Create an object and modify it using setter methods
- Print values using getter methods
- Compile and run successfully

### Basic Example (yours should be different)
```text
CHARACTER PROFILE
=================
Name: Aria
Level: 5
Health: 100
```

### Common Mistakes
- Forgetting to make fields private
- Accessing fields directly instead of using getters/setters
- Not validating values in setters
- Forgetting to use `this` when needed (we'll expand on this later)

<h2 align=center> Quick Recap </h2>

- Encapsulation protects object data
- Fields are made private
- Getters return values
- Setters modify values safely

Next module, you'll learn how classes can build on each other using **inheritance and polymorphism**.
