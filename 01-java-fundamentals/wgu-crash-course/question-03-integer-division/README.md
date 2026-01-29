<h1 align=center>
PA Question 03 — Full Tables Using Integer Division 
</h1>

<p align=center>
Navigate to <a href="../../modules/03-operators-and-expressions/08-arithmetic-operators/">Module 3 — Lesson 8</a> to learn more about using arithmetic operators.
</p>

<h2 align=center>
What You Practice
</h2>

<p align=center>
Integer division (truncation)
</p>

<p align=center>
Using variables in calculations
</p>

<p align=center>
Formatted output
</p>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that calculates the number of <strong>full tables</strong> for an event, based on the number of expected guests. Each full table seats <strong>10</strong> guests. Collect one integer input and assign it to the variable <code>guests</code>. Using integer division, calculate how many tables will be completely filled. Output the result in the following format, ending with a newline:
</p>

```text
Tables filled: X
```

#### Example 1

**Input:**

```text
340
```

**Output:**

```text
Tables filled: 34
```

#### Example 2

**Input:**

```text
349
```

**Output:**

```text
Tables filled: 34
```

## Common mistakes
- Trying to round instead of using integer division
- Using decimals instead of integers
- Forgetting the exact text: `"Tables filled: "`

## Variations to practice (OA-style)
- Change the table size (e.g., 8 or 12 guests per table)
- Ask for **remaining quests** instead of filled tables
- Ask for **tables needed** (this requires rounding up — different logic!)


<h2 align=center>
Template
</h2>

LabProgram.java

```java
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int tableSize = 10, guests, tablesFilled;

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
        int tableSize = 10, guests, tablesFilled;

        /* Type your code here */

         guests = scnr.nextInt();

         tablesFilled = guests / tableSize;

         System.out.println("Tables filled: " + tablesFilled);
    }
}
```

<h1 align=center>
More Practice
</h1>

<h2 align=center>
1) Buses Needed
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
A bus can carry <strong>40</strong> passengers. Write a program that calculates how many <strong>full buses</strong> can be filled based on the number of passengers. Read one integer input for the number of passengers. Use integer division to determine how many buses will be completely filled. Output the result in this format:
</p>

```text
Buses Filled: X
```

#### Example:

**Input:**

```text
205
```

**Output:**
```text
Buses Filled: 5
```

### What to focus on 
- ame math patterns as the table problem
- Only the variable names and divisor changed
- Don't round — use integer division

- Open <a href="./PracticeProgramOne.java">PracticeProgramOne.java</a> or copy this template into a new file:

    PracticeProgramOne.java:

    ```java
    import java.util.Scanner;

    public class PracticeProgramOne {
        public static void main(String[] args) {

            Scanner scnr = new Scanner(System.in);

            // A bus holds 40 passengers

            // Read the number of passengers and print how many buses are completely filled.

        }
    }
    ```

- Find the solution at <a href="./PracticeProgramOneSolution.java">PracticeProgramOneSolution.java</a>.

<h2 align=center>
2) Pizza Boxes Needed (Leftovers)
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Each pizza box holds <strong>8 slices</strong>. Write a program that calculates how many slices will be <strong>left over</strong> after filling as many full boxes as possible. Read one integer input representing the total number of slices. Use the modulus operator to determine how many slices remain. Output the result in this format:
</p>

```text
Leftover slices: X
```

#### Example

**Input:**

```text
50
```

**Output:**
```text
Leftover slices: 2
```

### What to focus on
- This uses **modulus (`%`)**, not division
- Still part of the same "division concept family"
- Helps students understand what integer division *removes*

- Open <a href="./PracticeProgramTwo.java">PracticeProgramTwo.java</a> or copy this template into a new file:

    PracticeProgramTwo.java:

    ```java
    import java.util.Scanner;

    public class PracticeProgramTwo {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);

            // Each pizza box holds 8 slices.

            // Read the total slices and print how many are left over.

        }
    }
    ```

- Find the solution at <a href="./PracticeProgramTwoSolution.java">PracticeProgramTwoSolution.java</a>.