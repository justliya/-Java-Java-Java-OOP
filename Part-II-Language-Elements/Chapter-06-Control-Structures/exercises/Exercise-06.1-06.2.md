# Exercises 6.1–6.2: Control Structures

## Exercise 6.1

Explain the difference between the following pairs of terms.

### a. Counting loop and conditional loop

- **Counting loop:** Runs a specific number of times.
- **Conditional loop:** Runs until a condition becomes false.

### b. `for` statement and `while` statement

- **`for` statement:** Best when you know how many times the loop should run.
- **`while` statement:** Best when the loop should run as long as a condition is true.

### c. `while` statement and `do`-`while` statement

- **`while` statement:** Checks the condition first. May run zero times.
- **`do`-`while` statement:** Runs once before checking the condition. Runs at least one time.

### d. Zero indexing and unit indexing

- **Zero indexing:** Counting starts at 0.
- **Unit indexing:** Counting starts at 1.

### e. Sentinel bound and limit bound

- **Sentinel bound:** A special value that tells the loop to stop.
- **Limit bound:** The loop stops when a limit is reached.

### f. Counting bound and flag bound

- **Counting bound:** The loop stops after a certain number of repetitions.
- **Flag bound:** The loop stops when a Boolean flag changes value.

### g. Loop initializer and updater

- **Loop initializer:** The starting value of the loop variable.
- **Updater:** Changes the loop variable each iteration.

### h. Named constant and literal

- **Named constant:** A value stored in a constant variable with a meaningful name.
- **Literal:** A value written directly in code.

### i. Compound statement and null statement

- **Compound statement:** Multiple statements grouped together with `{}`.
- **Null statement:** A statement that does nothing (`;`).

## Exercise 6.2

> **Quick Tip:**
> - Priming read = first input before the loop starts.
> - Sentinel = special stop value.
> - Counting bound = stop after a certain count.
> - Limit bound = stop when a target value is reached.

Fill in the blank.

1. The process of reading a data item before entering a loop is known as a **priming read** (first read before the loop).
2. A loop that does nothing except iterate is an example of a **null loop** (loop runs but does no useful work).
3. A loop that contains no body is an example of a **null statement** (empty loop body).
4. A loop whose entry condition is stated as `(k < 100 || k >= 0)` would be an example of an **infinite** loop (condition is always true).
5. A loop that should iterate until the user types in a special value should use a **sentinel** bound (special stop value).
6. A loop that should iterate until its variable goes from 5 to 100 should use a **counting** bound (count from 5 to 100).
7. A loop that should iterate until the difference between two values is less than 0.005 is an example of a **limit** bound (stop when a target is reached).

## Revision notes

- Answers reviewed and corrected for Exercises 6.1 and 6.2.
