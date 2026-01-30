<h1 align=center>
PA Question 06 — Name Formatting with Initials 
</h1>

<p align=center>
Navigate to <a href="../../modules/02-variables-and-data-types/05-strings-and-string-operations/">Module 2 — Lesson 5</a> to learn more about splitting strings, indexing, and using <code>substring()</code>. To brush up on <code>if / else if / else</code> statements, navigate to <a href="../../modules/04-decision-making/11-if-else-if-else/">Module 4 — Lesson 11</a>. You should be really comfortable with the <code>Scanner</code> now, but if you need a reminder, navigate to <a href="../../modules/02-variables-and-data-types/06-input-with-scanner/">Module 2 — Lesson 6</a>.
</p>

<h2 align=center>
What You Practice
</h2>

<p align=center>
Reading a full line of text with <code>nextLine()</code>
</p>

<p align=center>
Splitting a string into parts using <code>split()</code>
</p>

<p align=center>
Using <code>substring(0, 1)</code> to grab initials
</p>

<p align=center>
Conditional formatting based on name length
</p>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that collects a full name as one string input. Format and output the name as shown below:
</p>

<p align=center>
<code> lastInitial., firstName middleInitial.</code>
</p>

<p align=center>
If no middle name was provided, format the output and name as shown below:
</p>

<p align=center>
<code>lastInitial., firstName
</p>


**If the input is:**

```text
Pat Silly Doe
```

**The output is:**

```text
D. Pat S.
```

**Alternatively, if the input is:**

```text
Julia Clark
```

**The output is:**

```text
C., Julia
```


## Common mistakes
- Using `next()` instead of `nextLine()` (only reads one word)
- Not handling extra spaces (use `.trim()` and `split("\\s+"))`)
- Mixing up first/middle/last positions
- Forgetting punctuation: `.,` and `.`

## Variations to practice (OA-style)
- Put **first initial** instead of last initial
- Print **full middle name** instead of middle initial
- Print in different order, like:
    - `lastName, firstName M.`
    - `firstName M. lastName`
    - `M., firstName lastName`


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

        // Read the full line (full name)
        String fullName = scnr.nextLine();

        // Split the name into parts
        String[] nameParts = fullName.split(" ");

        String firstName = nameParts[0];
        String lastInitial = nameParts[nameParts.length - 1].substring(0, 1);

        if (nameParts.length == 3) {
            // Has middle name
            String middleInitial = nameParts[1].substring(0, 1); // Middle name initial
            System.out.println(lastInitial + "., " + firstName + " " + middleInitial + ".");
        } else if (nameParts.length == 2) {
            // No middle name
            System.out.println(lastInitial + "., " + firstName);
        } else {
            // Optional: handle unexpected input
            System.out.println("Invalid input!")
        }
    }
}
```

<h1 align=center>
More Practice
</h1>

<h2 align=center>
1) First and Last Initial (No Middle)
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that reads a full name that contains exactly two parts: first and last name.
</p>

**Output the name in this format:**

```text
F. L.
```

#### Example

**Input:**

```text
Julia Clark
```

**Output:**

```text
J. C.
```


### What to focus on 
- Splitting into two parts
- Getting the first character of each name
- Exact punctuation and spacing



### Try it!
- Open <a href="./PracticeProgramOne.java">PracticeProgramOne.java</a> or copy this template into a new file:

    PracticeProgramOne.java:

    ```java
    import java.util.Scanner;

    public class PracticeProgramOne {
        public static void main(String[] args) {

            Scanner scnr = new Scanner(System.in);

            // Read full name (first last)

            // Split into parts

            // Print "F. L"

        }
    }
    ```

- Find the solution at <a href="./PracticeProgramOneSolution.java">PracticeProgramOneSolution.java</a>.

<h2 align=center>
2) Middle Initial Only (3-Part Name)
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Write a program that reads a full name that contains exactly three parts: first, middle, and last name

**Output the name in this format:**

```text
M. firstName lastName
```

#### Example

**Input:**

```text
Pat Silly Doe
```

**Output:**
```text
S., Pat Doe
```


### What to focus on
- Correct indexing (`parts[1] is middle)
- Keeping full first and last names
- Formatting exactly with punctuation and spacing

### Try it!

- Open <a href="./PracticeProgramTwo.java">PracticeProgramTwo.java</a> or copy this template into a new file:

    PracticeProgramTwo.java:

    ```java
    import java.util.Scanner;

    public class PracticeProgramTwo {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);

            // Read a full name (first middle last)

            // Split into parts

            //Print "M., firstName lastName"

        }
    }
    ```

- Find the solution at <a href="./PracticeProgramTwoSolution.java">PracticeProgramTwoSolution.java</a>.