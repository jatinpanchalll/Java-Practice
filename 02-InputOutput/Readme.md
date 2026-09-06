# Java Input & Variables

This README contains notes on taking **user input in Java**, using `Scanner`, decimal values, and variables.

---

## 📥 Taking Input in Java

Java commonly uses the `Scanner` class to take input from the user.

First, import `Scanner`:

```java
import java.util.Scanner;
```

Create a `Scanner` object:

```java
Scanner sc = new Scanner(System.in);
```

Then take input according to the required data type.

### Example — String Input

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(input);

        sc.close();
    }
}
```

### Important Parts

- `import java.util.Scanner;` → Imports the `Scanner` class.
- `new Scanner(System.in)` → Creates a Scanner object connected to standard input (keyboard).
- `sc.next()` → Reads the next token as a `String`.
- `System.out.println(input)` → Prints the entered value.
- `sc.close()` → Closes the Scanner and its underlying input stream.

---

# 🔢 Common Scanner Input Methods

| Method | Reads | Example |
|---|---|---|
| `next()` | One token/word | `sc.next()` |
| `nextLine()` | Complete line | `sc.nextLine()` |
| `nextInt()` | `int` | `sc.nextInt()` |
| `nextLong()` | `long` | `sc.nextLong()` |
| `nextFloat()` | `float` | `sc.nextFloat()` |
| `nextDouble()` | `double` | `sc.nextDouble()` |
| `nextBoolean()` | `boolean` | `sc.nextBoolean()` |
| `nextShort()` | `short` | `sc.nextShort()` |
| `nextByte()` | `byte` | `sc.nextByte()` |

### Example

```java
Scanner sc = new Scanner(System.in);

int age = sc.nextInt();
double marks = sc.nextDouble();
String name = sc.next();

System.out.println(age);
System.out.println(marks);
System.out.println(name);

sc.close();
```

---

## ⚠️ `next()` vs `nextLine()`

This is an important interview and coding-practice concept.

```java
String name = sc.next();
```

`next()` reads only one token.

Input:

```text
Jatin Panchal
```

`next()` reads:

```text
Jatin
```

Whereas:

```java
String name = sc.nextLine();
```

reads the complete line:

```text
Jatin Panchal
```

### Common Pitfall

After `nextInt()`, `nextDouble()`, etc., the newline may remain in the input buffer.

```java
int age = sc.nextInt();
sc.nextLine();          // consume leftover newline
String name = sc.nextLine();
```

---

# 🧮 Decimal Values

When working with decimal values, Java commonly uses:

- `float`
- `double`

### `double`

```java
double pi = 3.14;
```

A decimal literal such as `3.14` is a `double` by default.

### `float`

For a `float`, use the `f` suffix:

```java
float pi = 3.14f;
```

Without `f`, this causes a type mismatch:

```java
float pi = 3.14;   // Error
```

Correct:

```java
float pi = 3.14f;
```

> **Interview Point:** Decimal literals are `double` by default. Use `f` or `F` when explicitly creating a `float` literal.

---

# 📦 Variables

A variable is a named storage location used to hold a value.

Example:

```java
int a = 10;
```

Here:

- `int` → Data type
- `a` → Variable name / identifier
- `10` → Value

### General Syntax

```java
dataType variableName = value;
```

Example:

```java
int age = 21;
double marks = 85.5;
String name = "Jatin";
```

---

# 🆔 Identifier

The **name given to a variable, method, class, etc.** is called an identifier.

Example:

```java
int age = 21;
```

Here, `age` is an identifier.

### Identifier Rules

- Can contain letters, digits, `_`, and `$`.
- Cannot start with a digit.
- Cannot contain spaces.
- Cannot be a Java keyword.
- Java identifiers are **case-sensitive**.

Valid:

```java
int age;
int studentAge;
int student_age;
int age2;
```

Invalid:

```java
int 2age;          // starts with digit
int student age;   // contains space
int class;         // keyword
```

> **Interview Point:** `age` and `Age` are two different identifiers because Java is case-sensitive.

---

# ⭐ Interview-Focused Points

### 1. What is `Scanner`?

`Scanner` is a class in the `java.util` package used to read input from sources such as the keyboard.

### 2. What does `System.in` mean?

`System.in` represents the standard input stream, normally connected to the keyboard.

### 3. Why do we write `new Scanner(System.in)`?

It creates a Scanner object that reads data from the standard input stream.

### 4. Difference between `next()` and `nextLine()`?

- `next()` → reads the next token/word.
- `nextLine()` → reads the complete line.

### 5. Why is `3.14` treated as `double`?

Because Java defines decimal floating-point literals as `double` by default.

### 6. How do you write a float literal?

```java
float x = 3.14f;
```

### 7. What is a variable?

A variable is a named location used by a program to store a value.

### 8. What is an identifier?

An identifier is a name used to identify program elements such as variables, methods, and classes.

---