# 🔁 Recursion in Java

> A complete beginner-to-advanced guide to **Recursion in Java** with explanations, syntax, dry runs, call stack visualization, examples, complexity analysis, interview questions, and common mistakes.

---

# 📑 Table of Contents

- Introduction
- What is Recursion?
- Why Recursion?
- Real-Life Examples
- Terminology
- How Recursion Works
- Base Case
- Recursive Case
- Call Stack
- Stack Unwinding
- Flow Diagram
- Recursion vs Iteration
- Types of Recursion
- Basic Programs
- Advanced Problems
- Time Complexity
- Space Complexity
- Advantages
- Disadvantages
- Common Mistakes
- Interview Questions
- Programs Included
- Quick Revision

---

# 📖 Introduction

Recursion is one of the most important concepts in programming.

Instead of solving a problem directly, a recursive function divides the problem into smaller versions of itself until the problem becomes so small that it can be solved directly.

Recursion is widely used in:

- Trees
- Graphs
- Binary Search
- Divide & Conquer
- Dynamic Programming
- Backtracking
- DFS
- File Systems
- Compiler Design

Learning recursion properly makes advanced Data Structures much easier.

---

# 🤔 What is Recursion?

Recursion is a programming technique where a method calls **itself** to solve a smaller version of the same problem.

Every recursive function must have a stopping condition known as the **Base Case**.

Without a Base Case, recursion never stops.

### Definition

> **Recursion is the process in which a function repeatedly calls itself until a terminating condition is reached.**

---

# 🎯 Why Recursion?

Many problems are naturally recursive.

Examples:

- Factorial
- Fibonacci
- Binary Search
- Merge Sort
- Quick Sort
- Tree Traversal
- DFS
- Tower of Hanoi
- N-Queens
- Sudoku Solver

Some problems become much shorter and cleaner when solved recursively.

---

# 🌍 Real-Life Examples

### Example 1 : Mirrors

Imagine standing between two mirrors.

The image keeps repeating infinitely.

This resembles recursion.

---

### Example 2 : Russian Dolls

```
Big Doll

↓

Medium Doll

↓

Small Doll

↓

Smallest Doll
```

Each doll contains another doll.

---

### Example 3 : Folder Inside Folder

```
Documents

↓

Projects

↓

Java

↓

Recursion

↓

Programs
```

Folders are recursively nested.

---

# 📚 Important Terminology

## Function Call

When one function invokes another function.

Example

```java
display();
```

---

## Recursive Function

A function that calls itself.

```java
fun(n-1);
```

---

## Base Case

The condition that stops recursion.

```java
if(n==0){
    return;
}
```

---

## Recursive Case

The part where the function calls itself.

```java
fun(n-1);
```

---

## Call Stack

The memory area where every recursive call waits until execution finishes.

---

## Stack Unwinding

The process of returning back after reaching the Base Case.

---

# ⚙️ Syntax of Recursion

```java
returnType functionName(parameters){

    // Base Case
    if(condition){
        return value;
    }

    // Recursive Case
    return functionName(smallerProblem);
}
```

---

# 🔄 How Recursion Works

Suppose we call

```java
fun(5);
```

Execution becomes

```
fun(5)

↓

fun(4)

↓

fun(3)

↓

fun(2)

↓

fun(1)

↓

Base Case

↓

Return

↓

fun(2)

↓

fun(3)

↓

fun(4)

↓

fun(5)
```

Notice that recursion has **two phases**.

1. Going Down (Recursive Calls)
2. Coming Back (Stack Unwinding)

---

# 🛑 Base Case

The Base Case is the stopping condition.

Without it, recursion continues forever.

Example

```java
if(n==1){
    return;
}
```

Another example

```java
if(n==0){
    return 1;
}
```

The Base Case should always be reachable.

---

# 🔁 Recursive Case

This is where recursion happens.

Example

```java
return n * factorial(n-1);
```

Each recursive call should make the problem smaller.

Wrong

```java
factorial(n);
```

Correct

```java
factorial(n-1);
```

---

# 📦 Call Stack

Every function call is stored inside the **Call Stack**.

Consider

```java
factorial(4);
```

Stack becomes

```
Top

factorial(1)

factorial(2)

factorial(3)

factorial(4)

main()

Bottom
```

The function at the top executes first.

After the Base Case, stack starts removing one function at a time.

This process is known as **Stack Unwinding**.

---

# ⬆️ Stack Unwinding

Suppose

```
factorial(4)
```

Execution

```
factorial(4)

↓

factorial(3)

↓

factorial(2)

↓

factorial(1)

↓

return 1

↓

2

↓

6

↓

24
```

Every recursive call waits for the smaller problem to finish.

Only after that does it continue execution.

---

# 🔄 Flow Diagram

```
Function Call

↓

Check Base Case

↓

Base Case True?

↓

Yes → Return

↓

No

↓

Recursive Call

↓

Again Check Base Case

↓

Return

↓

Previous Function Continues

↓

Final Answer
```

---

# 🆚 Recursion vs Iteration

| Recursion | Iteration |
|------------|-----------|
| Uses function calls | Uses loops |
| Uses Call Stack | No Call Stack |
| Cleaner code | Faster execution |
| More memory | Less memory |
| Easier for Trees & Graphs | Better for simple repetition |

### Example (Iteration)

```java
for(int i=1; i<=5; i++){
    System.out.println(i);
}
```

### Example (Recursion)

```java
public static void print(int n){

    if(n==6){
        return;
    }

    System.out.println(n);
    print(n+1);

}
```

---

# 📌 Types of Recursion

## 1. Direct Recursion

A function directly calls itself.

```java
fun(n-1);
```

---

## 2. Indirect Recursion

Function A calls Function B.

Function B calls Function A.

Example

```text
A()

↓

B()

↓

A()

↓

B()
```

---

## 3. Head Recursion

Recursive call happens before processing.

```java
fun(n-1);
System.out.println(n);
```

Output

```
1
2
3
4
5
```

---

## 4. Tail Recursion

Processing happens before recursive call.

```java
System.out.println(n);
fun(n-1);
```

Output

```
5
4
3
2
1
```

---

## 5. Tree Recursion

One function makes multiple recursive calls.

Example

```java
return fibonacci(n-1) + fibonacci(n-2);
```

---

---

# 💼 Interview Questions

## Q1. What is Recursion?

**Answer:**

Recursion is a programming technique in which a function calls itself to solve a smaller instance of the same problem until a stopping condition (Base Case) is reached.

---

## Q2. What is a Base Case?

**Answer:**

A Base Case is the terminating condition of a recursive function. It prevents infinite recursion.

Example

```java
if(n == 0){
    return 1;
}
```

---

## Q3. What is a Recursive Case?

**Answer:**

The Recursive Case is the part of the function where it calls itself with a smaller input.

Example

```java
return n * factorial(n - 1);
```

---

## Q4. What happens if a recursive function has no Base Case?

**Answer:**

The function keeps calling itself indefinitely until the program throws a **StackOverflowError**.

---

## Q5. What is the Call Stack?

**Answer:**

The Call Stack is a memory structure that stores every active function call. Each recursive call is pushed onto the stack, and once the Base Case is reached, functions return one by one.

---

## Q6. What is Stack Unwinding?

**Answer:**

Stack Unwinding is the process of returning from recursive calls after reaching the Base Case.

Example:

```
factorial(4)

↓

factorial(3)

↓

factorial(2)

↓

factorial(1)

↓

Return

↓

factorial(2)

↓

factorial(3)

↓

factorial(4)
```

---

## Q7. Difference between Recursion and Iteration?

| Recursion | Iteration |
|------------|-----------|
| Uses function calls | Uses loops |
| Uses Call Stack | No Call Stack |
| More memory | Less memory |
| Cleaner for recursive problems | Faster for simple repetition |

---

## Q8. What is Tail Recursion?

**Answer:**

In Tail Recursion, the recursive call is the last operation performed in the function.

Example

```java
print(n);
fun(n-1);
```

---

## Q9. What is Head Recursion?

**Answer:**

In Head Recursion, the recursive call occurs before any processing.

Example

```java
fun(n-1);
print(n);
```

---

## Q10. What is Tree Recursion?

**Answer:**

Tree Recursion occurs when a function makes more than one recursive call.

Example

```java
return fib(n-1) + fib(n-2);
```

---

## Q11. Why is recursive Fibonacci inefficient?

**Answer:**

Because it recalculates the same subproblems multiple times, resulting in an exponential time complexity of **O(2ⁿ)**.

---

## Q12. Can every recursive solution be converted into an iterative solution?

**Answer:**

Yes. Most recursive solutions can be converted into iterative solutions using loops or an explicit stack.

---

## Q13. Which data structure is used internally by Recursion?

**Answer:**

**Stack (Call Stack)**

---

## Q14. What is StackOverflowError?

**Answer:**

It occurs when the recursion depth exceeds the available stack memory due to too many recursive calls.

---

## Q15. When should Recursion be preferred?

**Answer:**

Recursion is preferred for problems involving:

- Trees
- Graphs (DFS)
- Divide & Conquer
- Backtracking
- Dynamic Programming
- Mathematical Recurrence Relations

---

# 📌 Quick Revision

## 🔹 Definition

- Recursion is a technique where a function calls itself.
- Every recursive function must have a Base Case.

---

## 🔹 Components

- Base Case
- Recursive Case
- Call Stack
- Stack Unwinding

---

## 🔹 Formulae

### Factorial

```
n!

=

n × (n-1)!
```

---

### Sum of Natural Numbers

```
sum(n)

=

n + sum(n-1)
```

---

### Fibonacci

```
fib(n)

=

fib(n-1) + fib(n-2)
```

---

### Optimized Power

```
xⁿ

=

(xⁿ⁄²)²
```

If **n** is odd,

```
Answer = x × (xⁿ⁄²)²
```

---

## 🔹 Types of Recursion

- Direct Recursion
- Indirect Recursion
- Head Recursion
- Tail Recursion
- Tree Recursion

---

## 🔹 Time Complexity

| Program | Time |
|---------|------|
| Print Numbers | O(n) |
| Factorial | O(n) |
| Sum | O(n) |
| Power | O(n) |
| Optimized Power | O(log n) |
| Fibonacci | O(2ⁿ) |

---

## 🔹 Space Complexity

Most recursive programs use:

```
O(n)
```

Because each function call occupies one stack frame.

---

## 🔹 Advantages

- Short and clean code
- Easy to solve recursive problems
- Useful in Trees & Graphs
- Essential for Backtracking
- Used in Divide & Conquer

---

## 🔹 Disadvantages

- Uses extra memory
- Function call overhead
- Risk of StackOverflowError
- Sometimes slower than loops

---

## 🔹 Common Mistakes

❌ Forgetting Base Case

❌ Wrong Base Case

❌ Recursive call doesn't reduce problem size

❌ Ignoring returned value

❌ Infinite recursion

---

## 📝 Programs Covered

- Print Increasing Numbers
- Print Decreasing Numbers
- Factorial
- Sum of Natural Numbers
- Fibonacci
- Power (xⁿ)
- Optimized Power
- Check Sorted Array
- First Occurrence
- Last Occurrence
- Remove Duplicates
- Tiling Problem
- Friends Pairing Problem
- Binary Strings
- Tower of Hanoi

---

# 🎯 Conclusion

Recursion is one of the most important programming concepts in Java and forms the foundation for many advanced topics like **Backtracking, Trees, Graphs, Divide & Conquer, and Dynamic Programming**.
