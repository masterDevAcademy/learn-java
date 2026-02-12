<h1 align=center>
PA Question 05 — Divisibility Check with Input Validation 
</h1>

<p align=center>
Navigate to <a href="../../modules/04-decision-making/11-if-else-if-else/">Module 4 — Lesson 11</a> to learn more about using <code>if</code> statements and logical operators. If you need to brush up on using Scanner, navigate to <a href="../../modules/02-variables-and-data-types/06-input-with-scanner/">Module 2 — Lesson 6</a>.  To better understand arithmetic operations, navigate to <a href="../../modules/03-operators-and-expressions/08-arithmetic-operators/">Module 3 — Lesson 08</a>.
</p>

<h2 align=center>
What You Practice
</h2>

<p align=center>
Using conditionals <code>if</code> / <code>else</code>
</p>

<p align=center>
Validating user input
</p>

<p align=center>
Using the modulus operator <code>%</code>
</p>

<h2 align=center>
Prompt
</h2>

<p align=center>
A number is divisible by 3 if the sum of its digits is divisible by 3. For example, 153 is divisible by 3 because 1 + 5 + 3 = 9 and 9 is divisible by 3. 
</p>

<p align=center>
Write a program that collects three integer inputs representing the place value of a three-digit number. Determines whether the sum of the digits is divisible by 3. If any integer entered is a negative value, output <code> Invalid input!</code>
</p>

<p align=center>
Output a formatted message identifying if the three-digit number is divisible by 3, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.

**If the input is:**

```text
1
5
3
```

**The output is:**

```text
153 is divisible by 3!
```

**Alternatively, if the input is:**

```text
1
0
4
```

**The output is:**

```text
104 is not divisible by 3!
```

**Alternatively, if the input is:**

```text
1
-5
3
```

**The output is:**

```text
Invalid input!
```

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">How To Read This Prompt</strong>
</summary>

- **Step 1: Validate input first.** If *any* digit is negative, immediately print `Invalid input!` and stop.
- **Step 2: Build the number using place value.**
  - Hundreds digit × 100
  - Tens digit × 10
  - Ones digit × 1
- **Step 3: Check divisibility using `%`.**
  - If `sum % 3 == 0`, it is divisible by 3.
- **Follow the output format exactly.** Spaces, punctuation, and capitalization must match.

</details>


## Common mistakes
- Forgetting to check for negative inputs 
- Using `/` instead of `%` to check divisibility
- Building the number incorrectly (place value matters!)

## Variations to practice (OA-style)
- Instead of 3 digits, read a **single integer**
- Instead of checking divisible by 3, check if the number is **even** or **odd**
- Instead of divisibility, check if the number is **greater than 500**


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

        int one = scnr.nextInt();
        int two = scnr.nextInt();
        int three = scnr.nextInt();
        
        if (one < 0 || two < 0 || three < 0) {
            System.out.println("Invalid input!");
            return;
        }

        int number = one * 100 + two * 10 + three;
        int sum = one + two + three

        if (sum % 3 == 0) {
            System.out.println(number + " is divisible by 3!");
        } else {
            System.out.println(number + " is not divisible by 3!");
        }
    }
}
```

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">Line by Line Explanation</strong>
</summary>

If you do not understand `public class LabProgram {` or `public static void main(String[] args) {` review [Module 1](../../modules/01-java-basics-and-program-structure).

1. **Reading Input**

    ```java
    int one = scnr.nextInt();
    int two = scnr.nextInt();
    int three = scnr.nextInt();
    ```

    - Reads three digits that will form a three-digit number.

2. **Input Validation**

    ```java
    if (one < 0 || two < 0 || three < 0) {
        System.out.println("Invalid input!");
        return;
    }
    ```

    - Checks if any digit is negative.
    - `||` means “or” — if *any* condition is true, the whole statement is true.
    - `return;` immediately stops the program.

3. **Building the Number**

    ```java
    int number = one * 100 + two * 10 + three;
    ```

    - Uses place value to combine digits into one number.

4. **Checking Divisibility**

    ```java
    int sum = one + two + three;
    if (sum % 3 == 0) {
    ```
    - `%` gives the remainder.
    - If remainder is 0, the number is divisible by 3.

5. **Output**

    ```java
    System.out.println(number + " is divisible by 3!");
    ```
    or
    ```java
    System.out.println(number + " is not divisible by 3!");
    ```
    - Concatenates numbers and strings to form the final sentence.

<h2 align=center>
Learn about these:
</h2>

[If / Else Statements](../../modules/04-decision-making/11-if-else-if-else)

[Logical Operators](../../modules/04-decision-making/11-if-else-if-else)

[Modulus Operator](../../modules/03-operators-and-expressions/08-arithmetic-operators)

[Input with Scanner](../../modules/02-variables-and-data-types/06-input-with-scanner)

</details>


<h1 align=center>
More Practice
</h1>

<h2 align=center>
1) Even or Odd Checker
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that reads a single integer and determines whether it is even or odd.
</p>

**Output format:**

```text
42 is even.
```
or

```text
17 is odd.
```


### What to focus on 
- Using `% 2` to determine even vs odd
-  Correct sentence formatting



### Try it!
- Open <a href="./PracticeProgramOne.java">PracticeProgramOne.java</a> or copy this template into a new file:

    PracticeProgramOne.java:

    ```java
    import java.util.Scanner;

    public class PracticeProgramOne {
        public static void main(String[] args) {

            Scanner scnr = new Scanner(System.in);

            // Read one integer

            // Determine if it is even or odd

            // Print the result

        }
    }
    ```

- Find the solution at <a href="./PracticeProgramOneSolution.java">PracticeProgramOneSolution.java</a>.

<h2 align=center>
2) Positive, Negative, or Zero
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that reads a number and determines whether it is positive, negative, or zero

**Output formats:**

```text
5 is positive.
```

```text
-2 is negative.
```

```text
0 is zero.
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

            // Read one integer

            // Determine if positive, negative, or 0

            //Print the result

        }
    }
    ```

- Find the solution at <a href="./PracticeProgramTwoSolution.java">PracticeProgramTwoSolution.java</a>.