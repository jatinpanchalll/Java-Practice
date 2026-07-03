# Object-Oriented Programming (OOP)

Object-Oriented Programming (OOP) is a programming paradigm in which a program is designed using **Objects** and **Classes** instead of only functions.

OOP helps us write code that is:

- Reusable
- Modular
- Secure
- Easy to Maintain
- Scalable

Java is a pure object-oriented inspired language and most real-world Java applications are built using OOP concepts.

---

# Table of Contents

1. Introduction to OOP
2. Why OOP?
3. Class
4. Object
5. Class vs Object
6. Memory Representation
7. Reference Variable
8. Creating Objects
9. Accessing Members
10. Access Modifiers
11. Getters & Setters
12. Encapsulation
13. Constructors
14. Types of Constructors
15. Copy Constructor
16. Shallow Copy & Deep Copy
17. Destructor
18. Advantages of OOP
19. Disadvantages of OOP
20. Important Notes
21. Common Mistakes
22. Interview Questions
23. Programs Included
24. Quick Revision

---

# What is OOP?

Object-Oriented Programming (OOP) is a programming style where data and functions are grouped together inside **Objects**.

Instead of writing everything inside functions, we create **Classes** and then create **Objects** from those classes.

OOP models real-world entities like:

- Student
- Car
- Mobile
- Bank Account
- Employee

Each object has:

- State (Variables)
- Behaviour (Methods)

---

# Why OOP?

Imagine you are creating a **College Management System**.

Without OOP

```text
Student1
Student2
Student3
Student4
```

Every student needs separate variables and functions.

As the project grows,

- Code becomes lengthy.
- Maintenance becomes difficult.
- Reusability becomes poor.

---

Using OOP

Create only one class.

```java
class Student{

}
```

Now create multiple objects.

```java
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();
Student s4 = new Student();
```

Advantages

- Less code
- Better organization
- Easy maintenance
- Easy debugging
- Code reusability

---

# What is a Class?

A **Class** is a blueprint or template used to create objects.

A class defines

- Variables (Properties)
- Methods (Behaviour)

A class itself does **NOT** occupy memory.

### Syntax

```java
class Student{

}
```

### Example

```java
class Pen{

    String color;
    int tip;

    void write(){
        System.out.println("Writing...");
    }

}
```

Here,

Pen is only a blueprint.

No real Pen exists.

---

# What is an Object?

An Object is an **instance of a class**.

Memory is allocated only when an object is created.

### Example

```java
Pen p1 = new Pen();
```

Here,

- p1 is a reference variable.
- A Pen object is created inside Heap Memory.

---

# Class vs Object

| Class | Object |
|--------|--------|
| Blueprint | Instance of Class |
| Logical Entity | Physical Entity |
| No Memory | Occupies Memory |
| Created Once | Multiple Objects can be created |
| Defines Variables & Methods | Uses Variables & Methods |

---

# Memory Representation

Example

```java
Pen p1 = new Pen();
```

```text
Stack Memory                     Heap Memory

+-----------+                 +----------------------+
| p1 ------ |---------------> | Pen Object           |
+-----------+                 | color = null         |
                              | tip = 0              |
                              +----------------------+
```

### Explanation

Stack stores

- Reference Variables

Heap stores

- Actual Objects

Memory is allocated only after

```java
new
```

is executed.

---

# What is a Reference Variable?

A Reference Variable stores the address of an object.

Example

```java
Pen p1 = new Pen();
```

Here,

- p1 is NOT the object.
- p1 stores the address of the object.
- Actual object exists inside Heap Memory.

---

# Creating Objects

### Syntax

```java
ClassName objectName = new ClassName();
```

### Example

```java
Student s1 = new Student();

Student s2 = new Student();
```

Each object gets its own memory.

Changing one object does not affect another object.

---

# Accessing Members

Use Dot Operator.

Example

```java
s1.name = "Jatin";

s1.roll = 101;

s1.study();
```

The Dot Operator is used to access

- Variables
- Methods

of an object.

---

# Important Keywords

## new

Purpose

- Creates Object
- Allocates Heap Memory
- Returns Reference

Example

```java
Student s1 = new Student();
```

---

## Dot Operator (.)

Purpose

- Access Variables
- Access Methods

Example

```java
s1.name

s1.study();
```

---

# Access Modifiers

Access Modifiers are keywords in Java that control the visibility and accessibility of classes, variables, methods, and constructors.

They help implement **Data Hiding** and **Encapsulation** by restricting access to object data.

---

## Why do we need Access Modifiers?

Imagine anyone could directly change a student's marks.

```java
student.marks = -500;
```

This is not valid.

Using Access Modifiers, we can control who can access or modify data.

This makes our program more secure and reliable.

---

## Types of Access Modifiers

| Modifier | Same Class | Same Package | Subclass | Other Package |
|----------|:----------:|:------------:|:--------:|:-------------:|
| `private` | ✅ | ❌ | ❌ | ❌ |
| Default | ✅ | ✅ | ❌ | ❌ |
| `protected` | ✅ | ✅ | ✅ | ❌* |
| `public` | ✅ | ✅ | ✅ | ✅ |

> **Note:** `protected` members are accessible outside the package only through inheritance.

---

## private

A private member can only be accessed inside the same class.

Example

```java
class Student{

    private int marks;

}
```

Only methods inside Student class can access marks.

---

## Default

If no access modifier is written, Java uses **Default** access.

```java
class Student{

    int rollNo;

}
```

Accessible only inside the same package.

---

## protected

A protected member is accessible

- Inside the same package.
- Inside subclasses (Inheritance).

```java
protected int age;
```

---

## public

A public member can be accessed from anywhere in the program.

```java
public String name;
```

---

## Visibility Order

```text
private
   ↓
default
   ↓
protected
   ↓
public
```

Visibility increases from top to bottom.

---

## Memory Note

Access Modifiers **do not change where an object is stored.**

Objects are still created inside Heap Memory.

They only control who can access the object's members.

---

## Interview Tip

Remember

```text
private

↓

default

↓

protected

↓

public
```

This is one of the most common interview questions.

---

# Getters and Setters

Getters and Setters are public methods used to read and update private variables.

Instead of accessing variables directly, we use methods.

This provides better security and control over object data.

---

## Why do we need Getters and Setters?

Suppose we have

```java
class Student{

    private String name;

}
```

Direct access

```java
Student s1 = new Student();

s1.name = "Jatin";
```

❌ Compile Time Error

Because

name is private.

Therefore,

Java provides Getter and Setter methods.

---

## Getter

A Getter method returns the value of a private variable.

### Syntax

```java
public DataType getVariableName(){

    return variableName;

}
```

### Example

```java
public String getName(){

    return name;

}
```

---

## Setter

A Setter method updates the value of a private variable.

### Syntax

```java
public void setVariableName(DataType value){

    variableName = value;

}
```

### Example

```java
public void setName(String name){

    this.name = name;

}
```

---

## Complete Example

```java
class Student{

    private String name;

    public void setName(String name){

        this.name = name;

    }

    public String getName(){

        return name;

    }

}

public class Main{

    public static void main(String[] args){

        Student s1 = new Student();

        s1.setName("Jatin");

        System.out.println(s1.getName());

    }

}
```

Output

```text
Jatin
```

---

## Getter vs Setter

| Getter | Setter |
|----------|--------|
| Reads Data | Updates Data |
| Returns Value | Usually returns void |
| Starts with get | Starts with set |
| Does not modify data | Modifies data |

---

## Why do we use "this" keyword?

Example

```java
public void setName(String name){

    this.name = name;

}
```

Here,

Left Side

```java
this.name
```

is the instance variable.

Right Side

```java
name
```

is the method parameter.

Without `this`, Java cannot distinguish between them.

---

## Memory Representation

```text
Stack Memory                    Heap Memory

+-----------+                +-----------------------+
| s1 ------ |--------------> | Student Object        |
+-----------+                | name = "Jatin"        |
                             +-----------------------+

setName()

↓

Updates Heap Object

↓

getName()

↓

Returns Value
```

---

## Validation using Setter

One of the biggest advantages of Setter is Validation.

Example

```java
public void setAge(int age){

    if(age > 0){

        this.age = age;

    }

}
```

Now invalid values cannot be stored.

---

## Advantages

- Data Hiding
- Better Security
- Controlled Access
- Validation
- Easy Maintenance
- Supports Encapsulation

---

## Common Mistakes

❌ Accessing private variables directly.

❌ Forgetting to use this keyword.

❌ Returning wrong variable inside Getter.

✔ Always access private variables through Getter and Setter.

---

# Encapsulation

Encapsulation is the process of wrapping **data (variables)** and **methods** into a single unit (Class).

It is also known as **Data Hiding**.

---

## Real Life Example

Think about an ATM Machine.

You can

- Deposit Money
- Withdraw Money
- Check Balance

But you cannot directly access or modify the bank database.

The data is hidden.

This is Encapsulation.

---

## Example

```java
class Student{

    private int marks;

    public int getMarks(){

        return marks;

    }

    public void setMarks(int marks){

        this.marks = marks;

    }

}
```

Variables are hidden.

Access is provided using methods.

---

## Benefits of Encapsulation

- Data Security
- Better Control
- Easy Maintenance
- Flexible Code
- Validation
- Prevents Unauthorized Access

---

## Interview Questions

1. What are Access Modifiers?

2. Difference between private and public?

3. What is Default Access Modifier?

4. What are Getters?

5. What are Setters?

6. Why are Getters and Setters used?

7. Why is this keyword used?

8. What is Encapsulation?

9. How do Getters and Setters implement Encapsulation?

10. Can Setter perform validation?

---

## Quick Revision

- Access Modifiers control accessibility.
- private gives maximum security.
- Getter reads data.
- Setter updates data.
- Setter can validate data.
- this refers to current object.
- Encapsulation = Data + Methods inside one class.
- Encapsulation provides Data Hiding.

# Constructors

A **Constructor** is a special method that is automatically called when an object is created.

The main purpose of a constructor is to **initialize the object's data**.

Unlike normal methods, constructors are executed automatically during object creation.

---

## Why do we need Constructors?

Suppose we have a Student class.

```java
class Student {

    String name;
    int age;

}
```

Now create an object.

```java
Student s1 = new Student();
```

At this point,

- name = null
- age = 0

If we want every object to have some initial values automatically,

we use Constructors.

---

## Characteristics of Constructors

- Constructor name must be same as class name.
- Constructor has **no return type**.
- Automatically called when object is created.
- Used to initialize object data.
- Every class can have one or more constructors.

---

## Syntax

```java
class Student {

    Student(){

    }

}
```

---

## Example

```java
class Student{

    String name;

    Student(){

        name = "Unknown";

    }

}

public class Main{

    public static void main(String[] args){

        Student s1 = new Student();

        System.out.println(s1.name);

    }

}
```

Output

```text
Unknown
```

---

# Constructor Working

Example

```java
Student s1 = new Student();
```

Internal Flow

```text
Student s1 = new Student();

↓

Memory Allocated in Heap

↓

Constructor Called Automatically

↓

Variables Initialized

↓

Reference Returned

↓

Stored inside s1
```

---

# Memory Representation

```text
Stack Memory                    Heap Memory

+-----------+               +----------------------+
| s1 ------ |-------------> | Student Object       |
+-----------+               | name = "Unknown"     |
                            | age = 18             |
                            +----------------------+

Constructor

↓

Initializes Object
```

---

# Types of Constructors

Java provides mainly three types of constructors.

## 1. Non-Parameterized Constructor

A constructor without parameters.

Example

```java
class Student{

    Student(){

        System.out.println("Constructor Called");

    }

}
```

---

## 2. Parameterized Constructor

A constructor that receives values during object creation.

Example

```java
class Student{

    String name;

    Student(String name){

        this.name = name;

    }

}
```

Object Creation

```java
Student s1 = new Student("Jatin");
```

Output

```text
Jatin
```

---

## 3. Copy Constructor

A constructor that creates a new object using another object.

Java does not provide a built-in Copy Constructor.

We create it manually.

---

## Example

```java
class Student{

    String name;
    int age;

    Student(Student s){

        this.name = s.name;
        this.age = s.age;

    }

}
```

Usage

```java
Student s1 = new Student();

Student s2 = new Student(s1);
```

Now,

Both objects contain the same values.

---

# Shallow Copy

In Shallow Copy,

only references are copied.

Both objects share the same referenced object.

```text
Object A

↓

Array

↑

Object B
```

If Object A changes the array,

Object B also sees the change.

---

## Example

```java
this.marks = s.marks;
```

Only reference copied.

---

# Deep Copy

In Deep Copy,

new memory is allocated.

Each object has its own copy of data.

```text
Object A

↓

Array A

Object B

↓

Array B
```

Changing one object does not affect another.

---

## Example

```java
for(int i = 0; i < 3; i++){

    this.marks[i] = s.marks[i];

}
```

Every element is copied individually.

---

# Shallow Copy vs Deep Copy

| Shallow Copy | Deep Copy |
|--------------|-----------|
| Copies Reference | Copies Actual Data |
| Shares Memory | Separate Memory |
| Faster | Slightly Slower |
| Changes affect both objects | Independent Objects |

---

# Destructor

A Destructor is used to destroy objects and release memory.

Unlike C++,

Java does **NOT** support user-defined destructors.

Java uses **Garbage Collection (GC)**.

Garbage Collector automatically removes unused objects from Heap Memory.

Therefore,

Java programmers do not manually destroy objects.

---

## Garbage Collection

Example

```java
Student s1 = new Student();

s1 = null;
```

Now,

The object becomes unreachable.

JVM's Garbage Collector may remove it automatically.

---

# Constructor vs Method

| Constructor | Method |
|-------------|--------|
| Same name as Class | Any valid name |
| No Return Type | Has Return Type |
| Called Automatically | Called Manually |
| Initializes Objects | Performs Operations |

---

# Common Mistakes

❌ Giving a return type to constructor.

```java
void Student(){

}
```

This becomes a method,

NOT a constructor.

---

❌ Constructor name different from class name.

```java
class Student{

    StudentInfo(){

    }

}
```

Invalid Constructor.

---

❌ Forgetting to initialize variables.

---

# Interview Questions

1. What is a Constructor?

2. Why do we use Constructors?

3. Difference between Constructor and Method?

4. Can Constructors be overloaded?

5. Why doesn't Constructor have a return type?

6. What is a Copy Constructor?

7. Difference between Shallow Copy and Deep Copy?

8. Does Java support Destructor?

9. What is Garbage Collection?

10. When is Constructor called?

---

# Quick Revision

- Constructor initializes objects.
- Constructor name = Class name.
- No return type.
- Automatically called.
- Types:
  - Non-Parameterized
  - Parameterized
  - Copy Constructor
- Java uses Garbage Collection.
- Java has no user-defined Destructor.
- Deep Copy creates separate memory.
- Shallow Copy copies references.