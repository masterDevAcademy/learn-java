<h1 align="center">Lesson 01: What Java Is & How a Java Program Runs</h1>

Welcome to your first Java lesson! Before we start writing programs, it's important to understand **what Java is** and **how a Java program actually runs**.

This lesson is all about **concepts, structure, and flow** — not logic or variables yet.

---

## Lesson Goal
By the end of this lesson, you'll be able to:

- Explain what Java is in simple terms
- Understand the difference between the JVM, JDK, and JRE
- Know the difference between **source code** and **bytecode**
- Understand how to **compile** and **run** a Java program
- Recognize the role of the `main()` method

---


<h2 align=center>
1) What is Java?
</h2>

Java is a **high-level programming language**, which means it is written in words that are relatively close to English.

You can think of Java as a **recipe book for computers** — humans write the recipes, and the computer follows them to make programs.

---

<h2 align=center>
2) JVM vs JDK vs JRE
</h2>

Java programs involve a few key tools:

| Term | What is does | 
|------|--------------|
| **JVM** (Java Virtual Machine) | Runs compiled Java programs on your computer. Think of it as the engine that executes your code. |
| **JRE** (Java Runtime Environment) | Includes the JVM and basic libraries needed to run Java programs. |
| **JDK** (Java Development Kit) | Everything you need to *write, compile, and run** Java programs, including the JRE |

**Analogy:**
- The **JVM** is the chef.
- The **JRE** is the kitchen.
- The **JDK** is the kitchen + recipe writing tools.

---

<h2 align=center>
3) Source Code vs Bytecode
</h2>

- **Source code**: The code you write in a `java` file. Humans read and write this.
- **Bytecode**: The `.class` file Java creates after compilation. The JVM can read and run this.

```text
JavaInfo.java  → (compiled) → JavaInfo.class → JVM runs it
```

---

<h2 align=center> 4) Compile vs Run </h2>

- **Compile**: Turn `.java` source code into `.class` bytecode using `javac`:

```bash
javac JavaInfo.java
```

- **Run**: Ask the JVM to execute bytecode using `java`:

```bash
java JavaInfo
```

> Java won't run a `.java` file directly. It must be compiled first.

---

<h2 align=center>
5) How Java Programs Start Executing
</h2>

Every Java program begins execution in the `main()` **method**. Think of it as the **entry door** for your program.

```java
public class JavaInfo {
    public static void main(String[] args) {
        // Java starts running code here
    }
}
```

- The JVM looks for this exact method signature to know where to start.
- Anything inside `main()` runs **top to bottom**

---
<h2 align=center>
Mini Project — Your First Java Program
</h2>

### Objective

Write a simple program that prints:
- Your name
- The java version being used 
- A short sentence explaining what Java is

`JavaInfo.java`
```java
public class JavaInfo {
    public static void main(String[] args) {
        System.out.println("Name: Print your name");
        System.out.println("Java Version: Print the Java version");
        // Hint: Run java -version in your terminal to find out what version you have
        System.out.println("Print a short sentence about Java");
    }
}
```

### Rules
- ❌ No variables
- ❌ No user input
- ❌ No loops or logic
- ✅ Only use System.out.println() to display text

**Example Output**:
```text
Name: Master Dev
Java Version: 17
Java is a programming language that lets you build applications for computers.
```

### Common Mistakes
- Forgetting `main()` — Java won't know where to start
- Mismatch between class name and file name
- Missing semicolons at the end of `System.out.println() statements

---

<h2 align=center>
Quick Recap
</h2>

- Java is a high-level programming language
- JVM runs programs, JDK lets you write and compile them, JRE lets you run them
- `.java` = source code, `.class` = bytecode
- Compile with `javac`, run with `java`
- Execution always starts in `main()`

Next lesson, you'll learn about the program structure and we will dive deeper into the `main()` method.
