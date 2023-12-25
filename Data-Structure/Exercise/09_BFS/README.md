# Binary Search Tree (BST) Implementation in C++

This project involves creating a Binary Search Tree (BST) in C++. A BST is a tree data structure in which each node has at most two children, referred to as the left child and the right child. For each node, all elements in the left subtree are less than the node, and all elements in the right subtree are greater than the node.

## Node Structure

The `Node` structure represents a node in the BST. Each node has an integer key and pointers to left and right child nodes.

```cpp
struct Node {
 int key;
 Node *left, *right;
};
```

## Functions

The BST class provides several functions:

- **newNode(int item)**: Creates a new node with a given key.
- **insertRec(Node* root, int key)**: Recursively inserts a new key into the BST.
- **insert(Node* root, int key)**: Wraps around `insertRec()`, providing the same functionality.
- **search(Node* root, int key)**: Checks if a key exists in the BST.



## Time Complexity

The time complexity of both the insert and search operations in a BST is O(h), where h is the height of the tree. In the worst case scenario, where the tree is skewed, h equals to n (number of nodes), making the time complexity O(n). However, for a balanced BST, the height is log(n), making the time complexity O(log(n)).

