<h1 align=center>
WGU Crash Course (Java Fundamentals D286 - ZyBooks-style Labs)
</h1>

<p align=center>
This section is a **fast, practice-first** track designed for WGU students preparing for the **ZyBooks / OA-style Java labs**. It's still useful for anyone — but it's optimized for **speed**, **pattern recognition**, and <strong>"read → type → run → tweak"</strong> practice.

> ✅ Goal: be able to recognize each lab "shape" and confidently implement it from scratch in a timed environment.

---

## How to use this folder

Each `question-XX` folder includes:
- `README.md` — the prompt, what it's really testing, common pitfalls, and **OA-style variations** (no proprietary OA code)
- `PracticeProgramOne.java` a **practice template** plus a reference solution `PracticeProgramOneSolution.java` you can compare against
- `PracticeProgramTwo.java` a **practice template** plus a reference solution** `PracticeProgramTwoSolution.java` you can compare against

Recommended workflow:
1. Open the `README.md`
2. Create/modify the program **from the template**
3. Run it locally:
    ```bash
    javac LabProgram.java
    java LabProgram
    ```

    > .class files are ignored in this entire repository. You MUST compile yourself.
    
4. Then do the **OA-style variations** section (the real value)

---

## Quick "test day" checklist

- Input with `Scanner`:
    -`nextInt()`, `nextDouble()`, `next()`, `nextLine()`
    - Remember: after `nextInt()` / `nextDouble()`, you may need `scnr.nextLine()` to consume the leftover newline
- Output formatting:
    - Exact spaces, commas, punctuation, and newline matter
    - Use `System.out.print()` vs `println()` intentionally
    - Use `printf()` when formatting money/decimals
- Loops:
    - Sentinel loops (`while`, `do/while`) for unknown input count
    - For loops for known fixed input counts (arrays)
- Strings:
    - `split(" ")`, `substring(0, 1), `.length`
- OOP patterns:
    - getters/setters, constructors, compare two objects, printInfo()
    - arraylists: create, add, return list

## Practice set

| Folder | Skill it drills |
|--------|-----------------|
| [question-01](./question-01-print-pattern/) | Printing a pattern (exact spacing) |
| [question-02](./question-02-repeated-product/) | Basic arithmetic + repeated multiplication |
| [question-03](./question-03-integer-division/) | Integer division (tables filles) |
| [question-04](./question-04-mixed-input-formatting/) | Mixed input types + formatted sentence |
| [question-05](./question-05-validation-and-divisibility/) | Conditionals + validation + math with digits |
| [question-06](./question-06-name-initials/) | String parsing + initials formatting |
| [question-07](./question-07-sentinel-sum-min/) | Sentinel loop + smallest + sum |
| [question-08](./question-08-array-average/) | Arrays + average + formatted output |
| [question-09](./question-09-method-random-loop/) | Methods + Random + looping calls | 
| [question-10](./question-10-compare-objects/) | Objects + setters/getters + compare | 
| [question-11](./question-11-helper-method-encapsulation/) | Encapsulation + helper method + ratio |
| [question-12](./question-12-constructors-getters-setters/) | constructors + accessors/mutators | 
| [question-13](./question-13-inheritance-override/) | Inheritance + overriding | 
| [question-14](./question-14-arraylist-field-add-get/) | ArrayList field + add/get methods |

---

## Notes on OA-style changes

People often report that the OA uses the **same concepts** with small twists:
- change operator (multiple `→` add/subtract)
- change "smallest" to "largest"
- change array length (3 `→` 4 or 5)
- swap class theme (Pet `→` Employee/Shape/etc.)

This is why every folder includes a "Variations to practice section."

Good luck!

> **Note:** 
>
> All practice program **prompts and problem designs** in this crash course were written **before taking the course exam.** 
>
> Some folders may currently be missing:
> - **"Final practice files"**
> - **"Completed solution files"** 
> - **"Fully built multi-project structures"** 
>
>This is because development of the repository is happening **in parallel with exam preparation**. While not every supporting file is complete yet, the **problem types, logic patterns, and concepts being practiced are still accurate and aligned with exam objectives.**