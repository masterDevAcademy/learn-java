<h1 align=center>
PA Question 09 — Method with Random Results
</h1>

<p align=center>
 — .
</p>

<h2 align=center>
What You Practice
</h2>

<p align=center>
Defining and calling a method
</p>

<p align=center>
Passing objects as parameters
</p>

<p align=center>
Using <code>Random</code> to generate values
</p>


<h2 align=center>
Prompt
</h2>

<p align=center>
Define a method names showResults with one parameter. The parameter should reference a random object <code>rand</code>. The <code>showResults()</code> method should generate a random integer of 0 or 1 using the random object reference <code>rand</code>. If the random number generated is equal to 1, return "true". If the random number generated is equal to 0, return "false".
</p>

<p align=center>
In the <code>main()</code> method template, the <code>rand</code> variable has already been assigned a random object with a seed value of 2. Write a program that collects on integer value as input, assumed to be greater than 0. Use a loop to call the <code>showResults()</code> method a number of times equal to the integer input. e.g., If 3 is entered as input, then <code>showResults()</code> will be called 3 times, each time returning "true" or "false".
</p>

Output the returned Boolean values on separate lines, ending with a newline


**If the input is:**

```text
3
```

**The output with a random object seed value of 2 is:**

```text
true
false
true
```


## Common mistakes
- Forgetting to pass `rand` into the method
- Using `Math.random()` instead of the provided `Random` object
- Returning boolean instead of String (format must match exactly)

## Variations to practice (OA-style)
- Return `"Heads"` or `"Tails"` instead
- Return `"Win"` or `"Lose"`
- Generate numbers from 1-6 instead of 0-1

<h2 align=center>
Template
</h2>

LabProgram.java

```java
import java.util.Scanner;
import java.util.Random;

public class LabProgram {   
   /* Define your method here */
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Seed used in develop mode
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
import java.util.Random;

public class LabProgram {   
   /* Define your method here */
   public static boolean showResults(Random rand) {
      int value = rand.nextInt(2);
      return value == 1;
   }
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Seed used in develop mode
      /* Type your code here. */
      int count = scnr.nextInt();
      for (int i = 0; i < count; i++) {
         System.out.println(showResults(rand));
      }
      
   }
}
```

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">Line by Line Explanation</strong>
</summary>

If you do not understand `public class LabProgram{` or `public static void main(String[] args) {` you need to go back to question one or read [Module 1](../../modules/01-java-basics-and-program-structure). If you do not understand 'Scanner' please go back to question two or read [Input with Scanner](../../modules/02-variables-and-data-types/06-input-with-scanner). Understanding `System.out.println()` is crucial at this point; if you do not understand this, stop here and go read [Printing Output](../../modules/01-java-basics-and-program-structure/03-printing-output-and-escape-characters/).


1. **The Method Definition**
    
    `public static boolean showResults(Random rand) {`
    - `boolean`: This is the return type. It tells Java this method must give back either a `true` or a `false`
    - `(Random rand)`: This is a parameter. The method needs a "Random" object passed into it to do its job

    Inside the method:
    - `int value = rand.nextInt(2);`: This generates a random number that is either **0 or 1**.
    - `return value == 1;`: This is a shortcut. If the value is 1, it returns `true`. It the value is 0, it returns `false`.


2. **The Main Method & Seeding**
    
    `Random rand = new Random(2);`

    - Here, you are "seeding" the random number generator with the number `2`.
    - **Why seed?** In programming, "random" isn't actually random — it's a sequence of numbers calculated by an algorithm. By using a seed (like 2), the program will produce the **exact same "random" sequence** every time you run it. This is helpful for graded labs!

3. **The `for` Loop**

    `int count = scnr.nextInt();`
    - The program first asks the user: "How many times should I run?"

    `for (int i = 0; i < count; i++) { ... }`
    - The loop runs for as many times as the user requested.
    - `System.out.println(showResults(rand));`: This calls your `showResults` method, waits for it to send back a `true` or `false`, and then prints that result to the screen. 

**How the Logic Flows:**
1. User enters `3`.
2. Loop starts (i=0).
3. `main` calls `showResults`.
4. `showResults` picks a number (let's say 1), returns `true`.
5. `main` prints `true`.
6. Repeat until the count is reached.

**Summary Table**

<div align=center>

| Component | Purpose |
|-----------|---------|
| `Random` | Generates pseudorandom numbers. |
| `Seed (2)` | Ensures the "random" results are predictable for testing. |
| `nextInt(2)` | Limits the random range to 0 or 1. |
| `boolean` | A data type that can only be `true` or `false` |
 
</div>

<h2 align=center>
Learn about these:
</h2>



 

</details>

---

<h1 align=center>
More Practice
</h1>

<h2 align=center>
1) Coin Flip Method
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Create a method named <code>flipCoin</code> that takes a <code>Random</code> object and returns either `"Heads"` or `"Tails"`.
</p>

In `main()`:
- Read a number
- Call the method that many times
- Print each result




### What to focus on 
- Creating a method that **returns a String**
- Passing the `Random` object into the method
- Using `rand.nextInt(2)` to generate two possible outcomes
- Printing results inside a loop in `main()`



### Try it!
- Open <a href="./PracticeProgramOne.java">PracticeProgramOne.java</a> or copy this template into a new file:

    PracticeProgramOne.java:

    ```java
    import java.util.Scanner;
    import java.util.Random;

    public class PracticeProgramOne {

        // Define flipCoin method

        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            Random rand = new Random(5);

            int count = scnr.nextInt();

            // Call flipCoin count times and print results
        }
    }
    ```

- Find the solution at <a href="./PracticeProgramOneSolution.java">PracticeProgramOneSolution.java</a>.

<h2 align=center>
2) Dice Roll Method
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Create a method named <code>rollDie</code> that takes a <code>Random</code> object and returns a number from 1-6.
</p>

In `main()`:
- Read how many times to roll
- Call the method in a loop
- Print each roll


### What to focus on
- Returning an **int** instead of a String
- Generating a number in a **specific range (1-6)**
    - *Hint: `rand.nextInt(6) + 1`
- Keeping method logic separate from loop in `main()`
- Understanding how return values are used in `System.out.println()`

### Try it!

- Open <a href="./PracticeProgramTwo.java">PracticeProgramTwo.java</a> or copy this template into a new file:

    PracticeProgramTwo.java:

    ```java
    import java.util.Scanner;
    import java.util.Random;

    public class PracticeProgramTwo {

        // Define rollDie method

        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            Random rand = new Random(7);

            int rolls = scnr.nextInt();

            // Call rollDie rolls times and print results
        }
    }
    ```

- Find the solution at <a href="./PracticeProgramTwoSolution.java">PracticeProgramTwoSolution.java</a>.