<h1 align=center>
PA Question 02 — Repeated Multiplication (3 outputs) 
</h1>

<p align=center>
Navigate to <a href="../../modules/02-variables-and-data-types/06-input-with-scanner/">Module 3 — Lesson 5</a> to learn more about using <code>Scanner</code> in Java. Navigate to <a href="../../modules/03-operators-and-expressions/08-arithmetic-operators/">Module 3 — Lesson 8</a> to learn more about using arithmetic operators.
</p>

<h2 align=center>
What You Practice
</h2>

<p align=center>
Reading `int`s with `Scanner`
</p>

<p align=center>
Simple arithmetic
</p>

<p align=center>
Output formatting on one line
</p>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that collects two integer inputs and assigns them to the variables <code>starting_num</code> and <code>multiplier</code>. Multiple <code>starting_num</code> by <code>multiplier</code> and output the results. Repeat this process two more times, each time multiplying the previous result by the <code>multiplier</code>. The three product outputs should be separated by a whitespace character, ending with a newline.
</p>

If the input is:
```text
2
5
```

The output when `starting_num = 2` is:

```text
10 50 250
```

## Common mistakes
- Using tabs instead of spaces
- Missing a line / extra line
- Forgetting the final newline (use `println`)

## Variations to practice (OA-style)
- Change the operator: repeated **addition** or repeated **subtraction**
- Output more/less steps (e.g., 4 results)


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

         int starting_num = scnr.nextInt();
         int multiplier = scnr.nextInt();

         int first = starting_num * multiplier;
         int second = first * multiplier;
         int third = second * multiplier;

         System.out.println(first + " " + second + " " + third);
    }
}
```

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">Line by Line Explanation</strong>
</summary>

If you do not understand `public class LabProgram{` or `public static void main(String[] args) {` you need to go back to question one or read [Module 1](../../modules/01-java-basics-and-program-structure)

1. **Setup and Input**
    
    `import java.util.Scanner;`
    - This imports the Scanner utility to your program to allow it to read input typed by the user

    `Scanner scnr = new Scanner(System.in);`
    - This creates a **Scanner object** named `scnr`. It's a tool that allows your program to read input typed by the user.

    `int starting_num = scnr.nextInt();`
    - The program pauses and waits for the user to type an integer. This value is stored in the variable `starting_num`.

    `int multiplier = scnr.nextInt();`
    - The program waits for the second integer, which will be used to multiple the numbers in the sequence.

2. **The Calculations**
    
    These lines perform the "chain reaction" of multiplication:

    `int first = starting_num * multiplier;`
    - It calculates the first result by multiplying the starting number by the multiplier.

    `int second = first * multiplier;`
    - It takes the **result** of the first calculation and multiplies it by the multiplier again.

    `int third = second * multiplier;`
    - It takes the **result** of the second calculation and multiplies it one last time.

3. **The Output**

    `System.out.println(first + " " + second + " " + third);`
    - This prints all three results on a single line
    - The `+ " " +` parts are used to add a space between the numbers so they don't run together (e.g., printing `10 100 1000` instead of `101001000`).


<h2 align=center>
Learn about these:
</h2>

[Input with Scanner](../../modules/02-variables-and-data-types/06-input-with-scanner)


[The Calculations](../../modules/03-operators-and-expressions/08-arithmetic-operators/)

[The Output](../../modules/01-java-basics-and-program-structure/03-printing-output-and-escape-characters/)

 

</details>

---

<h1 align=center>
More Practice
</h1>

<h2 align=center>
1) Repeated Addition
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that collects two integer inputs and assigns them to the variables <code>startingNum</code> and <code>adder</code>. Add <code>adder</code> to <code>startingNum</code> and output the result. Repeat this process two more times, each time adding <code>adder</code> to the previous result. The three outputs should be separated by a single space and end with a newline.
</p>

#### Example:

**Input:**

```text
4
3
```

**Output:**
```text
7 10 13
```

### What to focus on 
- Reading two integers using `Scanner`
- Reusing the previous result
- Keeping all output on **one line**
- Making sure spaces appear **between numbers only**

### Try it!

- Open <a href="./PracticeProgramOne.java">PracticeProgramOne.java</a> or copy this template into a new file:

    PracticeProgramOne.java:

    ```java
    import java.util.Scanner;

    public class PracticeProgramOne {
        public static void main(String[] args) {

            Scanner scnr = new Scanner(System.in);

            int startingNum = scnr.nextInt();
            int adder = scnr.nextInt();

            // Add adder three time, printing each new result

        }
    }
    ```

- Find the solution at <a href="./PracticeProgramOneSolution.java">PracticeProgramOneSolution.java</a>.

<h2 align=center>
2) Repeated Subtraction
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that collects two integer inputs and assigns them to the variables <code>startingNum</code> and <code>subtractor</code>. Subtract <code>subtractor</code> from <code>startingNum</code> and output the result. Repeat this process two more times, each time subtracting <code>subtractor</code> from the previous result.
</p>

#### Example

**Input:**

```text
20
4
```

**Output:**
```text
16 12 8
```

### What to focus on
- The logic is identical to multiplication and addition — only the operator changes
- Keep track of the running result
- Print all three results on one line

### Try it!

- Open <a href="./PracticeProgramTwo.java">PracticeProgramTwo.java</a> or copy this template into a new file:

    PracticeProgramTwo.java:

    ```java
    import java.util.Scanner;

    public class PracticeProgramTwo {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);

            int startingNum = scnr.nextInt();
            int subtractor = scnr.nextInt();

            // Subtract subtractor three times, printing each new result

        }
    }
    ```

- Find the solution at <a href="./PracticeProgramTwoSolution.java">PracticeProgramTwoSolution.java</a>.