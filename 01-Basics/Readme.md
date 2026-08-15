## 📌 What is Java?

* Java is a **case-sensitive** programming language.
* Java is a **high-level** programming language.
* Java was developed by **James Gosling**.
* Java development started around **June 1991**.
* Java programs follow a structured syntax and require some **boilerplate code**.

### 🌍 Where Does Java Run?

Java source code is compiled into **bytecode** (`.class` files). The bytecode runs on the **JVM (Java Virtual Machine)**.

```text
Java Source Code (.java)
        ↓
      javac
        ↓
Bytecode (.class)
        ↓
       JVM
        ↓
Operating System
```

Because JVM implementations exist for different operating systems, the same compiled Java program can generally run on:

* Windows
* Linux
* macOS
* Many server/cloud environments

This is the idea behind Java's **"Write Once, Run Anywhere" (WORA)** concept.

### Where Java Is Commonly Used

* Backend and web applications — especially with **Spring / Spring Boot**
* Enterprise applications
* Android development (Java is supported, although **Kotlin is now the preferred language for new Android development**)
* Desktop applications
* Cloud and distributed systems
* Big-data technologies and tools
* Banking and large business systems

### Where Java Does NOT Run Directly

* Java does **not run directly inside a normal web browser** like JavaScript.
* A browser does not normally execute `.java` or Java `.class` bytecode directly; Java browser applets are obsolete.
* Java needs a suitable **JVM/runtime environment** to execute ordinary Java bytecode.

> **Interview Point:** Java is platform-independent at the bytecode level, but the **JVM itself is platform-dependent** because a different JVM implementation is provided for different operating systems.

### ⭐ Java Execution Interview Points

* **JDK** → Used mainly to develop Java applications; it includes tools such as `javac`.
* **JVM** → Executes Java bytecode.
* **JRE** → Runtime components used to run Java applications; in modern JDK distributions, the JDK provides the runtime needed to run Java programs.
* Java source code is **not directly executed by the CPU**. It is first compiled to bytecode and then executed by the JVM.
* The `.java` file contains **source code**.
* The `.class` file normally contains **bytecode**.
* `javac` compiles source code.
* `java` launches a Java application through the JVM.
* Java is **platform-independent**, while the JVM is **platform-dependent**.
* Java is not completely "write once, run anywhere" in every practical situation; OS-specific dependencies, native libraries, file paths, GUI behavior, etc. can still affect portability.

---

## 🏗️ Basic Java Program

```java
public class JavaBasics {

    public static void main(String[] args) {

        // Code goes here

    }
}
```

### Explanation

* `public class JavaBasics` → Defines a class.
* `main()` → The main function from where Java program execution starts.
* `String[] args` → Stores command-line arguments.
* The code inside `{ }` is called the **body** of the class or method.

### Important Rule

The **class name and file name should be the same** when the class is declared as `public`.

Example:

```text
JavaBasics.java
```

```java
public class JavaBasics {
    // code
}
```

---

## ▶️ Compile and Run Java Program

### 1. Compile

Use the `javac` command:

```bash
javac JavaBasics.java
```

This compiles the Java source code and generates a `.class` file.

### 2. Run

Use the `java` command:

```bash
java JavaBasics
```

> While running, write the **class name**, not `.java`.

---

# 📦 Variables

A **variable** is a container used to store a data value.

Example:

```java
int age = 21;
```

Here:

* `int` → Data type
* `age` → Variable name
* `21` → Value

### General Syntax

```java
dataType variableName = value;
```

Example:

```java
int number = 10;
float price = 99.5f;
char grade = 'A';
boolean isJavaEasy = true;
```

Java is a **strongly typed language**, so a variable is declared with a specific data type.

---

# 🔢 Data Types

Data types specify what type of value a variable can store.

Java data types are broadly divided into:

1. **Primitive Data Types**
2. **Non-Primitive Data Types**

---

## 1. Primitive Data Types

Java has **8 primitive data types**:

| Data Type |                            Size | Range / Values                       | Example                      |
| --------- | ------------------------------: | ------------------------------------ | ---------------------------- |
| `byte`    |                 8 bits (1 byte) | -128 to 127                          | `byte age = 20;`             |
| `short`   |               16 bits (2 bytes) | -32,768 to 32,767                    | `short num = 1000;`          |
| `int`     |               32 bits (4 bytes) | -2³¹ to 2³¹ - 1                      | `int number = 10000;`        |
| `long`    |               64 bits (8 bytes) | -2⁶³ to 2⁶³ - 1                      | `long population = 100000L;` |
| `float`   |               32 bits (4 bytes) | Approx. 6–7 decimal digits           | `float price = 10.5f;`       |
| `double`  |               64 bits (8 bytes) | Approx. 15–16 decimal digits         | `double value = 99.99;`      |
| `char`    |               16 bits (2 bytes) | `0` to `65,535` (Unicode code units) | `char grade = 'A';`          |
| `boolean` | Not precisely specified by Java | `true` or `false`                    | `boolean pass = true;`       |

### Primitive Types

```text
byte
short
int
long
float
double
char
boolean
```

These are the basic built-in data types provided by Java.

### ⭐ Interview Points — Primitive Types

* Java has exactly **8 primitive data types**.
* `byte`, `short`, `int`, and `long` store **integer values**.
* `float` and `double` store **decimal/floating-point values**.
* `char` stores a **single character** and uses 16-bit Unicode code units.
* `boolean` stores only `true` or `false`.
* The default integer type for whole-number literals is `int`.
* The default type for decimal literals is `double`.
* Use `L` with a `long` literal when needed: `100000L`.
* Use `f` or `F` with a `float` literal: `10.5f`.
* `String` is **not** a primitive data type; it is a reference type.
* Primitive variables store values directly; reference variables store a reference to an object.

### Default Values of Instance/Class Variables

| Data Type                      | Default Value |
| ------------------------------ | ------------- |
| `byte`, `short`, `int`, `long` | `0`           |
| `float`, `double`              | `0.0`         |
| `char`                         | `\u0000`      |
| `boolean`                      | `false`       |
| Reference types                | `null`        |

> **Important:** Local variables do **not** get automatic default values. They must be initialized before use.

### Type Conversion

Java supports conversion between compatible numeric types.

**Widening conversion** is generally automatic:

```java
int x = 10;
long y = x;
double z = y;
```

**Narrowing conversion** requires explicit casting and may lose information:

```java
double price = 99.99;
int value = (int) price;   // 99
```

### Common Interview Questions

**Q. Which primitive type is generally used for integers?**
`int`

**Q. Which is larger: `float` or `double`?**
`double` — it has 64-bit precision compared with 32-bit for `float`.

**Q. Is `String` primitive?**
No. `String` is a reference type/class.

**Q. Is `boolean` size exactly 1 byte in Java?**
Java does not specify a fixed memory size for `boolean`; its representation is implementation-dependent.

**Q. Why does `char` use 2 bytes?**
Java `char` is a 16-bit UTF-16 code unit.

---

## 2. Non-Primitive Data Types

Non-primitive data types include reference types such as:

* `String`
* Arrays
* Classes
* Objects
* Interfaces

Example:

```java
String name = "Jatin";
```

Here, `String` is a **non-primitive/reference type**.

---
