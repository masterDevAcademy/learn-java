<h1 align=center>
PA Question 14 — Using an ArrayList of Objects
</h1>

<p align=center>
 — .
</p>

<h2 align=center>
What You Practice
</h2>

<p align=center>
Creating and using an <code>ArrayList</code>
</p>

<p align=center>
Storing objects inside collections
</p>

<p align=center>
Using loops to access object data
</p>

<p align=center>
Calling methods on objects in a list
</p>

<h2 align=center>
Prompt
</h2>

Write code in the `Customer` class of `Customer.java` to do the following:
- Create a `Grocery` ArrayList
- Define a method names `getGroceryList` that returns the `Grocery` ArrayList
    - Use the method signature `public ArrayList<Grocery> getGroceryList()`
- Define a method names `addGrocery` with a `Grocery` parameter variable.
    - The `addGrocery` method should add a `Grocery` object to the `Grocery` ArrayList via the parameter.
    - Use the method signature `public void addGrocery(Grocery grocery)`

**If the input is:**

```text
John
Eggs
5.99
12
y
Oatmeal
8.99
1
n
```

**The output when "John" is the name of the customer, "Eggs" are a grocery item, 5.99 is the price, 12 is the quantity, "y" is a value indicating "yes" to enter more items, "Oatmeal is another grocery item, 8.99 is the price, 1 is the quantity, and "n" is a value indication "no" to stop entering more items is:**

```text
John has the following items:

Item: Eggs
Price: 5.99
Quantity: 12

Item: Oatmeal
Price: 8.99
Quantity: 1

Total: 14.98
```

<details>
<summary align=center>
    <strong style="font-size: 1.4rem">How To Read This Prompt</strong>
</summary>

- **This is a multi-file question.**  
  You will only modify `Customer.java`. Do NOT change `CustomerInfo.java` or `Grocery.java`.

- **You are storing objects inside a collection.**  
  Instead of storing numbers or strings, this program stores **Grocery objects** inside an `ArrayList`.

- **The ArrayList belongs to the Customer.**  
  Each `Customer` object maintains its own grocery list.

- **You must create methods to manage the list.**  
  `addGrocery()` adds items to the list.  
  `getGroceryList()` returns the list so other files can loop through it.

- **Do not print inside the Customer class.**  
  Printing happens in `CustomerInfo.java`. The Customer class is only responsible for storing data.

- **The loop in CustomerInfo uses your methods.**  
  If `getGroceryList()` or `addGrocery()` are wrong, the loop in `main()` will not work.

</details>


## Common mistakes
- Forgetting to initialize the ArrayList
- Returning the wrong type from `getGroceryList()`
- Not using the parameter in `addGrocery()`
- Trying to access list elements without a loop

## Variations to practice (OA-style)
- Store `Pet` objects instead of groceries
- Store `Player` objects in a team roster
- Calculate totals using different fields

<h2 align=center>
Template
</h2>

CustomerInfo.java

*NOTE: You are NOT changing this file, this file is given and remains intact*

```java
import java.util.Scanner;
import java.util.ArrayList;

public class CustomerInfo {
 
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String name, item;
      double price, total = 0;
      int quantity;
      
      Grocery  grocery = null;
      Customer customer1 = new Customer();
      name = scnr.next();
      
      String sentinel = "y";
      
      do{   
         
         item = scnr.next();
         price = scnr.nextDouble();
         quantity = scnr.nextInt();
         
         grocery = new Grocery(item, price, quantity);          
         customer1.addGrocery(grocery);
         
         sentinel = scnr.next();         
         
      }while(sentinel.equals("y"));     
      
      System.out.println(name + " has the following items:\n");
      
      for(Grocery g : customer1.getGroceryList()){
         System.out.println("Item: " + g.getItem());
         System.out.println("Price: " + g.getPrice());
         System.out.println("Quantity: " + g.getQuantity() + "\n");   
         total += g.getPrice();
      }
      
      System.out.println("Total: " + total);
   }
}
```

Grocery.java

*NOTE: You are NOT changing this file, this file is given and remains intact*

```java
public class Grocery {

   private String item;
   private double price;
   private int quantity;
   
   public Grocery(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

     public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
```


Customer.java 

*NOTE: This is the file where the changes happen*

```java
import java.util.ArrayList;

public class Customer {
   private int id;
   private String name;
   
   //TODO: Create a Grocery ArrayList
   
   
   //TODO: Define getGroceryList() method that returns Grocery ArrayList  
  
    
   //TODO: Define addGrocery(Grocery grocery) that adds a Grocery object to Grocery ArrayList via the grocery parameter
   
   
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
```



<h2 align=center>
Solution
</h2>



Customer.java

```java
import java.util.ArrayList;

public class Customer {
    private int id; 
    private String name;

    // TODO: Create a Grocery ArrayList
    private ArrayList<Grocery> groceryList = new ArrayList<Grocery>();

    // TODO: Define getGroceryList() method that returns Grocery ArrayList
    public ArrayList<Grocery> getGroceryList() {
        return groceryList;
    }

    // TODO: Define addGrocery(Grocery grocery) that adds a Grocery object to Grocery ArrayList via the grocery parameter
    public void addGrocery(Grocery grocery) {
        groceryList.add(grocery);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```


<details>
<summary align=center>
    <strong style="font-size: 1.4rem">Line by Line Explanation</strong>
</summary>

If you do not understand `public class LabProgram{` or `public static void main(String[] args) {` you need to go back to question one or read [Module 1](../../modules/01-java-basics-and-program-structure). If you do not understand 'Scanner' please go back to question two or read [Input with Scanner](../../modules/02-variables-and-data-types/06-input-with-scanner). Understanding `System.out.println()` is crucial at this point; if you do not understand this, stop here and go read [Printing Output](../../modules/01-java-basics-and-program-structure/03-printing-output-and-escape-characters/).

1. The Grocery Class

    ```java
    public class Grocery {
        private String item;
        private double price;
        private int quantity;
    }
    ```

    - Each Grocery object represents one item.
    - It stores the item name, price, and quantity.

    ```java
    public Grocery(String item, double price, int quantity)
    ```

    - This constructor creates a grocery object with data.

    ```java
    public String getItem()
    public double getPrice()
    public int getQuantity()
    ```

    These getters allow other files to access grocery data.

2. Customer CLass

    ```java
    private ArrayList<Grocery> groceryList = new ArrayList<Grocery>();
    ```

    - This creates an ArrayList that stores Grocery objects.
    - Every Customer has their own grocery list.

    ```java
    public ArrayList<Grocery> getGroceryList() {
        return groceryList;
    }
    ```

    - This returns the entire grocery list.
    - CustomerInfo.java uses this to loop through items.

    ```java
    public void addGrocery(Grocery grocery) {
        groceryList.add(grocery);
    }
    ```

    - This method adds a Grocery object to the list.
    - It is called each time the user enters an item.

3. How CustomerInfo Uses Your Methods

    ```java
    grocery = new Grocery(item, price, quantity);
    customer1.addGrocery(grocery);
    ```

    - A new Grocery object is created.
    - It is added to the customer’s grocery list using your method.

    ```java
    for(Grocery g : customer1.getGroceryList()) {
    ```

    - This loops through the ArrayList you created.

    ```java
    System.out.println("Item: " + g.getItem());
    System.out.println("Price: " + g.getPrice());
    System.out.println("Quantity: " + g.getQuantity());
    ```

    - These getters come from the Grocery class.

    ```java
    total += g.getPrice() * g.getQuantity();
    ```

    - This calculates the correct total by multiplying price and quantity.

4. Big Concept: Objects Inside Collections

This program shows:
- A Customer object
- Contains an ArrayList
- That stores multiple Grocery objects

This is how real programs store:
- Shopping carts
- Team rosters
- Libraries of books
- Playlists of songs

Each object holds its own data, and collections manage groups of objects.

<h2 align=center>
Learn about these:
</h2>

[ArrayLists](../../modules/10-collections/30-arraylists)

[Objects Inside Collections](../../modules/10-collections/31-objects-inside-collections)

[Loops with Collections](../../modules/05-loops/15-for-loops)

[Classes and Objects Review](../../modules/08-objects-and-classes/25-introduction-to-classes-and-objects)

 

</details>

---

<h1 align=center>
More Practice
</h1>

<h2 align=center>
1) Team Roster
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Create a <code>Team</code> class that stores a list of <code>Player</code> objects. Add methods to add players and retrieve the roster.
</p>


### What to focus on 
- Using an ArrayList with custom objects
- Writing methods that manage collections
- Iterating over objects to print information 

### Try it!
- Open <a href="./PracticeProgramOne.java">PracticeProgramOne.java</a> or copy this template into a new file:

    PracticeProgramOne.java:

    ```java
    import java.util.ArrayList;

    public class Team {

        // ArrayList<Player>

        // addPlayer(Player p)

        // getRoster()

    }
    ```

- Find the solution at <a href="./PracticeProgramOneSolution.java">PracticeProgramOneSolution.java</a>.

<h2 align=center>
2) Library System
</h2>

<h2 align=center>
Prompt
</h2>

<p align=center>
Create a <code>Library</code> class that stores a list of <code>Book</code> objects. Add methods to add books and print all book titles.
</p>



### What to focus on
- Storing multiple objects in one collection
- Looping through an ArrayList
- Calling object methods inside loops

### Try it!

- Open <a href="./PracticeProgramTwo.java">PracticeProgramTwo.java</a> or copy this template into a new file:

    PracticeProgramTwo.java:

    ```java
    import java.util.ArrayList;

    public class Library {

        // ArrayList<Book>

        // addBook(Book b)

        // printBooks()

    }
    import java.util.ArrayList;

    public class Library {

        // ArrayList<Book>

        // addBook(Book b)

        // printBooks()

    }
    ```

- Find the solution at <a href="./PracticeProgramTwoSolution.java">PracticeProgramTwoSolution.java</a>.