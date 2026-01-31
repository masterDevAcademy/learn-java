<h1 align="center">
Lesson 26: Constructors
</h1>

## Lesson Goal
Learn how constructors initialize objects when they are created.

In the previous lesson, you created objects and then manually assigned values to their fields. Constructors allow us to set up an object **automatically at the moment it is created**.

By the end of this lesson, you'll understand how constructors work and how they make object creation cleaner and more reliable.
---

<h2 align=center>
1) What Is a Constructor?
</h2>

A **constructor** is a special method that runs when an object is created.

It is used to set up the object's starting values.

```java
public class Character {
    String name;
    int level;
    int health;

    public Character(String n, int l, int h) {
        name = n;
        level = l;
        health = h
    }
} 
```
This constructor sets the fields when the object is made.

---

<h2 align=center>
2) Creating an Object with a Constructor
</h2>

Instead of assigning values later, you pass them in when creating the object:

```java
Character hero = new Character("Aria", 5 80);
```

The constructor runs automatically and assigns the values.

---

<h2 align=center>
3) No-Argument Constructors
</h2>

A constructor can also have **no parameters**.

```java
public Character() {
    name = "Unknown";
    level = 1;
    health = 100;
}
```

This sets default values for new objects.

---

<h2 align=center>
4) Multiple Constructors
</h2>

A class can have more than one constructor.

```java
public Character(String n) {
    name = n;
    level = 1;
    health = 100;
}
```

Java chooses the constructor based on the arguments provided.

---

<h2 align=center> Mini Project — Companion Class </h2>

Create a class that represents a player's companion or pet, using constructors to initialize different starting values.


This project reinforces::
- Writing constructors
- Using parameters
- Setting object fields during creation

### Objective

Create a Java program that:
- Defines a `Companion` class
- Includes fields for: 
    - Name
    - Type (e.g., Wolf, Dragon, Falcon)
    - Health
- Uses a constructor to set these values when an object is created
- Created multiple objects with different starting data
- Prints each companion's information

### Rules
- ❌ No getters/setters yet
- ❌ No methods besides constructors
- ❌ No user input
- ✅ Use constructors to set values

### Requirements
Your program must:
- Define at least one constructor with parameters
- Use the constructor to initialize object fields
- Create at least two different objects
- Print each object's information
- Compile and run successfully

### Basic Example (yours should be different)
```text
COMPANIONS
==========
Name: Princess Donut, Type: Cat, Level: 3
Name: Ember, Type: Dragon, Level: 7
```

### Common Mistakes
- Forgetting that the constructor name must match the class name 
- Adding a return type (constructors do not have one)
- Forgetting to use parameters inside the constructors
- Trying to call the constructor like a normal method

<h2 align=center> Quick Recap </h2>

- Constructors run when objects are created
- They initialize an object's starting values
- Constructors can have parameters or no parameters
- A class can have multiple constructors

Next lesson, you'll learn how to protect data using **encapsulation with getters and setters**
