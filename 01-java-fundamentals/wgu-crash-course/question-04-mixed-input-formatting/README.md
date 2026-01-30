<h1 align=center>
PA Question 04 — Name, Age, and Salary Formatting 
</h1>

<p align=center>
Navigate to <a href="../../modules/02-variables-and-data-types/06-input-with-scanner/">Module 2— Lesson 6</a> to learn more about reading different types of input.
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
Combining Variables into formatted output
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

## Common mistakes
- Using `next()` instead of `nextLine()` for the full name
- Forgetting that nextInt() leaves a newline behind
- Forgetting the dollar sign `$`
- Missing punctuation like the period at the end

## Variations to practice (OA-style)
- Age might be given as a string instead of an int
- Salary might be a number without commas (on the PA, it wants it displayed without the commas if that is the case [the OA should be the same])
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

         System.out.println(name + " is " + age + " and makes $" + salary + ".")
    }
}
```

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