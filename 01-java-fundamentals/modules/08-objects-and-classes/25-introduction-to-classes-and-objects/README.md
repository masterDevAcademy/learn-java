<h1 align="center">
Lesson 25: Introduction to Classes and Objects
</h1>

## Lesson Goal
Learn what classes and objects are and how to create them in Java.

Up to now, your programs have stored data in variables and arrays. Object-oriented programming allows us to group related data and behavior into **objects**, which are created from **classes**.

By the end, you'll understand how to define a class, create objects, and access their data.

---

<h2 align=center>
1) What Is a Class?
</h2>

A **class** is a blueprint for creating objects

It defines:
- What data an object stores (**fields**)
- What actions it can perform (**methods**)

```java
public class Character {
    String name;
    int level;
    int health;
} 
```
This class describes what every `Character` object will have.

---

<h2 align=center>
2) What Is an Object?
</h2>

An **object** is an instance of a class.

You create an object using the `new` keyword:

```java
Character hero = new Character();
```

Now `hero` is a real object with its own data

---

<h2 align=center>
3) Assigning Values to Object Fields
</h2>

You can store values inside the object's fields:

```java
hero.name = "Aria";
hero.level = 5;
hero.health = 80;
```
Each object keeps its own copy of these values.

---

<h2 align=center>
4) Accessing Object Data
</h2>

You can read the values stored in an object:

```java
System.out.println(hero.name);
System.out.println(hero.level);
System.out.println(hero.health);
```

---

<h2 align=center> Mini Project — Character Class </h2>

Create a class that represents a game character.

Then create an object from that class and display its information

This introduces:
- Creating classes 
- Creating objects 
- Using object fields

### Objective

Create a Java program that:
- Defines a `Character` class
- Includes fields for: 
    - Name
    - Level
    - Health
- Creates at least one `Character` object
- Assigns values to the object's fields
- Prints the character's information

### Rules
- ❌ No constructors yet
- ❌ No methods inside the class yet
- ❌ No user input
- ✅ Focus only on fields and objects

### Requirements
Your program must:
- Define a class with at least three fields
- Create at least one object using `new`
- Assign values to each field
- Print the object's data clearly
- Compile and run successfully

### Basic Example (yours should be different)
```text
CHARACTER INFO
==============
Name: Aria
Level: 5
Health: 80
```

### Common Mistakes
- Forgetting to create the object with `new`
- Trying to access fields without an object
- Misspelling the class or field names
- Placing the class inside `main`

<h2 align=center> Quick Recap </h2>

- A class is a blueprint
- An object is an instance of a class
- Objects store their own data
- Fields are accessed using dot notation

Next lesson, you'll learn how **constructors** automatically set up objects when they are created.
