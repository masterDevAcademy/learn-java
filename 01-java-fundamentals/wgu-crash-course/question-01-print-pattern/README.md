<h1 align=center>
PA Question 01 — Print a 5x5 "H" pattern
</h1>

<p align=center>
Navigate to <a href="01-java-fundamentals/modules/01-java-basics-and-program-structure/03-printing-output-and-escape-characters">Module 1 — Lesson 3</a> to learn more about output in Java.
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

- Open <a href="./PracticeProgramTwo.java">PracticeProgramTwo.java</a> or copy this template into a new file:

    PracticeProgramOne.java:

    ```java
    public class PracticeProgramTwo {
        public static void main(String[] args) {

            // Modify the program to print a capital "A"

            System.out.println("A"):
            System.out.println("AA"):
            System.out.println("AAAAA"):
            System.out.println("AA"):
            System.out.println("AA"):
            
        }
    }
    ```

- Find the solution at <a href="./PracticeProgramTwoSolution.java">PracticeProgramTwoSolution.java</a>.