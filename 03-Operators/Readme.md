# Java Operators

Operators are symbols used to tell the compiler to perform an operation on one or more operands.

Example:

```java
int sum = a + b;
```

Here:

* `a` and `b` → Operands
* `+` → Operator

---

## 1. Arithmetic Operators

Arithmetic operators are used to perform mathematical operations.

| Operator | Name                | Example |
| -------- | ------------------- | ------- |
| `+`      | Addition            | `a + b` |
| `-`      | Subtraction         | `a - b` |
| `*`      | Multiplication      | `a * b` |
| `/`      | Division            | `a / b` |
| `%`      | Modulus / Remainder | `a % b` |

### Binary and Unary Operators

`+` and `-` can be used as both binary and unary operators.

```java
int a = 10;
int b = 5;

int sum = a + b;  // Binary +
int x = -a;       // Unary -
int y = +a;       // Unary +
```

* **Binary operator** → works with two operands.
* **Unary operator** → works with one operand.

### Modulus `%`

`%` gives the remainder after division.

```java
System.out.println(10 % 3);  // 1
```

Common use: checking even/odd numbers.

```java
if (n % 2 == 0) {
    System.out.println("Even");
}
```

### Integer Division

If both operands are integers, Java performs integer division.

```java
System.out.println(5 / 2);    // 2
System.out.println(5.0 / 2);  // 2.5
```

> **Interview Point:** `/` gives the quotient, while `%` gives the remainder for integer operands.

---

## 2. Relational Operators

Relational operators compare two values and return a boolean result: `true` or `false`.

| Operator | Meaning                  | Example  |
| -------- | ------------------------ | -------- |
| `==`     | Equal to                 | `a == b` |
| `!=`     | Not equal to             | `a != b` |
| `>`      | Greater than             | `a > b`  |
| `<`      | Less than                | `a < b`  |
| `>=`     | Greater than or equal to | `a >= b` |
| `<=`     | Less than or equal to    | `a <= b` |

Example:

```java
int a = 10;
int b = 20;

System.out.println(a < b);   // true
System.out.println(a == b);  // false
```

### `=` vs `==`

* `=` → Assignment operator
* `==` → Equality comparison operator

```java
int x = 10;                    // Assignment
System.out.println(x == 10);  // Comparison
```

> **Interview Point:** With objects, `==` compares references, not normal object content. For `String` content comparison, use `.equals()`.

---

## 3. Assignment Operators

Assignment operators assign or update values in variables.

| Operator | Meaning             | Equivalent   |
| -------- | ------------------- | ------------ |
| `=`      | Assignment          | `a = 10`     |
| `+=`     | Add and assign      | `a = a + 10` |
| `-=`     | Subtract and assign | `a = a - 10` |
| `*=`     | Multiply and assign | `a = a * 10` |
| `/=`     | Divide and assign   | `a = a / 10` |
| `%=`     | Modulus and assign  | `a = a % 10` |

Example:

```java
int a = 10;

a += 5;  // 15
a *= 2;  // 30
```

---

## 4. Logical Operators

Logical operators are mainly used with boolean expressions.

| Operator | Name        | Result                                  |            |                                          |
| -------- | ----------- | --------------------------------------- | ---------- | ---------------------------------------- |
| `&&`     | Logical AND | True only when both conditions are true |            |                                          |
| `        |             | `                                       | Logical OR | True when at least one condition is true |
| `!`      | Logical NOT | Reverses the boolean result             |            |                                          |

Example:

```java
int age = 21;
boolean hasID = true;

System.out.println(age >= 18 && hasID);  // true
System.out.println(age < 18 || hasID);   // true
System.out.println(!hasID);              // false
```

### Truth Table

| A | B | `A && B` | `A || B` |
|---|---|---|---|
| true | true | true | true |
| true | false | false | true |
| false | true | false | true |
| false | false | false | false |

### NOT Operator

| A     | `!A`  |
| ----- | ----- |
| true  | false |
| false | true  |

---

## ⭐ Short-Circuit Evaluation

`&&` and `||` use short-circuit evaluation.

### `&&`

If the first condition is `false`, Java does not need to evaluate the second condition.

```java
if (x != 0 && 10 / x > 1) {
    System.out.println("Valid");
}
```

If `x != 0` is false, the second condition is skipped.

### `||`

If the first condition is `true`, Java does not need to evaluate the second condition.

```java
if (age >= 18 || hasPermission) {
    System.out.println("Allowed");
}
```

If `age >= 18` is true, `hasPermission` may not be evaluated.

> **Interview Point:** `&&` and `||` short-circuit. `&` and `|` can work with boolean operands but do not provide the same short-circuit behavior.

---

## 5. Ternary Operator `?:`

The **ternary operator** is a shorthand way to write a simple `if-else` condition.

### Syntax

```java
condition ? valueIfTrue : valueIfFalse;
```

It is called **ternary** because it works with three operands:

1. Condition
2. Value when condition is `true`
3. Value when condition is `false`

### Example

```java
int age = 20;

String result = (age >= 18) ? "Adult" : "Minor";

System.out.println(result);  // Adult
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

### Another Example

```java
int a = 10;
int b = 20;

int max = (a > b) ? a : b;

System.out.println(max);  // 20
```

### ⭐ Interview Points — Ternary Operator

* `?:` is the **only ternary operator in Java**.
* It is also called the **conditional operator**.
* It returns a value, so it is commonly used for simple assignments.
* It is best suited for simple conditions.
* Avoid deeply nested ternary operators because they reduce readability.

### Ternary vs `if-else`

| Ternary                    | `if-else`                      |
| -------------------------- | ------------------------------ |
| Short and concise          | Better for complex logic       |
| Returns a value            | Better for multiple statements |
| Best for simple conditions | Best for complex conditions    |

---

# Operator Categories

```text
Operators
│
├── Arithmetic
│   ├── +
│   ├── -
│   ├── *
│   ├── /
│   └── %
│
├── Relational
│   ├── ==
│   ├── !=
│   ├── >
│   ├── <
│   ├── >=
│   └── <=
│
├── Assignment
│   ├── =
│   ├── +=
│   ├── -=
│   ├── *=
│   ├── /=
│   └── %=
│
├── Logical
│   ├── &&
│   ├── ||
│   └── !
│
└── Ternary
    └── ?:
```

# 🎯 Interview Questions

### 1. What is an operator?

A symbol used to perform an operation on one or more operands.

### 2. What is the difference between `/` and `%`?

`/` gives the quotient, while `%` gives the remainder for integer operands.

### 3. What is the difference between `=` and `==`?

`=` assigns a value, while `==` compares operands.

### 4. What is the difference between unary and binary operators?

A unary operator works on one operand; a binary operator works on two operands.

### 5. What is short-circuit evaluation?

Java skips unnecessary parts of a logical expression when the result is already known.

### 6. What is the output of `5 / 2`?

`2`, because both operands are integers.

### 7. What is the output of `5.0 / 2`?

`2.5`, because at least one operand is a floating-point value.

### 8. What does `%` return?

The remainder of a division operation.

### 9. What is the ternary operator?

`?:` is a conditional operator used as a concise alternative to a simple `if-else` expression.

### 10. Why is `?:` called a ternary operator?

Because it works with three operands: a condition, a true expression, and a false expression.

---

## 📝 Quick Revision

| Category   | Operators                         |   |        |
| ---------- | --------------------------------- | - | ------ |
| Arithmetic | `+`, `-`, `*`, `/`, `%`           |   |        |
| Relational | `==`, `!=`, `>`, `<`, `>=`, `<=`  |   |        |
| Assignment | `=`, `+=`, `-=`, `*=`, `/=`, `%=` |   |        |
| Logical    | `&&`, `                           |   | `, `!` |
| Ternary    | `?:`                              |   |        |