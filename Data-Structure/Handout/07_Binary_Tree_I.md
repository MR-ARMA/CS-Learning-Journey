# <center>Binary Tree Part 1


# <center> <div style="width: 370px;"> ![binary tree](pictures/binary_tree_III.jpg)


|Sequence Data Structure|Operations O(.)|Operations O(.)|Operations O(.)|Operations O(.)|Operations O(.)|
|-|-|-|-|-|-|
||Container|Static|Dynamic|Dynamic|Dynamic|
||build(X)|get_at(i)/set_at(i)|insert_first(x)/delete_first()|insert_last(x)/delete last()|insert at(i, x)|delete_at(i)|
|Array|<center>n|<center>1|<center>n|<center>n|<center>n|
|Linked List|<center>n|<center>n|<center>1|<center>n|<center>n|
|Dynamic Array|<center>n|<center>1|<center>n|$$ 1_{(a)} $$ |<center>n|
|Goal|<center>n| $$ \log n $$ | $$ \log n $$ | $$ \log n $$ | $$ \log n $$ |



|Set Data Structure|Operations O(.)|Operations O(.)|Operations O(.)|Operations O(.)|Operations O(.)|
|-|-|-|-|-|-|
||Container|Static|Dynamic|Order|Order|
||build(X)|find(k)|insert(x)/delete(k)|find_min()/find_max()|find prev(k)/find next(k)|
|Array|<center>n|<center>n|<center>n|<center>n|<center>n|
|Sorted Array|$$ n \log n $$|$$ \log n $$|<center>n|<center>1|$$ \log n $$|
|Direct Access Array|<center>u|<center>1|<center>1|<center>u|<center>u|
|Hash Table|$$ n_{(e)} $$|$$ 1_{(e)} $$|$$ 1_{(a)(e)} $$|<center>n|<center>n|
|Goal|<center>n| $$n \log n $$ | $$ \log n $$ | $$ \log n $$ | $$ \log n $$ |

#### How? Binary Tree


A binary tree is a fundamental data structure used in computer science and mathematics. It is a type of tree where each node can have at most two children, which are typically referred to as the left child and the right child. Binary trees play a crucial role in various algorithms and data manipulation tasks. Let's break down the components and structure of a binary tree:

1. **Definition:** A binary tree is a special type of tree, which is itself a connected graph with no cycles. In the case of a binary tree, each node has, at most, two child nodes: a left child and a right child. These child nodes are also binary nodes.


Here's a Python class definition for a Binary_Node, which represents a binary tree node:
2. **Binary Node:** A binary node is the basic building block of a binary tree. It is similar to a linked list node and contains a constant number of fields:

    - **Item:** A pointer to an item stored at the node. This can be any type of data or object, depending on the application.
    
    - **Parent Node:** A pointer to the parent node of the current node. If the current node is the root of the tree, this pointer may be set to None.
    
    - **Left Child Node:** A pointer to the left child node of the current node. If there is no left child, this pointer may be set to None.
    
    - **Right Child Node:** A pointer to the right child node of the current node. If there is no right child, this pointer may be set to None.




```python
class Binary_Node:
    def __init__(self, item):
        # Initialize the binary node with the given item
        self.item = item
        self.left = None
        self.right = None
        self.parent = None
```



In this code:
- The `__init__` method is the constructor for the Binary_Node class. It initializes a binary node with the provided `item`.
- `self.item` stores the item/data associated with the node.
- `self.left` is the pointer to the left child node, initially set to None.
- `self.right` is the pointer to the right child node, initially set to None.
- `self.parent` is the pointer to the parent node, initially set to None.

The code also includes a comment indicating that there might be a `subtree_update()` method in the future, but it's not implemented at this point (indicated by the "wait for R07!" comment).

This Binary_Node class can be used as a building block to create binary trees for various applications and algorithms.


### Notes



**Tree:** A connected graph with no cycle

**Root:** A node without parents

**Leaf:** A node without child


```python
node.left.parent = node
```

**Subtree** of node `X`: `X` and descendates `X`
**depth** of node `X`: `#`oncestrys = `#`edges in path from `X` up to the root
**height** of node `X`: `#`edges in longest downword path from `X` = max depth in subtree of `X`

***note:*** height(root) = hright(tree)


### Traversal Order of Node/Item

for every node `X`:
- node in `X`.left befor `X`
- node in `X`right after `X`


### Algorithm for `sub_tree(node)` : O(h)


```algorithm
until node.left != Node:
    node = node.left
return node
```



### Algorithm for `successor(node)` : O(h)
(successor: next after node in trees traversal order)


```algorithm
if note.right:
    return subtree_first(node)
else:
    node = node.right #walk up tree
    node == node.parent.left (until go up a left branch)
return node
```


### Algorithm for `subtree_insert_after(new_node)` :



```algorithm
if node.right is None:
    node.right = new_node
else:
    put new as successor(node).left
```

### Algorithm for `subtree_delete(node)` :


```algorithm
if node is leaf:
    detach from parent
else:
    if node.left not empty:
        swap node item <-> predecessor(node) item
        subtree_delete(predecessor)
    if node.right is empty:
        swap node item <-> successor(node) item
        subtree_delete(successor)
```



### Reminder of an important point


**SEQUENCE:** 
traversal order = sequence order

**SET:** 
traversal order = increasing order


### Terminology

- The ***root*** of a tree has no parent
- A ***leaf*** of a tree has no children
- Define ***depth*** (<X>) of node <X> in a tree rooted at <R> to be length of path from <X> to <R>
- Define ***height*** (<X>) of node <X> to be max depth of any node in the ***subtree*** rooted at <X>
- **Idea:** Design operations to run in `O(h)` time for root height `h`, and maintain `h = O(log n)`
- A binary tree has an inherent order: its ***traversal order***
    - every node in node <X>’s left subtree is ***before*** <X>
    - every node in node <X>’s right subtree is ***after*** <X>
- List nodes in traversal order via a recursive algorithm starting at root:
    - Recursively list left subtree, list self, then recursively list right subtree
    - Runs in `O(n)` time, since `O(1)` work is done to list each node
- Right now, traversal order has no meaning relative to the stored items
- Later, assign semantic meaning to traversal order to implement Sequence/Set interfaces 

### Application: Set


- **Idea! Set Binary Tree** (a.k.a. **Binary Search Tree / BST** ): Traversal order is sorted order increasing by key
    - Equivalent to **BST Property**: for every node, every key in left subtree ≤ node’s key ≤ every key in right subtree
- Then can find the node with key k in node <X>’s subtree in `O(h)` time like binary search:
    - If k is smaller than the key at <X>, recurse in left subtree (or return None)
    - If k is larger than the key at <X>, recurse in right subtree (or return None)
    - Otherwise, return the item stored at <X>
- Other Set operations follow a similar pattern; see recitation 



### Application: Sequence


- **Idea! Sequence Binary Tree:** Traversal order is sequence order
- How do we find i-th node in traversal order of a subtree? Call this operation `subtree_at(i)`
- Could just iterate through entire traversal order, but that’s bad, `O(n)`
- However, if we could compute a subtree’s ***size*** in `O(1)`, then can solve in `O(h)` time
     - How? Check the size nL of the left subtree and compare to i
     - If i < n_L, recurse on the left subtree
     - If i > n_L, recurse on the right subtree with $ i' = i − n_L − 1 $
     - Otherwise, i = n_L, and you’ve reached the desired node!
- Maintain the size of each node’s subtree at the node via **augmentation**
     - Add node.size field to each node
     - When adding new leaf, add +1 to a.size for all ancestors a in `O(h)` time
     - When deleting a leaf, add −1 to a.size for all ancestors a in `O(h)` time
- Sequence operations follow directly from a fast `subtree_at(i)` operation
- Naively, `build(X)` takes `O(nh)` time, but can be done in `O(n)` time; see recitation 



---

### Exercise


CODE CHALLENGE: Printing the Elements of a Binary Search Tree in Sorted Order


#### C++ Code:

```C++
void sortedPrint(Node* node) {
    if(node->leftChild)
        sortedPrint(node->leftChild);
    cout << node->label << endl;        
    if(node->rightChild)
        sortedPrint(node->rightChild);
}
```


#### Python Code:

```python
class Node:
    def __init__(self, label):
        self.label = label
        self.leftChild = None
        self.rightChild = None

def sorted_print(node):
    if node.leftChild:
        sorted_print(node.leftChild)
    print(node.label)
    if node.rightChild:
        sorted_print(node.rightChild)
```

---

**So far we have reached `O(h)`, now how to convert it to: $ O( \log n ) $**

