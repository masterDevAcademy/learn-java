<h1 align="center">Lesson 3: Printing Output & Escape Characters</h3>

## Lesson Goal
Learn how to display text output in the console and control **how that output is formatted**:

- `System.out.print()`
- `System.out.println()`
- Escape characters: `\n`, `\t`, `\"`

By the end, you'll be able to format a clean console output and build a styled "player card."

---

<h2 align=center>
1) Printing Output: `print()` vs `println()`
</h2>

Java prints to the console using `System.out`.

### `println()` prints a line and then moves to the next line

```java
System.out.println("Hello");
System.out.println("World");
```
**Output**
```text
Hello
World
```

### `print()` does NOT move to the next line

```java
System.out.print("Hello ");
System.out.print("World");
```
**Output**
```text
Hello World
```
*Note: Notice the space after "Hello" before the ending double quote in the java snipper; without this, the output would be "HelloWorld"*

- Use `println()` for most line-by-line output.
- Use `print()` when you want multiple pieces on the same line.

<h2 align=center>
New Lines with <code>\n</code>
</h2>

The newline escape character `\n` forces the next text to start on a new line.

```java
System.out.print("Line 1\n\Line 2\nLine 3\n");
```
**Output**
```text
Line 1
Line 2
Line 3
```
Useful when you want to build multi-line output inside one string.

<h2 align=center>
Tabs with \t
</h2>

The tab escape character \t creates spacing (like pressing Tab).

```java
System.out.print.ln("Name:\tJordan");
System.out.print.ln("Class:\tRanger");
```
**Output**
```text
Name:   Jordan
Class:  Ranger
```

Tabs are great for quick alignment, but spacing may very slightly depending on the console.

<h2 align=center>
4) Printing Quotes with <code>\"</code>
</h2>

If you want to print quotation marks, you must escape them:

```java
System.out.print.ln("Quote: \"Stay consistent.\"");
```
**Output**
```text
Quote: "Stay consistent."
```

<h2 align=center>
Quick Recap
</h2>

- `println()` prints a line then moves down
- `print()` stays on the same line
- `\n` = new line
- `\t` = tab spacing
- `\"` = literal quotation mark

Next lesson, you'll be ready to start building real programs that use these output skills.

<h2 align=center>
Mini Project — Console Player Card
</h2>


### Objective
Print a styled player card using ONLY:

- `print` / `println`
- `\n`, `\t`, `\"`
- Manual spaces

Try this on your own first! Here's a template to start you off:

#### `PlayerCardPrinter.java`
```java
public class PlayerCardPrinter {
    public static void main(String[] args) {
        // Insert your code here
    }
}
```

*Hint: Start with `System.out.print();`*

### Rules
- ❌ No variables
- ❌ No user input
- ❌ No loops or conditionals
- ✅ Just output formatting

### Requirements
Your player card must include:
- A title header (like `PLAYER CARD` or a game name)
- Name
- Class/Role
- Level
- One quote in quotation marks
- A clean border using characters like `=`, `-`, `#`, or `*`
- At least one use of each:
    - `print()` 
    - `println()`
    - `\n`
    - `\t`
    - `\"`

### Basic Example (yours should be different)

```text
===================
    Player Card
===================
Name: []
Class: []
Level: []
Quote: ["Ship it."]
===================
```

### Common Mistakes
- Expecting `print()` to auto-add a new line (it won't)
- Forgetting to escape quotes (`"`) inside a string
- Misalignment due to inconsistent tabs/spaces
- Overthinking it — this lesson is about output control, not logic

