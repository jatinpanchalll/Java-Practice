# Java Conditional Statements

Conditional statements are used to make decisions in a Java program.

They allow a program to execute different blocks of code depending on whether a condition is `true` or `false`.

Example:

```java
int age = 20;

if (age >= 18) {
    System.out.println("Adult");
}
```

## Types of Conditional Statements

1. `if`
2. `if-else`
3. `if-else-if`
4. Nested `if`
5. `switch`
6. Ternary operator `?:`

---

# 1. `if` Statement

The `if` statement executes a block of code only when the given condition is `true`.

### Syntax

```java
if (condition) {
    // code
}
```

### Example

```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

### Important Point

The condition inside `if` must evaluate to a `boolean`.

```java
if (true) {
    System.out.println("Hello");
}
```

Java does **not** treat `0` as `false` and `1` as `true`.

```java
// Invalid in Java
if (1) {
    System.out.println("Hello");
}
```

---

# 2. `if-else` Statement

Used when there are two possible outcomes.

- Condition `true` → `if` block executes.
- Condition `false` → `else` block executes.

### Syntax

```java
if (condition) {
    // if block
} else {
    // else block
}
```

### Example

```java
int age = 16;

if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

---

# 3. `if-else-if` Ladder

Used when there are multiple conditions.

Java checks conditions from **top to bottom**. The first condition that becomes `true` executes, and the remaining conditions are skipped.

### Example

```java
int marks = 75;

if (marks >= 90) {
    System.out.println("Grade A+");
} else if (marks >= 75) {
    System.out.println("Grade A");
} else if (marks >= 60) {
    System.out.println("Grade B");
} else if (marks >= 40) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

Output:

```text
Grade A
```

### Interview Point

Order matters.

```java
int marks = 95;

if (marks >= 40) {
    System.out.println("Pass");
} else if (marks >= 90) {
    System.out.println("A+");
}
```

Output:

```text
Pass
```

The first condition is already `true`, so the later condition is not checked.

---

# 4. Nested `if`

An `if` statement inside another `if` statement is called a **nested if**.

```java
int age = 20;
boolean hasID = true;

if (age >= 18) {
    if (hasID) {
        System.out.println("Entry allowed");
    }
}
```

Nested `if` is useful when one condition depends on another.

> Avoid excessive nesting because it can reduce readability.

---

# 5. `switch` Statement

`switch` is useful when one expression needs to be compared against multiple fixed values.

### Syntax

```java
switch (expression) {

    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code
}
```

### Example

```java
int day = 2;

switch (day) {

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid day");
}
```

Output:

```text
Tuesday
```

## `break` in Switch

`break` terminates the current `switch`.

Without `break`, traditional switch cases can fall through.

```java
int x = 1;

switch (x) {

    case 1:
        System.out.println("One");

    case 2:
        System.out.println("Two");

    case 3:
        System.out.println("Three");
}
```

Output:

```text
One
Two
Three
```

This is called **fall-through**.

## `default`

`default` executes when none of the cases match.

```java
int day = 10;

switch (day) {

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid day");
}
```

`default` is optional.

## Switch Supported Types

Traditional Java `switch` supports:

- `byte`
- `short`
- `char`
- `int`
- `String`
- `enum`
- corresponding wrapper types

Traditional `switch` does not support `long`, `float`, `double`, or `boolean` as the selector type.

---

# 6. Ternary Operator `?:`

The ternary operator is a short way of writing a simple `if-else`.

### Syntax

```java
condition ? valueIfTrue : valueIfFalse;
```

### Example

```java
int age = 20;

String result = (age >= 18) ? "Adult" : "Minor";

System.out.println(result);
```

Output:

```text
Adult
```

Equivalent `if-else`:

```java
String result;

if (age >= 18) {
    result = "Adult";
} else {
    result = "Minor";
}
```

### Interview Point

Use ternary for **simple conditions**. Avoid complicated or deeply nested ternary expressions because they reduce readability.

---

# Difference Between Conditional Statements

| Statement | Best Used For |
|---|---|
| `if` | One condition |
| `if-else` | Two possible outcomes |
| `if-else-if` | Multiple conditions |
| Nested `if` | Dependent conditions |
| `switch` | Multiple fixed values |
| Ternary `?:` | Simple condition returning a value |

---

# ⭐ Important Interview Points

### 1. Can `if` work with an integer in Java?

No. Java requires a boolean expression.

```java
if (10) { } // ❌ Invalid
```

Correct:

```java
if (10 > 5) { } // ✅
```

### 2. What happens when multiple `if` conditions are true?

With separate `if` statements, all matching blocks can execute.

```java
int x = 10;

if (x > 5) {
    System.out.println("A");
}

if (x > 8) {
    System.out.println("B");
}
```

Output:

```text
A
B
```

In an `if-else-if` ladder, only the first matching condition executes.

### 3. Difference between multiple `if` and `if-else-if`

Separate `if` statements are checked independently.

With `if-else-if`, once one condition is `true`, the remaining conditions are skipped.

### 4. What is fall-through in switch?

When a switch case executes and continues into subsequent cases because there is no `break`.

### 5. Is `default` mandatory in switch?

No. `default` is optional.

### 6. Is `break` mandatory in every switch case?

No. But without it, traditional switch cases may fall through.

### 7. Can we use String in switch?

Yes.

```java
String language = "Java";

switch (language) {

    case "Java":
        System.out.println("Programming Language");
        break;

    default:
        System.out.println("Other");
}
```

### 8. Can we use `long` in switch?

No, traditional Java `switch` does not support `long`.

### 9. Switch vs if-else-if

`switch` is convenient for comparing one expression against multiple fixed values.

`if-else-if` is more flexible for ranges and complex boolean conditions.

---

# 🎯 Interview Questions

### Q1. What are conditional statements?

Statements used to execute different blocks of code depending on whether a condition is true or false.

### Q2. Difference between `if` and `if-else`?

`if` executes code only when the condition is true. `if-else` also provides an alternative block when the condition is false.

### Q3. What is an `if-else-if` ladder?

It checks multiple conditions sequentially.

### Q4. What is nested `if`?

An `if` statement placed inside another `if` statement.

### Q5. What is switch?

A selection statement used to choose among multiple matching cases based on an expression.

### Q6. What is fall-through?

Execution continuing into subsequent switch cases because `break` is missing.

### Q7. Is `default` mandatory?

No.

### Q8. Can String be used in switch?

Yes.

### Q9. Can long be used in switch?

No, not as a traditional switch selector type.

### Q10. What is the ternary operator?

`?:` is a conditional operator used as a concise alternative to a simple `if-else` expression.

---

# 📝 Quick Revision

```text
Conditional Statements
│
├── if
│
├── if-else
│
├── if-else-if
│
├── Nested if
│
├── switch
│   ├── case
│   ├── break
│   └── default
│
└── Ternary
    └── ?:
```

## Key Rules

- `if` condition must produce `boolean`.
- `if-else-if` executes the first matching condition.
- Separate `if` statements are checked independently.
- `switch` is useful for fixed-value choices.
- `break` prevents switch fall-through.
- `default` is optional.
- Ternary `?:` is best for simple conditions.
