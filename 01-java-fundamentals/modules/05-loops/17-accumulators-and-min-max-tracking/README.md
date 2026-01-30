<h1 align="center">
Lesson 17: Accumulators & Min/Max Tracking
</h1>

## Lesson Goal
Learn how to track totals, counts, and extreme values inside loops.

So far, your loops have repeated actions. Now, they will **collect information** as they run. This is how programs calculate things like:
- Total scores
- Average
- Highest and lowest values

By the end, you'll be able to use loops to gather useful statistics from multiple inputs.

---

<h2 align=center>
1) What Is an Accumulator?
</h2>

An **accumulator** is a variable that keeps a running total.

```java
int total = 0;

for (int i = 1; i <= 3; i++) {
    total += i;
}
```

The value of `total` increases each time the loop runs.

---

<h2 align=center>
2) Counting Values
</h2>

Loops often track how many times something happens.


```java
int count = 0;

while (number != -1) {
    count ++;
}
```
**Output:**

---

<h2 align=center>
3) Tracking the Minimum and Maximum
</h2>

You can compare each new value to the smallest or largest seen so far.

```java
int lowest = Integer.MAX_VALUE;
int highest = Integer.MIN_VALUE;

if (value < lowest) {
    lowest = value;
}

if (value > highest) {
    highest = value;
}
```

These comparisons run inside a loop.

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
