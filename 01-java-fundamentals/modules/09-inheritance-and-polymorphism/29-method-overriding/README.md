<h1 align="center">
Lesson 29: Method Overriding & Polymorphism
</h1>

## Lesson Goal
Learn how subclasses can change inherited behavior using method overriding, and how polymorphism allows different objects to be treated as a common type.

In the previous lesson, subclasses inherited fields from a parent class. Now, they will also be able to **customize behavior** by replacing methods from the parent class.

By the end of this lesson, you'll understand how method overriding works and how polymorphism makes object-oriented programs flexible.

---

<h2 align=center>
1) What Is Method Overriding?
</h2>

**Method overriding** happens when a subclass provides its own version of a method that already exists in the parent class.

```java
class Character {
    public void attack() {
        System.out.println("The character attacks!");
    }
}

class Warrior extends Character {
    @Override
    public void attack() {
        System.out.println("The Warrior swings a sword!");
    }
}
```

The `Warrior` class replaces the `attack()` method.
---

<h2 align=center>
2) The <code>@Override</code> Annotation
</h2>

The `@Override` annotation tells Java that a method is meant to replace a parent method.

It helps catch mistakes if the method name or parameters are incorrect.

---

<h2 align=center>
3) What Is Polymorphism?
</h2>

**Polymorphism** means "many forms." It allows different objects to be treated as the same parent type.

```java
Character hero1 = new Warrior();
Character hero2 = new Mage();
```

Both are `Character` references, but they behave differently when methods are called.

---

<h2 align=center>
4) Polymorphism in Action
</h2>

```java
hero1.attack(); // Warrior attack
hero2.attack(); // Mage attack
```

Even though both variables are type `Character`, the subclass method runs.

---

<h2 align=center> Mini Project — Ability System </h2>
Create a system where different character types attack in their own unique way.

This project reinforces:
- Method overriding
- The `@Override` annotation
- Polymorphism

### Objective
Create a Java program that:
- Defines a base `Character` class with an `attack()` method
- Creates subclasses like `Warrior` and `Mage`
- Overrides the `attack()` method in each subclass
- Uses parent-type references to call overridden methods
- Demonstrates polymorphism in action

### Rules
- ❌ No user input required
- ❌ No arrays or lists required
- ❌ No additional methods beyond attack
- ✅ Focus on overriding and polymorphism

### Requirements
Your program must:
- Define a base class with a method to override
- Use `@Override` in each subclass
- Create at least two subclass objects
- Store them as `Character` references
- Call the method and show different inputs
- Compile and run successfully

### Basic Example (yours should be different)
```text
The warrior swings a sword!
The mage casts a fireball!
```

### Common Mistakes
- Forgetting the method signature must match exactly
- Not using `@Override` and missing errors
- Trying to access subclass-specific fields through a parent reference
- Forgetting that polymorphism works through parent types

<h2 align=center> Quick Recap </h2>

- Method overriding lets subclasses customize behavior
- `@Override` ensures correct method replacement
- Polymorphism allows different objects to share a common type
- Parent references can call subclass methods

Next module, you'll learn how to store multiple objects using **collections like ArrayList**.
