<h1 align=center>
PA Question 10 — Compare Customer Ages
</h1>

<p align=center>
Navigate to <a href="../../modules/08-objects-and-classes/25-introduction-to-classes-and-objects/">Module 8 — Lesson 25</a> to learn how classes and objects work. Navigate to <a href="../../modules/08-objects-and-classes/27-encapsulation-getters-and-setters/">Module 8 — Lesson 27</a> to learn about encapsulation and using getters/setters. If you need to review input, visit <a href="../../modules/02-variables-and-data-types/06-input-with-scanner/">Module 2 — Lesson 6</a>.
</p>


<h2 align=center>
What You Practice
</h2>

<p align=center>
Creating and using objects
</p>

<p align=center>
Using mutator (setter) methods
</p>

<p align=center>
Using accessor (getter) methods
</p>

<p align=center>
Comparing object data
</p>

<h2 align=center>
Prompt
</h2>

<p align=center>
An existing <code>Customer</code> class has been provided in <code>Customer.java</code>. Write a program in <code>main</code> of <code>CustomerAge.java</code> that reads two customers' names and ages (one name and one age per customer). Use the provided <code>customer1</code> and <code>customer2</code> objects and set their fields using <code>setName()</code> and <code>setAge()</code>. Then determine which customer is older using <code>getAge()</code>.
</p>

<p align=center>
Output the older customer's information using its <code>printInfo()</code> method. The output should match the formatting exactly and end with a newline.
</p>



**If the input is:**

```text
Jane
25
John
29
```

**The output is:**

```text
Customer that is older:
Name: John
Age: 29
```

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">How To Read This Prompt</strong>
</summary>

- **Notice it is multi-file.** You do your work in <code>CustomerAge.java</code>; <code>Customer.java</code> is provided.
- **Use setters to assign data.** If fields are <code>private</code>, you must use <code>setName()</code> and <code>setAge()</code>.
- **Use getters to compare.** Compare ages with <code>customer1.getAge()</code> and <code>customer2.getAge()</code>.
- **Printing is already implemented.** Use <code>printInfo()</code> exactly—don’t reformat the output yourself.

</details>


## Common mistakes
- Forgetting to use the setter methods (`setName`, `setAge`)
- Trying to access private variables directly
- Comparing the wrong values
- Forgetting to call `printInfo()`

## Variations to practice (OA-style)
- Compare salaries instead of ages
- Compare three customers instead of two
- Print the younger customer instead

<h2 align=center>
Template
</h2>

Customer.java

*NOTE: You are NOT changing this file, this file is given and remains intact*

```java


public class Customer {   
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { 
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```
CustomerAge.java 

*NOTE: This is the file where the changes happen*

```java
import java.util.Scanner;

public class CustomerAge {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        // TODO: Declare name and age variables (string, and int)

        // TODO: Read name and age input for customer 1

        // TODO: Set customer 1 name and age fields using mutator methods (setName() and setAge())


        // TODO: Read name and age input for customer 2


        // TODO: Set customer 2 name and age fields using mutator methods (setName() and setAge())


        System.out.println("Customer that is older:");

        // TODO: Determine older customer (use getAge()) and output older customer's info (use printInfo())

    }
}
```

<h2 align=center>
Solution
</h2>



CustomerAge.java 

```java
import java.util.Scanner;

public class CustomerAge {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        // TODO: Declare name and age variables (string, and int)
        String name;
        int age;

        // TODO: Read name and age input for customer 1
        name = scnr.nextLine();
        age = scnr.nextInt();
        scnr.nextLine();

        // TODO: Set customer 1 name and age fields using mutator methods (setName() and setAge())
        customer1.setName(name);
        customer1.setAge(age);

        // TODO: Read name and age input for customer 2
        name = scnr.nextLine();
        age = scnr.nextInt();
        scnr.nextLine();

        // TODO: Set customer 2 name and age fields using mutator methods (setName() and setAge())
        customer2.setName(name);
        customer2.setAge(age);

        System.out.println("Customer that is older:");

        // TODO: Determine older customer (use getAge()) and output older customer's info (use printInfo())

        if (customer1.getAge() > customer2.getAge()) {
            customer1.printInfo();
        } else {
            customer2.printInfo();
        }
    }
}
```

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">Line by Line Explanation</strong>
</summary>

If you do not understand `public class CustomerAge {` or `public static void main(String[] args) {` you need to go back to question one or read [Module 1](../../modules/01-java-basics-and-program-structure). If you do not understand `Scanner` please go back to question two or read [Input with Scanner](../../modules/02-variables-and-data-types/06-input-with-scanner). Understanding `System.out.println()` is crucial at this point; if you do not understand this, stop here and go read [Printing Output](../../modules/01-java-basics-and-program-structure/03-printing-output-and-escape-characters/).

1. **Create the Scanner and Customer Objects**

    ```java
    Scanner scnr = new Scanner(System.in);

    Customer customer1 = new Customer();
    Customer customer2 = new Customer();
    ```

    - `Scanner` reads input from the user.
    - `customer1` and `customer2` are two separate objects created from the `Customer` class.
    - You will store the input values inside these objects.

2. **Declare Variables for Input**

    ```java
    String name;
    int age;
    ```

    - These temporary variables hold the input before you assign it to an object.
    - You reuse them for both customers.

3. **Read and Store Customer 1**

    ```java
    name = scnr.nextLine();
    age = scnr.nextInt();
    scnr.nextLine();
    ```

    - `nextLine()` reads the full name line.
    - `nextInt()` reads the age number.
    - The extra `scnr.nextLine()` clears the leftover newline after `nextInt()` so the next name reads correctly.

    Then you set the values into the object:

    ```java
    customer1.setName(name);
    customer1.setAge(age);
    ```

    - Fields are `private`, so you must use setters.

4. **Read and Store Customer 2**

    This repeats the same pattern:

    ```java
    name = scnr.nextLine();
    age = scnr.nextInt();
    scnr.nextLine();

    customer2.setName(name);
    customer2.setAge(age);
    ```

5. **Print the Required Header**

    ```java
    System.out.println("Customer that is older:");
    ```

    - This line must print exactly as shown in the example output.

6. **Compare Ages Using Getters and Print the Older Customer**

    ```java
    if (customer1.getAge() > customer2.getAge()) {
        customer1.printInfo();
    } else {
        customer2.printInfo();
    }
    ```

    - `getAge()` reads each customer’s age from inside the object.
    - You compare the two ages.
    - `printInfo()` handles printing the name and age in the correct format, so you don’t re-build the output yourself.

<h2 align=center>
Learn about these:
</h2>

[Classes and Objects](../../modules/08-objects-and-classes/25-introduction-to-classes-and-objects)

[Encapsulation, Getters, and Setters](../../modules/08-objects-and-classes/27-encapsulation-getters-and-setters)

[Input with Scanner](../../modules/02-variables-and-data-types/06-input-with-scanner)

</details>

---

<h1 align=center>
More Practice
</h1>

<h2 align=center>
1) Compare Student GPAs (multi-file)
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
You are given a <code>Student</code> class with fields for name and GPA. Write a program that reads two students' names and GPAs, then prints the student with the higher GPA.
</p>

This practice mirrors the PA style: you are given a class file that you do **not** change.

- Open: [01-compare-student-gpas/README.md](./01-compare-student-gpas/README.md)
- Edit: [01-compare-student-gpas/PracticeProgramOne.java](./01-compare-student-gpas/PracticeProgramOne.java)
- Do not edit: [01-compare-student-gpas/Student.java](./01-compare-student-gpas/Student.java)
- Solution: [01-compare-student-gpas/PracticeProgramOneSolution.java](./01-compare-student-gpas/PracticeProgramOneSolution.java)


### What to focus on 
- Creating multiple objects
- Using setter methods to assign values
- Comparing values using getter methods
- Calling an object method to display information



### Try it!
- Open <a href="./01-compare-student-gpas/PracticeProgramOne.java">PracticeProgramOne.java</a> or copy this template into a new file:

    PracticeProgramOne.java:

    ```java
    import java.util.Scanner;

    public class PracticeProgramOne {
        public static void main(String[] args) {

            Scanner scnr = new Scanner(System.in);

            Student s1 = new Student();
            Student s2 = new Student();

            // Read input and set student data
            // Compare GPAs
            // Print the student with the higher GPA

        }
    }
    ```

- Find the solution at <a href="./01-compare-student-gpas/PracticeProgramOneSolution.java">PracticeProgramOneSolution.java</a>.

<h2 align=center>
2) Find the Most Expensive Product
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
You are given a <code>Product</code> class with name and price fields. Write a program that reads two products and prints the one with the higher price.
</p>

- Open: [02-most-expensive-product/README.md](./02-most-expensive-product/README.md)
- Edit: [02-most-expensive-product/PracticeProgramTwo.java](./02-most-expensive-product/PracticeProgramTwo.java)
- Do not edit: [02-most-expensive-product/Product.java](./02-most-expensive-product/Product.java)
- Solution: [02-most-expensive-product/PracticeProgramTwoSolution.java](./02-most-expensive-product/PracticeProgramTwoSolution.java)


### What to focus on
- Comparing numeric values stored in objects
- Using object methods instead of accessing fields directly
- Practicing the same comparison pattern in a new context

### Try it!

- Open <a href="./02-most-expensive-product/PracticeProgramTwo.java">PracticeProgramTwo.java</a> or copy this template into a new file:

    PracticeProgramTwo.java:

    ```java
    import java.util.Scanner;

    public class PracticeProgramTwo {
        public static void main(String[] args) {

            Scanner scnr = new Scanner(System.in);

            Product p1 = new Product();
            Product p2 = new Product();

            // Read product data
            // Compare prices
            // Print the more expensive product

        }
    }
    ```

- Find the solution at <a href="./02-most-expensive-product/PracticeProgramTwoSolution.java">PracticeProgramTwoSolution.java</a>.