<h1 align="center">
Lesson 20: Method Overloading & Scope
</h1>

## Lesson Goal
Learn how methods can share the same name with different parameters and how variable scope works in Java.

Now that you know how to create and call methods, it's time to make them more flexible. Methods can accept input through **parameters**, and multiple methods can share the same name as long as their parameters differ. You'll also learn how variables are limited to certain parts of a program.

By the end of this lesson, you'll understand method overloading and how scope affects variable visibility

---

<h2 align=center>
1) Method Parameters
</h2>

Methods can receive information through **parameters**.


```java
public static void showDamage(int damage) {
    System.out.println("You took " + damage + " damage!");
}
```

When calling the method:

```java
showDamage(15);
```

The value `15` is passed into the method.

---

<h2 align=center>
2) Returning Values
</h2>

Methods can send information back using a `return` statement.

```java
public static int add(int a, int b) {
    return a + b;
}
```

Using the returned value:

```java
int total = add(5, 3);
System.out.println(total);
```

---

<h2 align=center>
3) Method Overloading
</h2>

**Method overloading** allows multiple methods to share the same name if their parameter lists are different.

```java 
public static int calculateDamage(int base) {
    return base;
}

public static int calculateDamage(int base, int bonus) {
    return base + bonus;
}
```

Java chooses the correct method based on the arguments passed.

---

<h2 align=center>
4) Understanding Scope
</h2>

**Scope** determines where a variable can be used.

Variables declared inside a method are **local** to that method.

```java
public static void example() {
    int x = 10; // only usable inside this method
}
```

Trying to use `x` outside this method will cause an error.

Each method has its own separate scope. 

---

<h2 align=center> Mini Project — Ability Damage Calculator </h2>
Create a program that calculates damage using overloaded methods.

This project reinforces: 
- Method parameters
- Return values
- Method overloading
- Variable scope

### Objective
Create a Java program that: 
- Defines multiple overloaded methods to calculate damage
- Uses parameters to adjust damage
- Returns the calculated damage
- Prints the results in `main`



### Rules
- ❌ No loops required
- ❌ No classes or objects yet
- ❌ No user input required
- ✅ Use overloaded methods and return values

### Requirements
Your program must:
- Define at least **two overloaded methods** with the same name
- Each method must accept a different number of parameters
- Each method must return an `int` value
- Call both methods in `main` and print results

### Basic Example (yours should be different)
```text
{{Example output}}
```

### Common Mistakes
- Forgetting to include a return statement
- Trying to overload methods with the same parameters
- Using variables outside of their scope
- Confusing method parameters with variables in `main`

<h2 align=center> Quick Recap </h2>

- Methods can take input through parameters
- Methods can return values using `return`
- Method overloading allows same-name methods with different parameters
- Variables only exist inside their scope

Next lesson, you'll learn how to use Java's `Random` class to generate random numbers for unpredictable behavior.
