<h1 align="center">
Lesson 32: Output Formatting with printf
</h1>

## Lesson Goal
Learn how to use `System.out.printf()` to format text and numbers in a clean, professional way.

So far, you've printed output using `println()`, which works but often leads to messy alignment. `printf()` gives you control over spacing, alignment, and number precision.

By the end, you'll be able to create structured console output like real reports or game status screens.

---

<h2 align=center>
1) What is printf?
</h2>

`printf` stand for **print formatted**. It allows you to insert values into a formatted string using placeholders called **format specifiers**.


```java
// Example code snippet
System.out.printf("Level: %d", 5);
```
---

<h2 align=center>
2) Common Format Specifiers
</h2>

<div align=center>

| Specifier | Meaning |
|-----------|---------|
| `%d` | Integer |
| `%f` | Decimal number |
| `%s` | String |
| `%n` | Newline | 

</div>

Example:

```java
System.out.printf("Name: %s Level: %d%n", "Aria", 5);
```

---

<h2 align=center>
3) Controlling Decimal Places
</h2>

You can limit decimal precision.

```java
double critChance = 23.45678;
System.out.printf("Crit Chance: %.2f%%%n", critChance);
```
Output:
```text
Crit Chance: 23.46%
```

---

<h2 align=center>
4) Aligning Columns
</h2>

You can control width and alignment.

```java
System.out.printf("%-10s %5d%n", "Aria", 5);
```

- `-10` → left-align text in 10 spaces
- `5` → right-align number in 5 spaces

---

<h2 align=center>
5) Multiple Values on one Line
</h2>

```java
System.out.printf("%-12s | Level: %2d | HP: %3d%n", "Thorn", 10, 85);
```

---
<h2 align=center> Mini Project — Character Stats Report</h2>

Create a formatted report showing character stats in aligned columns.

This project reinforces: 
- Using multiple format specifiers
- Aligning text and numbers
- Formatting decimal values

### Objective
Create a Java program that:
- Stores character stats in variables 
- Uses `printf()` to display a formatted stat report
- Aligns multiple characters in a clean table format


### Rules
- ❌ No loops required
- ❌ No user input required
- ❌ No advanced formatting libraries
- ✅ Use `printf` formatting

### Requirements
Your program must: 
- Use at least: 
    - One `%s`
    - One `%d`
    - One `%f`
- Align columns using width specifiers
- Display at least two characters
- Include a header row
- Compile and run successfully

### Basic Example (yours should be different)
```text
Name       | Lvl   | Crit %
--------------------------------
Thorn      |    10 |     23.46
Lyra       |     8 |     31.20
```

### Common Mistakes
- Forgetting to match specifiers with variable types
- Missing `%n` for newlines
- Misplacing width specifiers
- Forgetting that `%f` defaults to many decimal places

<h2 align=center> Quick Recap </h2>

- `printf` formats output using specifiers
- `%s`, `%d`, and `%f` represent different data types
- Width controls alignment
- Precision controls decimal places

You now have everything needed to present data cleanly — the final step before bringing everything together in the **capstone project**.