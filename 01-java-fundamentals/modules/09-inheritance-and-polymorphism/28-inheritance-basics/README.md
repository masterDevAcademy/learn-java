<h1 align="center">
Lesson 28: Inheritance Basics
</h1>

## Lesson Goal
Learn how one class can inherit fields and methods from using inheritance.

Instead of rewriting the same code in multiple classes, inheritance allows a new class to reuse the features of an existing class.

By the end, you'll understand how to create a subclass using the `extends` keyword and how they share behavior with a parent class.

---

<h2 align=center>
1) What Is Inheritance?
</h2>

**Inheritance** allows one class to gain the fields and methods of another class.

The original class is called the **parent** or **base** class.

The new class is called the **child** or **subclass**.

---

<h2 align=center>
2) The <code>extends</code> Keyword
</h2>

You create a subclass using `extends`.

```java
class Character {
    String name;
    int level;
}

class Warrior extends Character {
    int strength;
}
```

The `Warrior` class now has:
- `name`
- `level`
- `strength`

---

<h2 align=center>
3) Creating Objects from Subclasses
</h2>

You can create objects from subclasses just like any other class.

```java
Warrior hero = new Warrior();
hero.name = "Thorn";
hero.level = 10;
hero.strength = 15;
```

The subclass object contains both inherited and new fields.

---

<h2 align=center>
4) Why Use Inheritance?
</h2>

Inheritance helps by:
- Avoiding repeated code
- Organizing related classes
- Making programs easier to expand

Instead of writing separate fields for every character type, you define common features once in the base class.

---

<h2 align=center> Mini Project — Character Classes </h2>
Create a base `Character` class and specialized subclasses for different character types.

This project reinforces:
- Inheritance structure
- Sharing fields between classes
- Adding unique fields in subclasses

### Objective
Create a Java program that:
- Defines a base `Character` class with common fields
- Defines at least two subclasses (example: `Warrior`, `Mage`)
- Adds unique fields to each subclass
- Creates objects from each subclass
- Prints their data

### Rules
- ❌ No method overriding yet
- ❌ No polymorphism yet
- ❌ No user input required
- ✅ Focus on fields and inheritance

### Requirements
Your program must:
- Create a base class with at least two fields
- Create at least two subclasses using `extends`
- Add at least one unique field to each subclass
- Create at least one object of each subclass
- Print all object data
- Compile and run successfully

### Basic Example (yours should be different)
```text
CHARACTERS
==========
Warrior: Thorn, Level 10, Strength 15
Mage: Lyra, Level 8, Mana 20
```

### Common Mistakes
- Forgetting to use `extends`
- Trying to redeclare fields already in the parent class
- Confusing parent and child class roles
- Forgetting that subclasses inherit fields automatically

<h2 align=center> Quick Recap </h2>

- Inheritance lets one class reuse another class's features
- The `extends` keyword creates a subclass
- Subclasses inherit fields from their parent class
- Subclasses can also add their own unique fields.

Next lesson, you'll learn how subclasses can change inherited behavior using **method overriding and polymorphism**.
