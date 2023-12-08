# <center>Binary Tree Part 2

# <center> <div style="width: 370px;"> ![binary tree](pictures/binary_tree_2.jpg)

|Sequence Data Structure|Operations O(.)|Operations O(.)|Operations O(.)|Operations O(.)|Operations O(.)|
|-|-|-|-|-|-|
||Container|Static|Dynamic|Dynamic|Dynamic|
||build(X)|get_at(i)/set_at(i)|insert_first(x)/delete_first()|insert_last(x)/delete last()|insert at(i, x)/delete_at(i)|
|Binary Tree|<center>n|<center>h|<center>h|<center>h|<center>h|
|AVL Tree|<center>n|$\log n$|$\log n$|$\log n$|$\log n$|

|Set Data Structure|Operations O(.)|Operations O(.)|Operations O(.)|Operations O(.)|Operations O(.)|
|-|-|-|-|-|-|
||Container|Static|Dynamic|Order|Order|
||build(X)|find(k)|insert(x)/delete(k)|find_min()/find_max()|find prev(k)/find next(k)|
|Binary Tree|$$n \log n $$|<center>h|<center>h|<center>h|<center>h|
|AVL Tree|$n \log n$|$\log n$|$\log n$|$\log n$|$\log n$|


### Balanced Binary Trees: Achieving Optimal Height

In our previous discussion, we explored binary trees as versatile data structures for storing items, allowing us to organize data without imposing constraints on the tree's maximum height. Our ultimate objective is to maintain a state of balance within our tree. A tree containing 'n' nodes is considered balanced when its height is within the bounds of `O(log n)`. This balance ensures that operations, such as those discussed in our previous conversation, which took `O(h)` time, will now only require `O(log n)` time.

To achieve this balance in the face of insertions and deletions, various techniques have been developed, including ***Red-Black Trees***, ***B-Trees***, ***2-3 Trees***, and ***Splay Trees***. One of the oldest and simplest methods, known as the **AVL Tree** (Adelson-Velsky and Landis, 1962), offers an elegant solution. In an AVL Tree, each node is height-balanced, adhering to what we call the AVL Property. This property stipulates that the difference in height between the left and right subtrees of a height-balanced node must not exceed 1.

To put it differently, we can determine a node's balance by calculating its skew, defined as the height of its right subtree minus the height of its left subtree (with the height of an empty subtree considered as -1). A node is considered height-balanced if its skew is either -1, 0, or 1. When every node in a tree satisfies this height-balance criterion, we can confidently say that the tree itself is height-balanced.


---

### Exercise

A height-balanced tree is balanced. 

**Solution**


Balanced means that `h = O(log n)`. Equivalently, balanced means that `log n` is lower
bounded `by Ω(h)` so that `n = 2^Ω(h)`. So if we can show the minimum number of nodes in a heightbalanced tree is at least exponential in h, then it must also be balanced. Let `F(h)` denote the fewest nodes in any height-balanced tree of height h. Then `F(h)` satisfies the recurrence:


$$ F(h) = 1 + F(h − 1) + F(h − 2) ≥ 2F(h − 2) $$


since the subtrees of the root’s children should also contain the fewest nodes. As base cases, the fewest nodes in a height-balanced tree of height 0 is one, i.e., `F(0) = 1`, while the fewest nodes in a height-balanced tree of height 1 is two, i.e., `F(1) = 2`. Then this recurrence is lower bounded by $F(h) ≥ 2^{\frac{h}{2}} = 2^{Ω(h)}$ as desired.


---

##### How to change the structure of a tree, while preserving traversal order? 


**Rotations!**



```plaintext
Before Rotation (rotate_right(A)):

        _______A_____
       ____B____     C
      D       E     / \
     / \     / \   /___\
    /___\   /___\
After Rotation (rotate_right(A)):

         _______B________
        D           ____A____
       / \         E         C
      /___\       / \       / \         
                 /___\     /___\
---------------------------------

Before Rotation (rotate_left(B)):

        _______B________
       D           ____A____
      / \         E         C
     /___\       / \       / \           
                /___\     /___\
After Rotation (rotate_left(B)):

             _______A_____
        ____B____        C
       D         E      / \
      / \       / \    /___\
     /___\     /___\
```


### AVL Tree


#### Claim


Transforming a binary tree to another with the same traversal order can be accomplished in `O(n)` rotations.


#### Proof

The transformation process involves repeatedly performing the last possible right rotation in the traversal order. This operation results in a canonical chain structure. With each rotation, the depth of the last node in the chain increases by $1$. Since the depth of the final node in the canonical chain is $n − 1$, at most $n − 1$ rotations are performed in this process. To reach the target tree, reverse the canonical rotations.



- Although it's possible to maintain height-balance using $O(n)$ rotations to fully balance the tree, this approach is relatively slow.
- Our objective is to achieve and maintain tree balance efficiently, with $O(log n)$ time per operation!


### AVL Trees: Height Balance

- AVL trees maintain height-balance (also called the AVL Property)
    - A node is height-balanced if heights of its left and right subtrees differ by at most 1
    - Let skew of a node be the height of its right subtree minus that of its left subtree
    - Then a node is height-balanced if its skew is −1, 0, or 1

#### Claim

 A binary tree with height-balanced nodes has height $h = O(log n)$ (i.e., $n = 2^Ω(h)$
)

#### Proof


Suffices to show fewest nodes `F(h)` in any height h tree is `F(h) = 2^Ω(h)`


$$ F(0) = 1, F(1) = 2, F(h-1)+F(h-2)≥ 2F(h-2) => F(h)≥ 2^{\frac{h}{2}}  $$

---




## Rebalance

Imagine a scenario where adding or removing a leaf from a height-balanced tree causes an imbalance to occur. In this situation:

- The changes in height and skew are confined to the subtrees of the ancestors of the affected leaf.
- These height changes are limited to increments or decrements of just ±1. Consequently, the skews of these subtrees remain within a range of magnitude $≤ 2$.

The approach to address this imbalance is as follows:

- We initiate a process to restore height balance to the ancestors of the leaf, starting from the leaf itself and moving up towards the root of the tree.
- The key strategy is to repeatedly rebalance the lowest ancestor that is not in a height-balanced state. For the sake of simplicity, we assume without loss of generality that this ancestor has a skew of $2$.


### Let's refine the explanation:

**Local Rebalance:**

When dealing with a binary tree node <B> that has a skew of $2$, and when every other node within <B>'s subtree maintains height balance, it is possible to restore height balance to <B>'s subtree through one or two rotations. After these rotations, the height of <B> will either remain the same or be reduced by one.

• Proof:
– Since the skew of <B> is 2, we know that <B> has a right child, denoted as <F>.
– There are two cases to consider: 
  1. Case 1: The skew of <F> is 0.
  2. Case 2: The skew of <F> is 1.
  
In both cases, we can perform a left rotation on <B> to achieve balance:

```bash
   __<B>______                     ______<F>____
  <A>    ___<F>___              __<B>___       <G>
  / \   <D>      <G>     =>   <A>      <D>     / \
 /___\  / \      / \          / \      / \    /   \
       /___\    /___\        /___\    /___\  /_____\
      /_____\                        /_____\
                   
```

Here's the rationale for these rotations:

    - Let 'h' be the height of <A>.After the rotation, the height of <G> becomes 'h + 1', and in Case 1, the height of <D> also becomes 'h + 1', while in Case 2, it becomes 'h'.
    - After the rotation:
        - The skew of <B> becomes either 1 in Case 1 or 0 in Case 2, making <B> height balanced.
        - The skew of <F> becomes -1, rendering <F> height balanced.
        - The height of <B> before the rotation is 'h + 3', which remains 'h + 3' in Case 1 and becomes 'h + 2' in Case 2.



Here's the edited text:

**Case 3:**

In Case 3, when the skew of <F> is -1, indicating the presence of the left child <D> of <F>:

- We initiate a right rotation on <F>, followed by a left rotation on <B>.

```bash
   __<B>___________                    _____<D>______
  <A>        _____<F>__            __<B>__       __<F>__
  / \    __<D>__      <G>  =>     <A>    <C>    <E>    <G>
 /___\  <C>    <E>    / \         / \    /_\    /_\    / \
        /_\    /_\   /___\       /___\  /___\  /___\  /___\
       /___\  /___\
```

After these rotations:

- The skew of <B> becomes either 0 or -1, ensuring that <B> is now height balanced.
- The skew of <F> becomes either 0 or 1, rendering <F> height balanced.
- The skew of <D> is 0, resulting in height balance for <D>.
- The height of <B> transitions from 'h + 3' before to 'h + 2' afterward.





**Global Rebalance:**

When adding or removing a leaf from a height-balanced tree T to create tree T0:

- T0 can be transformed into a height-balanced tree T00 using at most $O(log n)$ rotations.

**Proof:**

- Only ancestors of the affected leaf exhibit different heights in $T_0$ compared to $T$.
- The affected leaf has at most $O(log n)$ ancestors whose subtrees may have changed.
- We identify the lowest ancestor <X> that lacks height balance (with a skew magnitude of $2$).

  - In the case of leaf insertion, this elevates the height of <X>, leading to Case $2$ or $3$ in Local Rebalancing.
  - The subsequent rotation reduces the subtree height, resulting in balance after a single rotation.

  - For leaf removal, the height of one child of <X> decreases, affecting only the imbalance.
  - This could reduce the height of <X> by 1, potentially causing imbalance in <X>'s parent.
  - Hence, it might be necessary to rebalance every ancestor of <X>, but this is limited to a maximum of $h = O(log n)$ of them.

- Consequently, maintaining height balance can be achieved using only $O(log n)$ rotations after insertion or deletion.
- However, this approach requires us to verify whether a potentially $O(log n)$ nodes were height balanced.



 Below is code to implement the rebalancing algorithm presented in lecture.
 
 ```cpp
 def calculate_skew(node):
    """
    Calculate the skew of a node (O(?))
    """
    return height(node.right) - height(node.left)

def rebalance(node):
    """
    Rebalance an AVL tree node (O(?))
    """
    if calculate_skew(node) == 2:
        if calculate_skew(node.right) < 0:
            node.right = subtree_rotate_right(node.right)
        node = subtree_rotate_left(node)
    elif calculate_skew(node) == -2:
        if calculate_skew(node.left) > 0:
            node.left = subtree_rotate_left(node.left)
        node = subtree_rotate_right(node)
    return node

def maintain(node):
    """
    Maintain the AVL tree balance (O(h))
    """
    node = rebalance(node)
    subtree_update(node)
    if node.parent:
        node.parent = maintain(node.parent)
    return node
```



Here's a C++ implementation of an AVL tree with rebalancing:

```cpp
#include <iostream>
#include <algorithm>

// Definition of AVLNode structure
struct AVLNode {
    int data;
    AVLNode* left;
    AVLNode* right;
    int height;

    AVLNode(int val) : data(val), left(nullptr), right(nullptr), height(1) {}
};

// Function to calculate the height of a node
int getHeight(AVLNode* node) {
    return (node ? node->height : 0);
}

// Function to update the height of a node
void updateHeight(AVLNode* node) {
    node->height = 1 + std::max(getHeight(node->left), getHeight(node->right));
}

// Function to perform a right rotation
AVLNode* rotateRight(AVLNode* y) {
    AVLNode* x = y->left;
    AVLNode* T2 = x->right;

    x->right = y;
    y->left = T2;

    updateHeight(y);
    updateHeight(x);

    return x;
}

// Function to perform a left rotation
AVLNode* rotateLeft(AVLNode* x) {
    AVLNode* y = x->right;
    AVLNode* T2 = y->left;

    y->left = x;
    x->right = T2;

    updateHeight(x);
    updateHeight(y);

    return y;
}

// Function to balance the AVL tree
AVLNode* balanceNode(AVLNode* node) {
    int balance = getHeight(node->left) - getHeight(node->right);

    // Left Heavy
    if (balance > 1) {
        // Left-Right Heavy
        if (getHeight(node->left->right) > getHeight(node->left->left)) {
            node->left = rotateLeft(node->left);
        }
        return rotateRight(node);
    }
    // Right Heavy
    else if (balance < -1) {
        // Right-Left Heavy
        if (getHeight(node->right->left) > getHeight(node->right->right)) {
            node->right = rotateRight(node->right);
        }
        return rotateLeft(node);
    }

    return node;
}

// Function to insert a value into the AVL tree
AVLNode* insert(AVLNode* root, int value) {
    if (!root) {
        return new AVLNode(value);
    }

    if (value < root->data) {
        root->left = insert(root->left, value);
    }
    else if (value > root->data) {
        root->right = insert(root->right, value);
    }
    else {
        // Duplicate values are not allowed
        return root;
    }

    updateHeight(root);

    return balanceNode(root);
}

// Function to perform an in-order traversal of the AVL tree
void inOrderTraversal(AVLNode* root) {
    if (!root) {
        return;
    }

    inOrderTraversal(root->left);
    std::cout << root->data << " ";
    inOrderTraversal(root->right);
}

int main() {
    AVLNode* root = nullptr;

    // Insert elements into the AVL tree
    root = insert(root, 10);
    root = insert(root, 20);
    root = insert(root, 30);

    // Print the AVL tree using in-order traversal
    std::cout << "In-order traversal of the AVL tree: ";
    inOrderTraversal(root);

    return 0;
}
```


## Conclusion


- Set AVL trees achieve $O(lg n)$ time for all set operations, except $O(n log n)$ time for build and $O(n)$ time for iter
- Sequence AVL trees achieve $O(lg n)$ time for all sequence operations, except $O(n)$ time for build and iter


### Application: Sequence


- For sequence binary tree, we needed to know subtree sizes
- For just inserting/deleting a leaf, this was easy, but now need to handle rotations
- Subtree size is a subtree property, so can maintain via augmentation
     - Can compute size from sizes of children by summing them and adding 1


### Application: Sorting


- Any Set data structure defines a sorting algorithm: build (or repeatedly insert) then iter
- For example, Direct Access Array Sort
- AVL Sort is a new $O(n lg n)$ -time sorting algorithm 

