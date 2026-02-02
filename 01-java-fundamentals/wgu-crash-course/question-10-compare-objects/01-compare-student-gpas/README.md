<h1 align=center>
More Practice 01 — Compare Student GPAs (multi-file)
</h1>

<p align=center>
Navigate to <a href="../../../modules/08-objects-and-classes/25-introduction-to-classes-and-objects/">Module 8 — Lesson 25</a> to learn how objects work. Navigate to <a href="../../../modules/08-objects-and-classes/27-encapsulation-getters-and-setters/">Module 8 — Lesson 27</a> to learn about getters and setters. If you need to review input, visit <a href="../../../modules/02-variables-and-data-types/06-input-with-scanner/">Module 2 — Lesson 6</a>.
</p>

<h2 align=center>
Goal
</h2>

<p align=center>
Practice the same pattern as the PA: you are given a class file you do <strong>not</strong> edit, and you write logic in the main program file.
</p>

<h2 align=center>
Files
</h2>

- ✅ **Edit:** `PracticeProgramOne.java`
- 🚫 **Do not edit:** `Student.java`
- ✅ **Check your work:** `PracticeProgramOneSolution.java`

<h2 align=center>
Prompt
</h2>

<p align=center>
You are given a <code>Student</code> class with private fields for name and GPA, plus getters/setters and a <code>printInfo()</code> method.
</p>

<p align=center>
Write a program that reads two students’ names and GPAs (one name and one GPA per student). Use setter methods to store the data in two <code>Student</code> objects. Then determine which student has the higher GPA using <code>getGpa()</code>, and print that student using <code>printInfo()</code>.
</p>

<p align=center>
Read input in this order (each on its own line): student 1 name, student 1 GPA, student 2 name, student 2 GPA.
</p>

<h2 align=center>
Example
</h2>

**If the input is:**

```text
Alex
3.8
Jordan
3.6
```

**The output is:**

```text
Student with higher GPA:
Name: Alex
GPA: 3.8
```

<h2 align=center>
Hints
</h2>

- You must use setters (fields are private)
- Compare GPAs using getters: `s1.getGpa()` and `s2.getGpa()`.
- Print using the provided method (don't reformat output).

<h2 align=center>
Run it
<h2>

From this folder:

    ```bash
    javac *.java
    java PracticeProgramOne
    ```