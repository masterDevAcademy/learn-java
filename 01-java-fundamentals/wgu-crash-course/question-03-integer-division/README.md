<h1 align=center>
PA Question 03 — Full Tables Using Integer Division 
</h1>

<p align=center>
Navigate to <a href="../../modules/02-variables-and-data-types/06-input-with-scanner/">Module 2 — Lesson 6</a> to learn more about using <code>Scanner</code> in Java. Navigate to <a href="../../modules/03-operators-and-expressions/08-arithmetic-operators/">Module 3 — Lesson 8</a> to learn more about using arithmetic operators.
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

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">How To Read This Prompt</strong>
</summary>

- **Spot what they’re really asking:** this is an **integer division** problem.
- If they ask for "full" or "filled" groups (tables, buses, seats, etc.), you usually want:  **`totalPassengers / busCapacity`** (no rounding).
- **Don’t use decimals** unless the prompt explicitly says to.
- **Output only what they ask for** (no extra words or labels).
- **Pay attention to the exact output format** (one number vs multiple values, spaces, and final newline).

</details>

## Common mistakes
- Using floating-point math instead of integer division
- Rounding (e.g., `Math.ceil`) when they want only fully filled buses
- Printing extra text (labels like "Result:” or "Total:")
- Mixing up quotient vs remainder (`/` vs `%`)
- Dividing in the print statement instead of storing the result in a variable (harder to debug later questions)

## Variations to practice (OA-style)
- Change the table size (e.g., 8 or 12 guests per table)
- Ask for **remaining guests** instead of filled tables
- Ask for **tables needed** (this requires rounding up — different logic!)

> If the prompt uses words like **full, filled, complete**, or **whole**, default to **integer division** unless it explicitly asks you to round up **or include partially filled groups**.



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

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">Line by Line Explanation</strong>
</summary>

If you do not understand `public class LabProgram {` or `public static void main(String[] args) {` review [Module 1](../../modules/01-java-basics-and-program-structure).

1. **Setup and Input**

    `import java.util.Scanner;`  
    - Imports the `Scanner` class so your program can read user input.

    `Scanner scnr = new Scanner(System.in);`  
    - Creates a Scanner named `scnr` that reads from the keyboard.

    `int tableSize = 10, guests, tablesFilled;`  
    - `tableSize` is set to `10` because each table seats 10 guests.
    - `guests` will store the input value.
    - `tablesFilled` will store the number of full tables.

    `guests = scnr.nextInt();`  
    - Reads one integer input and stores it in `guests`.

2. **The Calculation (Integer Division)**

    `tablesFilled = guests / tableSize;`  
    - Uses **integer division** to calculate full tables.
    - Integer division **truncates** any remainder.
      - Example: `349 / 10` becomes `34` (the `.9` is discarded).
    - This matches the idea of **full** tables only.

3. **Formatted Output**

    `System.out.println("Tables filled: " + tablesFilled);`  
    - Prints the exact label text followed by the number.
    - The space after the colon is important (`": "`).
    - `println` ensures the output ends with a newline.

<h2 align=center>
Learn about these:
</h2>

[Input with Scanner](../../modules/02-variables-and-data-types/06-input-with-scanner)

[Arithmetic Operators and Integer Division](../../modules/03-operators-and-expressions/08-arithmetic-operators)

[The Print Statement](../../modules/01-java-basics-and-program-structure/03-printing-output-and-escape-characters)

</details>


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
- Same math patterns as the table problem
- Only the variable names and divisor changed
- Don't round — use integer division

### Try it!

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


### Try it!

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