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

Debt ratio is a ratio of total debt to total assets, calculated using the formula:

`Total Debt / Total Assets`

<p align=center>
The <code>DebtMeasure.java</code> file contains existing code then collects input for <code>totalDebt</code> and <code>totalAssets</code>, then passes the inputs into the <code>Debt</code> object's <code>setDR()</code> method. The code then returns the <code>debtRatio</code> using the <code>Debt</code> object's <code>getDR()</code> method.
</p>

Write code in the `Debt` class of `Debt.jav` that has the following field and methods:
- `debtRatio`: private field of a type double
- `calculateDR`: a private helper method with two parameter variables of type double for `totalDebt` and `totalAssets`
    - The `calculateDR` method should calculate the debt ratio and assign the results to the `debtRatio` field.
    - Use the method signature `private void CalculateDR(double totalDebt, double totalAssets)`.
- `getDR`: public accessor method that returns the `debtRatio` field value
- `setDR`: public mutator method that passes the inputs, `totalDebt` and `totalAssets`, to the Debt class

Ensure your program output matches the example formatting below and works for a variety of input values.

**If the input is:**

```text
250000
300000
```

**The output when 250000 is the total debt and 300000 is the total assets is:**

```text
The Company's total debt is in the amount of $250,000.00, and total assets are in the amount of $300,000.00, which gives a debt ratio of 0.83.
```


## Common mistakes
- Forgetting to store the results in the class field
- Doing the math in `main()` instead of inside the class
- Making `calculateDR()` public (it should be private)
- Returning the wrong value in `getDR()`

## Variations to practice (OA-style)
- Calculate a **percentage** instead of a ratio
- Use different financial metrics (profit margin, expense ratio)
- Store multiple calculated values inside the class

<h2 align=center>
Template
</h2>

DebtMeasure.java

*NOTE: You are NOT changing this file, this file is given and remains intact*

```java
import java.util.Scanner;

public class DebtMeasure {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Debt debt1 = new Debt();
            
      double totalDebt = scnr.nextDouble();
      double totalAssets = scnr.nextDouble();      
            
      debt1.setDR(totalDebt, totalAssets);      
    
      System.out.printf("The Company's total debt is in the amount of $%,.2f, and total assets are in the amount of $%,.2f, which gives a debt ratio of %.2f.\n", totalDebt, totalAssets, debt1.getDR());      
   }
}
```
Debt.java 

*NOTE: This is the file where the changes happen*

```java
public class Debt {
    // TODO: Declare private field - debtRatio    
  
    // TODO: Define private method - calculateDR()
 
    
    // TODO: Define public method - getDR()

    
    // TODO: Define public method - SetDR

    
 }
```

<h2 align=center>
Solution
</h2>



Debt.java 

```java

public class Debt {
    // TODO: Declare private field - debtRatio
    private double debtRatio;
    // TODO: Define private method - calculateDR()
    private void calculateDR(double totalDebt, double totalAssets) {
        debtRatio = totalDebt / totalAssets;
    }

    // TODO: Define public method - getDR()
    public double getDR() {
        return debtRatio;
    }

    // TODO: Define public method - SetDR
    public void setDR(double totalDebt, double totalAssets) {
        calculateDR(totalDebt, totalAssets);
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
1) Temperature Converter Class
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Create a class that stores a temperature in Celsius and automatically calculates the temperature in Fahrenheit.
</p>

**Formula**:
> F = (C * 9/5) + 32

### What to focus on 
- Storing calculated values inside the class
- Using a private helper method
- Returning results using a getter


### Try it!
- Open <a href="./PracticeProgramOne.java">PracticeProgramOne.java</a> or copy this template into a new file:

    PracticeProgramOne.java:

    ```java
    public class Temperature {

        // Store celsius and fahrenheit
        // Create a private method to calculate Fahrenheit
        // Provide public getters and setters
    }

    ```

- Find the solution at <a href="./PracticeProgramOneSolution.java">PracticeProgramOneSolution.java</a>.

<h2 align=center>
2) Rectangle Area Class
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Create a class that stores the width and height of a rectangle and automatically calculates its area.
</p>

**Formula**:
> Area = width x height

### What to focus on
- Encapsulation (calculations inside the class)
- Keeping helper methods private
- Using setters to trigger calculations

### Try it!

- Open <a href="./PracticeProgramTwo.java">PracticeProgramTwo.java</a> or copy this template into a new file:

    PracticeProgramTwo.java:

    ```java
    public class Rectangle {

        // Store width, height, and area
        // Private method to calculate area
        // Public setters and getter for area
    }
    ```

- Find the solution at <a href="./PracticeProgramTwoSolution.java">PracticeProgramTwoSolution.java</a>.