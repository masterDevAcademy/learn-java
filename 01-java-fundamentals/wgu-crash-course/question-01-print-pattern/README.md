<h1 align=center>
PA Question 01 — Print a 5x5 "H" pattern
</h1>

<p align=center>
Navigate to <a href="../../modules/01-java-basics-and-program-structure/03-printing-output-and-escape-characters/">Module 1 — Lesson 3</a> to learn more about output in Java.
</p>

<h2 align=center>
What You Practice
</h2>

<p align=center>
Exact output (spaces matter)
</p>

<p align=center>
<code>System.out.println(...)</code>
</p>

<h2 align=center>
Prompt
</h2>

<p align=center>
Output the following pattern, ending with a newline.Each line of the pattern contains 5 characters including whitespace.
</p>

The output is:

```text
H   H
H   H
HHHHH
H   H
H   H
```

## Common mistakes
- Using tabs instead of spaces
- Missing a line / extra line
- Forgetting the final newline (use `println`)

## Variations to practice (OA-style)
Try rewriting the pattern using different letters/symbols (e.g., `A`, `*`, `#`) while keeping the spacing the same.


<h2 align=center>
Template
</h2>

LabProgram.java

```java
public class LabProgram {
    public static void main(String[] args) {
        /* Type your code here */

    }
}
```

<h2 align=center>
Solution
</h2>

LabProgram.java

```java
public class LabProgram {
    public static void main(String[] args) {
        /* Type your code here */
        System.out.println("H   H");
        System.out.println("H   H");
        System.out.println("HHHHH");
        System.out.println("H   H");
        System.out.println("H   H");
    }
}
```

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">Line by Line Explanation</strong>
</summary>

1. **The Class Definition**
    
    `public class LabProgram {`

    - `public`: This is an access modifier that makes the class accessible from anywhere.
    - `class`: This keyword tells Java you are defining a new class.
    - `LabProgram`: This is the name of the class, In Java, the filename must match this name (e.g., `LabProgram.java`).

2. **The Main Method**
    
    `public static void main(String[] args) {`

    - This is the **entry point** of your program. When you run a Java application, the computer looks for this exact line to start executing instructions.
    - `static`: Allows the method to run without creating an object of the class.
    - `void`: Means this method doesn't return any value.
    - `String[] args`: This allows the program to accept inputs (arguments) from the command line, though they aren't used here.

3. **The Print Statements**

    This middle section contains five variations of the same command:
    
    `System.out.println("...");`

    - `System.out`: Tells Java to use the standard output stream (usually your console/screen)
    - `.println`: Short for "print line." It prints whatever is inside the parentheses and then moves the cursor to a **new line**.
    - **The Strings**:
        - `"H   H"`: Prints the sides of the H with three spaces in between.
        - `"HHHHH"`: Prints a solid row of five H's to create the middle bar of the letter.

4. **Closing Braces**

    `}`

    - The first `}` closes the `main` method
    - The second `}` closes the `LabProgram` class.

<h2 align=center>
Learn about these:
</h2>

[Class Definition and `main()` method](../../modules/01-java-basics-and-program-structure/02-program-structure-and-main)


[The Print Statement](../../modules/01-java-basics-and-program-structure/03-printing-output-and-escape-characters)

 



</details>

---

<h1 align=center>
More Practice
</h1>

<h2 align=center>
1) Print a capital U
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that prints a 5x5 capital <strong>U</strong> pattern using the letter <code>U</code>. Each line must be <strong>exactly 5 characters wide</strong> (including spaces), and the program should end with a newline.
</p>

**The output should look like this:**

```text
U   U
U   U
U   U
U   U
UUUUU
```

### What to focus on
- Using `System.out.println() correctly
- Counting spaces carefully
- Making sure the bottom of the U is centered

### Try it!

- Open <a href="./PracticeProgramOne.java">PracticeProgramOne.java</a> or copy this template into a new file:

    PracticeProgramOne.java:

    ```java
    public class PracticeProgramOne {
        public static void main(String[] args) {

            // Print  a 5X5 "U" pattern using capital U's
            // Each line must be exactly 5 characters wide (including spaces).

        }
    }
    ```

- Find the solution at <a href="./PracticeProgramOneSolution.java">PracticeProgramOneSolution.java</a>.

<h2 align=center>
2) Modify To Make An <strong>A</strong> Pattern
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Modify the program so that it prints a 5x5 capital <strong>A</strong> pattern using the letter <code>A</code>. Each line must be <strong>exactly 5 characters wide</strong> (including spaces), and the program should end with a new line.
</p>

**The output should look like this:**

```text
  A  
 A A 
AAAAA
A   A
A   A
```

### What to focus on
- Leading spaces matter just as much as letter
- The middle line should be completely filled
- Make sure both sides of the A are lined up vertically

### Try it!

- Open <a href="./PracticeProgramTwo.java">PracticeProgramTwo.java</a> or copy this template into a new file:

    PracticeProgramTwo.java:

    ```java
    public class PracticeProgramTwo {
        public static void main(String[] args) {

            // Modify the program to print a capital "A"

            System.out.println("A");
            System.out.println("AA");
            System.out.println("AAAAA");
            System.out.println("AA");
            System.out.println("AA");
            
        }
    }
    ```

- Find the solution at <a href="./PracticeProgramTwoSolution.java">PracticeProgramTwoSolution.java</a>.