<h1 align=center>
PA Question 08 — Array Values and Average 
</h1>

<p align=center>
 — .
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
Write a program that creates an array to hold three values of type double. The program should collect three double values as input and store them in an array. Then calculate the average value of the array.
</p>

<p align=center>
Output the array values and calculated average value, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
</p>


**If the input is:**

```text
10.0
10.5
11.0
```

**The output is:**

```text
Array items: 10.0, 10.5, 11.0
Average: 10.5
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
      /* Type your code here. */
      
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

        double[] numbers = new double[3]; // Array to hold three double variables
        double sum = 0.0;

        // Collect input and store in array
        for (int i = 0; i < 3; i++) {
            numbers[i] = scnr.nextDouble();
            sum += numbers[i]; // Add to sum
        }

        double average = sum / 3; // calculate average

        // Print array items
        
        System.out.println("Array items: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);

        // Print average
        System.out.println("Average: " + average);
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