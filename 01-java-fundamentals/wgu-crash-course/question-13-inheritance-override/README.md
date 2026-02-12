<h1 align=center>
PA Question 13 — Inheritance and Method Overriding
</h1>

<p align=center>
Navigate to <a href="../../modules/09-inheritance-and-polymorphism/28-inheritance-basics/">Module 9 — Lesson 28</a> to learn about inheritance. Navigate to <a href="../../modules/09-inheritance-and-polymorphism/29-method-overriding/">Module 9 — Lesson 29</a> to learn about method overriding and polymorphism.
</p>

<h2 align=center>
What You Practice
</h2>

<p align=center>
Understanding inheritance
</p>

<p align=center>
Using <code>extends</code> to create derived classes
</p>

<p align=center>
Overriding a method
</p>

<p align=center>
Using polymorphism (same method, different behavior)
</p>

<h2 align=center>
Prompt
</h2>

<p align=center>
The <code>MallardDuck</code> and <code>RubberDuck</code> derived classes extend the <code>Duck</code> base class. In the <code>MallardDuck</code> and <code>RubberDuck</code> derived classes, define an overridden method named <code>getBehavior</code> that returns the string "squeaks" and "flies", respectively.

Write code in the derived class of `RubberDuck.java` that has the following method:
- `getBehavior`: an overridden method that returns the string "squeaks"

Write code in the derived class of `MallardDuck.java` that has the following method:
- `getBehavior`: an overridden method that returns the string "flies"

**If the input is:**

```text
Mallard Austin
Rubber Squeaker
```

**The output when "Mallard" is the duck type, "Austin" is the duck name, "Rubber" is the duck type, and "Squeaker" is the duck name is:**

```text
Duck Information:
Austin the Mallard duck flies!
Squeaker the Rubber duck squeaks!
```

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">How To Read This Prompt</strong>
</summary>

- **This is a multi-file inheritance question.**  
  You will only modify `MallardDuck.java` and `RubberDuck.java`.

- **The base class is already written.**  
  `Duck.java` contains shared fields and methods that both duck types inherit.

- **You must override a method.**  
  Both derived classes must provide their own version of `getBehavior()`.

- **Use `@Override` above the method.**  
  This ensures the method signature matches the parent class correctly.

- **Do NOT modify the base class.**  
  The whole point of inheritance is to extend behavior, not rewrite the original class.

- **Polymorphism means same method, different behavior.**  
  Both ducks have `getBehavior()`, but one returns `"flies"` and the other `"squeaks"`.

</details>


## Common mistakes
- Forgetting to use `@Override`
- Misspelling the method name (`getBehavior`)
- Returning the wrong String
- Modifying the base class instead of the derived class

## Variations to practice (OA-style)
- Different animal classes (Dog, Cat)
- Different behaviors (barks, meows)
- Additional derived classes

<h2 align=center>
Template
</h2>

DuckInfo.java

*NOTE: You are NOT changing this file, this file is given and remains intact*

```java
import java.util.Scanner;

public class DuckInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);   
      
      // Variables for Scanner object input
      String type, name;
      
      // Input Mallard Duck type and name
      type = scnr.next();
      name = scnr.next();
      
      
      System.out.println("Duck Information:"); 
      
      // Create MallardDuck object
      MallardDuck md = new MallardDuck();
      
      // Call MallardDuck setters and pass type and name variables as arguments
      md.setType(type);
      md.setName(name);
      
      //Call MallardDuck getters and display output e.g. tab(name getter) the (type getter) duck (behavior getter)! 
      System.out.println(md.getName() + " the " + md.getType() + " duck " + md.getBehavior() + "!");
      
      // Input RubberDuck type and name
      type = scnr.next();
      name = scnr.next();
      
      // Create RubberDuck object
      RubberDuck rd = new RubberDuck();
      
      // Call RubberDuck setters
      rd.setType(type);
      rd.setName(name);
      
      //Call RubberDuck getters and display output e.g. tab(name getter) the (type getter) duck (behavior getter)! 
      System.out.println(rd.getName() + " the " + rd.getType() + " duck " + rd.getBehavior() + "!");

    }
}
```

Duck.java

*NOTE: You are NOT changing this file, this file is given and remains intact*

```java
public class Duck {

    private String name, behavior, type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBehavior() {
        return behavior;
    }    
}

```


MallardDuck.java 

*NOTE: This is a file where the changes happen*

```java
public class MallardDuck extends Duck{

    //TODO: Define getBehavior() overridden method and return String "flies"
    
}
```

RubberDuck.java

*NOTE: This is a file where the changes happen*

```java
public class RubberDuck extends Duck {
   
   //TODO: Define getBehavior() overridden method and return String "squeaks"
    
}
```

<h2 align=center>
Solution
</h2>



MallardDuck.java

```java
public class MallardDuck extends Duck{

    // TODO: Define getBehavior() overridden method and return String "flies"

    @Override
    public String getBehavior() {
        return "flies";
    }
}
```
RubberDuck.java

```java
public class RubberDuck extends Duck {
   
   //TODO: Define getBehavior() overridden method and return String "squeaks"
   @Override
   public String getBehavior() {
      return "squeaks";
   }
}
```

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">Line by Line Explanation</strong>
</summary>

If you do not understand `public class LabProgram{` or `public static void main(String[] args) {` you need to go back to question one or read [Module 1](../../modules/01-java-basics-and-program-structure). If you do not understand 'Scanner' please go back to question two or read [Input with Scanner](../../modules/02-variables-and-data-types/06-input-with-scanner). Understanding `System.out.println()` is crucial at this point; if you do not understand this, stop here and go read [Printing Output](../../modules/01-java-basics-and-program-structure/03-printing-output-and-escape-characters/).


1. The Base CLass: `Duck.java`

- The `Duck` class is the **parent (base) class**. It contains fields and methods that all ducks share.

    ```java
    private String name, behavior, type;
    ```

    - These fields belong to every Duck object.
    - They are `private`, which means other files cannot access them directly.

    ```java
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    ```

    - These are **getters and setters**
    - The main program uses these to assign the duck's name/type and read them back.

    ```java
    public String getBehavior() {
        return behavior;
    }
    ```

    - This method exists in the base class, but notice:
        - There is no setter for `behavior`
        - Nothing in `Duck.java` assigns a behavior rule
    - That is why the derived class must override it

2) The Derived Classes Override Behavior

Both `MallardDuck` and `RubberDuck` **extend** `Duck`.
That means they inherit `setName()`, `setType()`, `getName()`, and `getType()`.

MallardDuck.java

    ```java
    public class MallardDuck extends Duck {
        ...
    }
    ```

    - `extends Duck` means this class is a **child of Duck**.
    - It automatically gets all public methods from `Duck`.

    ```java
    @Override
    public String getBehavior() {
        return "flies";
    }

    - `@Override` tells java: "I am replacing the parent version of this method."
    - When `getBehavior()` is called on a `MallardDuck`, it will return `"flies"`.

RubberDuck.java

    ```java
    public class RubberDuck extends Duck {
        ...
    }
    ```

    - Same inheritance idea: RubberDuck is a Duck, but with different behavior.

    ```java
    @Override
    public String getBehavior() {
        return "squeaks";
    }
    ```
    - This overrides the same method name and signature.
    - When `getBehavior()` is called on a `RubberDuck`, it returns `"squeaks"`.


3) How `DuckInfo.java` Uses Your Overrides

The main program reads input, creates ducks, sets their fields, and prints the results.

    ```java
    type = scnr.next();
    name = scnr.next();
    System.out.println("Duck Information:");
    ```

    - Reads two tokens: duck type then duck name.
    - Prints the header once.

    ```java
    MallardDuck md = new MallardDuck();
    md.setType(type);
    md.setName(name);
    ```

    - Creates a MallardDuck object.
    - Uses inherited setters from <code>Duck</code> to store the type and name.

    ```java
    System.out.println(md.getName() + " the " + md.getType() + " duck " + md.getBehavior() + "!");
    ```

- `md.getName()` and `md.getType()` come from the base class.
- `md.getBehavior()` comes from the derived class override.
- That’s why the output becomes:
  `Austin the Mallard duck flies!`

Then it repeats for the Rubber duck:

    ```java
    RubberDuck rd = new RubberDuck();
    rd.setType(type);
    rd.setName(name);
    System.out.println(rd.getName() + " the " + rd.getType() + " duck " + rd.getBehavior() + "!");
    ```

    - Same print line — different class — different result.
    - That is the core of **polymorphism**: same method call, different behavior depending on object type.


<h2 align=center>
Learn about these:
</h2>


[Inheritance Basics](../../modules/09-inheritance-and-polymorphism/28-inheritance-basics)

[Method Overriding](../../modules/09-inheritance-and-polymorphism/29-method-overriding)

[Polymorphism](../../modules/09-inheritance-and-polymorphism/29-method-overriding)

 

</details>

---

<h1 align=center>
More Practice
</h1>

<h2 align=center>
1) Animal Sounds
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Create a base class named <code>Animal</code> with a method <code>MakeSound()</code>. Then create two derived classes, <code>Dog</code> and <code>Cat</code>, that override this method
</p>

Expected behavior:
- Dog → `"barks"`
- Cat → `"meows"`

### What to focus on 
- Using `extends`
` Overriding a method with the same signature
- Understanding that behavior changes based on object type

### Try it!
- Open <a href="./PracticeProgramOne.java">PracticeProgramOne.java</a> or copy this template into a new file:

    PracticeProgramOne.java:

    ```java
    public class Animal {
        public String makeSound() {
            return "makes a sound";
        }
    }

    public class Dog extends Animal {
        // Override makeSound()
    }

    public class Cat extends Animal {
        // Override makeSound()
    }
    ```

- Find the solution at <a href="./PracticeProgramOneSolution.java">PracticeProgramOneSolution.java</a>.

<h2 align=center>
2) Vehicle Movement
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Create a base class <code>Vehicle</code> with a method <code>move()</code>. Then create <code>Car</code> and <code>Bicycle</code> classes that override the method.
</p>

Expected behavior:
- Car → `"drives"`
- Bicycle → `"pedals"`


### What to focus on
- Same method name, different behavior
- How polymorphism works
- Method overriding rules

### Try it!

- Open <a href="./PracticeProgramTwo.java">PracticeProgramTwo.java</a> or copy this template into a new file:

    PracticeProgramTwo.java:

    ```java
    public class Vehicle {
        public String move() {
            return "moves";
        }
    }

    public class Car extends Vehicle {
        // Override move()
    }

    public class Bicycle extends Vehicle {
        // Override move()
    }
    ```

- Find the solution at <a href="./PracticeProgramTwoSolution.java">PracticeProgramTwoSolution.java</a>.