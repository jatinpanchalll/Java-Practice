# 2D Arrays in Java

## Definition
* A 2D Array is an array of arrays used to store data in rows and columns.
* Elements are accessed using row and column indices.
* Useful for representing matrices, tables, and grids.

Example:
```java
int matrix[][] = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

## Memory Representation
* A 2D Array in Java is stored as an array of arrays.
* Each row is a separate array referenced by the main array.

Example:
```text
matrix
   |
   +--> Row0 --> [1][2][3]
   +--> Row1 --> [4][5][6]
   +--> Row2 --> [7][8][9]
```

## 4 × 4 Matrix Indexing
```text
        Col
        0      1      2      3

Row 0  [0,0] [0,1] [0,2] [0,3]
Row 1  [1,0] [1,1] [1,2] [1,3]
Row 2  [2,0] [2,1] [2,2] [2,3]
Row 3  [3,0] [3,1] [3,2] [3,3]
```

Access Formula:
```java
matrix[row][column]
```

## Time Complexity

| Operation | Complexity     |
| --------- | -------------- |
| Access    | O(1)           |
| Traversal | O(rows × cols) |
| Search    | O(rows × cols) |


## Author
**Jatin Panchal**
