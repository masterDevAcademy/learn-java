<h1 align="center">
Lesson 22: Array Basics
</h1>

## Lesson Goal
Learn how to declare, create, and access arrays in Java.

Up to this point, your programs could only store one value per variable. Arrays allow programs to store **multiple related values** in a single structure.

By the end of this lesson, you'll understand how arrays are created, how they are indexed, and how to read and write values inside on them.

---

<h2 align=center>
1) What Is an Array?
</h2>

An **array** is a collection of values stored under one variable name.

Each value has a position called an **index**.

```java
String[] inventory = new String[5];
```

This creates an array that can hold **5 strings**.

---

<h2 align=center>
2) Index Positions
</h2>

Arrays indexes start at **0**, not 1.

<div align=center>

| Index | Value |
|-------|-------|
| 0 | First item |
| 1 | Second item |
| 2 | Third item |

</div>

If an array has length 5, the last index is **4**.

---

<h2 align=center>
3) Assigning Values
</h2>

You can store values at specific positions.

```java
inventory[0] = "Health Potion";
inventory[1] = "Iron Sword";
inventory[2] = "Torch";
```

Each slot now holds a value.

---

<h2 align=center>
4) Accessing Values
</h2>

You can read values from an array using their index.

```java
System.out.println(inventory[0]); // Health Potion
```

---

<h2 align=center>
5) Array Length
</h2>

Arrays have a built-in property called `length`.

```java
System.out.println(inventory.length); // 5
```

This tells you how many slots the array contains.

---

<h2 align=center> Mini Project — Inventory Slots (Fixed-Size Backpack) </h2>
Create a program that represents a player's backpack using an array.

The backpack has a fixed number of slots. Each slot can hold one item.

This project introduces:
- Declaring arrays
- Storing values by index
- Reading values from an array
- Understanding fixed-size storage

### Objective

Create a Java program that:
- Creates an inventory array with multiple slots
- Stores item names in each slot
- Prints each slot and its item
- Displays how many slots the backpack has

### Rules
- ❌ No loops required yet
- ❌ No user input
- ❌ No arrays of numbers yet
- ✅ Use `String[]` array and index access

### Requirements
Your program must:
- Declare a `String[]` array with at least 6 slots
- Assign item names to at least 5 slots
- Print each slot number and item name
- Print the total number of slots using `.length`
- Compile and run successfully

### Basic Example (yours should be different)
```text
BACKPACK INVENTORY
==================
Slot 1: Health Potion
Slot 2: Iron Sword
Slot 3: Torch
Slot 4: Map
Slot 5: Rope
Slot 6: Empty

Total Slots: 6
```

### Common Mistakes
- {{Mistake 1}}
- {{Mistake 2}}
- {{Mistake 3}}

<h2 align=center> Quick Recap </h2>

- {{Key takeaway 1}}
- {{Key takeaway 2}}
- {{Key takeaway 3}}
- {{Key takeaway 4}}

Next lesson, you'll be ready to {{transition to next lesson}}
