# Max Heap Implementation in C++

This project is an exercise to implement a max heap data structure in C++. The max heap supports the following operations:

- `Insert(int x)`: Insert an element `x` into the heap.
- `ExtractMax()`: Remove and return the maximum element from the heap.
- `GetMax()`: Return the maximum element without removing it.

## Understanding Max Heap

A max heap is a specialized tree-based data structure that satisfies the heap property. In a max heap, for any given node I, the value of I is greater than or equal to the values of its children. This property must be true for all nodes in the tree, including the root.


## Usage

To use this class, simply instantiate a `MaxHeap` object and call its methods. For example:

```cpp
MaxHeap mh;
mh.Insert(5);
mh.Insert(3);
mh.Insert(8);
cout << mh.GetMax() << endl; // Outputs: 8
cout << mh.ExtractMax() << endl; // Outputs: 8
cout << mh.GetMax() << endl; // Outputs: 5
```


## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

