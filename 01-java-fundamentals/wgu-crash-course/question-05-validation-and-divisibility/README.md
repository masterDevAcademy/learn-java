<h1 align=center>
PA Question 05 — Divisibility Check with Input Validation 
</h1>

<p align=center>
Navigate to <a href="../../modules/04-conditionals-and-logic/">Module 4 — Conditionals</a> to learn more about using <code>if</code> statements and logical operators.
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
A number is divisible by 3 if the sums of its digits is divisible by 3. For example, 153 is divisible by 3 because 1 + 5 + 3 = 9 and 9 is divisible by 3. 
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

        if (sum % 3 == 0) {
            System.out.println(number + " is divisible by 3!");
        } else {
            System.out.println(number + " is not divisible by 3!");
        }
    }
}
```

<h1 align=center>
More Practice
</h1>

<h2 align=center>
1) Even or Off Checker
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
0 is zeo.
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