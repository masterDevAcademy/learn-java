<h1 align=center>
PA Question 07 — Sum and Smallest Value 
</h1>

<p align=center>
Navigate to <a href="../../modules/02-variables-and-data-types/05-strings-and-string-operations/">Module 2 — Lesson 5</a> to learn more about splitting strings, indexing, and using <code>substring()</code>. To brush up on <code>if / else if / else</code> statements, navigate to <a href="../../modules/04-decision-making/11-if-else-if-else/">Module 4 — Lesson 11</a>. You should be really comfortable with the <code>Scanner</code> now, but if you need a reminder, navigate to <a href="../../modules/02-variables-and-data-types/06-input-with-scanner/">Module 2 — Lesson 6</a>.
</p>

<h2 align=center>
What You Practice
</h2>

<p align=center>
Using a sentinel-controlled loop
</p>

<p align=center>
Tracking a running total
</p>

<p align=center>
Tracking the smallest value
</p>


<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that collects any number of non-negative integer inputs and calculates the sum of the values. A negative integer should end the input collection and is not part of the sum.
</p>

<p align=center>
Output the smallest non-negative value and the sum of the non-negative input values, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
</p>


**If the input is:**

```text
15
20
0
3
-1
```

**The output is:**

```text
Smallest: 0
Sum: 38
```


## Common mistakes
- Including the negative number in the sum
- Forgetting to initialize `smallest` properly
- Resetting `smallest` inside the loop
- Using `if` instead of a loop

## Variations to practice (OA-style)
- Find the **largest** value instead of smallest
- Also count how many numbers were entered
- Compute the **average**


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

        int sum = 0;
        int smallest = Integer.MAX_VALUE; // Start with a very large value

        while (true) {
            int num = scnr.nextInt();

            if (num < 0) {
                break; //stop input if negative
            }

            sum += num; // add to sum

            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Sum: " + sum);
    }
}
```

<h1 align=center>
More Practice
</h1>

<h2 align=center>
1) Largest Value Tracker
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that reads non-negative integers until a negative number is entered. Output the <strong>largest</strong> number entered (excluding the negative).
</p>

**Output format:**

```text
Largest: X
```


### What to focus on 
- Same loop structure as original PA
- Track largest instead of smallest
- Initialize largest correctly



### Try it!
- Open <a href="./PracticeProgramOne.java">PracticeProgramOne.java</a> or copy this template into a new file:

    PracticeProgramOne.java:

    ```java
    import java.util.Scanner;

    public class PracticeProgramOne {
        public static void main(String[] args) {

            Scanner scnr = new Scanner(System.in);

            int largest = Integer.MIN_VALUE;

            // Read numbers until negative

            // Track the largest value

            // Print result

        }
    }
    ```

- Find the solution at <a href="./PracticeProgramOneSolution.java">PracticeProgramOneSolution.java</a>.

<h2 align=center>
2) Sum and Count
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that reads non-negative integers until a negative number is entered. Output both the <strong>sum</strong> and how many numbers where entered.

**Output format:**

```text
Count: X
Sum: Y
```

### What to focus on
- Tracking two values at once
- Incrementing a counter inside the loop
- Same sentinel pattern
### Try it!

- Open <a href="./PracticeProgramTwo.java">PracticeProgramTwo.java</a> or copy this template into a new file:

    PracticeProgramTwo.java:

    ```java
    import java.util.Scanner;

    public class PracticeProgramTwo {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);

            int sum = 0;
            int count = 0;

            // Read numbers until negative

            // Track count and sum

            // Print Result

        }
    }
    ```

- Find the solution at <a href="./PracticeProgramTwoSolution.java">PracticeProgramTwoSolution.java</a>.