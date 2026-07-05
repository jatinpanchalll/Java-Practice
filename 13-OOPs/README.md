# Object-Oriented Programming (OOP)

Object-Oriented Programming (OOP) is a programming paradigm in which a program is designed using **Objects** and **Classes** instead of only functions.

OOP helps developers write code that is:

- Reusable
- Modular
- Secure
- Easy to Maintain
- Scalable

Java follows OOP principles to model real-world entities and build efficient applications.

---

# Table of Contents

1. Introduction to OOP
2. Why OOP?
3. Four Pillars of OOP
4. What is a Class?
5. What is an Object?
6. Class vs Object
7. Memory Representation
8. Reference Variable
9. Creating Objects
10. Accessing Members
11. Important Keywords
12. Real-Life Example
13. Advantages
14. Disadvantages
15. Important Notes
16. Common Mistakes
17. Interview Questions
18. Quick Revision

---

# What is OOP?

Object-Oriented Programming (OOP) is a programming paradigm that organizes code into **Objects** instead of only using functions.

An object combines:

- Data (Variables / Attributes)
- Behaviour (Methods / Functions)

OOP helps us represent real-world entities such as:

- Student
- Car
- Bank Account
- Employee
- Mobile Phone

using software objects.

---

# Why OOP?

Imagine building a **College Management System**.

### Without OOP

```text
Student1_Name
Student1_RollNo
Student1_Age

Student2_Name
Student2_RollNo
Student2_Age

Student3_Name
Student3_RollNo
Student3_Age
```

As the number of students increases,

- Code becomes repetitive.
- Maintenance becomes difficult.
- Reusability becomes poor.

---

### With OOP

Create only one class.

```java
class Student {

}
```

Now create multiple objects.

```java
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();
```

Each object stores different data while sharing the same blueprint.

This makes the code:

- Cleaner
- Reusable
- Easier to maintain
- Easy to extend

---

# Four Pillars of OOP

Java OOP is mainly based on four concepts.

| Concept | Purpose |
|---------|---------|
| Encapsulation | Data Hiding |
| Inheritance | Code Reusability |
| Polymorphism | One Interface, Multiple Forms |
| Abstraction | Hides Implementation Details |

These four concepts work together to build flexible and maintainable software.

---

# What is a Class?

A **Class** is a blueprint or template used to create objects.

A class defines:

- Properties (Variables)
- Behaviours (Methods)

A class itself **does not occupy memory**.

### Syntax

```java
class Student{

}
```

### Example

```java
class Student {

    String name;
    int rollNo;

    void study() {
        System.out.println("Studying...");
    }

}
```

Here,

Student is only a blueprint.

No actual Student exists yet.

---

# What is an Object?

An **Object** is an instance of a class.

Objects occupy memory and represent real-world entities.

Example

```java
Student s1 = new Student();
```

Here,

- Student → Class
- s1 → Reference Variable
- new → Creates Object

Now a Student object is created inside Heap Memory.

---

# Class vs Object

| Class | Object |
|--------|--------|
| Blueprint | Instance of Class |
| Logical Entity | Physical Entity |
| Does not occupy memory | Occupies memory |
| Defines Variables & Methods | Uses Variables & Methods |
| Created once | Multiple objects can be created |

---

# Memory Representation

Example

```java
Student s1 = new Student();
```

```text
                JVM Memory

Stack Memory                     Heap Memory

+-----------+                +----------------------+
| s1 ------ |--------------> | Student Object       |
+-----------+                | name = null          |
                             | rollNo = 0           |
                             +----------------------+
```

### Explanation

**Stack Memory**

Stores:

- Local Variables
- Method Calls
- Reference Variables

**Heap Memory**

Stores:

- Objects
- Instance Variables

Memory is allocated in Heap only after using the `new` keyword.

---

# What is a Reference Variable?

A Reference Variable stores the memory address (reference) of an object.

Example

```java
Student s1 = new Student();
```

Here,

- `s1` is NOT the object.
- `s1` stores the address of the object.
- The actual object is stored inside Heap Memory.

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

Each object has its own memory.

Changing one object does not affect another.

---

# Accessing Members

Use the **Dot (`.`) Operator** to access variables and methods.

Example

```java
s1.name = "Jatin";

s1.rollNo = 101;

s1.study();
```

The Dot Operator allows an object to access:

- Variables
- Methods

defined inside the class.

---

# Important Keywords

## new

Purpose

- Creates a new object.
- Allocates memory in Heap.
- Returns the object's reference.

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
s1.name = "Jatin";

s1.study();
```

---

# Real-Life Example

Imagine a **Car Factory**.

### Blueprint

```text
Car
```

### Objects

```text
BMW

Audi

Tesla

Hyundai
```

All cars are created from the same blueprint.

Similarly,

Objects are created from a Class.

---

# Advantages of OOP

- Code Reusability
- Easy Maintenance
- Better Security
- Modular Programming
- Easy Debugging
- Real-World Representation
- Scalability

---

# Disadvantages of OOP

- Slightly difficult for beginners.
- Uses more memory than procedural programming.
- Initial design takes more time.
- Small programs may become unnecessarily lengthy.

---

# Important Notes

- A class does not occupy memory.
- Objects are stored in Heap Memory.
- Reference variables are stored in Stack Memory.
- One class can create multiple objects.
- Every object has its own copy of instance variables.
- Methods can be shared among all objects.

---

# Common Mistakes

❌ Class and Object are the same.

❌ Reference variable is the object.

❌ Memory is allocated for the class.

✔ Memory is allocated only after object creation.

✔ Objects are stored in Heap Memory.

✔ Reference variables are stored in Stack Memory.

---

# Interview Questions

### Basic

1. What is OOP?
2. Why is OOP used?
3. What is a Class?
4. What is an Object?
5. Difference between Class and Object?

### Intermediate

6. What is a Reference Variable?
7. What does the `new` keyword do?
8. What is the Dot Operator?
9. Where are objects stored?
10. Difference between Stack and Heap Memory?

### Advanced

11. Why doesn't a class occupy memory?
12. Can one class create multiple objects?
13. What happens internally when `new` is executed?

---

# Quick Revision

- OOP = Programming using Classes and Objects.
- Class = Blueprint.
- Object = Instance of Class.
- Objects are stored in Heap Memory.
- Reference Variables are stored in Stack Memory.
- `new` creates objects.
- `.` accesses members.
- One class can create multiple objects.

# Access Modifiers

Access Modifiers are keywords in Java that control the visibility and accessibility of classes, variables, methods, and constructors.

They determine **who can access a member** within a program.

Access Modifiers help implement **Encapsulation** and improve **Data Security**.

---

## Why do we need Access Modifiers?

Suppose every variable inside a class is public.

```java
class Student {

    public int marks;

}
```

Now anyone can write

```java
Student s1 = new Student();

s1.marks = -100;
```

This is incorrect because marks should never be negative.

To prevent unauthorized access, Java provides **Access Modifiers**.

---

## Types of Access Modifiers

| Modifier | Same Class | Same Package | Subclass | Other Package |
|-----------|:----------:|:------------:|:---------:|:-------------:|
| `private` | ✅ | ❌ | ❌ | ❌ |
| Default | ✅ | ✅ | ❌ | ❌ |
| `protected` | ✅ | ✅ | ✅ | ❌* |
| `public` | ✅ | ✅ | ✅ | ✅ |

> **Note:** `protected` members are accessible outside the package only through inheritance.

---

## private

Accessible only inside the same class.

```java
class Student {

    private int marks;

}
```

Best choice for instance variables.

---

## Default

If no access modifier is specified,

Java automatically assigns **Default** access.

```java
class Student {

    int rollNo;

}
```

Accessible only inside the same package.

---

## protected

Accessible

- Inside the same package.
- Inside subclasses.

```java
protected int age;
```

Mostly used with Inheritance.

---

## public

Accessible from anywhere.

```java
public String name;
```

Use only when the member should be available everywhere.

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

Access Modifiers do **NOT** affect memory allocation.

Objects are still stored inside Heap Memory.

Access Modifiers only control accessibility.

---

# Getters and Setters

Getters and Setters are public methods used to **read** and **modify** private variables.

They provide controlled access to object data.

---

## Why do we need Getters and Setters?

Private variables cannot be accessed directly.

Example

```java
class Student {

    private String name;

}
```

Trying to access

```java
Student s1 = new Student();

s1.name = "Jatin";
```

❌ Compile Time Error

To access private data,

Java uses Getter and Setter methods.

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
```

```java
Student s1 = new Student();

s1.setName("Jatin");

System.out.println(s1.getName());
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
| Returns Value | Usually Returns void |
| Starts with get | Starts with set |
| Doesn't Modify Data | Modifies Data |

---

## Why do we use "this" keyword?

```java
public void setName(String name){

    this.name = name;

}
```

Here,

`this.name`

→ Instance Variable

`name`

→ Method Parameter

The `this` keyword removes ambiguity between them.

---

## Memory Representation

```text
Stack Memory                     Heap Memory

+-----------+                +------------------------+
| s1 ------ |--------------> | Student Object         |
+-----------+                | name = "Jatin"         |
                             +------------------------+

setName()

↓

Updates Object

↓

getName()

↓

Returns Value
```

---

## Validation using Setter

One advantage of Setter is validation.

```java
public void setAge(int age){

    if(age > 0){

        this.age = age;

    }

}
```

Invalid values cannot be stored.

---

# Encapsulation

Encapsulation is the process of combining

- Data (Variables)
- Methods

into a single unit called **Class**.

It is also known as **Data Hiding**.

---

## Real-Life Example

Think about an ATM Machine.

You can

- Withdraw Money
- Deposit Money
- Check Balance

But,

You cannot directly access the bank database.

Only authorized operations are allowed.

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

The variable is hidden.

Access is provided using methods.

---

## Benefits of Encapsulation

- Data Security
- Better Control
- Data Validation
- Easy Maintenance
- Flexible Code
- Prevents Unauthorized Access

---

## Important Notes

- Always declare instance variables as private.
- Access private data using Getter and Setter.
- Encapsulation improves code security.
- Setter can validate data before updating it.
- Getter only returns data.

---

## Common Mistakes

❌ Declaring all variables public.

❌ Accessing private variables directly.

❌ Forgetting to use `this`.

✔ Use private variables.

✔ Use Getter and Setter methods.

---

## Interview Questions

### Basic

1. What are Access Modifiers?
2. Name all Access Modifiers.
3. Difference between private and public.

### Intermediate

4. What are Getters?
5. What are Setters?
6. Why do we use Getter and Setter methods?
7. What is Encapsulation?

### Advanced

8. Why are variables declared private?
9. Why is `this` used in Setter?
10. Can Setter perform validation?

---

## Quick Revision

- Access Modifiers control accessibility.
- private provides maximum security.
- Getter reads data.
- Setter updates data.
- Setter can validate values.
- Encapsulation = Data + Methods.
- Encapsulation provides Data Hiding.

# Constructors

A **Constructor** is a special member of a class that is automatically called when an object is created.

Its main purpose is to **initialize the object's data**.

Unlike methods, constructors are invoked automatically during object creation.

---

## Why do we need Constructors?

Suppose we have the following class.

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

By default,

```text
name = null
age = 0
```

If we want every object to start with meaningful values,

we use **Constructors**.

---

## Characteristics of Constructors

- Constructor name must be the same as the class name.
- Constructor does not have any return type.
- Constructor is called automatically.
- Constructor initializes objects.
- Every class can have multiple constructors (Constructor Overloading).

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
class Student {

    String name;

    Student() {

        name = "Unknown";

    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(s1.name);

    }

}
```

### Output

```text
Unknown
```

---

# Constructor Working

Example

```java
Student s1 = new Student();
```

### Internal Flow

```text
Student s1 = new Student();

↓

Memory allocated in Heap

↓

Constructor called automatically

↓

Variables initialized

↓

Reference returned

↓

Stored inside s1
```

---

# Memory Representation

```text
Stack Memory                     Heap Memory

+-----------+                +----------------------+
| s1 ------ |--------------> | Student Object       |
+-----------+                | name = "Unknown"     |
                             | age = 18             |
                             +----------------------+
```

Constructor initializes the object immediately after memory allocation.

---

# Types of Constructors

Java mainly provides two types of constructors.

## 1. Non-Parameterized Constructor

A constructor without parameters.

### Example

```java
class Student {

    Student() {

        System.out.println("Constructor Called");

    }

}
```

---

## 2. Parameterized Constructor

A constructor that receives values while creating an object.

### Example

```java
class Student {

    String name;

    Student(String name) {

        this.name = name;

    }

}
```

Creating Object

```java
Student s1 = new Student("Jatin");
```

Output

```text
Jatin
```

---

# Constructor Overloading

A class can contain multiple constructors with different parameter lists.

This is known as **Constructor Overloading**.

### Example

```java
class Student {

    Student() {

    }

    Student(String name) {

    }

    Student(String name, int age) {

    }

}
```

Java identifies the correct constructor based on the arguments passed.

---

# Copy Constructor

A Copy Constructor creates a new object using another object's data.

Unlike C++, Java does not provide a built-in copy constructor.

We create it manually.

### Example

```java
class Student {

    String name;
    int age;

    Student(Student s) {

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

Now both objects contain the same values.

---

# Shallow Copy

In Shallow Copy,

only the **reference** is copied.

Both objects share the same referenced object.

```text
Object A

↓

Array

↑

Object B
```

If one object changes the array,

the other object also sees the changes.

### Example

```java
this.marks = s.marks;
```

---

# Deep Copy

In Deep Copy,

a new memory location is created.

Actual data is copied element by element.

```text
Object A

↓

Array A

Object B

↓

Array B
```

Changing one object does not affect the other.

### Example

```java
for(int i = 0; i < marks.length; i++) {

    this.marks[i] = s.marks[i];

}
```

---

# Shallow Copy vs Deep Copy

| Shallow Copy | Deep Copy |
|--------------|-----------|
| Copies Reference | Copies Actual Data |
| Shared Memory | Separate Memory |
| Faster | Slightly Slower |
| Changes affect both objects | Independent Objects |

---

# Destructor

A Destructor is responsible for destroying objects and releasing memory.

Unlike C++,

Java does **NOT** support user-defined destructors.

Java automatically manages memory using the **Garbage Collector (GC)**.

---

## Garbage Collection

Example

```java
Student s1 = new Student();

s1 = null;
```

Now,

The object becomes unreachable.

The Garbage Collector may automatically remove it from Heap Memory.

---

# Constructor vs Method

| Constructor | Method |
|-------------|--------|
| Same name as class | Any valid name |
| No return type | Has return type |
| Called automatically | Called manually |
| Initializes object | Performs operations |

---

# Important Notes

- Constructor is automatically called.
- Constructor name must match the class name.
- Constructor has no return type.
- Constructors can be overloaded.
- Java does not provide a default Copy Constructor.
- Java does not support user-defined Destructors.
- Garbage Collector automatically removes unused objects.

---

# Common Mistakes

❌ Giving a return type.

```java
void Student(){

}
```

This becomes a method, not a constructor.

---

❌ Constructor name different from class name.

```java
class Student {

    StudentInfo() {

    }

}
```

Not a constructor.

---

❌ Forgetting to initialize variables.

---

# Interview Questions

### Basic

1. What is a Constructor?
2. Why do we use Constructors?
3. Difference between Constructor and Method?

### Intermediate

4. What is Constructor Overloading?
5. What is a Parameterized Constructor?
6. What is a Copy Constructor?
7. Difference between Shallow Copy and Deep Copy?

### Advanced

8. Does Java support Destructors?
9. What is Garbage Collection?
10. What happens internally when an object is created?

---

# Quick Revision

- Constructor initializes objects.
- Constructor name = Class name.
- No return type.
- Automatically called.
- Types:
  - Non-Parameterized
  - Parameterized
- Constructors can be overloaded.
- Copy Constructor copies another object.
- Shallow Copy copies references.
- Deep Copy copies actual data.
- Java uses Garbage Collection.

# Inheritance

Inheritance is an OOP concept that allows one class to acquire the properties and methods of another class.

It promotes **Code Reusability** by allowing a child class to reuse the features of its parent class.

---

## Why do we need Inheritance?

Suppose we have two classes.

```java
class Animal {

    void eat() {
        System.out.println("Animal eats");
    }

}
```

```java
class Dog {

    void eat() {
        System.out.println("Animal eats");
    }

    void bark() {
        System.out.println("Dog barks");
    }

}
```

The `eat()` method is duplicated.

Instead of writing the same code again,

Dog can inherit Animal.

---

## Syntax

```java
class Parent {

}

class Child extends Parent {

}
```

Example

```java
class Animal {

    void eat() {

        System.out.println("Eating");

    }

}

class Dog extends Animal {

    void bark() {

        System.out.println("Barking");

    }

}
```

Dog can now access

- eat()
- bark()

---

## Memory Representation

```text
Dog d1 = new Dog();

↓

Stack

d1

↓

Heap

Dog Object

↓

Animal Properties

↓

Dog Properties
```

Both Parent and Child members become part of the Child object.

---

# Advantages of Inheritance

- Code Reusability
- Less Code Duplication
- Easy Maintenance
- Extensible Code
- Supports Polymorphism

---

# Types of Inheritance

## 1. Single Inheritance

```text
Animal

↓

Dog
```

---

## 2. Multilevel Inheritance

```text
Animal

↓

Mammal

↓

Dog
```

---

## 3. Hierarchical Inheritance

```text
        Animal
       /      \
     Dog      Cat
```

---

## 4. Hybrid Inheritance

Java does **NOT** support Hybrid Inheritance using classes because it creates ambiguity.

It can be achieved using **Interfaces**.

---

## Why Multiple Inheritance is not supported?

Example

```text
Father

↓

Child

↑

Mother
```

If both parents have

```java
walk()
```

Which one should Java call?

This creates the **Diamond Problem**.

Therefore,

Java does not support Multiple Inheritance using classes.

---

# Polymorphism

The word Polymorphism means

> **One Interface, Multiple Forms**

A single method can behave differently in different situations.

---

## Types of Polymorphism

### 1. Compile-Time Polymorphism

Achieved using

- Method Overloading

Example

```java
class Calculator {

    int add(int a, int b){

        return a + b;

    }

    int add(int a, int b, int c){

        return a + b + c;

    }

}
```

The compiler decides which method to call.

---

### 2. Run-Time Polymorphism

Achieved using

- Method Overriding

Example

```java
class Animal{

    void sound(){

        System.out.println("Animal");

    }

}

class Dog extends Animal{

    @Override
    void sound(){

        System.out.println("Bark");

    }

}
```

Decision is taken during runtime.

---

## Method Overloading vs Method Overriding

| Overloading | Overriding |
|-------------|------------|
| Same Method Name | Same Method Name |
| Different Parameters | Same Parameters |
| Compile Time | Runtime |
| Same Class | Parent & Child |

---

# Abstraction

Abstraction means hiding implementation details and showing only essential information.

Users only know **what** to do,

not **how** it works internally.

---

## Real-Life Example

ATM Machine

You press

```text
Withdraw
```

Money comes out.

You don't know

- Database Query
- Server Communication
- Banking Logic

This is Abstraction.

---

## Abstract Class

An Abstract Class cannot be instantiated.

It may contain

- Abstract Methods
- Normal Methods

Example

```java
abstract class Animal{

    abstract void sound();

}
```

---

## Why Abstract Class?

Suppose every animal makes a different sound.

Instead of writing a generic implementation,

force every child class to implement its own version.

---

# Interfaces

An Interface is a blueprint that contains only method declarations (traditionally). A class implements an interface and provides the method implementations.

Interfaces help achieve

- Abstraction
- Multiple Inheritance (through interfaces)

---

## Syntax

```java
interface Animal{

    void sound();

}

class Dog implements Animal{

    public void sound(){

        System.out.println("Bark");

    }

}
```

---

## Abstract Class vs Interface

| Abstract Class | Interface |
|----------------|-----------|
| Uses extends | Uses implements |
| Can have constructors | Cannot have constructors |
| Can have instance variables | Fields are constants by default |
| Single Inheritance | Multiple Interfaces Supported |

---

# Static Keyword

Static belongs to the **Class**, not to individual objects.

Only one copy exists for the entire class.

---

## Static Variable

```java
class Student{

    static String school = "ABC";

}
```

Every object shares the same value.

---

## Static Method

```java
class Student{

    static void display(){

    }

}
```

Called using

```java
Student.display();
```

No object required.

---

# Super Keyword

The `super` keyword refers to the **Parent Class Object**.

It is used to

- Call Parent Constructor
- Access Parent Variables
- Call Parent Methods

---

## Calling Parent Constructor

```java
class Dog extends Animal{

    Dog(){

        super();

    }

}
```

`super()` is automatically called if not written explicitly.

---

## Access Parent Method

```java
super.eat();
```

---

## Access Parent Variable

```java
super.color;
```

---

# Common Mistakes

❌ Forgetting `@Override`.

❌ Calling private methods from child class.

❌ Confusing Overloading with Overriding.

❌ Creating objects of Abstract Class.

❌ Forgetting `implements` keyword for Interface.

---

# Interview Questions

### Inheritance

1. What is Inheritance?
2. Why do we use Inheritance?
3. Types of Inheritance?
4. Why doesn't Java support Multiple Inheritance?

### Polymorphism

5. What is Polymorphism?
6. Difference between Overloading and Overriding?
7. What is Dynamic Method Dispatch?

### Abstraction

8. What is Abstraction?
9. Difference between Abstract Class and Interface?

### Static

10. Why is static used?
11. Difference between Static and Instance Variables?

### Super

12. What is super?
13. Difference between this and super?

---

# Quick Revision

- Inheritance = Code Reusability.
- extends → Inheritance.
- implements → Interface.
- Overloading → Compile Time.
- Overriding → Runtime.
- Abstract Class cannot be instantiated.
- Interface provides abstraction.
- Static belongs to Class.
- super refers to Parent Class.

# JVM Memory Summary

Whenever a Java program runs, the JVM mainly uses two memory areas:

## Stack Memory

Stack Memory stores:

- Method Calls
- Local Variables
- Reference Variables

Example

```java
Student s1 = new Student();
```

Here,

```text
Stack

s1
```

is stored inside Stack Memory.

---

## Heap Memory

Heap Memory stores:

- Objects
- Instance Variables

Example

```text
Heap

Student Object

name = "Jatin"

age = 20
```

Every object created using the `new` keyword is stored in Heap Memory.

---

## Complete Memory Flow

```text
Student s1 = new Student("Jatin",20);

↓

Stack Memory

+-----------+
| s1 ------ |
+-----------+
      |
      |
      ▼

Heap Memory

+----------------------+
| Student Object       |
| name = "Jatin"       |
| age = 20             |
+----------------------+
```

---

# Complete OOP Flow

```text
Create Class

↓

Create Object

↓

Constructor Executes

↓

Memory Allocated

↓

Variables Initialized

↓

Methods Accessed

↓

Object Used
```

---

# OOP Best Practices

✅ Keep instance variables `private`.

✅ Use Getter and Setter methods.

✅ Use meaningful class names.

✅ Keep one class responsible for one task.

✅ Prefer Composition over unnecessary Inheritance.

✅ Use Constructor for initialization.

✅ Avoid duplicate code.

✅ Follow naming conventions.

---

# Common Errors

### 1. Constructor with Return Type

 Wrong

```java
void Student(){

}
```

✔ Correct

```java
Student(){

}
```

---

### 2. Different Constructor Name

❌ Wrong

```java
class Student{

    StudentInfo(){

    }

}
```

Constructor name must be same as class name.

---

### 3. Accessing Private Variables

❌ Wrong

```java
s1.name = "Jatin";
```

✔ Correct

```java
s1.setName("Jatin");
```

---

### 4. Creating Object of Abstract Class

❌ Wrong

```java
Animal a = new Animal();
```

---

### 5. Forgetting @Override

Always use

```java
@Override
```

when overriding methods.

---

# Interview Tips

Remember these keywords.

| Keyword | Purpose |
|----------|---------|
| class | Blueprint |
| object | Instance |
| new | Creates Object |
| this | Current Object |
| super | Parent Object |
| extends | Inheritance |
| implements | Interface |
| static | Belongs to Class |
| private | Maximum Security |

---

# Frequently Asked Interview Questions

### OOP Basics

- What is OOP?
- Why is OOP important?
- Explain Class and Object.
- Difference between Class and Object.

### Constructors

- What is a Constructor?
- Why doesn't Constructor have a return type?
- Constructor vs Method?
- Types of Constructors?

### Encapsulation

- What is Data Hiding?
- Why are variables private?
- Why use Getter and Setter?

### Inheritance

- Types of Inheritance?
- Why Multiple Inheritance is not supported?
- Explain Hybrid Inheritance.

### Polymorphism

- Difference between Overloading and Overriding?
- What is Dynamic Method Dispatch?

### Abstraction

- Difference between Abstraction and Encapsulation?
- Abstract Class vs Interface?

### Static

- Why Static?
- Static Variable vs Instance Variable?

### Super

- Difference between `this` and `super`?
- Why use `super()`?

---

# Programs Included

- ClassAndObjects.java
- AccessModifiers.java
- GettersAndSetters.java
- Encapsulation.java
- Constructor.java
- TypesOfConstructor.java
- CopyConstructor.java
- Inheritance.java
- MultilevelInheritance.java
- HierarchicalInheritance.java
- HybridInheritance.java
- Polymorphism.java
- Abstraction.java
- Interfaces.java
- StaticKeyword.java
- SuperKeyword.java

---

# Complete OOP Cheat Sheet

```text
OOP

│
├── Class
│
├── Object
│
├── Constructor
│
├── Access Modifier
│
├── Getter & Setter
│
├── Encapsulation
│
├── Inheritance
│
├── Polymorphism
│
├── Abstraction
│
├── Interface
│
├── Static
│
└── Super
```

---

# Final Quick Revision

✔ OOP = Programming using Classes and Objects.

✔ Class = Blueprint.

✔ Object = Instance of Class.

✔ Objects are stored inside Heap Memory.

✔ Reference Variables are stored inside Stack Memory.

✔ Constructor initializes objects.

✔ Getter reads data.

✔ Setter updates data.

✔ Encapsulation = Data Hiding.

✔ Inheritance = Code Reusability.

✔ Polymorphism = One Interface, Multiple Forms.

✔ Abstraction = Hide Implementation.

✔ Interface supports Abstraction.

✔ Static belongs to Class.

✔ Super refers to Parent Class.

✔ Java uses Garbage Collection.

---

# Conclusion

Object-Oriented Programming is one of the most important concepts in Java.

Understanding OOP makes it easier to build:

- Large Applications
- Scalable Software
- Maintainable Projects
- Real-World Systems

Mastering OOP is essential for Java development, Spring Boot, Android development, and technical interviews.

---

# Author

**Jatin Panchal**

Aspiring Software Developer

Learning Java, DSA, HTML, CSS & JavaScript

GitHub:
https://github.com/jatinpanchalll