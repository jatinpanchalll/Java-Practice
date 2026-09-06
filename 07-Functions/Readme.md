# Java Functions (Methods)

In Java, functions are technically called **methods**.

A method is a block of code designed to perform a specific task. A method can be called whenever that task needs to be performed.

Methods help make programs:

- Reusable
- Organized
- Easier to read
- Easier to test and maintain

Example:

```java
static void greet() {
    System.out.println("Hello");
}
```

Calling the method:

```java
greet();
```

---

# Why Use Methods?

Without methods, the same code may need to be written multiple times.

Instead of:

```java
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
```

We can write:

```java
static void greet() {
    System.out.println("Hello");
}
```

Then:

```java
greet();
greet();
greet();
```

This is called **code reusability**.

---

# Method Syntax

```java
accessModifier static returnType methodName(parameters) {
    // method body
}
```

Example:

```java
public static int add(int a, int b) {
    return a + b;
}
```

Parts:

| Part | Meaning |
|---|---|
| `public` | Access modifier |
| `static` | Belongs to the class |
| `int` | Return type |
| `add` | Method name |
| `int a, int b` | Parameters |
| `return a + b` | Returned value |

> `public` and `static` are not mandatory for every method. They depend on how the method is designed and called.

---

# 1. Method Declaration

Defining a method is called method declaration/definition.

```java
static void greet() {
    System.out.println("Hello");
}
```

The method above does not execute automatically.

---

# 2. Method Calling

A method executes when it is called.

```java
static void greet() {
    System.out.println("Hello");
}

public static void main(String[] args) {
    greet();
}
```

Output:

```text
Hello
```

### Important

Defining a method and calling a method are two different things.

```text
Method definition
       ↓
Method call
       ↓
Method executes
```

---

# 3. Method Without Parameters and Without Return Value

```java
static void greet() {
    System.out.println("Hello");
}
```

Calling:

```java
greet();
```

Here:

- No parameter
- `void` return type
- No value returned

---

# 4. Method With Parameters

Parameters allow us to pass data into a method.

```java
static void greet(String name) {
    System.out.println("Hello " + name);
}
```

Calling:

```java
greet("Jatin");
```

Output:

```text
Hello Jatin
```

### Parameter vs Argument

```java
greet("Jatin");
```

- `String name` → Parameter
- `"Jatin"` → Argument

**Parameter** is the variable defined in the method declaration.

**Argument** is the actual value passed during the method call.

---

# 5. Method With Return Value

A method can calculate something and return the result.

```java
static int add(int a, int b) {
    return a + b;
}
```

Calling:

```java
int result = add(10, 20);

System.out.println(result);
```

Output:

```text
30
```

Here:

- `int` → return type
- `return a + b` → sends the result back
- `result` → stores the returned value

---

# 6. `void` Method

`void` means the method does not return a value.

```java
static void printMessage() {
    System.out.println("Hello");
}
```

A `void` method can use `return;` to exit early, but it cannot return a value.

```java
static void check(int age) {

    if (age < 18) {
        return;
    }

    System.out.println("Adult");
}
```

This is valid:

```java
return;
```

This is invalid in a `void` method:

```java
return 10; // ❌
```

---

# 7. `return` Statement

`return` does two important things:

1. Returns a value from a non-void method.
2. Immediately exits the method.

Example:

```java
static int square(int n) {
    return n * n;
}
```

Example of early return:

```java
static void check(int n) {

    if (n < 0) {
        return;
    }

    System.out.println("Positive");
}
```

---

# 8. Four Common Method Types

Methods can be classified based on parameters and return value.

| Type | Parameters | Return Value |
|---|---|---|
| 1 | No | No |
| 2 | Yes | No |
| 3 | No | Yes |
| 4 | Yes | Yes |

### 1. No Parameter, No Return

```java
static void greet() {
    System.out.println("Hello");
}
```

### 2. Parameter, No Return

```java
static void printSquare(int n) {
    System.out.println(n * n);
}
```

### 3. No Parameter, Return Value

```java
static int getNumber() {
    return 10;
}
```

### 4. Parameter, Return Value

```java
static int add(int a, int b) {
    return a + b;
}
```

---

# 9. Static Method

A `static` method belongs to the class rather than a particular object.

Example:

```java
class Main {

    static void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        greet();
    }
}
```

A static method can be called directly from another static method in the same class.

It can also be called using the class name:

```java
Main.greet();
```

---

# 10. Instance Method

A non-static method is called an **instance method**.

It belongs to an object.

```java
class Student {

    void study() {
        System.out.println("Studying");
    }
}
```

To call it:

```java
Student s = new Student();

s.study();
```

Here:

- `study()` → instance method
- `s` → object
- `s.study()` → method call through object

---

# Static vs Instance Method

| Static Method | Instance Method |
|---|---|
| Belongs to class | Belongs to object |
| Can be called using class name | Usually called using object |
| Does not require an object to call | Requires an object |
| Declared using `static` | No `static` keyword |

Example:

```java
class Demo {

    static void staticMethod() {
        System.out.println("Static");
    }

    void instanceMethod() {
        System.out.println("Instance");
    }

    public static void main(String[] args) {

        staticMethod();

        Demo obj = new Demo();
        obj.instanceMethod();
    }
}
```

---

# 11. `main()` Method

The `main()` method is the standard entry point used to launch a Java application.

```java
public static void main(String[] args) {
}
```

### Breakdown

| Part | Meaning |
|---|---|
| `public` | JVM must be able to access it |
| `static` | Can be invoked without creating an object |
| `void` | Returns no value |
| `main` | Special method name recognized by the Java launcher |
| `String[] args` | Command-line arguments |

> Interview Point: `main()` is a method, not a keyword.

---

# 12. Method Overloading

Method overloading means having multiple methods with the **same name but different parameter lists** in the same class.

Example:

```java
static int add(int a, int b) {
    return a + b;
}

static int add(int a, int b, int c) {
    return a + b + c;
}
```

Calling:

```java
System.out.println(add(10, 20));
System.out.println(add(10, 20, 30));
```

Output:

```text
30
60
```

### Valid Overloading

Different number of parameters:

```java
add(int, int)
add(int, int, int)
```

Different parameter types:

```java
add(int, int)
add(double, double)
```

Different parameter order:

```java
show(int, double)
show(double, int)
```

### ❌ Return Type Alone Cannot Overload a Method

This is invalid:

```java
int add(int a, int b) {
    return a + b;
}

double add(int a, int b) {
    return a + b;
}
```

Why?

Because the parameter list is exactly the same.

> **Interview Point:** Method overloading is an example of **compile-time polymorphism**.

---

# 13. Pass-by-Value in Java

Java is **always pass-by-value**.

For primitive variables, the method receives a copy of the value.

```java
static void change(int x) {
    x = 100;
}

public static void main(String[] args) {

    int a = 10;

    change(a);

    System.out.println(a);
}
```

Output:

```text
10
```

Changing `x` does not change `a`.

---

# 14. Passing Objects to Methods

When an object is passed to a method, Java passes a **copy of the reference value**.

Example:

```java
class Student {
    int age;
}

class Main {

    static void changeAge(Student s) {
        s.age = 25;
    }

    public static void main(String[] args) {

        Student obj = new Student();
        obj.age = 20;

        changeAge(obj);

        System.out.println(obj.age);
    }
}
```

Output:

```text
25
```

This does **not** mean Java uses pass-by-reference.

Java remains **pass-by-value**; the value being copied is the object reference.

> ⭐ Interview Point: Java does not have true pass-by-reference parameters.

---

# 15. Recursion

When a method calls itself, it is called **recursion**.

Example:

```java
static void print(int n) {

    if (n == 0) {
        return;
    }

    System.out.println(n);

    print(n - 1);
}
```

Calling:

```java
print(5);
```

Output:

```text
5
4
3
2
1
```

### Important Parts of Recursion

Every useful recursive method generally needs:

1. **Base case** → stops recursion
2. **Recursive call** → method calls itself
3. **Progress toward base case**

Without a proper base case, recursion can continue until a `StackOverflowError` occurs.

---

# 16. Local Variables in Methods

Variables declared inside a method are local variables.

```java
static void calculate() {

    int a = 10;
    int b = 20;

    System.out.println(a + b);
}
```

`a` and `b` are accessible only inside their scope.

```java
static void calculate() {

    int a = 10;
}

// System.out.println(a); // ❌ Error
```

---

# 17. Method Scope and Lifetime

Method parameters and local variables exist within their applicable scope during method execution.

Example:

```java
static void test(int x) {

    int y = 20;

    System.out.println(x);
    System.out.println(y);
}
```

`x` and `y` cannot be directly accessed outside the method.

---

# 18. Calling One Method from Another

A method can call another method.

```java
static int square(int n) {
    return n * n;
}

static void printSquare(int n) {
    int result = square(n);
    System.out.println(result);
}
```

Calling:

```java
printSquare(5);
```

Output:

```text
25
```

---

# 19. Method Call and Stack

When a method is called, Java creates a **stack frame** for that method execution.

Example:

```java
static void methodA() {
    methodB();
}

static void methodB() {
    System.out.println("Hello");
}
```

Execution concept:

```text
main()
  ↓
methodA()
  ↓
methodB()
  ↓
methodB() finishes
  ↓
methodA() finishes
  ↓
main() continues
```

Each active method call has its own stack frame.

> Interview Point: Deep recursion can consume stack memory and eventually cause `StackOverflowError`.

---

# 20. Method Naming Convention

Java commonly uses **camelCase** for method names.

Good:

```java
calculateSum()
findMaximum()
printDetails()
getStudentName()
```

Avoid:

```java
CalculateSum()
calculate_sum()
CALCULATESUM()
```

Common convention:

- Method names → `camelCase`
- Class names → `PascalCase`

---

# ⭐ Important Interview Questions

### Q1. What is a method in Java?

A method is a block of code that performs a specific task and can be called when needed.

### Q2. Why are methods used?

For code reusability, modularity, readability, testing, and easier maintenance.

### Q3. What is the difference between parameter and argument?

A parameter is a variable in the method declaration. An argument is the actual value passed during the method call.

### Q4. What is `void`?

`void` indicates that a method does not return a value.

### Q5. What does `return` do?

It returns a value from a method and/or immediately terminates the method.

### Q6. What is method overloading?

Defining multiple methods with the same name but different parameter lists.

### Q7. Can methods be overloaded by changing only the return type?

No.

### Q8. Is Java pass-by-value or pass-by-reference?

Java is always **pass-by-value**.

### Q9. What is a static method?

A method that belongs to the class rather than a particular object.

### Q10. What is an instance method?

A non-static method associated with an object.

### Q11. Can a static method directly access instance variables?

No. A static method does not have an implicit `this` reference, so it cannot directly access instance members without an object.

### Q12. What is recursion?

When a method calls itself.

### Q13. What is a base case?

The condition that stops recursive calls.

### Q14. Can one method call another method?

Yes.

### Q15. Is `main()` a method?

Yes. `main()` is a special method used by the Java launcher as the standard entry point for a Java application.

---

# 🎯 Output-Based Interview Questions

## Q1. What is the output?

```java
static void test() {
    System.out.println("Hello");
}

public static void main(String[] args) {
    test();
    test();
}
```

Output:

```text
Hello
Hello
```

---

## Q2. What is the output?

```java
static int add(int a, int b) {
    return a + b;
}

public static void main(String[] args) {
    System.out.println(add(5, 10));
}
```

Output:

```text
15
```

---

## Q3. What is the output?

```java
static void change(int x) {
    x = 50;
}

public static void main(String[] args) {

    int x = 10;

    change(x);

    System.out.println(x);
}
```

Output:

```text
10
```

Because Java passes the primitive value by value.

---

## Q4. What is the output?

```java
static int test() {
    return 10;
    // System.out.println("Hello"); // ❌ unreachable
}
```

The statement after `return` cannot execute.

---

## Q5. What happens?

```java
static void test() {

    test();
}
```

The method keeps calling itself without a base case and eventually results in:

```text
StackOverflowError
```

---

# Method Categories — Quick Table

| Parameters | Return | Example |
|---|---|---|
| No | No | `void greet()` |
| Yes | No | `void print(int n)` |
| No | Yes | `int getNumber()` |
| Yes | Yes | `int add(int a, int b)` |

---

# Static vs Instance — Quick Revision

```text
Method
│
├── Static Method
│   └── Belongs to Class
│
└── Instance Method
    └── Belongs to Object
```

---

# Method Execution Flow

```text
Method Definition
       ↓
Method Call
       ↓
Arguments Passed
       ↓
Method Executes
       ↓
Return Value (if any)
       ↓
Control Returns to Caller
```

---

# 📝 Quick Revision

```text
Java Methods
│
├── Method Definition
├── Method Calling
├── Parameters
├── Arguments
├── Return Type
├── return
├── void
│
├── Static Method
├── Instance Method
│
├── Method Overloading
│
├── Pass-by-Value
│
├── Recursion
│   ├── Base Case
│   └── Recursive Call
│
└── main() Method
```

## Key Rules

- Java technically uses the term **method**, not function.
- A method executes when it is called.
- Parameters are variables in the method declaration.
- Arguments are actual values passed to the method.
- `void` means no return value.
- `return` can return a value and terminates the current method.
- Method overloading requires different parameter lists.
- Return type alone cannot overload a method.
- Java is always pass-by-value.
- `static` methods belong to the class.
- Instance methods belong to objects.
- Recursion requires a proper base case.
- `main()` is the standard entry point for launching a Java application.
