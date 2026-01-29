<h1 align=center>
WGU Crash Course (Java Fundamentals D286 - ZyBooks-style Labs)
</h1>

<p align=center>
This section is a **fast, practice-first** track designed for WGU students preparing for the **ZyBooks / OA-style Java labs**. It's still useful for anyone — but it's optimized for **speed**, **pattern recognition**, and <strong>"read → type → run → tweak"</strong> practice.

> ✅ Goal: be able to recognize each lab "shape" and confidently implement it from scratch in a timed environment.

---

## How to use this folder

Each `question-XX` folder includes:
- `README.md` — the prompt, what it's really resting, common pitfalls, and **OA-style variations** (no proprietary OA code)
- `LabProgram.java` (or multiple files when needed) — a **practice template** plus a reference solution** you can compare against

Recommended workflow:
1. Open the `README.md`
2. Create/modify the program **from the template**
3. Run it locally:
    ```bash
    javac LabProgram.java
    java LabProgram
    ```
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
| question-01 | Printing a pattern (exact spacing) |
| question-02 | Basic arithmetic + repeated multiplication |
| question-03 | Integer division (tables filles) |
| question-04 | Mixed input types + formatted sentence |
| question-05 | Conditionals + validation + math with digits |
| question-06 | String parsing + initials formatting |
| question-07 | Sentinel loop + smallest + sum |
| question-08 | Arrays + average + formatted output |
| question-09 | Methods + Random + looping calls | 
| question-10 | Objects + setters/getters + compare | 
| question-11 | Encapsulation + helper method + ratio |
| question-12 | constructors + accessors/mutators | 
| question-13 | Inheritance + overriding | 
| question-14 | ArrayList field + add/get methods |

---

## Notes on OA-style changes

People often report that the OA uses the **same concepts** with small twists:
- change operator (multiple `→` add/subtract)
- change "smallest" to "largest"
- change array length (3 `→` 4 or 5)
- swap class theme (Pet `→` Employee/Shape/etc.)

This is why every folder includes a "Variations to practice section."

Good luck!