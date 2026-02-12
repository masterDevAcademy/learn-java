<h1 align=center>
PA Question 04 — Name, Age, and Salary Formatting 
</h1>

<p align=center>
Navigate to <a href="../../modules/02-variables-and-data-types/06-input-with-scanner/">Module 2 — Lesson 6</a> to learn more about reading different types of input. Navigate to <a href="../../modules/04-strings/12-strings-basics/">Module 4 — Lesson 12</a> to learn more about working with strings. Navigate to <a href="../../modules/01-java-basics-and-program-structure/03-printing-output-and-escape-characters/">Module 1 — Lesson 3</a> to review formatted output.
</p>


<h2 align=center>
What You Practice
</h2>

<p align=center>
Reading different input types
</p>

<p align=center>
Using <code>nextLine()</code>, 
<code>nextInt()</code>, and
<code>next()</code>
</p>

<p align=center>
Combining variables into formatted output
</p>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that takes a full name, age, and salary as inputs on separate lines. Output a formatted message containing the inputs, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
</p>

**If the input is:**

```text
Pat Ford 
35
60,000
```

**The output is:**

```text
Pat Ford is 35 and makes $60,000.
```

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">How To Read This Prompt</strong>
</summary>

- **Read inputs in the exact order given.** If the prompt lists name first and age second, your code must read them in that same order.
- **Match input methods to the data type.**
  - Use `nextInt()` for integers
  - Use `next()` for single words
  - Use `nextLine()` for full lines of text
- **Output format matters.** Pay attention to spaces, punctuation, and capitalization in the required output.
- **Don’t print prompts** like “Enter your name:” unless the instructions tell you to.

</details>

## Common mistakes
- Using `nextLine()` after `nextInt()` without consuming the leftover newline
- Reading inputs in the wrong order
- Printing extra text not shown in the example output
- Missing spaces or punctuation in the output format

## Variations to practice (OA-style)
- Age might be given as a string instead of an int
- - Salary might be a number without commas (your program should still display it correctly)
- Input order might change (salary first, etc.)


<h2 align=center>
Template
</h2>

LabProgram.java

```java
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here */

    }
}
```

<h2 align=center>
Solution
</h2>

LabProgram.java

```java
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here */

         String name = scnr.nextLine();
         int age = scnr.nextInt();
         String salary = scnr.next();

         System.out.println(name + " is " + age + " and makes $" + salary + ".");
    }
}
```

> *NOTE: If you mix `nextInt()` and `nextLine()`, you may need an extra `nextLine()` to consume the leftover newline.

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">Line by Line Explanation</strong>
</summary>

If you do not understand `public class LabProgram {` or `public static void main(String[] args) {` review [Module 1](../../modules/01-java-basics-and-program-structure).

1. **Setup and Input**

    `import java.util.Scanner;`  
    - This allows the program to read input from the user.

    `Scanner scnr = new Scanner(System.in);`  
    - Creates a Scanner object that reads from the keyboard.

    `String name = scnr.nextLine();`  
    - Reads the person's **full name**. `nextLine()` is used because names may contain spaces.

    `int age = scnr.nextInt();`  
    - Reads the age as an integer.

    `String salary = scnr.next();`  
    - Reads the salary as a single word/string (including commas if present).

2. **Building the Output Sentence**

    ```java
    System.out.println(name + " is " + age + " and makes $" + salary + ".");
    ```

    - The `+` operator joins (concatenates) strings and numbers together.
    - Spaces and punctuation inside the quotes must match the required format exactly.
    - `$` is added manually because it is not part of the input.

3. **Scanner Input Tip**

    When mixing `nextInt()` and `nextLine()`, Java may leave a newline character in the input buffer.  
    If you read another full line after an integer, you may need an extra `scnr.nextLine();` to clear it.

<h2 align=center>
Learn about these:
</h2>

[Input with Scanner](../../modules/02-variables-and-data-types/06-input-with-scanner)

[Working with Strings](../../modules/04-strings/12-strings-basics)

[The Print Statement](../../modules/01-java-basics-and-program-structure/03-printing-output-and-escape-characters)


</details>


<h1 align=center>
More Practice
</h1>

<h2 align=center>
1) Student Introduction
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that reads a student's full name, major, and GPA (on separate lines). Then print a formatted sentence introducing the student.
</p>

**Output format:**

```text
Alex Johnson is majoring in Computer Science with a GPA of 3.8.
```


### What to focus on 
- Reading full names correctly with `nextLine()`
- Combining multiple variables into one sentence
- Correct spacing and punctuation


### Try it!

- Open <a href="./PracticeProgramOne.java">PracticeProgramOne.java</a> or copy this template into a new file:

    PracticeProgramOne.java:

    ```java
    import java.util.Scanner;

    public class PracticeProgramOne {
        public static void main(String[] args) {

            Scanner scnr = new Scanner(System.in);

            // Read name, major, and GPA

            // Output formatted introduction sentence

        }
    }
    ```

- Find the solution at <a href="./PracticeProgramOneSolution.java">PracticeProgramOneSolution.java</a>.

<h2 align=center>
2) Job Profile Formatter
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that reads a person's name, job, title, and hourly wage. Then print a formatted sentence describing their job.
</p>

**Output format:**

```text
Jordan Lee works as a Graphic Designer earning $28 per hour.
```


### What to focus on
- Mixing strings and numbers in output
- Making sure spacing and punctuation are correct
- Keeping all input/output clean and readable


### Try it!

- Open <a href="./PracticeProgramTwo.java">PracticeProgramTwo.java</a> or copy this template into a new file:

    PracticeProgramTwo.java:

    ```java
    import java.util.Scanner;

    public class PracticeProgramTwo {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);

            // Read name, job title, and hourly wage

            // Output formatted job description

        }
    }
    ```

- Find the solution at <a href="./PracticeProgramTwoSolution.java">PracticeProgramTwoSolution.java</a>.