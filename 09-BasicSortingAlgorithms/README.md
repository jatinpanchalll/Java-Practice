# Sorting Algorithms

## Definition
Sorting is the process of arranging elements in a specific order, usually ascending or descending.

### Bubble Sort
- Large element comes to end of array by swapping with adjacent elements.

### Selection Sort
- Pick the smallest, putit at the beginning.

### Insertion Sort
- Pick an element & place in the right position in Sorted Part.

### In-Built Sort
- Ascending 
  import java.util.Arrays;
  Arrays.sort(arr), Arrays(arr,si,ei);

- Descending
  import java.util.Arrays;
  import java.util.Collections;
  Arrays.sort(arr,Collections.reverseOrder());

  Note :- Use Integer for int

### Counting Sort



  


## Time Complexity

| Algorithm | Best | Average | Worst |
|------------|------|---------|--------|
| Bubble Sort | O(n) | O(n²) | O(n²) |
| Selection Sort | O(n²) | O(n²) | O(n²) |
| Insertion Sort | O(n) | O(n²) | O(n²) |

## Author
**Jatin Panchal**



# Sorting Algorithms

## Definition
Sorting is the process of arranging elements in a specific order, usually ascending or descending.

### Bubble Sort
- Large elements move to the end of the array by swapping adjacent elements.

### Selection Sort
- Pick the smallest element and place it at the beginning.

### Insertion Sort
- Pick an element and place it in the correct position in the sorted part.

### In-Built Sort
#### Ascending Order
```java
import java.util.Arrays;
Arrays.sort(arr);
Arrays.sort(arr, si, ei);
```

#### Descending Order
```java
import java.util.Arrays;
import java.util.Collections;
Arrays.sort(arr, Collections.reverseOrder());
```

**Note:** Use `Integer[]` instead of `int[]` when using `Collections.reverseOrder()`.

### Counting Sort
- Efficient for sorting integers within a limited range.
- For small numbers, Konsa kitni bar aata hai.

## Time Complexity

| Algorithm      | Best  | Average | Worst |
| -------------- | ----- | ------- | ----- |
| Bubble Sort    | O(n)  | O(n²)   | O(n²) |
| Selection Sort | O(n²) | O(n²)   | O(n²) |
| Insertion Sort | O(n)  | O(n²)   | O(n²) |

## Author
**Jatin Panchal**
