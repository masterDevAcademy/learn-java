<h1 align="center">
Lesson 16: Loop Control — break & continue
</h1>

## Lesson Goal
Learn how to control loop behavior using the `break` and `continue` statements.

So far, loops have run until their condition becomes false. Now you'll learn how to: 
- **Stop a loop early** (`break`)
- **Skip part of a loop iteration** (`continue`)

By the end, you'll be able to control loop flow more precisely..

---

<h2 align=center>
1) The <code>break</code> Statement
</h2>

The `break` statement immediately stops a loop, even if the loop condition is still true.

```java
for (int i = 1; 1<= 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```
**Output**:
```text
1
2
3
4
```
The loop stops when `i` reaches 5.

---

<h2 align=center>
2) The <code>continue</code> Statement
</h2>

The `continue` statement skips the rest of the current loop iteration and moves to the next one.


```java
for (int i = 1; 1 <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}
```
**Output:**
```text
1
2
4
5
```
The number 3 is skipped 

---

<h2 align=center>
3) When to Use break vs continue
</h2>

<div align=center>

| Statement | What It Does |
|-----------|--------------|
| `break` | Stops the loop completely |
| `continue` | Skips to the next loop cycle

</div>

Use `break` when the loop has **found what it needs** or should stop early.

Use `continue` when you want to **skip invalid or unwanted data**.

---

<h2 align=center> Mini Project — {{Mini Project Title}} </h2>

### Objective

{{What the student should create or accomplish}}

{{JavaFileName.java}}
```java
public class {{JavaFileName}} {
    public static void main(String[] args) {
        // Insert your code here
    }
}
```
*Hint: {{Optional hint}}*

### Rules
- ❌ {{Rule 1}}
- ❌ {{Rule 2}}
- ❌ {{Rule 3}}
- ✅ {{Allowed actions}}

### Requirements
{{Detailed requirements for the project}}

### Basic Example (yours should be different)
```text
{{Example output}}
```

### Common Mistakes
- {{Mistake 1}}
- {{Mistake 2}}
- {{Mistake 3}}

<h2 align=center> Quick Recap </h2>

- {{Key takeaway 1}}
- {{Key takeaway 2}}
- {{Key takeaway 3}}
- {{Key takeaway 4}}

Next lesson, you'll be ready to {{transition to next lesson}}
