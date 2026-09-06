# Java Loops

Loops are used to execute a block of code repeatedly until a condition becomes `false`.

They are useful when the same task needs to be performed multiple times.

Example:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Output:

```text
1
2
3
4
5
```

---

# Types of Loops in Java

Java provides four commonly used loop forms:

1. `for` loop
2. `while` loop
3. `do-while` loop
4. Enhanced `for-each` loop

Java also provides loop-control statements:

- `break`
- `continue`

---

# 1. `for` Loop

The `for` loop is commonly used when the number of iterations is known or controlled by a counter.

### Syntax

```java
for (initialization; condition; update) {
    // code
}
```

### Example

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Output:

```text
1
2
3
4
5
```

## How a `for` Loop Works

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Execution order:

```text
1. Initialization
       ↓
2. Condition
       ↓
3. Body
       ↓
4. Update
       ↓
5. Condition
       ↓
   ...
```

The initialization executes only once.

The condition is checked before every iteration.

The update executes after the loop body.

### Important

If the condition is initially `false`, the loop body does not execute even once.

```java
for (int i = 10; i < 5; i++) {
    System.out.println(i);
}
```

No output.

---

# 2. `while` Loop

A `while` loop is used when the number of iterations may not be known in advance.

### Syntax

```java
while (condition) {
    // code
}
```

### Example

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

Output:

```text
1
2
3
4
5
```

### Important

The condition is checked **before** the body executes.

Therefore, if the condition is initially `false`, the body executes zero times.

```java
int i = 10;

while (i < 5) {
    System.out.println(i);
    i++;
}
```

No output.

---

# 3. `do-while` Loop

A `do-while` loop executes its body first and checks the condition afterward.

### Syntax

```java
do {
    // code
} while (condition);
```

### Example

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

Output:

```text
1
2
3
4
5
```

## ⭐ Important Difference

A `do-while` loop executes **at least once**, even when the condition is initially `false`.

```java
int i = 10;

do {
    System.out.println(i);
} while (i < 5);
```

Output:

```text
10
```

This is a very common interview question.

---

# 4. Enhanced `for` / `for-each` Loop

The enhanced `for` loop is mainly used to traverse arrays and collections.

### Syntax

```java
for (dataType variable : arrayOrCollection) {
    // code
}
```

### Example with Array

```java
int[] numbers = {10, 20, 30, 40};

for (int number : numbers) {
    System.out.println(number);
}
```

Output:

```text
10
20
30
40
```

### Example with String Array

```java
String[] names = {"Jatin", "Rahul", "Aman"};

for (String name : names) {
    System.out.println(name);
}
```

### Advantages

- Simple syntax
- Easy to read
- No need to manage index manually
- Useful for traversing arrays and collections

### Limitations

The enhanced `for` loop does not directly provide the index.

```java
int[] numbers = {10, 20, 30};

for (int number : numbers) {
    System.out.println(number);
}
```

If you need the index, a normal `for` loop is usually better.

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(i + " -> " + numbers[i]);
}
```

---

# 5. `break` Statement

`break` immediately terminates the nearest loop or switch.

### Example

```java
for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
3
4
```

When `i == 5`, `break` terminates the loop.

### Interview Point

`break` exits the **nearest enclosing loop**.

---

# 6. `continue` Statement

`continue` skips the current iteration and moves to the next iteration.

### Example

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
4
5
```

When `i == 3`, the remaining body is skipped for that iteration.

---

# `break` vs `continue`

| `break` | `continue` |
|---|---|
| Terminates the loop | Skips current iteration |
| Loop ends immediately | Loop continues |
| Exits the nearest loop | Moves to next iteration |

---

# 7. Nested Loops

A loop inside another loop is called a **nested loop**.

### Example

```java
for (int i = 1; i <= 3; i++) {

    for (int j = 1; j <= 3; j++) {
        System.out.println(i + " " + j);
    }
}
```

Output:

```text
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
```

For every one iteration of the outer loop, the inner loop completes all its iterations.

### ⭐ Interview Point

If the outer loop runs `n` times and the inner loop also runs `n` times, the total iterations are approximately:

```text
n × n = n²
```

This is commonly associated with **O(n²)** time complexity.

---

# 8. Infinite Loop

An infinite loop is a loop that never becomes `false`.

### Example

```java
while (true) {
    System.out.println("Hello");
}
```

Another example:

```java
for (;;) {
    System.out.println("Hello");
}
```

Both are infinite loops.

They can be stopped using `break` or another control-flow mechanism when appropriate.

### Example

```java
int i = 1;

while (true) {

    System.out.println(i);

    if (i == 5) {
        break;
    }

    i++;
}
```

---

# 9. Loop Variable Scope

A variable declared inside a `for` loop is generally accessible only inside that loop.

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// System.out.println(i); // ❌ Error
```

The variable `i` has local scope inside the loop.

If you need the variable afterward:

```java
int i;

for (i = 0; i < 5; i++) {
    System.out.println(i);
}

System.out.println(i); // 5
```

---

# 10. Multiple Variables in a `for` Loop

A `for` loop can initialize and update multiple variables.

```java
for (int i = 0, j = 10; i < j; i++, j--) {
    System.out.println(i + " " + j);
}
```

This is valid Java syntax.

---

# 11. Empty `for` Loop

All three parts of a `for` loop are optional.

```java
for (;;) {
    System.out.println("Infinite loop");
}
```

This creates an infinite loop.

You can also write:

```java
int i = 0;

for (; i < 5;) {
    System.out.println(i);
    i++;
}
```

---

# 12. Nested `break` and `continue`

`break` and `continue` normally affect only the **nearest loop**.

Example:

```java
for (int i = 1; i <= 3; i++) {

    for (int j = 1; j <= 3; j++) {

        if (j == 2) {
            break;
        }

        System.out.println(i + " " + j);
    }
}
```

The `break` terminates only the inner loop.

---

# 13. Labeled `break`

Java supports labeled statements, which can be used to break out of an outer loop.

```java
outer:
for (int i = 1; i <= 3; i++) {

    for (int j = 1; j <= 3; j++) {

        if (i == 2 && j == 2) {
            break outer;
        }

        System.out.println(i + " " + j);
    }
}
```

This terminates the loop marked `outer`.

> **Interview Point:** Labeled `break` is valid Java but should be used carefully because excessive use can reduce readability.

---

# `for` vs `while` vs `do-while`

| Feature | `for` | `while` | `do-while` |
|---|---|---|---|
| Condition checked | Before body | Before body | After body |
| Minimum executions | 0 | 0 | 1 |
| Best when | Iterations are known | Condition-driven loop | Body must execute at least once |
| Initialization/update | Usually in loop header | Usually outside | Usually outside |

---

# `for` vs `for-each`

| Normal `for` | Enhanced `for-each` |
|---|---|
| Gives direct index access | Does not directly give index |
| Can move forward/backward using index | Traverses elements sequentially |
| More control | Simpler syntax |
| Useful when index is needed | Useful when only elements are needed |

---

# ⭐ Important Interview Points

### 1. Which loop executes at least once?

`do-while`.

### 2. Which loops can execute zero times?

`for` and `while`.

### 3. Difference between `while` and `do-while`?

`while` checks the condition before executing the body.

`do-while` executes the body first and checks the condition afterward.

### 4. What does `break` do?

It immediately terminates the nearest loop or switch.

### 5. What does `continue` do?

It skips the current iteration and proceeds to the next iteration.

### 6. Can a `for` loop be infinite?

Yes.

```java
for (;;) {
}
```

### 7. Can a `while` loop be infinite?

Yes.

```java
while (true) {
}
```

### 8. Can we use `break` inside `if`?

Yes, but only when that `if` is inside a loop or switch.

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        break;
    }
}
```

### 9. Can `continue` be used outside a loop?

No.

### 10. Does `break` terminate all nested loops?

No. It terminates only the nearest loop unless a labeled `break` is used.

---

# 🎯 Output-Based Interview Questions

## Q1. What is the output?

```java
for (int i = 0; i < 5; i++) {
    System.out.print(i + " ");
}
```

Output:

```text
0 1 2 3 4
```

---

## Q2. What is the output?

```java
for (int i = 5; i > 0; i--) {
    System.out.print(i + " ");
}
```

Output:

```text
5 4 3 2 1
```

---

## Q3. What is the output?

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.print(i + " ");
}
```

Output:

```text
1 2 4 5
```

---

## Q4. What is the output?

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        break;
    }

    System.out.print(i + " ");
}
```

Output:

```text
1 2
```

---

## Q5. What is the output?

```java
int i = 5;

do {
    System.out.println(i);
} while (i < 5);
```

Output:

```text
5
```

Because `do-while` executes the body before checking the condition.

---

## Q6. What is the output?

```java
int i = 5;

while (i < 5) {
    System.out.println(i);
}
```

Output:

```text
No output
```

The condition is false initially.

---

# 🎯 Interview Questions

### Q1. What is a loop?

A loop repeatedly executes a block of code while a specified condition is satisfied.

### Q2. What are the types of loops in Java?

`for`, `while`, `do-while`, and enhanced `for-each`.

### Q3. Which loop should you use when the number of iterations is known?

Usually a `for` loop.

### Q4. Which loop executes at least once?

`do-while`.

### Q5. What is an infinite loop?

A loop whose termination condition never becomes false.

### Q6. What is a nested loop?

A loop placed inside another loop.

### Q7. Difference between `break` and `continue`?

`break` terminates the loop; `continue` skips the current iteration.

### Q8. What is the advantage of for-each?

It provides simple and readable traversal of arrays and collections without manually managing indexes.

### Q9. What is the limitation of for-each?

It does not directly provide the element index and gives less control over traversal.

### Q10. What is fall-through?

Fall-through is a switch concept, not a normal loop behavior. In a switch, it occurs when a case continues into the next case without `break`.

---

# 📝 Quick Revision

```text
Loops
│
├── for
│
├── while
│
├── do-while
│
├── for-each
│
├── Nested Loops
│
├── Infinite Loops
│
└── Loop Control
    ├── break
    └── continue
```

## Key Rules

- `for` → commonly used when iterations are known.
- `while` → condition checked before execution.
- `do-while` → body executes at least once.
- `for-each` → easy traversal of arrays/collections.
- `break` → terminates the nearest loop.
- `continue` → skips the current iteration.
- Nested loops → inner loop completes for each outer iteration.
- `for (;;)`, `while (true)` → infinite loops.
- A loop variable declared in the loop header has loop-local scope.
