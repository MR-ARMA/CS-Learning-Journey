# <center>Code Challenge


# <center> <div style="width: 370px"> ![code challenge1](pictures/code_challenge1.jpg)


### Challenge 1


#### Recursively Visiting the Nodes of a Tree

Write a function `recursivePrint(Node* node)` that recursively prints the labels of all nodes in the subtree rooted at node (in any order). For example, if we had a tree with some root node root, then calling `recursivePrint(root)` would print the labels of all nodes in the tree (in some arbitrary order). Print a single label per line. Note that the tree will not necessarily be binary!


#### Solution


```cpp
void recursivePrint(Node* node) {
    /* YOUR CODE HERE */
    cout << node->label << endl;
    for(auto chil : node->children)
        recursivePrint(Node* node);
    
}
```


### Challenge 2


#### Printing the Elements of a Binary Search Tree in Sorted Order

Write a function `sortedPrint(Node* node)` that recursively prints the labels of all nodes in the subtree rooted at node in ascending sorted order. For example, if we had a tree with some root node root, then calling `sortedPrint(root)` would print the labels of all nodes in the tree in ascending sorted order. Print a single label per line. You can assume that the Binary Search Tree structure is valid (i.e., all nodes are larger than all of their descendants in their left subtree and smaller than all of their descendants in their right subtree).

#### Solution

```cpp
void sortedPrint(Node* node) {
    if(node->leftChild)
        sortedPrint(node->leftChild);
    
    cout << node->label << endl;        
    
    if(node->rightChild)
        sortedPrint(node->rightChild);
}
```

### Challenge 3

#### Finding the Maximum Value in an AVL Tree

Write a function `findMax(Node* node)` that recursively finds and returns the maximum value (label) in the subtree rooted at ***node***. For example, if you had an AVL tree with some ***root*** node root, then calling `findMax(root)` should return the maximum value in the tree.


#### Solution

```cpp
int findMax(Node* node) {
    if (node == nullptr)
        return INT_MIN; // Assuming you have included <climits> for INT_MIN
    
    if (node->rightChild)
        return findMax(node->rightChild);
    
    return node->label;
}
```

### Challenge 4


#### Checking if an AVL Tree is Balanced

Write a function `isBalanced(Node* node)` that checks whether the subtree rooted at node is balanced. A balanced AVL tree is a tree in which the balance factor of every ***node*** is between -1, 0, or 1. The balance factor of a node is the height of its left subtree minus the height of its right subtree. The function should return ***true*** if the subtree is balanced and ***false*** otherwise.


#### Solution

```cpp
bool isBalanced(Node* node) {
    if (node == nullptr)
        return true;
    
    int balanceFactor = getHeight(node->leftChild) - getHeight(node->rightChild);
    
    if (balanceFactor < -1 || balanceFactor > 1)
        return false;
    
    return isBalanced(node->leftChild) && isBalanced(node->rightChild);
}

int getHeight(Node* node) {
    if (node == nullptr)
        return 0;
    
    int leftHeight = getHeight(node->leftChild);
    int rightHeight = getHeight(node->rightChild);
    
    return 1 + max(leftHeight, rightHeight);
}
```



#### Challenge 5


#### Insertion with Rotations


Write a function `insert(Node* root, int value)` that inserts a new node with the given ***value*** into an AVL tree while maintaining the AVL tree properties. Ensure that you handle the necessary rotations (single and double rotations) to keep the tree balanced.


#### Solution

```cpp
Node* insert(Node* root, int value) {
    if (root == nullptr)
        return new Node(value);

    // Perform standard BST insert
    if (value < root->label)
        root->leftChild = insert(root->leftChild, value);
    else if (value > root->label)
        root->rightChild = insert(root->rightChild, value);
    else
        return root; // Duplicate values not allowed

    // Update height of this ancestor node
    root->height = 1 + max(getHeight(root->leftChild), getHeight(root->rightChild));

    // Get the balance factor of this ancestor node
    int balance = getBalance(root);

    // Perform rotations if needed to maintain AVL balance
    // Left Heavy (LL or LR)
    if (balance > 1) {
        if (value < root->leftChild->label) // LL
            return rightRotate(root);
        else { // LR
            root->leftChild = leftRotate(root->leftChild);
            return rightRotate(root);
        }
    }
    
    // Right Heavy (RR or RL)
    if (balance < -1) {
        if (value > root->rightChild->label) // RR
            return leftRotate(root);
        else { // RL
            root->rightChild = rightRotate(root->rightChild);
            return leftRotate(root);
        }
    }

    return root;
}

int getBalance(Node* node) {
    if (node == nullptr)
        return 0;
    return getHeight(node->leftChild) - getHeight(node->rightChild);
}

int getHeight(Node* node) {
    if (node == nullptr)
        return 0;
    return node->height;
}

Node* rightRotate(Node* y) {
    Node* x = y->leftChild;
    Node* T2 = x->rightChild;

    // Perform rotation
    x->rightChild = y;
    y->leftChild = T2;

    // Update heights
    y->height = 1 + max(getHeight(y->leftChild), getHeight(y->rightChild));
    x->height = 1 + max(getHeight(x->leftChild), getHeight(x->rightChild));

    return x;
}

Node* leftRotate(Node* x) {
    Node* y = x->rightChild;
    Node* T2 = y->leftChild;

    // Perform rotation
    y->leftChild = x;
    x->rightChild = T2;

    // Update heights
    x->height = 1 + max(getHeight(x->leftChild), getHeight(x->rightChild));
    y->height = 1 + max(getHeight(y->leftChild), getHeight(y->rightChild));

    return y;
}
```

### Challenge 6 (python language)


#### Validate a Binary Search Tree


Write a function `is_valid_bst(root)` that takes the root of a binary tree as input and returns ***True*** if the tree is a valid binary search tree (BST), and ***False*** otherwise. A valid BST is a binary tree where for each node:

- All nodes in its left subtree have values less than the node's value.
- All nodes in its right subtree have values greater than the node's value.
- Both the left and right subtrees are also valid BSTs.


#### Solution

```python
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def is_valid_bst(root):
    def is_valid(node, min_val, max_val):
        if not node:
            return True
        
        if not (min_val < node.val < max_val):
            return False
        
        return (is_valid(node.left, min_val, node.val) and
                is_valid(node.right, node.val, max_val))
    
    return is_valid(root, float('-inf'), float('inf'))
```


### Challenge 7 (python language)

#### Find the Lowest Common Ancestor in a Binary Search Tree


Write a function `lowest_common_ancestor(root, p, q)` that finds the lowest common ancestor (LCA) of two nodes ***p*** and ***q*** in a binary search tree. The LCA is the node that is the lowest common ancestor of both ***p*** and ***q***.



#### Solution

```python
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def lowest_common_ancestor(root, p, q):
    if not root:
        return None

    if root.val > p.val and root.val > q.val:
        return lowest_common_ancestor(root.left, p, q)
    elif root.val < p.val and root.val < q.val:
        return lowest_common_ancestor(root.right, p, q)
    else:
        return root
```

### Challenge 7 (python language)


#### Count the Number of Nodes in a Binary Search Tree


Write a `function count_nodes(root)` that counts and returns the total number of nodes in a binary search tree.




#### Solution

```python
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def count_nodes(root):
    if not root:
        return 0
    
    return 1 + count_nodes(root.left) + count_nodes(root.right)

```

