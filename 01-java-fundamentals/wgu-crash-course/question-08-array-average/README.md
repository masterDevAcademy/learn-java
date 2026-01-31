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
Creating and using an array
</p>

<p align=center>
Using a loop to collect input
</p>

<p align=center>
Calculating an average
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
- Forgetting to initialize the array size
- Using `int` instead of `double`
- Forgetting to divide by the number of elements
- Printing values in the wrong order

## Variations to practice (OA-style)
- Change array size (4 or 5 values)
- Find **largest** instead of average 
- Print values on separate lines

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

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">Line by Line Explanation</strong>
</summary>

If you do not understand `public class LabProgram{` or `public static void main(String[] args) {` you need to go back to question one or read [Module 1](../../modules/01-java-basics-and-program-structure). If you do not understand 'Scanner' please go back to question two or read [Input with Scanner](../../modules/02-variables-and-data-types/06-input-with-scanner). Understanding `System.out.println()` is crucial at this point; if you do not understand this, stop here and go read [Printing Output](../../modules/01-java-basics-and-program-structure/03-printing-output-and-escape-characters/).


1. **The Array Declaration**
    
    `double[] numbers = new double[3]`
    - This creates an **array** named `numbers` that can hold **3** separate `double` (decimal) values.
    - Think of an array like a row of lockers, where each locker has an index stating at 0.

2. **The `for` Loop and Input**
    
    `for (int i = 0; i < 3; i++) { ... }`

    - This loop repeats exactly **3 times**
    - `i = 0`: The counter starts at 0.
    - `i < 3` : The loop continues as long as `i` is less than 3.
    - `i++`: increases `i` by 1 after every loop

    Inside the loop:
    - `numbers[i] = scnr.nextDouble();`: This grabs a decimal from the user and puts it into the "locker" at position `i`
    - `sum += numbers[i];`: This takes the value just entered and adds it to the running total (`sum`).

3. **Calculating the Average**

    `double average = sum / 3;`
    - This takes the final total of the three numbers and divides it by 3. Since both `sum` and `3` (implicitly treated as a double here) are used, you get a precise decimal result.

4. Outputting the Results

    `System.out.println("Array items: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);`
    - Here, the code manually accesses each "locker" in the array using its index (`0`, `1`, and `2`) to print them out side-by-side.

    `System.out.println("Average: " + average);`
    - Finally, it prints the calculated average.

<h2 align=center>
Learn about these:
</h2>



 

</details>

---

<h1 align=center>
More Practice
</h1>

<h2 align=center>
1) Five Numbers Average
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that stores <strong>five</strong> double values in an array and calculates the average.
</p>

**Output format:**

```text
Average: X
```


### What to focus on 
- Changing array size
- Looping correct number of time
- Dividing by array length



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