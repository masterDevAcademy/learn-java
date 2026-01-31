<h1 align="center">
Lesson 31: Objects Inside Collections
</h1>

## Lesson Goal
Learn how to store objects inside an `ArrayList`.

SSo far, you've stored simple values like Strings in collections. Real programs often need to store full objects, like characters, enemies, or items.

By the end of this lesson, you'll be able to create an `ArrayList` of objects and use loops to access their data.

---

<h2 align=center>
1) ArrayLists Can Store Objects
</h2>

Collections can store custom objects, not just primitive types or Strings.

```java
ArrayList<Character> party = new ArrayList<>();
```

This list will hold `Character` objects.

---

<h2 align=center>
2) Adding Objects to a Collection
</h2>


```java
Character warrior = new Character("Thorn", 10);
Character mage = new Character("Lyra", 8);

party.add(warrior);
party.add(mage);
```

---

<h2 align=center>
3) Accessing Objects in a Loop
</h2>


```java
for (Character member : party) {
    System.out.println(member.getName());
}
```

You can call object methods inside the loop.

---

<h2 align=center>
4) Why This Matters
</h2>

Storing objects in collections allows programs to:
- Manage teams or parties
- Track enemies in a battle
- Store inventory items
- Organize complex data

This is how real games and applications handle groups of entities.

---

<h2 align=center> Mini Project — Party Roster System </h2>
Create a system that stores multiple character objects in a party roster.

This project reinforces:
- Creating objects
- Storing objects in an ArrayList
- Looping through objects

### Objective
Create a Java program that:
- Defines a `Character` class with fields like name and level
- Creates multiple `Character` objects
- Stores them in an `ArrayList`
- Loops through the list and prints each character's information

### Rules
- ❌ No inheritance required
- ❌ No user input required
- ❌ No complex game logic
- ✅ Focus on storing and accessing objects

### Requirements
Your program must:
- Define a class with at least two fields
- Include a constructor to initialize those fields
- Create at least three objects
- Store them in an `ArrayList`
- Use a loop to print their data
- Compile and run successfully

### Basic Example (yours should be different)
```text
PARTY ROSTER
============
Thorn - Level 10
Lyra - Level 8
Kael - Level 12
Total Party Members: 3
```

### Common Mistakes
- Forgetting to import `ArrayList`
- Trying to store primitives directly (must use wrapper types or objects)
- Forgetting to create objects before adding them
- Trying to access fields directly instead of using getters

<h2 align=center> Quick Recap </h2>

- `ArrayList` can store custom objects
- Objects are added using .add()
- Loops allow access to object methods
- This is how programs manage groups of entities

Next module, you'll learn how  to format output cleanly using tools like `printf` to display information professionally.
