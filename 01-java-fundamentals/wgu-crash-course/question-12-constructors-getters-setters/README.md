<h1 align=center>
PA Question 12 — Constructors and Pet Objects
</h1>

<p align=center>
 — .
</p>

<h2 align=center>
What You Practice
</h2>

<p align=center>
Writing constructors
</p>

<p align=center>
Using overloaded constructors
</p>

<p align=center>
Initializing object fields
</p>

<p align=center>
Using getters to retrieve object data
</p>

<h2 align=center>
Prompt
</h2>

Write code in the `Pet.java` file that has the following field, constructors, and methods:

Fields
- `name`: string field for the name of the pet
- `type`: string field for the type of the pet
- `age`: integer field for the age of the pet

Constructors
- `Pet`: no-argument constructor
    - The `Pet` constructor should assign the value "unknown" to the name field, the value "unknown" to the field, and the value 0 to the age field.
- `Pet`: overloaded constructor with two string parameter variables for the name and type, and one integer parameter variable for the age
    - The overloaded `Pet` constructor should assign the parameter variable values to the `name`, `type`, and `age` fields, accordingly:

Methods
- `setName`: mutator method that sets the `name` field
- `setType`: mutator method the sets the `type` field 
- `setAge`: mutator method that sets the `age`field
- `getName`: accessor method that return that `name` field value
- `getType`: accessor method that returns the `type` field value
- `getAge`: accessor method that returns the `age` field value

**If the input is:**

```text
Max 
Bulldog
3
Leo
Boston-Terrier
6
```

**The output is:**

```text
Name: unknown
Type: unknown
Age: 0

Name: Max
Type: Bulldog
Age: 3

Name: Leo
Type: Boston-Terrier
Age: 6
```


## Common mistakes
- Forgetting to initialize fields in the no-arg constructor
- Forgetting to use `this.` in the overloaded constructor
- Mixing up parameter order
- Returning wrong values in getters

## Variations to practice (OA-style)
- Use different class name (Employee, Car, Book)
- Add more fields (weight, breed color)
- Use different default values

<h2 align=center>
Template
</h2>

PetInfo.java

*NOTE: You are NOT changing this file, this file is given and remains intact*

```java
import java.util.Scanner;

public class PetInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String name, type;
      int age;            

      Pet pet1 = new Pet();      
   
      name = scnr.next();
      type = scnr.next();      
      age = scnr.nextInt();
      Pet pet2 = new Pet(name, type, age);     
      
      name = scnr.next();
      type = scnr.next();      
      age = scnr.nextInt();
      Pet pet3 = new Pet(name, type, age);        
      
      System.out.println("Name: " + pet1.getName());
      System.out.println("Type: " + pet1.getType());
      System.out.println("Age: " +  pet1.getAge() + "\n");
      
      System.out.println("Name: " + pet2.getName());
      System.out.println("Type: " + pet2.getType());
      System.out.println("Age: " +  pet2.getAge()  + "\n");
      
      System.out.println("Name: " + pet3.getName());
      System.out.println("Type: " + pet3.getType());
      System.out.println("Age: " +  pet3.getAge());    
   }
}
```
Pet.java 

*NOTE: This is the file where the changes happen*

```java
public class Pet {
    // TODO: Declare private fields 
    
    
    // TODO: Define no-arg constructor 
    
   
   // TODO: Define overloaded constructor
  

   // TODO: Define getter (accessor) methods and setter (mutator) methods
   
   
}
```

<h2 align=center>
Solution
</h2>



Pet.java 

```java
public class Pet {
    // TODO: Declare private fields
    private String name;
    private String type;
    private int age;

    // TODO: Define no-arg constructor
    public pet() {
        name = "unknown";
        type = "unknown";
        age = 0;
    }

    // TODO: Define overloaded constructor
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    // TODO: Define getter (accessor) methods and setter (mutator) methods
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
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
1) Employee Constructor
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Create an <code>Employee</code> class with fields for name, job title, and salary. Include both a no-argument constructor and an overloaded constructor.
</p>


### What to focus on 
- Using constructors to initialize fields
- Providing default values
- Using `this` to avoid confusion between parameters and fields

### Try it!
- Open <a href="./PracticeProgramOne.java">PracticeProgramOne.java</a> or copy this template into a new file:

    PracticeProgramOne.java:

    ```java
    public class Employee {

        // Fields

        // No-arg constructor (default values)

        // Overloaded constructor

        // Getters and setters

    }
    ```

- Find the solution at <a href="./PracticeProgramOneSolution.java">PracticeProgramOneSolution.java</a>.

<h2 align=center>
2) Car Object Initialization
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Create a <code>Car</code> class with make, model, and year fields. Include two constructors and getter methods.
</p>


### What to focus on
- Constructor overloading
- Proper field assignment
- Retrieving values using getters

### Try it!

- Open <a href="./PracticeProgramTwo.java">PracticeProgramTwo.java</a> or copy this template into a new file:

    PracticeProgramTwo.java:

    ```java
    public class Car {

        // Fields

        // Constructors

        // Getters and setters

    }
    ```

- Find the solution at <a href="./PracticeProgramTwoSolution.java">PracticeProgramTwoSolution.java</a>.