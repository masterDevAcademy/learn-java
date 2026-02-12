<h1 align=center>
PA Question 06 — Name Formatting with Initials 
</h1>

<p align=center>
Navigate to <a href="../../modules/04-strings/12-strings-basics/">Module 4 — Lesson 12</a> to learn about working with strings. Navigate to <a href="../../modules/04-strings/13-string-methods/">Module 4 — Lesson 13</a> to learn about string methods like <code>substring()</code> and <code>charAt()</code>. If you need to review input, visit <a href="../../modules/02-variables-and-data-types/06-input-with-scanner/">Module 2 — Lesson 6</a>.
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
<code>lastInitial., firstName</code>
</p>


**If the input is:**

```text
Pat Silly Doe
```

**The output is:**

```text
D., Pat S.
```

**Alternatively, if the input is:**

```text
Julia Clark
```

**The output is:**

```text
C., Julia
```

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">How To Read This Prompt</strong>
</summary>

- **Count how many words are in the name.**
  - 2 words → First + Last
  - 3 words → First + Middle + Last
- **Initials usually mean the first character of a word.**
  - Use `charAt(0)` or `substring(0, 1)`
- **Pay attention to output punctuation.**
  - Periods, commas, and spaces must match exactly.
- **Don’t assume middle names always exist** unless the prompt guarantees it.

</details>

## Common mistakes
- Using `next()` instead of `nextLine()` and losing parts of the name
- Forgetting to handle both two-part and three-part names
- Missing spaces or punctuation in the formatted output
- Using the wrong index when extracting initials

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
            System.out.println("Invalid input!");
        }
    }
}
```
<details>
<summary align=center>
    <strong style="font-size: 1.4rem">Line by Line Explanation</strong>
</summary>

1. **Reading Input**

    ```java
    String fullName = scnr.nextLine();
    ```

    - Reads the entire name as one line of text, including spaces.

2. **Splitting the Name into Parts**

    ```java
    String[] nameParts = fullName.split(" ");
    ```

    - Splits the full name wherever a space appears.
    - Examples `"Pat Silly Doe"` becomes ["Pat", "Silly", "Doe"].

3. **Getting the First Name and Last Initial**

    ```java
    String firstName = nameParts[0];
    String lastInitial = nameParts[nameParts.length - 1].substring(0, 1);
    ```

    - The first word is the first name.
    - The last word is the last name; `substring(0, 1) gets its first letter.

4. **If There Is a Middle Name**

    ```java
    if (nameParts.length == 3) {
        String middleInitial = nameParts[1].substring(0, 1);
        System.out.println(lastInitial + "., " + firstName + " " + middleInitial + ".");
    }
    ```

    - If there are 3 words, the second word is the middle name.
    - Its first letter becomes the middle initial.
    - The output format becomes: `L., First M.`

5. **If There Is No Middle Name**

    ```java
    else if (nameParts.length == 2) {
        System.out.println(lastInitial + "., " + firstName);
    }
    ```

    - If only two words are present, skip the middle initial
    - Output format becomes: `L., First`

6. **Handling Unexpected Input

    ```java
    else {
        System.out.println("Invalid input!");
    }
    ```

    - If the name doesn't have 2 or 3 parts, the program prints an error.


<h2 align=center>
Learn about these:
</h2>

[Working with Strings](../../modules/04-strings/12-strings-basics)

[String Methods](../../modules/04-strings/13-string-methods)

[Input with Scanner](../../modules/02-variables-and-data-types/06-input-with-scanner)

</details>


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