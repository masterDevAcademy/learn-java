<h1 align=center>
PA Question 13 — Inheritance and Method Overriding
</h1>

<p align=center>
 — .
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


## Common mistakes
- Forgetting to use `@Override`
-Misspelling the method name (`getBehavior`)
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




<h2 align=center>
Learn about these:
</h2>



 

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