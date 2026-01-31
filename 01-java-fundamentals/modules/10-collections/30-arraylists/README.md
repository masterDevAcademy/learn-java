<h1 align="center">
Lesson 30: ArrayLists
</h1>

## Lesson Goal
Learn how to use `ArrayList` to store a dynamic list of values.

Arrays store multiple values but have a fixed size. An `ArrayList` can grow and shrink as items are added or removed, making it more flexible for real-world programs.

By the end of this lesson, you'll be able to create an `ArrayList`, add and remove items, and loop through its contents.

---

<h2 align=center>
1) What Is an ArrayList?
</h2>

An **ArrayList** is a collection that stores multiple items and can change size.

Unlike arrays:
- You don't need to set a fixed size
- You can add or remove elements anytime

---

<h2 align=center>
2) Importing ArrayList
</h2>

Before using it, you must import it:

```java
import java.util.ArrayList;
```

---

<h2 align=center>
3) Creating an ArrayList
</h2>


```java
ArrayList<String> inventory = new ArrayList<>();
```

This creates an empty list of Strings.

---

<h2 align=center>
4) Adding Items
</h2>

```java
inventory.add("Sword");
inventory.add("Potion");
inventory.add("Shield");
```

---

<h2 align=center>
5) Accessing items
</h2>

```java
System.out.println(inventory.get(0)); // Sword
```

Indexes start at 0, just like arrays

---

<h2 align=center>
6) Removing Items
<h2>

```java
inventory.remove("Potion");
```

You can also remove by index.

---

<h2 align=center>
7) Checking Size
<h2>

```java
System.out.println(inventory.size());
```

---

<h2 align=center>
8) Looping Through an Array List
<h2>

```java
for (String item : inventory) {
    System.out.println(item);
}
```

---

<h2 align=center> Mini Project — Inventory System </h2>
Create a dynamic inventory list for a game character.

This project reinforces:
- Creating an ArrayList
- Adding and removing items
- Looping through items

### Objective
Create a Java program that:
- Creates an `ArrayList` of inventory items
- Adds several items
- Removes at least one item
- Displays all remaining items
- Shows the total number of items

### Rules
- ❌ No arrays
- ❌ No user input required
- ❌ No objects yet (String only)
- ✅ Use `ArrayList<String>`

### Requirements
Your program must:
- Import `ArrayList`
- Create an empty `ArrayList`
- Add at least 5 items
- Remove at least 1 item
- Use a loop to print all items
- Print the inventory size
- Compile and run successfully

### Basic Example (yours should be different)
```text
INVENTORY
=========
Sword
Shield
Bow
Helmet
Total Items: 4
```

### Common Mistakes
- Forgetting to import `ArrayList`
- Using array syntax instead of .add()
- Trying to access elements using `[]` instead of `.get()`
- Forgetting that indexing starts at 0

<h2 align=center> Quick Recap </h2>

- `ArrayList` stores a dynamic list of values
- `.add()` inserts items 
- `.remove()` deletes items
- `.get()` accesses elements
- `.size()` returns the number of items

Next lesson, you'll store **objects** inside collections to build systems like party rosters and enemy lists.
