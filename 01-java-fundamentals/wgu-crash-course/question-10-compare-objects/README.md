<h1 align=center>
PA Question 10 — Compare Customer Ages
</h1>

<p align=center>
 — .
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
An existing <code>Customer()</code> has been provided in <code>Customer.java</code>. Write a program in <code>main</code> of <code>CustomerAga.java</code> to accept on string input and one integer input for a customer's name and age fields, respectively. Use the existing <code>customer1</code> and <code>customer2</code> reference variables provided in the template to set the name and age of both customer objects using the <code>setName()</code> and <code>setAge()</code> methods. Determine which customer is older using its <code>getAge()</code> method.
</p>

<p align=center>
Output the older customer's information using its <code>printInfo()</code> method, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
</p>

Output the returned Boolean values on separate lines, ending with a newline


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
        this.age = age
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
        age = scnr.nextLine();

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

If you do not understand `public class LabProgram{` or `public static void main(String[] args) {` you need to go back to question one or read [Module 1](../../modules/01-java-basics-and-program-structure). If you do not understand 'Scanner' please go back to question two or read [Input with Scanner](../../modules/02-variables-and-data-types/06-input-with-scanner). Understanding `System.out.println()` is crucial at this point; if you do not understand this, stop here and go read [Printing Output](../../modules/01-java-basics-and-program-structure/03-printing-output-and-escape-characters/).




<h2 align=center>
Learn about these:
</h2>



 

</details>

---

<h1 align=center>
More Practice
</h1>

<h2 align=center>
1) Compare Student GPAs
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
You are given a <code>Student</code> class with fields for name and GPA. Write a program that reads two students' names and GPAs, then prints the student with the higher GPA.
</p>


### What to focus on 
- Creating multiple objects
- Using setter methods to assign values
- Comparing values using getter methods
- Calling an object method to display information



### Try it!
- Open <a href="./PracticeProgramOne.java">PracticeProgramOne.java</a> or copy this template into a new file:

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

- Find the solution at <a href="./PracticeProgramOneSolution.java">PracticeProgramOneSolution.java</a>.

<h2 align=center>
2) Find the Most Expensive Product
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
You are given a <code>Product</code> class with name and price fields. Write a program that reads two products and prints the one with the higher price.
</p>


### What to focus on
- Comparing numeric values stored in objects
- Using object methods instead of accessing fields directly
- Practicing the same comparison pattern in a new context

### Try it!

- Open <a href="./PracticeProgramTwo.java">PracticeProgramTwo.java</a> or copy this template into a new file:

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

- Find the solution at <a href="./PracticeProgramTwoSolution.java">PracticeProgramTwoSolution.java</a>.