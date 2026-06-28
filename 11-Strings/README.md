# Strings in Java

## Definition
- A String is a sequence of characters.
- Strings in Java are objects of the `String` class.
- Strings are immutable (cannot be modified after creation).

Example:

```java
String name = "Jatin";
```


## Memory Representation
Strings are stored in the **String Pool** when created using string literals.

Example:

```java
String s1 = "Java";
String s2 = "Java";
```

Memory:

```
String Pool

      "Java"
       ▲   ▲
       │   │
      s1  s2
```

Using `new` keyword:

```java
String s3 = new String("Java");
```

Memory:

```
Heap Memory

s3 ─────► "Java"
```


## Common Methods
- length()
- charAt()
- compareTo()
- equals()
- substring()
- concat()
- toUpperCase()
- toLowerCase()
- indexOf()
- StringBuilder


## Advantages
- Easy to use
- Rich built-in methods
- Immutable (thread-safe)
- Efficient memory using String Pool


## Disadvantages
- Immutable (new object created after modification)
- Concatenation using `+` is slower for large strings


## Time Complexity

| Operation | Complexity |
|------------|------------|
| Access Character | O(1) |
| Length | O(1) |
| Compare | O(n) |
| Concatenation | O(n) |
| Substring | O(n) |


## Author
**Jatin Panchal**