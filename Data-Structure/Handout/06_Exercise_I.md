# <center> Exercise

# <center> <div style="width: 370px;"> ![Exercise](pictures/Exercise.jpg)


### 1.Code Challenge I

Implement counting sort in Python to sort a list of integers with keys in the range 0 to k.

#### solution

---
```python
def counting_sort(arr, k):
    # Create a count array to store the frequency of each element
    count = [0] * (k + 1)

    # Count the occurrences of each element in the input array
    for num in arr:
        count[num] += 1

    # Reconstruct the sorted array
    sorted_arr = []
    for i in range(k + 1):
        sorted_arr.extend([i] * count[i])

    return sorted_arr

# Example usage:
arr = [4, 2, 2, 8, 3, 3, 1]
k = 8
sorted_arr = counting_sort(arr, k)
print(sorted_arr)
```
---

### 2.Code Challenge II

Implement a stable counting sort in C++ using an array of vectors as "chains" to handle duplicate keys.

#### Solution

---
```cpp
#include <iostream>
#include <vector>

using namespace std;

void stable_counting_sort(vector<int>& arr, int k) {
    vector<vector<int>> count(k + 1);

    // Count the occurrences of each element in the input array
    for (int num : arr) {
        count[num].push_back(num);
    }

    // Reconstruct the sorted array
    int index = 0;
    for (int i = 0; i <= k; ++i) {
        for (int j = 0; j < count[i].size(); ++j) {
            arr[index++] = count[i][j];
        }
    }
}

int main() {
    vector<int> arr = {4, 2, 2, 8, 3, 3, 1};
    int k = 8;
    
    stable_counting_sort(arr, k);
    
    for (int num : arr) {
        cout << num << " ";
    }
    
    return 0;
}

```
---

### 3.Question I


What is the time complexity of radix sort and what conditions need to be met for it to achieve linear runtime? How does it compare asymptotically to comparison-based sorting algorithms like merge sort?


#### Solution

***Radix Sort Time Complexity and Conditions for Linear Runtime:***

- The time complexity of radix sort is `O(n * k)`, where n is the number of elements to be sorted, and `k` is the number of digits in the maximum element.
- Radix sort can achieve linear runtime when the number of digits `k` is a constant, i.e., independent of the number of elements n. This means that the range of possible key values should not grow with the input size. In other words, `k` should be a constant or bounded by a small value.
- Asymptotically, radix sort can be more efficient than comparison-based sorting algorithms like merge sort, which have a worst-case time complexity of `O(n log n)`. When k is relatively small, radix sort can be faster. However, radix sort has a larger constant factor and may be less efficient for small input sizes.

### 4.Question II

Explain the difference between a stable and unstable sorting algorithm. Give an example of each. Why might stability be an important property for a sorting algorithm?

#### Solution


***Stable vs. Unstable Sorting Algorithm:***

- A stable sorting algorithm preserves the relative order of equal elements in the sorted output. In other words, if you have two elements with the same key value, the one that appeared earlier in the original input will also appear earlier in the sorted output. Stability is important in situations where you want to maintain the original order of equivalent elements.
- Example of a stable sorting algorithm: Insertion Sort.
- Example of an unstable sorting algorithm: Quick Sort.
- Stability can be important in scenarios like sorting a list of people by age and then by name. If two people have the same age, a stable sort ensures that their original order by name is maintained.

### 5.Question III

What is amortized analysis and how can it be applied to analyze the cost of operations like insertion and deletion in a dynamic array or hash table? Give a specific example to demonstrate the amortized cost.

#### Solution

***Amortized Analysis and its Application:***

- Amortized analysis is a method for analyzing the average time complexity of a sequence of operations on a data structure, even when some individual operations may be expensive. It provides a more accurate picture of the overall performance.
- For example, consider a dynamic array that occasionally needs to resize when it reaches its capacity. The resize operation is expensive (`O(n)` where n is the current size), but it doesn't happen every time an element is inserted.
- Using amortized analysis, we can show that the average cost of an insertion operation (including occasional resizes) is `O(1)`.
- Let's say we double the array size whenever it's full. If we perform n insertions, there will be at most O(log n) resizes (doubling the size each time). The total cost of resizing is `O(n)`. Therefore, the amortized cost of each insertion is `O((n + n)/n) = O(2)`, which is `O(1)` on average.