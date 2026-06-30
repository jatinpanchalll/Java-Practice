# Bit Manipulation in Java

## Definition
- Bit Manipulation is the process of performing operations directly on the binary representation (bits) of a number.
- It is faster than many arithmetic operations because it works at the bit level.
- Commonly used in DSA, Competitive Programming, Operating Systems and Embedded Systems.

Example

```java
int n = 13;
```

Binary Representation

```text
Decimal : 13

Binary  : 1101
           ↑↑↑↑
Bit No. : 3210
```

---

# Binary Number System

| Decimal | Binary |
|---------:|:------:|
| 0 | 0000 |
| 1 | 0001 |
| 2 | 0010 |
| 3 | 0011 |
| 4 | 0100 |
| 5 | 0101 |
| 6 | 0110 |
| 7 | 0111 |
| 8 | 1000 |
| 9 | 1001 |
| 10 | 1010 |
| 11 | 1011 |
| 12 | 1100 |
| 13 | 1101 |
| 14 | 1110 |
| 15 | 1111 |

---

# Bitwise Operators

| Operator | Symbol | Description |
|-----------|--------|-------------|
| AND | `&` | 1 if both bits are 1 |
| OR | `\|` | 1 if any one bit is 1 |
| XOR | `^` | 1 if bits are different |
| NOT | `~` | Inverts all bits |
| Left Shift | `<<` | Shift bits to left |
| Right Shift | `>>` | Shift bits to right |

---

# Truth Tables

### AND (&)

| A | B | Output |
|:-:|:-:|:------:|
|0|0|0|
|0|1|0|
|1|0|0|
|1|1|1|

### OR (|)

| A | B | Output |
|:-:|:-:|:------:|
|0|0|0|
|0|1|1|
|1|0|1|
|1|1|1|

### XOR (^)

| A | B | Output |
|:-:|:-:|:------:|
|0|0|0|
|0|1|1|
|1|0|1|
|1|1|0|

---

# Operators Example

```text
a = 5 = 0101
b = 3 = 0011
```

| Expression | Result |
|------------|--------|
| a & b | 1 |
| a \| b | 7 |
| a ^ b | 6 |
| ~a | -6 |
| a << 1 | 10 |
| a >> 1 | 2 |

---

# Important Formulas

```java
Odd or Even
n & 1
```

```java
Get ith Bit
(n & (1 << i))
```

```java
Set ith Bit
n | (1 << i)
```

```java
Clear ith Bit
n & ~(1 << i)
```

```java
Update ith Bit
Clear + Set
```

```java
Clear Last i Bits
n & (~0 << i)
```

```java
Clear Range of Bits
n & ((~0 << (j+1)) | ((1<<i)-1))
```

```java
Power of Two
(n & (n-1)) == 0
```

```java
Count Set Bits
while(n>0)
```

```java
Fast Exponentiation
O(log n)
```

---

# Programs Covered

- Check Odd or Even
- Get ith Bit
- Set ith Bit
- Clear ith Bit
- Update ith Bit
- Clear Last i Bits
- Clear Range of Bits
- Check Power of Two
- Count Set Bits
- Fast Exponentiation

---

# Advantages

- Very Fast
- Constant Time Operations
- Memory Efficient
- Useful in Competitive Programming
- Used in System Programming

---

# Disadvantages

- Hard to Understand
- Less Readable
- Easy to Make Mistakes

---

# Time Complexity

| Operation | Complexity |
|-----------|------------|
| AND | O(1) |
| OR | O(1) |
| XOR | O(1) |
| NOT | O(1) |
| Left Shift | O(1) |
| Right Shift | O(1) |
| Get Bit | O(1) |
| Set Bit | O(1) |
| Clear Bit | O(1) |
| Update Bit | O(1) |
| Count Set Bits | O(log n) |
| Fast Exponentiation | O(log n) |

---

# Interview Questions

- Why is Bit Manipulation faster?
- Difference between AND and OR?
- How to check Odd or Even?
- How to check Power of Two?
- Difference between Left Shift and Right Shift?
- Why is XOR useful?

---

# Author

**Jatin Panchal**